package com.keturahedwards.cleanskin;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class QrScannerCode extends AppCompatActivity implements ZXingScannerView.ResultHandler{
    private static final int REQUEST_CAMERA = 1;
    private ZXingScannerView ScannerView;
    private static int cam = Camera.CameraInfo.CAMERA_FACING_BACK;

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);

        int currentapiVersion = Build.VERSION.SDK_INT;
        if(currentapiVersion >= Build.VERSION_CODES.M){
            if(checkPermissions()){
                Toast.makeText(getApplicationContext(),"Permission Granted", Toast.LENGTH_LONG).show();
            }
            else{
                requestPermissions();
            }
        }
    }

    private boolean checkPermissions(){
        return(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED);
    }
    private void requestPermissions(){
        ActivityCompat.requestPermissions(QrScannerCode.this,new String[] {Manifest.permission.CAMERA},REQUEST_CAMERA);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onRequestPermissionResult(int requestCode, String permission[], int [] grantResult){
        switch(requestCode){
            case REQUEST_CAMERA:
                if(grantResult.length > 0){
                    boolean cameraAccept = grantResult[0] == PackageManager.PERMISSION_GRANTED;
                    if (cameraAccept) {
                        Toast.makeText(getApplicationContext(), "Permission Granted by User", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Permission not Granted by User", Toast.LENGTH_LONG).show();
                        if(shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)){
                            showMessageOkCancel("You need to grant the Permission",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                                requestPermissions(new String[]{Manifest.permission.CAMERA},REQUEST_CAMERA);
                                            }
                                        }
                                    });
                            return;

                        }
                    }
                }
                break;
        }
    }
    @Override
    public void onResume(){
        super.onResume();
        int currentapiVersion = Build.VERSION.SDK_INT;
        if(currentapiVersion >= Build.VERSION_CODES.M){
            if(checkPermissions()){
                if(ScannerView == null){
                    ScannerView = new ZXingScannerView(this);
                    setContentView(ScannerView);
                }
                ScannerView.setResultHandler(this);
                ScannerView.startCamera();
            }
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        ScannerView.stopCamera();
        ScannerView = null;
    }

    private void showMessageOkCancel(String message, DialogInterface.OnClickListener oklistner){
        new AlertDialog.Builder(QrScannerCode.this)
                .setMessage(message)
                .setPositiveButton("Ok", oklistner)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }

    @Override
    public void handleResult(Result result){
        final String rawresult = result.getText();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Scan Result");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ScannerView.resumeCameraPreview(QrScannerCode.this);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onDestroy();
            }
        });

        builder.setMessage(result.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}



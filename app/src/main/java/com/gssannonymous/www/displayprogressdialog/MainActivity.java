package com.gssannonymous.www.displayprogressdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick3(View v) {

        final ProgressDialogTest pDTest=new ProgressDialogTest();
        pDTest.show(getFragmentManager(),"progress dialog");

           new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=15; i++){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                pDTest.dismiss();
            }
        }).start();
    }
}

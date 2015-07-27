package com.gssannonymous.www.displayprogressdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Bundle;

/**
 * Created by ggs134 on 15. 7. 24.
 */
public class ProgressDialogTest extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        ProgressDialog dialog=new ProgressDialog(getActivity(), getTheme());
        dialog.setTitle("Please Wait..");
        dialog.setMessage("Webpage being loaded");
        dialog.setIndeterminate(true);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setMax(15);
        return dialog;
    }
}

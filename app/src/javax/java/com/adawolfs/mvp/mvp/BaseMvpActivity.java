package com.adawolfs.mvp.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.adawolfs.mvp.mvp.annotations.Injector;

import javax.inject.Inject;

/**
 * Created by adawolfs on 1/20/17.
 */

public abstract class BaseMvpActivity<V extends BaseMvpView , P extends BaseMvpPresenter<V>>
        extends AppCompatActivity implements BaseMvpView{


    public Context getContext(){
        return this;
    }


    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }

    public void showError(int stringResId) {
        Toast.makeText(this, stringResId, Toast.LENGTH_LONG).show();
    }

    public void showMessage(int srtResId) {
        Toast.makeText(this, srtResId, Toast.LENGTH_LONG).show();
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


}

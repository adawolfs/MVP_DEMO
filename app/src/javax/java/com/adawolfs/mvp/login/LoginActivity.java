package com.adawolfs.mvp.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.adawolfs.mvp.R;
import com.adawolfs.mvp.mvp.BaseMvpActivity;

import javax.inject.Inject;

/**
 * Created by adawolfs on 1/20/17.
 */
public class LoginActivity extends BaseMvpActivity<LoginContract.View, LoginPresenter>
        implements LoginContract.View, View.OnClickListener {

    @Inject
    LoginPresenter presenter;

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginInjector.inject(this);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {
        Toast.makeText(this, "Error en el usuario", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToHome() {

    }

    @Override
    public void onClick(View v) {
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}

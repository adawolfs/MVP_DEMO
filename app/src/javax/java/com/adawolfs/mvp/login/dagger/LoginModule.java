package com.adawolfs.mvp.login.dagger;

import android.app.Activity;
import android.content.Context;

import com.adawolfs.mvp.login.LoginActivity;
import com.adawolfs.mvp.login.LoginInteractor;
import com.adawolfs.mvp.login.LoginPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adawolfs on 1/20/17.
 */

@Module
public class LoginModule {

    private Context context;
    private LoginActivity loginActivity;

    public LoginModule(LoginActivity view) {
        this.context = view;
        this.loginActivity = view;
    }

    @Provides
    @Singleton
    LoginInteractor provideInteractor() {
        return new LoginInteractor();
    }

    @Provides
    @Singleton
    LoginActivity provideView() {
        return loginActivity;
    }

    @Provides
    @Singleton
    LoginPresenter providePresenter(LoginInteractor interactor, LoginActivity view) {
        return new LoginPresenter(interactor, view);
    }

}

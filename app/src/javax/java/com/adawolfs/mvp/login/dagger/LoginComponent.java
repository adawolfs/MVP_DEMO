package com.adawolfs.mvp.login.dagger;

import com.adawolfs.mvp.login.LoginActivity;
import com.adawolfs.mvp.login.dagger.*;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adawolfs on 1/20/17.
 */
@Singleton
@Component(modules = com.adawolfs.mvp.login.dagger.LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity __);
}
package com.adawolfs.mvp.login;


import com.adawolfs.mvp.login.dagger.DaggerLoginComponent;
import com.adawolfs.mvp.login.dagger.LoginComponent;
import com.adawolfs.mvp.login.dagger.LoginModule;

/**
 * Created by adawolfs on 1/20/17.
 */

public class LoginInjector {

    private static LoginComponent loginComponent;

    public static void inject(LoginActivity view) {
        if (loginComponent == null) {
            loginComponent = DaggerLoginComponent
                    .builder()
                    .loginModule(new LoginModule(view))
                    .build();
        }
        loginComponent.inject(view);
    }
}

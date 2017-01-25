package com.adawolfs.mvp_java.login

import com.adawolfs.mvp_java.login.dagger.DaggerLoginComponent
import com.adawolfs.mvp_java.login.dagger.LoginComponent
import com.adawolfs.mvp_java.login.dagger.LoginModule

/**
 * Created by adawolfs on 1/20/17.
 */
class LoginInjector {

    class inject(view: LoginActivity) {
        private var loginComponent: LoginComponent? = null
        init{
            if (loginComponent == null) {
                loginComponent = DaggerLoginComponent
                        .builder()
                        .loginModule(LoginModule(view))
                        .build()
            }
            loginComponent!!.inject(view)
        }
    }
}
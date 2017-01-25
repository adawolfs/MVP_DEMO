package com.adawolfs.mvp_java.login.dagger

import android.app.Activity
import android.content.Context

import com.adawolfs.mvp_java.login.LoginActivity
import com.adawolfs.mvp_java.login.LoginInteractor
import com.adawolfs.mvp_java.login.LoginPresenter

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by adawolfs on 1/20/17.
 */

@Module
class LoginModule(view: LoginActivity) {

    private val context: Context
    private val loginActivity: LoginActivity

    init {
        this.context = view
        this.loginActivity = view
    }

    @Provides
    @Singleton
    internal fun provideInteractor(): LoginInteractor {
        return LoginInteractor()
    }

    @Provides
    @Singleton
    internal fun provideView(): LoginActivity {
        return loginActivity
    }

    @Provides
    @Singleton
    internal fun providePresenter(interactor: LoginInteractor, view: LoginActivity): LoginPresenter {
        return LoginPresenter(interactor, view)
    }

}

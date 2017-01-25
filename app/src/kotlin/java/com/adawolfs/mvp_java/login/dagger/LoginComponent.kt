package com.adawolfs.mvp_java.login.dagger

import com.adawolfs.mvp_java.login.LoginActivity
import com.adawolfs.mvp_java.login.dagger.*

import javax.inject.Singleton

import dagger.Component

/**
 * Created by adawolfs on 1/20/17.
 */
@Singleton
@Component(modules = arrayOf(com.adawolfs.mvp_java.login.dagger.LoginModule::class))
interface LoginComponent {
    fun inject(activity: LoginActivity)
}
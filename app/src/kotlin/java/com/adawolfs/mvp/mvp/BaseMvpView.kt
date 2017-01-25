package com.adawolfs.mvp.mvp

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by adawolfs on 1/20/17.
 */
interface BaseMvpView {

    fun getContext(): Context

    fun showError(error: String)

    fun showError(@StringRes error: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)
}
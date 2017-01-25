package com.adawolfs.mvp_java.login

import com.adawolfs.mvp_java.mvp.BaseMvpInteractor
import com.adawolfs.mvp_java.mvp.BaseMvpPresenter
import com.adawolfs.mvp_java.mvp.BaseMvpView

/**
 * Created by adawolfs on 1/20/17.
 */
class LoginContract{

    interface View : BaseMvpView {

        fun showProgress()

        fun hideProgress()

        fun setUsernameError()

        fun setPasswordError()

        fun navigateToHome()

    }

    interface Presenter: BaseMvpPresenter<View> {
        fun validateCredentials(user : String, password : String)
    }

    interface Interactor : BaseMvpInteractor{
        fun login(user: String, password: String)
    }
}
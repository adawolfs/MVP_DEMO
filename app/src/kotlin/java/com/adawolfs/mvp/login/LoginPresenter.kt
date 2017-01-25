package com.adawolfs.mvp.login

import com.adawolfs.mvp.mvp.BaseMvpInteractor
import com.adawolfs.mvp.mvp.BaseMvpPresenterImpl

/**
 * Created by adawolfs on 1/20/17.
 */

                    //This is the constructor definition for this class
class LoginPresenter(interactor: LoginContract.Interactor, view: LoginContract.View) :
        BaseMvpPresenterImpl<LoginContract.View>(view), LoginContract.Presenter{

    init {
        attachView(view)
    }

    private var mInteractor : LoginContract.Interactor = interactor

    override fun validateCredentials(user: String, password: String) {
        getView()?.showError("Error en el usuario Kotlin")
    }


}
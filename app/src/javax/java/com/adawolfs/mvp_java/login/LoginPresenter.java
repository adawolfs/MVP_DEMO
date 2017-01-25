package com.adawolfs.mvp_java.login;

import com.adawolfs.mvp_java.mvp.BaseMvpPresenter;
import com.adawolfs.mvp_java.mvp.BaseMvpPresenterImpl;

import javax.inject.Inject;

/**
 * Created by adawolfs on 1/20/17.
 */

public class LoginPresenter extends BaseMvpPresenterImpl<LoginContract.View>
        implements LoginContract.Presenter {

    private LoginContract.Interactor mInteractor;

    public LoginPresenter(LoginContract.Interactor interactor, LoginContract.View view) {
        mInteractor = interactor;
        attachView(view);
    }

    @Override
    public void validateCredentials(String user, String password) {
        getView().showError("Error en el usuario Java");
    }

}

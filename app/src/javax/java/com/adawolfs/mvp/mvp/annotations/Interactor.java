package com.adawolfs.mvp.mvp.annotations;

import com.adawolfs.mvp.mvp.BaseMvpInteractor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by adawolfs on 1/20/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Interactor {
    Class<? extends BaseMvpInteractor> getInteractor();
}

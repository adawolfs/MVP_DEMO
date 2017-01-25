package com.adawolfs.mvp_java.mvp.annotations;

import com.adawolfs.mvp_java.mvp.BaseMvpInteractor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by adawolfs on 1/20/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Injector {
    Class value();
}

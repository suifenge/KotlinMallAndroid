package com.suifeng.kotlin.baselibrary.rx

import rx.Subscriber

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {

    }

    override fun onError(e: Throwable?) {

    }

}
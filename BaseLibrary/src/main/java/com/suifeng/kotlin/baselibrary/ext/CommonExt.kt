package com.suifeng.kotlin.baselibrary.ext

import com.suifeng.kotlin.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscriber)
}
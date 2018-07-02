package com.suifeng.kotlin.baselibrary.presenter

import com.suifeng.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
open class BasePresenter< T : BaseView> {
    lateinit var mView: T
}
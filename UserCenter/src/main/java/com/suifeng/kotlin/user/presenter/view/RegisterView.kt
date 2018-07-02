package com.suifeng.kotlin.user.presenter.view

import com.suifeng.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
interface RegisterView : BaseView {
    fun onRegisterResult(result: Boolean)
}
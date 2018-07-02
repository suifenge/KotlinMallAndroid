package com.suifeng.kotlin.baselibrary.ui.activity

import com.suifeng.kotlin.baselibrary.presenter.BasePresenter
import com.suifeng.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
open class BaseMvpActivity<T: BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }

}
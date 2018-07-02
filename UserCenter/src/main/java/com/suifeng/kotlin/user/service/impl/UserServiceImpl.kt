package com.suifeng.kotlin.user.service.impl

import com.suifeng.kotlin.user.service.UserService
import rx.Observable

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}
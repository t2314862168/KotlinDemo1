package com.tangxb.demo

/**
 * Created by Taxngb on 2017/11/13.
 */
class Person(val name: String) {
    var age: Int = 0
        set(value: Int) {
            field = value
        }
        get() = field
}

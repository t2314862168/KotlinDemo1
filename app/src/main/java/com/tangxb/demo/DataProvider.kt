package com.tangxb.demo

/**
 * Created by Taxngb on 2017/11/13.
 */
class DataProvider {
    companion object {
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DataProvider()
        }
        val list = ArrayList<Person>()
    }

    fun getNeedDataSize() = list.size

    fun getNeedData(): ArrayList<Person> {
        for (i in 1..10) {
            var person = Person("name-${i}")
            person.age = i
            list.add(person)
        }
        return list
    }
}
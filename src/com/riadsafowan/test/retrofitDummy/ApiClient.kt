package com.riadsafowan.test.retrofitDummy

class ApiClient {
    companion object {
        fun getData(): List<Person> = listOf(Person("Riad Safowan"), Person("Redwan aurko"))
    }
}
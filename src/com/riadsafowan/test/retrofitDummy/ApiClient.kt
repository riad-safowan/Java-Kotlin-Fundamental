package com.riadsafowan.test.retrofitDummy

class ApiClient {
    fun getData(): List<Person> = listOf(Person("Riad Safowan"), Person("Redwan aurko"))
}
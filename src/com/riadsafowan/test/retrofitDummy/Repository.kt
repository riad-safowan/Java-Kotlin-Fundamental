package com.riadsafowan.test.retrofitDummy

class Repository {
    companion object {
        fun getData() =
            ApiHelper.apiHelper { ApiClient.getData() }

    }
}

fun main() {
    val data = Repository.getData()
    when (data) {
        is Response.Success -> {
            data.value.forEach {
                println(it.name)
            }
        }
        is Response.Error -> println("There is an error")
    }
}
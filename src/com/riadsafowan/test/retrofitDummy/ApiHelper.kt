package com.riadsafowan.test.retrofitDummy

class ApiHelper {
    companion object {
        fun <T> apiHelper(
            apiCall: () -> T
        ): Response<T> {
            return Response.Success(apiCall.invoke())
//            return Response.Error("NetWork Error")
        }
    }
}
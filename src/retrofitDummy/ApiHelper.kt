package retrofitDummy

object ApiHelper {
    fun <T> apiHelper(
        apiCall: () -> T
    ): Response<T> {
        println("ApiHelper: " + Thread.currentThread().name)
        return Response.Success(apiCall.invoke())
//            return Response.Error("NetWork Error")
    }
}
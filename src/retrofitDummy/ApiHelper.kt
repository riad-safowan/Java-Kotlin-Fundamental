package retrofitDummy

object ApiHelper {
    fun <T> apiHelper(
        apiCall: () -> T
    ): Response<T> {
        return Response.Success(apiCall.invoke())
//            return Response.Error("NetWork Error")
    }
}
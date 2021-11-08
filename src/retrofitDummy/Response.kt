package retrofitDummy

sealed class Response<out T> {
    data class Success<T>(val value: T) : Response<T>()
    data class Error(val error: String) : Response<Nothing>()
}

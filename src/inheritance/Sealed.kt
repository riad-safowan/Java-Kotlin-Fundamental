package inheritance

sealed class Response<out T> {
    class Success<T>(val value: T) : Response<T>()
    class Error(val error: String) : Response<Nothing>()
}

data class Data(val string: String, val int: Int)

fun main() {

    val response: Response<Data> = Response.Success(Data("Riad", 19))

    val d: Response<*> = Response.Error("IO Exception")


    if (response is Response.Success) {
        println(response.value)
    }


}


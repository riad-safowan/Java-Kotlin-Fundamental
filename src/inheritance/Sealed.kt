package inheritance

sealed class Response<T> {
    class Success<T>(val value: T) : Response<T>()
    class Error<T>(val error: String) : Response<T>()
}

data class Data(val string: String, val int: Int)

fun main() {

    val response: Response<Data> = Response.Success(Data("Riad", 19))

    val d: Response<Data> = Response.Error("IO Exception")


    if (response is Response.Success) {
        println(response.value)
    }


}


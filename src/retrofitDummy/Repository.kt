package retrofitDummy

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

object Repository {
    fun getData() = ApiHelper.apiHelper {
        runBlocking(Dispatchers.IO) {
            println("Repository: "+Thread.currentThread().name)
            ApiClient.getData()
        }
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
package retrofitDummy

import kotlinx.coroutines.runBlocking

object ApiClient {
    suspend fun getData(): List<Person> {
        println("ApiClient: "+Thread.currentThread().name)
       return listOf(Person("Riad Safowan"), Person("Redwan aurko"))
    }
}


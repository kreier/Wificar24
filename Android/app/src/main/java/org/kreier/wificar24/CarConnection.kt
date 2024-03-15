package org.kreier.wificar24

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

suspend fun CarConnection(direction: String) {
    val url = "http://192.168.18.1:8080/move?dir=" + direction
//    val url = "https://ktor.io/"
    val client = HttpClient(Android) {
        engine {
            connectTimeout = 100_000
            socketTimeout = 100_000
        }
    }
    val response: HttpResponse = client.get(urlString = url)
    println(response.status)
    client.close()
}
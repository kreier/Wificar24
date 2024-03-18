package org.kreier.wificar24

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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

@Preview
@Composable
fun JetpackCompose() {
    Card {
//        var expanded by remember { mutableStateOf(false) }
        var expanded = true
        Column(Modifier.clickable { /* later */ }) {
            Image(
                painterResource(id = R.drawable.jetpack_compose),
                contentDescription = "Jetpack Compose Logo",)
            AnimatedVisibility(visible = expanded) {
                Text(
                    text = "Jetpack Compose",
                    style= MaterialTheme.typography.bodyLarge,
                )
            }
        }
    }
}
package org.kreier.wificar24

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Composable
fun screen() {

    val counter = remember { mutableStateOf(0) }

    Column {
        CounterButton(
            text = "Click count:",
            count = counter.value,
            updateCount = { newCount ->
                counter.value = newCount
            }
        )
    }
}

@Composable
fun CounterButton(text: String, count: Int, updateCount: (Int) -> Unit) {
    Button(onClick = { updateCount(count+1) }) {
        Text(text = "$text ${count}")
    }
}

@Preview
@Composable
fun screenTest() {
    screen()
}

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        CarConnection()
        delay(1000L)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}
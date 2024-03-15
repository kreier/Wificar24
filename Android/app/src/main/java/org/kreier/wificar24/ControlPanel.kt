package org.kreier.wificar24

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ControlPanel(modifier: Modifier = Modifier) {
    Row {
        DirectionPanel()
        Text(text = "8 action buttons, feedback")
        Text(text = "Future analog joystick")
    }
}

@Composable
fun DirectionPanel() {
    Text(text = "4 direction buttons")
//    Column() (
//        Text(text = "Go forward")
////        ElevatedButton(onClick = {
////        /* Send F TODO*/ }) {
////
////        }
//    )
    Row {
        Text(text = "Go left")
        Spacer(modifier = Modifier)
        Text(text = "Go right")
    }
//    Column {
//        Text(text = "Go Back")
//    }
}


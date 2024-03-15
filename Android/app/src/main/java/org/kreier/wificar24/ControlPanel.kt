package org.kreier.wificar24

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ControlPanel(modifier:Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxWidth(1f)) {
        var robotState = remember { mutableStateOf( "S") }
        DirectionPanel(
            modifier = Modifier.fillMaxWidth(0.35f),
            state = robotState.value,
            updateState = { newState -> robotState.value = newState}
        )
        ButtonPanel(modifier = Modifier.fillMaxWidth(0.3f))
        JoystickPanel(robotState.value)
    }
}

@Composable
fun DirectionPanel(modifier: Modifier = Modifier, state: String, updateState: (String) -> Unit) {
//    BoxWithConstraints {
//        if (maxWidth > maxHeight) {
//            var dWidth = maxHeight
//            var dHeight = maxHeight
//        }
        Column(modifier = Modifier
            .fillMaxWidth(0.35f)
            .fillMaxHeight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
            ) {
            var arrowSize = 60.dp
            Button( onClick = { updateState("F") } )
                {
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_upward_24),
                    contentDescription = null,
                    modifier = Modifier.size(width = arrowSize, height = arrowSize)
                )
//                Text(fontSize = 42.sp, text = "↑")
            }
            Row {
                Button(
                    onClick = { updateState("L") }
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                        contentDescription = null,
                        modifier = Modifier.size(width = arrowSize, height = arrowSize)
                    )
//                    Text(fontSize = 42.sp, text = "←")
                }
//                Spacer(modifier.fillMaxWidth(0.3f))
                Button(onClick = { updateState("S") }) {
//                    Image(
//                        painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
//                        contentDescription = null,
//                        modifier = Modifier.size(width = arrowSize, height = arrowSize)
//                    )
                    Text(fontSize = 42.sp, text = "S")
                }
                Button(onClick = { updateState("R") }) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                        contentDescription = null,
                        modifier = Modifier.size(width = arrowSize, height = arrowSize)
                    )
//                    Text(fontSize = 42.sp, text = "→")
                }
            }
            Button(onClick = { updateState("B") }) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_downward_24),
                    contentDescription = null,
                    modifier = Modifier.size(width = arrowSize, height = arrowSize)
                )
//                Text(fontSize = 42.sp, text = "↓")
            }
        }
    }
//}

@Composable
fun ButtonPanel(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxWidth(0.29f)
            .fillMaxHeight()
    ) {
        Text(text = "Feedback")
        Text(text = "8 action \nbuttons")
    }
}

@Composable
fun JoystickPanel(stateESP: String) {
    Text(text = "Current State: $stateESP")
}
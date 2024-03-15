package org.kreier.wificar24

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.kreier.wificar24.ui.theme.Wificar24Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wificar24Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Wificar24("Wificar24")
                }
            }
        }
    }
}

@Composable
fun Wificar24(name: String, modifier: Modifier = Modifier) {
    Column(
//        modifier = Modifier
//            .statusBarsPadding()
//            .padding(horizontal = 40.dp
        ) {
            ToolBar24()
            ControlPanel()
        }
}

@Composable
fun Button_1(nummer: Int) {
    Text(
        text = "Erster Button"
    )
}
fun action(): Int {
    return 2
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Wificar24Theme {
        Wificar24("Wificar to 24")
    }
}
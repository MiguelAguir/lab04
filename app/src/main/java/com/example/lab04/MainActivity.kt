package com.example.lab04
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.lab04.ui.theme.Lab04Theme
import com.example.lab04.ui.theme.screens.ViewHolaCurso
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ViewHolaCurso()
                }
            }
        }
    }
}
@Composable
fun MainScreen() {
    ViewHolaCurso()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainActivityContent() {
    Scaffold {
        MainScreen()
    }
}

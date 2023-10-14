package dev.bellu.hackathon_serpro

import HomeScreen
import LoginScreen
import WelcomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.bellu.hackathon_serpro.presenter.theme.Hackathon_serproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "initial"){
                composable("initial") {WelcomeScreen(navController)}
                composable("login") { LoginScreen(navController)}
                composable("home") { HomeScreen(navController)}
            }
        }
    }
}

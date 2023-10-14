import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.hackathon_serpro.R
import dev.bellu.hackathon_serpro.presenter.theme.Typography
import dev.bellu.hackathon_serpro.presenter.theme.primary

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(R.drawable.logo), contentDescription = null)
        Spacer(modifier = Modifier.height(20.dp))
        ButtonDefault(title = "Entrar", color = primary, typography = Typography.titleSmall, navController = navController, destiny = "login")
        Spacer(modifier = Modifier.height(20.dp))
        ButtonDefault("Criar Conta", color = primary, typography = Typography.titleSmall, navController = navController, destiny = "")
    }
}

@Composable
fun ButtonDefault(title: String, color: androidx.compose.ui.graphics.Color, typography: TextStyle, navController: NavController, destiny: String) {

    val colorsButtonCustom: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = color
    )
    Button(
        modifier = Modifier.fillMaxWidth(0.9f)
            .height(49.dp),
        colors = colorsButtonCustom,
        onClick = {
            navController.navigate(destiny)
        },
    ) {
        Text(title, style = typography)
    }
}
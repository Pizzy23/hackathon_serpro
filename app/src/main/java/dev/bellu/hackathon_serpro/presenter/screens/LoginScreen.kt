import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.hackathon_serpro.R
import dev.bellu.hackathon_serpro.presenter.theme.Typography
import dev.bellu.hackathon_serpro.presenter.theme.primary

@Composable
fun LoginScreen(navController: NavController){

    var inputEmail by remember { mutableStateOf("") }
    var inputPassword by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(R.drawable.logosmall), contentDescription = null)
        Spacer(modifier = Modifier.height(20.dp))
        Input(
            value = inputEmail,
            onValueChange = { inputEmail = it},
            label = "Email ou CPF",
            placeholder = "Insira seu e-mail"
        )
        Input(
            value = inputPassword,
            onValueChange = { inputPassword = it},
            label = "Senha",
            placeholder = "Insira sua senha"
        )
        Spacer(modifier = Modifier.height(20.dp))
        ButtonDefault("Entrar", color = primary, typography = Typography.titleSmall, navController = navController, destiny = "home")
    }
}
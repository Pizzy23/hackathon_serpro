import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.hackathon_serpro.R
import dev.bellu.hackathon_serpro.presenter.theme.Typography
import dev.bellu.hackathon_serpro.presenter.theme.onSecondary
import dev.bellu.hackathon_serpro.presenter.theme.tertiary

@Composable
fun HomeScreen(navController: NavController){

    Column(modifier = Modifier.background(color = tertiary)) {
        Row (modifier = Modifier.fillMaxWidth()){
            Box(
                modifier = Modifier
                    .padding(16.dp)
            ){
                Image(painter = painterResource(R.drawable.logomegasmall), contentDescription = null)
            }
        }
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Bem vindo(a), Antônio!", style = Typography.displaySmall)
            Text("Você tem 4 lições em andamento", style = Typography.displaySmall)
        }

        Row {
            Box(
                modifier = Modifier
                    .height(136.dp)
                    .width(136.dp)
                    .background(color = onSecondary)){

            }

        }
    }
}
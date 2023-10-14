import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import dev.bellu.hackathon_serpro.presenter.theme.Typography
import dev.bellu.hackathon_serpro.presenter.theme.onSecondary
import dev.bellu.hackathon_serpro.presenter.theme.primary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Input(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String
){

    val colorsCustom: TextFieldColors = TextFieldDefaults.textFieldColors(
        containerColor = onSecondary ,
        focusedIndicatorColor = primary,
        unfocusedIndicatorColor = primary
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()){

        OutlinedTextField(
            colors = colorsCustom,
            value = value,
            onValueChange = onValueChange,
            label = { Text(label, style = TextStyle(color = Color.Black )) },
            placeholder = { Text(placeholder) },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(100),
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = null)
            }
        )
    }
}
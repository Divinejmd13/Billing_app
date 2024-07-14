
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.billingapp.ui.theme.BillingAppTheme
import com.example.billingapp.ui.theme.orange_main

class LoginPage(private val navController: NavHostController) {
    @Composable
    fun content() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "SATGURU",
                    style = TextStyle(fontSize = 28.sp, color = Color(0xFFFF6B00), fontWeight = FontWeight.SemiBold)
                )
                Text(
                    text = " TELECOM",
                    style = TextStyle(fontSize = 28.sp, color = Color(0xFF515151), fontWeight = FontWeight.SemiBold)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = {
                    navController.navigate("adminPage") // Navigate to the AdminPage
                },
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
                    .width(500.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xFFFF6B00)
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Login as Admin",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate("userPage") // Navigate to the UserPage
                },
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
                    .width(500.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xFFFF6B00)
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Login as User",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White
                    )
                )
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Log(userType: Char) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var passwordVisible by rememberSaveable { mutableStateOf(false) }
        var errorMessage by remember { mutableStateOf<String?>(null) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "SATGURU",
                    style = TextStyle(fontSize = 28.sp, color = Color(0xFFFF6B00), fontWeight = FontWeight.SemiBold)
                )
                Text(
                    text = " TELECOM",
                    style = TextStyle(fontSize = 28.sp, color = Color(0xFF515151), fontWeight = FontWeight.SemiBold)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            val portalText = if (userType == 'u') "User Portal" else "Admin Portal"
            Text(text = portalText, fontSize = 25.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(16.dp))
            val MAX_USERNAME_LENGTH =10
            OutlinedTextField(
                value = username,
                onValueChange = {newText->
                if (newText.length <= MAX_USERNAME_LENGTH) { // MAX_USERNAME_LENGTH is the maximum allowed length
                username = newText
                errorMessage=null
            }else{
                    errorMessage = "Max characters reached"
                }
                                },
                leadingIcon = { // Use the leadingIcon lambda
                Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null // Provide a content description if needed
                    )
                },
                label = { Text("Username", style = TextStyle(fontSize = 18.sp)) },

                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor= orange_main,
                    unfocusedLabelColor= Color.Gray,
                    focusedBorderColor = orange_main,
                    unfocusedBorderColor = Color.Gray,
                    ),

            )
            // Display the error message
            errorMessage?.let { message ->
                Text(
                    text = message,
                    style = TextStyle(fontSize = 13.sp, color = Color.Red, fontStyle = FontStyle.Italic)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text( "Enter password") },
                leadingIcon = { // Use the leadingIcon lambda

                    Icon(
                        imageVector = Icons.Default.AcUnit
                        ,
                        contentDescription = null // Provide a content description if needed
                    )
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

                        trailingIcon={val image = if (passwordVisible)
                    Icons.Filled.Visibility
                else Icons.Filled.VisibilityOff

                    // Please provide localized description for accessibility services
                    val description = if (passwordVisible) "Hide password" else "Show password"

                    IconButton(onClick = {passwordVisible = !passwordVisible}) {
                        Icon(imageVector = image, description)
                    }
                             },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = orange_main,
                    unfocusedBorderColor = Color.Gray,
                    focusedLabelColor = orange_main,
                    unfocusedLabelColor = Color.Gray,
                )

            )
            Spacer(modifier = Modifier.height(28.dp))
            Button(
                onClick = {
                    // Handle button click action here
                    // You can navigate here based on userType
                    // Example: navController.navigate("AdminPage")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
                    .width(280.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xFFFF6B00)
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Login ",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun LoginPageAdminPreview() {
    BillingAppTheme {
        val navController = rememberNavController()
        LoginPage(navController).Log('a')
    }
}

@Preview
@Composable
fun LoginPageUserPreview() {
    BillingAppTheme {
        val navController = rememberNavController()
        LoginPage(navController).Log('u')
    }
}
@Preview
@Composable
fun content() {
    BillingAppTheme {
        val navController = rememberNavController()
        LoginPage(navController).content()
    }
}

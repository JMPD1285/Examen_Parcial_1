package parra.jose.examen1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import parra.jose.examen1.composables.PantallaInicio
import parra.jose.examen1.composables.PantallaPerfil
import parra.jose.examen1.ui.theme.Examen1Theme

//Clase principal donde inicia la aplicación
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Aqui se carga la interfaz principal de la app
            Examen1Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Examen1App()
                }
            }
        }
    }
}

@Composable
fun Examen1App() {
    //Guarda que pantalla esta activa actualmente
    var pantallaSel by remember { mutableStateOf("inicio") }
    Scaffold(
        bottomBar = {
            NavigationBar {
                //Boton para mostrar la pantalla "Cursos"
                NavigationBarItem(
                    selected = pantallaSel == "inicio", onClick = { pantallaSel = "inicio" },
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.School, contentDescription = "Cursos")
                    },
                    label = { Text("Cursos") }
                )
                //Boton para mostrar la pantalla "Mi Perfil"
                NavigationBarItem(
                    selected = pantallaSel == "perfil", onClick = { pantallaSel = "perfil" },
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Face, contentDescription = "Mi Perfil")
                    },
                    label = { Text("Mi Perfil") }
                )
            }
        }
    ) { paddingValues ->
        //Segun la opción seleccionada se muestra la pantalla correspondiente
        when (pantallaSel) {
            "inicio" -> PantallaInicio(paddingValues)
            "perfil" -> PantallaPerfil(paddingValues)
        }
    }
}
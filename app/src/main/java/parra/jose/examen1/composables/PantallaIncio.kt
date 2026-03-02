package parra.jose.examen1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import parra.jose.examen1.R

@Composable
fun PantallaInicio(paddingValues: PaddingValues) {

    Column(
        modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp)
    ) {
        //Titulo principal de la aplicación
        Text(
            text = "Kakarot Math", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Seccion donde se muestra la información del usuario
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.cat), contentDescription = "Perfil",
                    modifier = Modifier.size(55.dp).clip(CircleShape), contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "kyzamiz", fontWeight = FontWeight.Bold, fontSize = 16.sp
                    )
                    Text(
                        text = "4to Grado", color = Color.Gray, fontSize = 13.sp
                    )
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.MenuBook, contentDescription = "Grado",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))

                Text(
                    text = "Grado", fontWeight = FontWeight.Medium
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Comenzar", fontWeight = FontWeight.Bold, fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(12.dp))

        //Card principal que muestra la actividad destacada "Numeros"
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF8BC34A)
            ),
            modifier = Modifier.fillMaxWidth().height(170.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Numeros", fontSize = 22.sp, fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Text(
                        text = "Hola, numeros bonitos!!!",
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                    //Boton para iniciar la actividad
                    Button(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.PlayArrow,
                            contentDescription = "Play"
                        )
                        Text("Comenzar")

                        Spacer(modifier = Modifier.width(6.dp))
                    }
                }
                //Imagen decorativa que acompaña la card
                Image(
                    painter = painterResource(id = R.drawable.frog), contentDescription = "Rana",
                    modifier = Modifier.size(95.dp), contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Cursos", fontWeight = FontWeight.Bold, fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(16.dp))

        //Se usa el componente CursoCard para mostrar los cursos disponibles
        CursoCard(
            titulo = "Prueba de 7 dias",
            fecha = "Comienza el 1ro de Agosto",
            precio = "¥ 9.9",
            precioReal = "¥ 98",
            colorFondo = Color(0xFF4FC3F7),
            imagen = R.drawable.penguin
        )
        Spacer(modifier = Modifier.height(12.dp))

        CursoCard(
            titulo = "Curso de Otoño",
            fecha = "Comienza el 1ro de Septiembre",
            precio = "¥ 398",
            precioReal = "¥ 1280",
            colorFondo = Color(0xFF9575CD),
            imagen = R.drawable.giraffe
        )
    }
}

//Funcion reutilizable para mostrar las cards de los cursos
@Composable
fun CursoCard(
    titulo: String,
    fecha: String,
    precio: String,
    precioReal: String,
    colorFondo: Color,
    imagen: Int
) {

    Card(
        shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(containerColor = colorFondo),
        modifier = Modifier.fillMaxWidth().height(120.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = imagen), contentDescription = titulo,
                modifier = Modifier.size(70.dp), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = titulo,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 16.sp
                )

                Text(
                    text = fecha,
                    color = Color.White,
                    fontSize = 13.sp
                )
            }

            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = precio,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text(
                    text = precioReal,
                    color = Color.LightGray,
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }
    }
}
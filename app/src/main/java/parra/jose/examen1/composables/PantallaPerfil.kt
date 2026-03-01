package parra.jose.examen1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import parra.jose.examen1.R

@Composable
fun PantallaPerfil(paddingValues: PaddingValues) {

    Column(
        modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp)){

        Text(
            text = "Kakarot Math", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.fillMaxWidth(),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){

            Image(
                painter = painterResource(id = R.drawable.cat), contentDescription = "IPerfil",
                modifier = Modifier.size(100.dp).clip(CircleShape), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "kyzamiz", fontWeight = FontWeight.Bold, fontSize = 18.sp
            )

            Text(
                text = "4to Grado",
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Filled.Warning, contentDescription = "Alerta", modifier = Modifier.size(16.dp),
                tint = Color.Red
            )
            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "La fecha limite esta muy cerca!!!", fontWeight = FontWeight.Bold, fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Aprendiendo", fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))


        Card(
            shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(containerColor = Color(0xFF9575CD)),
            modifier = Modifier.fillMaxWidth().height(130.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
            ) {

                Column {
                    Text(
                        text = "Curso de Otoño", fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Text(
                        text = "Semana 1",
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Button(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.PlayArrow, contentDescription = "Play", modifier = Modifier.size(18.dp)
                        )
                        Text("Comenzar")
                        Spacer(modifier = Modifier.width(6.dp))
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.giraffe), contentDescription = "Jirafa",
                    modifier = Modifier.size(80.dp), contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))

        Card(
            shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(containerColor = Color(0xFF4FC3F7)),
            modifier = Modifier.fillMaxWidth().height(130.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Prueba de 7 dias", fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "Dia 2",
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Button(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.PlayArrow, contentDescription = "Play",
                            modifier = Modifier.size(18.dp)
                        )
                        Text("Comenzar")
                        Spacer(modifier = Modifier.width(6.dp))
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.penguin),
                    contentDescription = "Pinguino",
                    modifier = Modifier.size(80.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}
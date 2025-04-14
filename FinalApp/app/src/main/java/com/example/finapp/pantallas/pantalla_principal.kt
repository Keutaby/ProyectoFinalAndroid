package com.example.finapp.pantallas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.finapp.pantallas.navegacion.BotonesNavegacion

@Composable
fun PantallaPrincipal(modifier: Modifier){
    val control_navegacion = rememberNavController()
    val boton_navegacion = BotonesNavegacion()
    /*val Pagina_seleccionada by remember {
        mutableStateOf(0)
    }*/

    Scaffold(modifier = Modifier, topBar = {
        NavigationBar {
            BotonesNavegacion().botones_para_navegacion().forEachIndexed { index, botones_para_navegacion ->  }
                NavigationBarItem(
                    selected = index == pantalla_seleccionada,
                )
        }
    })

}


@Preview(showBackground = true)
@Composable
fun prevista(){
    PantallaPrincipal(Modifier.fillMaxSize())
}
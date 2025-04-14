package com.example.finapp.pantallas.navegacion

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

sealed class PantallasMenus(val route:String){
    object Home: PantallasMenus("pantalla principal")
    object API: PantallasMenus("pantalla de API")
    object Classes: PantallasMenus("pantalla de clases")
    object About: PantallasMenus("pantalla de informacion")
    object Profile: PantallasMenus("pantalla perfil")
}

data class BotonesNavegacion(val label: String = "",
    val icon: ImageVector = Icons.Filled.Call,
    val route: String = ""
){
    fun botones_para_navegacion(): List<BotonesNavegacion>{
        return listOf(
            BotonesNavegacion(
                label = "Home",
                icon = Icons.Filled.Home,
                route = PantallasMenus.Home.route
            ),

            BotonesNavegacion(
                label = "API",
                icon = Icons.Filled.Menu,
                route = PantallasMenus.API.route
            ),

            BotonesNavegacion(
                label = "Classes",
                icon = Icons.Filled.DateRange,
                route = PantallasMenus.Classes.route
            ),

            BotonesNavegacion(
                label = "About",
                icon = Icons.Filled.Info,
                route = PantallasMenus.About.route
            ),

            BotonesNavegacion(
                label = "Profile",
                icon = Icons.Filled.AccountCircle,
                route = PantallasMenus.Profile.route
            )
        )
    }
}
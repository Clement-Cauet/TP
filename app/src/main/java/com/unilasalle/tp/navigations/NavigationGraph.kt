package com.unilasalle.tp.navigations

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.unilasalle.tp.services.database.controllers.CartController
import com.unilasalle.tp.services.database.controllers.CartItemController
import com.unilasalle.tp.ui.screens.HomeScreen
import com.unilasalle.tp.ui.screens.CartScreen
import com.unilasalle.tp.ui.screens.ProfileScreen
import com.unilasalle.tp.services.database.entities.User

/**
 * Navigation graph for the application.
 *
 * @param navController The navigation controller.
 * @param cartController The cart controller.
 * @param cartItemController The cart item controller.
 * @param context The context.
 * @param user The user.
 * @param modifier The modifier.
 */
@Composable
fun NavigationGraph(navController: NavHostController, cartController: CartController, cartItemController: CartItemController, context: Context, user: User?, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable("home") { HomeScreen(cartController,cartItemController) }
        composable("cart") { CartScreen(cartController, cartItemController, user) }
        composable("profile") { ProfileScreen(cartController, cartItemController, user) }
    }
}
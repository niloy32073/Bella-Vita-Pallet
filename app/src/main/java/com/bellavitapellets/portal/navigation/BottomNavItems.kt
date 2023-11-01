package com.bellavitapellets.portal.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.ShoppingCart
import com.bellavitapellets.portal.R

object BottomNavItems {
    val bottomNavItem = listOf<BottomNavItem>(
        BottomNavItem(
            label = "Home",
            icon = R.drawable.home,
            route = "home"
        ),
        BottomNavItem(
            label = "Dosage",
            icon = R.drawable.vaccines,
            route = "dosage"
        ),
        BottomNavItem(
            label = "Order",
            icon = R.drawable.shopping_cart,
            route = "order"
        ),
        BottomNavItem(
            label = "Help",
            icon = R.drawable.support_agent,
            route = "help"
        )
    )
}
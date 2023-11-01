package com.bellavitapellets.portal.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions

@Composable
fun BottomNavigationBar(navController: NavHostController){
    NavigationBar(containerColor = Color(239,236,236)) {

        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route

        // Bottom nav items we declared
        BottomNavItems.bottomNavItem.forEach { navItem ->

            // Place the bottom nav items
            NavigationBarItem(
                selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(route = navItem.route, navOptions = navOptions {
                        //Limit backStack
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    })
                    //topTitle = navItem.title
                },

                icon = {
                    Icon(painter = painterResource(id = navItem.icon), contentDescription = navItem.label)
                },

                // label
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF16AA9B),
                selectedTextColor = Color(0xFF16AA9B),
                indicatorColor = Color(0xFFFFFFFF),
                unselectedTextColor = Color(0xFF161313)
            )
            )
        }
    }
}
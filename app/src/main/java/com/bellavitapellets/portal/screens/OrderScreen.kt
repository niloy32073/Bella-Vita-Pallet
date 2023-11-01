package com.bellavitapellets.portal.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bellavitapellets.portal.component.webViewLoader

@Composable
fun orderScreen(){
    webViewLoader(url = "portal.bellavitapellets.com/shop/")
}
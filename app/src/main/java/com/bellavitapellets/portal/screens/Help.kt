package com.bellavitapellets.portal.screens

import androidx.compose.runtime.Composable
import com.bellavitapellets.portal.component.webViewLoader


@Composable
fun helpScreen(){
    webViewLoader(url = "portal.bellavitapellets.com/cs/")
}
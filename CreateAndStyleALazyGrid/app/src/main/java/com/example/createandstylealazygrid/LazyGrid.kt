package com.example.createandstylealazygrid

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun LazyGrid(){
    LazyVerticalGrid(columns = GridCells.Adaptive(140.dp)){
        items(1000){
            MyGridCell()
        }
    }
}

@Composable
fun MyGridCell(){
    Card (
        elevation = 16.dp,
        modifier = Modifier.padding(8.dp)
            ) {
        Box(
            modifier = Modifier.padding(8.dp).fillMaxSize
        ){

        }
    }
}
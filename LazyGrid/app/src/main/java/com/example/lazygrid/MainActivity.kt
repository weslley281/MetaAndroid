package com.example.lazygrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ListItemDefaults.Elevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarDefaults.Elevation
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazygrid.ui.theme.LazyGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)){
                items(500){number ->
                    MyGridCell(number)
                }
            }
        }
    }
}

@Composable
fun MyGridCell(number: Int){
    Card(
        modifier = Modifier.padding(8.dp),
    ) {
        Box(
            modifier = Modifier.aspectRatio(1f),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Item " + number,
                fontSize = 20.sp)
        }
    }
}
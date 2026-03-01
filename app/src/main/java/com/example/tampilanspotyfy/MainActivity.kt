package com.example.tampilanspotyfy

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tampilanspotyfy.ui.theme.TampilanSpotyfyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TampilanSpotyfyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.fillMaxSize().padding(innerPadding)){
                    /*  Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    Column(modifier = Modifier.padding(innerPadding)) {
                        header()

                        header2()

                        Contoh()
                    }

                        Footer(modifier = Modifier.align(Alignment.BottomCenter))

                    }
                }
            }
        }
    }
}

@Composable
fun header(modifier: Modifier = Modifier){
    Row(modifier= modifier) {
        Image(
            painter = painterResource(R.drawable.profil1),
            contentDescription = null,
            modifier=Modifier.size(50.dp)
        )
        Spacer(modifier=modifier.width(10.dp))
        Button(onClick={
            println("Button Clik")}){
            Text(text="Semua")
        }

        Spacer(modifier=modifier.width(10.dp))

        Button(onClick={
            println("Button Clik")}){
            Text(text="Musik")
        }

        Spacer(modifier=modifier.width(10.dp))

        Button(onClick={
            println("Button Clik")}){
            Text(text="Podcast")
        }
    }
}

@Composable
fun header2(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.foto1),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(text = "kota ini \ntak sama tanpa mu ")
        }

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {

            Image(
                painter = painterResource(R.drawable.foto2),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Text(text = "Nadif Basalamah")
        }


    }

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {

            Image(
                painter = painterResource(R.drawable.foto3),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Text(text = "Bersenja Gurau")
        }

        Spacer(modifier = Modifier.width(5.dp))
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.foto4),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Text(text = "Lagu Timur viral \n fyp tiktok")
        }


    }

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {

            Image(
                painter = painterResource(R.drawable.foto5),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Text(text = "Mood Belajar")
        }

        Spacer(modifier = Modifier.width(5.dp))
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.foto6),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Text(text = "Mix Idgitaf")
        }
    }

    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "Sering Kamu Putar baru - baru ini", fontWeight = FontWeight.Bold, fontSize = 24.sp)
    Row() {
        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.foto8),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )

                Column() {
                    Text(text = "Lesung Pipi")
                    Text(text = "Raim Laude", fontSize = 12.sp)
                }
            }
        }
    }

    Row() {
        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.foto9),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )

                Column() {
                    Text(text = "Hati-Hati Di jalan")
                    Text(text = "Tulus", fontSize = 12.sp)
                }
            }
        }
    }

    Row() {
        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.foto10),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )

                Column() {
                    Text(text = "Tiba Tiba Jumat Lagi")
                    Text(text = "Nadhif Basamalah", fontSize = 12.sp)
                }
            }
        }
    }
    Text(text = "Rekomendasi Untuk Anda", fontSize = 24.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.home),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Home", fontSize = 10.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.search),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Search", fontSize = 10.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Collection", fontSize = 10.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.spotify),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Spotify", fontSize = 10.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.plus),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Buat", fontSize = 10.sp)
        }
    }
}

@Composable
fun Contoh (){
    Text(text = "Daniel")
    Text(text = "2357051015")
}





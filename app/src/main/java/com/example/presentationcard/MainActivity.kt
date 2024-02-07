package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {

    val img = painterResource(R.drawable.presentation_card)

    Box (
        modifier = modifier.fillMaxSize()
    ){
        Image(
            painter = img,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()
        ){
            PersonalData(modifier = modifier)
            ContactData(modifier = modifier)
        }
    }
}

@Composable
fun PersonalData(modifier: Modifier){

    val img = painterResource(R.drawable.foto)

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = img,
            contentDescription = stringResource(R.string.personal_photo),
            modifier = modifier.scale(0.7f)
        )
        Text(
            text = stringResource(R.string.i_m_pedro_higuera),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 15.dp)
        )
        Text(
            text = stringResource(R.string.android_developer),
            fontSize = 18.sp
        )
    }
}

@Composable
fun ContactData(modifier: Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.linkedin_pedrohiguerag),
            fontSize = 18.sp
        )
        Text(
            text = stringResource(R.string.github_pedrohiguerag),
            fontSize = 18.sp
        )
        Text(
            text = stringResource(R.string.torre_higueragarzonpedroarturo),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentationCardTheme {
        PresentationCard()
    }
}
package com.example.navigationcompose.ui.view.screen

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationcompose.model.Mahasiswa
import com.example.navigationcompose.model.RencanaStudi

@Composable
fun TampilDataView(
mhs: Mahasiswa,
rcs: RencanaStudi,
onClickButton:() -> Unit
){

}

@Composable
fun TampilData(
    judul :String,
    isinya :String
){
    Row (modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier .weight(0.8f))
        Text(":", modifier = Modifier .weight(0.2f))
        Text(isinya, modifier = Modifier .weight(2f))

    }
}
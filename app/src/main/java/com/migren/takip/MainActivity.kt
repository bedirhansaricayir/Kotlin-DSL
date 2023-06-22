package com.migren.takip

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.maxkeppeker.sheets.core.models.base.rememberUseCaseState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.calendar.models.CalendarStyle
import com.migren.takip.ui.theme.MigrenTakipTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MigrenTakipTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var state = rememberUseCaseState()
                    var kayıtEdildi by remember { mutableStateOf<List<Pair<LocalDate, String>>>(listOf()) }
                    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(onClick = {state.show() }) {
                            Text(text = "Takvimi Aç")
                        }
                        CalendarDialog(
                            state = state,
                            config = CalendarConfig(
                                yearSelection = true,
                                monthSelection = true,
                                style = CalendarStyle.MONTH,
                                disabledDates = kayıtEdildi.map { it.first }
                            ),
                            selection = CalendarSelection.Date {
                                kayıtEdildi = kayıtEdildi + Pair(it,"Şiddetli baş ağrısı")
                            }
                        )
                        kayıtEdildi.forEach {
                            Text(text = "${it.first} Tarihinde Yaşadığın Belirtiler\n"+ it.second)
                        }
                    }
                }
            }
        }
    }
}


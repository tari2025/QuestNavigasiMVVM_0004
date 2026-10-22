package com.example.newpertemuan6.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    nama: String,
    jenisKelamin: String,
    alamat: String,
    onBackBtnClick: () -> Unit
) {
    val items = listOf(
        Pair("Nama Lengkap", nama),
        Pair("Jenis Kelamin", jenisKelamin),
        Pair("Alamat", alamat)
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Tampilan Data") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Cyan
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(isiRuang)
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase())
                        Text(
                            text = item.second,
                            style = MaterialTheme.typography.titleMedium
                        )
                        HorizontalDivider(
                            thickness = 1.dp,
                            color = Color.Cyan
                        )
                    }
                }
            }

            Button(
                onClick = onBackBtnClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Back")
            }
        }
    }
}

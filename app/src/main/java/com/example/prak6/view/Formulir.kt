package com.example.newpertemuan6.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    onSubmitBtnClick: (String, String, String) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("Laki-laki") }
    var alamat by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Form Isian") },
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
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Nama Lengkap") },
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Jenis Kelamin")

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = jenisKelamin == "Laki-laki",
                    onClick = { jenisKelamin = "Laki-laki" }
                )
                Text("Laki-laki")

                Spacer(modifier = Modifier.width(8.dp))

                RadioButton(
                    selected = jenisKelamin == "Perempuan",
                    onClick = { jenisKelamin = "Perempuan" }
                )
                Text("Perempuan")
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Alamat") },
                singleLine = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    onSubmitBtnClick(
                        nama,
                        jenisKelamin,
                        alamat
                    )
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Submit")
            }
        }
    }
}

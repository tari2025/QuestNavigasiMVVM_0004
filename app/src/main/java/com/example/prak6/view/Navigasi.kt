
package com.example.prak6

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak6.view.FormIsian
import com.example.prak6.view.TampilData

@Composable
fun DataApp() {
    val navController = rememberNavController()

    var namaSiswa by remember { mutableStateOf("") }
    var jenisKelaminSiswa by remember { mutableStateOf("") }
    var alamatSiswa by remember { mutableStateOf("") }

    NavHost(
        navController = navController,
        startDestination = "form"
    ) {
        composable("form") {
            FormIsian(
                onSubmitBtnClick = { nama, jenisKelamin, alamat ->
                    namaSiswa = nama
                    jenisKelaminSiswa = jenisKelamin
                    alamatSiswa = alamat

                    navController.navigate("detail")
                }
            )
        }

        composable("detail") {
            TampilData(
                nama = namaSiswa,
                jenisKelamin = jenisKelaminSiswa,
                alamat = alamatSiswa,
                onBackBtnClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}

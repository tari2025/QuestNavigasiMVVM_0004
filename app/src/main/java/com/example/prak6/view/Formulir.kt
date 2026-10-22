@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenis: List<String> = listOf("Laki-laki", "Perempuan"),
    onSubmitBtnClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = "Form Isian")) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) {
        if (isiRuang) {
            Column(
                modifier = Modifier.padding(paddingValues = isiRuang),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = "",
                    singleLine = true,
                    modifier = Modifier
                        .padding(top = 28.dp)
                )
            }
        }
    }
}
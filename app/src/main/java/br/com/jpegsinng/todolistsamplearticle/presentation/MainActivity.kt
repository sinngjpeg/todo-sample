package br.com.jpegsinng.todolistsamplearticle.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.jpegsinng.todolistsamplearticle.presentation.ui.TaskListScreen
import br.com.jpegsinng.todolistsamplearticle.ui.theme.TodolistsamplearticleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint // Necessário para usar Hilt na Activity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ativa o modo edge-to-edge (opcional, para melhor aparência)
        enableEdgeToEdge()

        // Define o conteúdo da tela
        setContent {
            TodolistsamplearticleTheme { // Aplica o tema do aplicativo
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { AppTopBar() } // Barra superior personalizada
                ) { innerPadding ->
                    // Exibe a tela principal (lista de tarefas)
                    TaskListScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar() {
    TopAppBar(
        title = { Text("To-Do List") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary, // Cor de fundo
            titleContentColor = MaterialTheme.colorScheme.onPrimary // Cor do título
        )
    )
}


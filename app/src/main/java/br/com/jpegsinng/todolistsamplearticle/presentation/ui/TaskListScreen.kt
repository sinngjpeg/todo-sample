package br.com.jpegsinng.todolistsamplearticle.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import br.com.jpegsinng.todolistsamplearticle.presentation.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(
    modifier: Modifier = Modifier,
    viewModel: TaskViewModel = hiltViewModel()
) {
    var showAddTaskDialog by remember { mutableStateOf(false) }

    val tasks by viewModel.tasks.observeAsState(emptyList())

    Column(modifier = modifier) {
        // Botão para abrir o diálogo de adicionar tarefa
        Button(
            onClick = { showAddTaskDialog = true },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Adicionar Tarefa")
        }

        LazyColumn(
            modifier = modifier.fillMaxSize()
        ) {
            items(tasks) { task ->
                TaskItem(
                    task = task,
                    onComplete = { viewModel.completeTask(task.id) },
                    onDelete = { viewModel.deleteTask(task.id) }
                )
            }
        }
    }


    if (showAddTaskDialog) {
        AddTaskDialog(
            onDismiss = { showAddTaskDialog = false }, // Fecha o diálogo
            onAddTask = { taskTitle ->
                viewModel.addTask(taskTitle) // Adiciona a nova tarefa no ViewModel
                showAddTaskDialog = false  // Fecha o diálogo após adicionar a tarefa
            }
        )
    }
}
package br.com.jpegsinng.todolistsamplearticle.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.jpegsinng.todolistsamplearticle.domain.model.Task
import br.com.jpegsinng.todolistsamplearticle.domain.usecase.AddTaskUseCase
import br.com.jpegsinng.todolistsamplearticle.domain.usecase.CompleteTaskUseCase
import br.com.jpegsinng.todolistsamplearticle.domain.usecase.DeleteTaskUseCase
import br.com.jpegsinng.todolistsamplearticle.domain.usecase.GetAllTasksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val deleteTaskUseCase: DeleteTaskUseCase,
    private val addTaskUseCase: AddTaskUseCase,
    private val getAllTasksUseCase: GetAllTasksUseCase,
    private val completeTaskUseCase: CompleteTaskUseCase
) : ViewModel() {

    private val _tasks = MutableLiveData<List<Task>>()
    val tasks: LiveData<List<Task>> get() = _tasks

    init {
        loadTasks()
    }

    private fun loadTasks() {
        viewModelScope.launch {
            _tasks.value = getAllTasksUseCase()
        }
    }

    fun completeTask(taskId: String) {
        viewModelScope.launch {
            completeTaskUseCase(taskId)
            loadTasks()
        }
    }

    fun addTask(title: String) {
        viewModelScope.launch {
            val newTask =
                Task(id = UUID.randomUUID().toString(), title = title, isCompleted = false)
            addTaskUseCase(newTask)
            loadTasks()
        }
    }

    fun deleteTask(taskId: String) {
        viewModelScope.launch {
            deleteTaskUseCase(taskId)
            loadTasks()
        }
    }
}


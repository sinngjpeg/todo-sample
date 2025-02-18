package br.com.jpegsinng.todolistsamplearticle.domain.repository

import br.com.jpegsinng.todolistsamplearticle.domain.model.Task

interface TaskRepository {
    suspend fun getAllTasks(): List<Task>
    suspend fun getTaskById(taskId: String): Task
    suspend fun updateTask(task: Task)
    suspend fun addTask(task: Task)
    suspend fun deleteTask(taskId: String)
}
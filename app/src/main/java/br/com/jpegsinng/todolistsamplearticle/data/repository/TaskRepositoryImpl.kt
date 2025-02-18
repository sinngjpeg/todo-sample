package br.com.jpegsinng.todolistsamplearticle.data.repository

import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import br.com.jpegsinng.todolistsamplearticle.data.database.TaskDao
import br.com.jpegsinng.todolistsamplearticle.data.mappers.toDomainModel
import br.com.jpegsinng.todolistsamplearticle.data.mappers.toEntity
import br.com.jpegsinng.todolistsamplearticle.domain.model.Task
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(private val taskDao: TaskDao) : TaskRepository {
    override suspend fun getTaskById(taskId: String): Task {
        return taskDao.getTaskById(taskId).toDomainModel()
    }

    override suspend fun updateTask(task: Task) {
        taskDao.updateTask(task.toEntity())
    }

    override suspend fun getAllTasks(): List<Task> {
        return taskDao.getAllTasks().map { it.toDomainModel() }
    }

    override suspend fun addTask(task: Task) {
        taskDao.insert(task.toEntity())
    }

    override suspend fun deleteTask(taskId: String) {
        taskDao.deleteById(taskId)
    }
}

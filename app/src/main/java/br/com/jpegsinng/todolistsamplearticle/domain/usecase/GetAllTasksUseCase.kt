package br.com.jpegsinng.todolistsamplearticle.domain.usecase

import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import br.com.jpegsinng.todolistsamplearticle.domain.model.Task
import javax.inject.Inject

class GetAllTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(): List<Task> {
        return taskRepository.getAllTasks()
    }
}
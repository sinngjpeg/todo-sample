package br.com.jpegsinng.todolistsamplearticle.domain.usecase

import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import javax.inject.Inject

class CompleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskId: String) {
        val task = taskRepository.getTaskById(taskId)
        val updatedTask = task.markAsCompleted()
        taskRepository.updateTask(updatedTask)
    }
}

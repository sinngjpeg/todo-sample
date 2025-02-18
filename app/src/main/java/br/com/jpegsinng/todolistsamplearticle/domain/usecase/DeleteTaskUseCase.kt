package br.com.jpegsinng.todolistsamplearticle.domain.usecase

import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskId: String) {
        taskRepository.deleteTask(taskId)
    }
}
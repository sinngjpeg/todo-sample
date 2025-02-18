package br.com.jpegsinng.todolistsamplearticle.domain.usecase

import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import br.com.jpegsinng.todolistsamplearticle.domain.model.Task
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(task: Task) {
        taskRepository.addTask(task)
    }
}
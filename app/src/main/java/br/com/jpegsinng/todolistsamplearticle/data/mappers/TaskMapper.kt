package br.com.jpegsinng.todolistsamplearticle.data.mappers

import br.com.jpegsinng.todolistsamplearticle.data.database.TaskEntity
import br.com.jpegsinng.todolistsamplearticle.domain.model.Task

fun TaskEntity.toDomainModel(): Task {
    return Task(id = this.id, title = this.title, isCompleted = this.isCompleted)
}

fun Task.toEntity(): TaskEntity {
    return TaskEntity(id = this.id, title = this.title, isCompleted = this.isCompleted)
}
package br.com.jpegsinng.todolistsamplearticle.domain.model

data class Task(
    val id: String,
    val title: String,
    val isCompleted: Boolean
) {
    fun markAsCompleted(): Task {
        return this.copy(isCompleted = true)
    }
}
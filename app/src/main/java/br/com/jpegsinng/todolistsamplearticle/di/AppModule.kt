package br.com.jpegsinng.todolistsamplearticle.di

import android.content.Context
import androidx.room.Room
import br.com.jpegsinng.todolistsamplearticle.data.database.AppDatabase
import br.com.jpegsinng.todolistsamplearticle.data.database.TaskDao
import br.com.jpegsinng.todolistsamplearticle.data.repository.TaskRepositoryImpl
import br.com.jpegsinng.todolistsamplearticle.domain.repository.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "tasks_db").build()
    }

    @Provides
    fun provideTaskDao(database: AppDatabase): TaskDao {
        return database.taskDao()
    }

    @Provides
    fun provideTaskRepository(taskDao: TaskDao): TaskRepository {
        return TaskRepositoryImpl(taskDao)
    }
}
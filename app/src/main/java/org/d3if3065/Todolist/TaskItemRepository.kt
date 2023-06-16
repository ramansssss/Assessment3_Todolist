package org.d3if3065.Todolist

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow
import org.d3if3065.Todolist.db.TaskItem
import org.d3if3065.Todolist.db.TaskItemDao

class TaskItemRepository(private val taskItemDao: TaskItemDao)
{
    val allTaskItems: Flow<List<TaskItem>> = taskItemDao.allTaskItems()

    @WorkerThread
    suspend fun insertTaskItem(taskItem: TaskItem)
    {
        taskItemDao.insertTaskItem(taskItem)
    }

    @WorkerThread
    suspend fun updateTaskItem(taskItem: TaskItem)
    {
        taskItemDao.updateTaskItem(taskItem)
    }
}
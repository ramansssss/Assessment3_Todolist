package org.d3if3065.Todolist

import android.app.Application
import org.d3if3065.Todolist.db.TaskItemDatabase

class TodoApplication : Application()
{
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}
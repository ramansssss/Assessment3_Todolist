package org.d3if3065.Todolist

import org.d3if3065.Todolist.db.TaskItem

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}
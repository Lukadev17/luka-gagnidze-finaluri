package luka.gagnidze.service;

import luka.gagnidze.DTO.*;

public interface TaskService {

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);

    GetTasksOutput getTasks(GetTasksInput getTasksInput);


}
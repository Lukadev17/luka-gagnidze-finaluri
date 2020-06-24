package luka.gagnidze.controller;

import luka.gagnidze.DTO.*;
import luka.gagnidze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TaskController")
public class TaskController {

    @Autowired
    TaskService taskService;


    @PostMapping("add-task")
    public AddTaskOutput getTasks(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("delete-task")
    public DeleteTaskOutput getTasks(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }

    @PostMapping("get-tasks")
    public GetTasksOutput getTasks(@RequestBody GetTasksInput getTasksInput) {
        return taskService.getTasks(getTasksInput);
    }
}

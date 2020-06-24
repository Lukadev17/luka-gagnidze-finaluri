package luka.gagnidze.service.impl;

import luka.gagnidze.DTO.*;
import luka.gagnidze.model.Task;
import luka.gagnidze.repository.TaskRepository;
import luka.gagnidze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepository.save(task);
        addTaskOutput.setMessage("Task-ი წარმატებით დაემატა");
        return addTaskOutput;

    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        Task task = taskRepository.getOne(deleteTaskInput.getTaskId());
        taskRepository.delete(task);
        deleteTaskOutput.setMessage("Task-ი წარმატებით წაიშალა");
        return deleteTaskOutput;
    }

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {

        GetTasksOutput getTasksOutput = new GetTasksOutput();
        List<TaskDto> taskDtos = new ArrayList<>();

        for (Task currentTask : taskRepository.findAll()) {
            TaskDto taskDto = new TaskDto();
            taskDto.setId(currentTask.getId());
            taskDto.setTitle(currentTask.getTitle());
            taskDto.setDescription(currentTask.getDescription());
            taskDto.setStartDate(currentTask.getStartDate());
            taskDto.setEndDate(currentTask.getEndDate());
            taskDtos.add(taskDto);
        }
        getTasksOutput.setTasksData(taskDtos);
        return getTasksOutput;
    }
}

package luka.gagnidze.DTO;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDto> tasksData;
}
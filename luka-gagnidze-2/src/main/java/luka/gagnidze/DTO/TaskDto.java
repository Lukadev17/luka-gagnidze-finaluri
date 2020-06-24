package luka.gagnidze.DTO;


import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
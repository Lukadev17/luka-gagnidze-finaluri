package luka.gagnidze.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pdfUrl;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "attachment")
    @ToString.Exclude
    private Book book;
}
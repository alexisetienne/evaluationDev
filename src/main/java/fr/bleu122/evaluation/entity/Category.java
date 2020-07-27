package fr.bleu122.evaluation.entity;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//JPA
@Entity
@Table(name = "CATEGORY", schema = "bleu_schema")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_NOTES")
    private Long idNote;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", targetEntity = Question.class)
    private Set<Question> questions = new HashSet<>();

    @ManyToOne(targetEntity = Notes.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_NOTES", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    private Notes notes;
}

package fr.bleu122.evaluation.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;
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
@Table(name = "QUESTION", schema = "bleu_schema")
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_CATEGORY")
    private Long idCategory;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question", targetEntity = Answer.class)
    private Set<Answer> answers = new HashSet<>();

    @ManyToOne(targetEntity = Category.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEGORY", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    private Category category;
}

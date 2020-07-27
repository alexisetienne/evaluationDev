package fr.bleu122.evaluation.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

//Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//JPA
@Entity
@Table(name = "ANSWER", schema = "bleu_schema")
public class Answer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;


    @Column(name = "NAME")
    private String name;

    @Column(name = "ANSWER_VALUE")
    private boolean answerValue;

    @Column(name = "ID_QUESTION")
    private Long idQuestion;

    @ManyToOne(targetEntity = Question.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_QUESTION", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    private Question question;
}

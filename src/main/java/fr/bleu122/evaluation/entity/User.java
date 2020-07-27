package fr.bleu122.evaluation.entity;

import java.util.*;
import lombok.*;
import javax.persistence.*;


//Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//JPA
@Entity
@Table(name = "USER", schema = "bleu_schema")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "CGU_READ")
    private boolean cguRead;

    @Column(name = "REGISTER_DATE")
    private Date registerDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", targetEntity = Notes.class)
    private Set<Notes> notes = new HashSet<>();

}

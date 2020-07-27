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
@Table(name = "NOTES", schema = "bleu_schema")
public class Notes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "VALUE")
    private Long value;

    @Column(name = "ID_USER")
    private Long userId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "notes", targetEntity = Category.class)
    private Set<Category> category = new HashSet<>();

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    private User user;
}

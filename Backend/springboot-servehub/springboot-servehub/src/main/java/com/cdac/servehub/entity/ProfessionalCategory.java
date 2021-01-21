package com.cdac.servehub.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "professional_category")
@Getter
@Setter
public class ProfessionalCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany (cascade = CascadeType.ALL ,mappedBy = "category")
    private Set<Professional> professionals;
}

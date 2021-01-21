package com.cdac.servehub.entity;

import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "professional")
@Data
public class Professional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long Id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "mobile_no")
    private String mobileNo;
    @Column (name = "user_name")
    private String userName;
    @Column (name = "user_pass")
    private String userPass;
    @Column (name = "city")
    private String city;
    @Column (name = "description")
    private String description;
    @Column (name = "age")
    private int age;
    @Column (name = "units_in_order")
    private int unitsInOrder;
    @Column (name = "image_url")
    private String imageUrl;
    @Column (name = "unit_price")
    private double unitPrice;
    @Column (name = "experience")
    private int experience;
    @Column (name = "active")
    private boolean active;
    @CreationTimestamp
    @Column (name = "date_created")
    private Date dateCreated;
    @UpdateTimestamp
    @Column (name = "last_updated")
    private Date lastUpdated;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false )
    private ProfessionalCategory category;
}

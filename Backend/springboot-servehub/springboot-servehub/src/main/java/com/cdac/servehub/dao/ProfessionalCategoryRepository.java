package com.cdac.servehub.dao;

import com.cdac.servehub.entity.ProfessionalCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "professionalCategory",path = "professional-category")
public interface ProfessionalCategoryRepository extends JpaRepository<ProfessionalCategory,Long> {

    @Query(value="select * from professional_category where id = ?",nativeQuery = true)
    public ProfessionalCategory findById1(Long id);
}



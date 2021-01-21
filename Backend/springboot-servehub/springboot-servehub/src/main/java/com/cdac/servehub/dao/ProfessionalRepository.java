package com.cdac.servehub.dao;


import com.cdac.servehub.entity.Professional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProfessionalRepository extends JpaRepository<Professional,Long> {
    Page<Professional> findByCategoryId(@RequestParam("id") Long id , Pageable pageable);
    Page<Professional> findByCityContaining(@RequestParam("city") String city, Pageable pageable);
    //public Professional findByUserName(String emailId);

}

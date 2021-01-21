//package com.cdac.servehub.controller;
//
//import com.cdac.servehub.dao.ProfessionalCategoryRepository;
//import com.cdac.servehub.entity.Professional;
//import com.cdac.servehub.entity.ProfessionalCategory;
//import com.cdac.servehub.service.ProfessionalService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProfessionalController {
//    @Autowired
//    private ProfessionalService professionalService;
//
//    @Autowired
//    private ProfessionalCategoryRepository professionalCategoryr;
//
//    @PostMapping("/professional123")
//    @CrossOrigin(origins = "http://localhost:4200")
//    public Professional registerProfessional(@RequestBody Professional professional) throws Exception {
//        System.out.println(professional.getCategory().getId()+"hello");
//        String tempEmailId = professional.getUserName();
//        System.out.println(professional.getCategory().getId()+"hello");
//        Long a = professional.getCategory().getId();
//
//        ProfessionalCategory professionalCategory1 = professionalCategoryr.findById1(a);
//        professional.setCategory(professionalCategory1);
//
////        if(tempEmailId != null) {
////            Professional professional1 = professionalService.fetchUserByEmailId(tempEmailId);
////            if(professional1 != null) {
////                throw new Exception("professional with "+tempEmailId+"already present");
////            }
////        }
//
//        Professional professionalobja = new Professional();
//        professionalobja = professionalService.saveProfessional(professional);
//        return professionalobja;
//    }
//}

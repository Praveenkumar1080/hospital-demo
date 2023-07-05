package com.cg.hms.Controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hms.Entity.Nurse;
import com.cg.hms.Entity.Procedures;
import com.cg.hms.Service.ProcedureServiceImpl;

 
@RestController
@RequestMapping(value="/api/procedure")
public class Procedure {
    private ProcedureServiceImpl service;
    @Autowired
    public void setService(ProcedureServiceImpl service) {
    	this.service = service;
    }
    	
    @PostMapping
        public ResponseEntity<Procedures>saveProcedure(@RequestBody Procedures proc) {
            Procedures pro = service.saveProcedure(proc);
        	ResponseEntity<Procedures> res = new ResponseEntity<>(pro,HttpStatus.OK);
            return res;
        }
    @GetMapping(value="/")
        public ResponseEntity<List<Procedures>> getprocedure() {
        	
            List<Procedures> list = service.getAllProcedures();
            ResponseEntity<List<Procedures>> res = new ResponseEntity<>(list,HttpStatus.OK);
            return res;
    }
    @GetMapping(value="/cost/{id}")
        public ResponseEntity <Procedures> getid(@RequestParam(value="id") Integer id) {
    	    Procedures obj = service.getCostOfProcedureById(id); 
            ResponseEntity<Procedures>res = new ResponseEntity<>(obj,HttpStatus.OK);
            return res;
    }
    @GetMapping(value="/cost/{name}")
        public ResponseEntity <List<Procedures>>searchName(@RequestParam(value="name") String name) {
    	    List<Procedures> obj = service.getCostOfProcedureByName(name);
            ResponseEntity<List<Procedures>> res = new ResponseEntity<>(obj,HttpStatus.OK);
            return res;
    }
    @RequestMapping(method= RequestMethod.PUT, value = "/cost")
        public ResponseEntity <Procedures>updateCost(@RequestBody Procedures
   			 pro,@RequestParam("empid") Integer empid) {
    	    Procedures procedure = service.updateCostOfProcedure(empid, pro);
            ResponseEntity<Procedures> res = new ResponseEntity<>(procedure,HttpStatus.OK);
            return res;
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/name")
        public ResponseEntity <Procedures>updateName(@RequestBody Procedures
      			 pro,@RequestParam("empid") Integer empid) {
    	    Procedures procedure = service.updateNameOfProcedureB(empid, pro);
            ResponseEntity<Procedures> res = new ResponseEntity<>(procedure,HttpStatus.OK);
            return res;
    }
}


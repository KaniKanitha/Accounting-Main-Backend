package com.example.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstproject.employeeentity.AccountingApplication;
import com.example.myfirstproject.service.AccountingApplicationService;

@RestController
public class AccountingApplicationController {

    @Autowired
    AccountingApplicationService es;

    @PostMapping("adddata")
public ResponseEntity<AccountingApplication>add(@RequestBody AccountingApplication em){
    AccountingApplication obj=es.create(em);
   return new ResponseEntity<>(obj,HttpStatus.CREATED); 
}
@GetMapping("showdata")
public ResponseEntity <List<AccountingApplication>>showinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}
@GetMapping("getdata")
public ResponseEntity <List<AccountingApplication>>getinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}

@PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<AccountingApplication> putMethodName(@PathVariable("employeeId") int id, @RequestBody AccountingApplication employee) {
        if(es.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Boolean> delete(@PathVariable("employeeId") int id)
    {
        if(es.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

}
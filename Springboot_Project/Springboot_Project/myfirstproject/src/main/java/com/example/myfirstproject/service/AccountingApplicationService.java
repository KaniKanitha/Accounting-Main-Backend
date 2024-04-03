package com.example.myfirstproject.service;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstproject.employeeentity.AccountingApplication;
import com.example.myfirstproject.repository.AccountingApplicationRepo;

// import jakarta.persistence.metamodel.ListAttribute;

@Service
public class AccountingApplicationService {

    @Autowired
    AccountingApplicationRepo er;

    public AccountingApplication create(AccountingApplication ee){
        return er.save(ee);
    }

    public java.util.List<AccountingApplication> getalldetails(){
        return er.findAll();
    
    }

    public AccountingApplication getEmployeeById(int id){
        return er.findById(id).orElse(null);
    } 

    public boolean updateDetails(int id,AccountingApplication employee)
        {
            if(this.getEmployeeById(id)==null)
            {
                return false;
            }
            try{
                er.save(employee);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        public boolean deleteEmployee(int id)
        {
            if(this.getEmployeeById(id) == null)
            {
                return false;
            }
            er.deleteById(id);
            return true;
        }

}
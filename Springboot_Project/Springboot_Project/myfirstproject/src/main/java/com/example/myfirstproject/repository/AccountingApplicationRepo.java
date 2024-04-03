package com.example.myfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstproject.employeeentity.AccountingApplication;

public interface AccountingApplicationRepo extends JpaRepository<AccountingApplication,Integer>{

}
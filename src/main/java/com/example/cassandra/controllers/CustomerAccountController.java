package com.example.cassandra.controllers;

import com.example.cassandra.models.CustomerAccount;

import com.example.cassandra.repositories.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class CustomerAccountController {
    @Autowired
    private CustomerAccountRepository repo;
    @PostMapping("/Accounts")
    public ResponseEntity<CustomerAccount> addAccount(@RequestBody CustomerAccount acct) {
        acct.setExternalCustomerId(UUID.randomUUID().toString());
        repo.save(acct);
        return new ResponseEntity<>(acct, HttpStatus.CREATED);
    }

    @GetMapping("/Accounts/{id}")
    public ResponseEntity<CustomerAccount> getAccount(@PathVariable("id") String id ) {
        Optional<CustomerAccount> acct = repo.findById(id);
        if (acct.isPresent()) {
            return new ResponseEntity<>(acct.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}

package com.example.cassandra.repositories;

import com.example.cassandra.models.CustomerAccount;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountRepository extends CassandraRepository<CustomerAccount, String> {
}

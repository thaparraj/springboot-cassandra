package com.example.cassandra.models;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("customeraccount")
@Data
public class CustomerAccount {
    @PrimaryKey
    String externalCustomerId;
    @Column String firstName;
    @Column String lastName;
}

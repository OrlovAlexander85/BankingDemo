package com.orlov.banking_demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "authority")
public class Authority {

    @Id
    private UUID id;
    private String authority;

    public Authority() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

package com.eletronic_system_store.eletronic_store_system.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "supplier_name", nullable = false, length = 100)
    private String supplierName;

    @Column(name = "supplier_code", nullable = false)
    private String cnpjCode;

    @Column(name = "supplier_email", nullable = false, length = 256)
    private String email;

    public SupplierEntity(String name, String cnpjCode, String email) {
        setName(name);
        setCode(cnpjCode);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getCnpjCode() {
        return cnpjCode;
    }

    public String getEmail() {
        return email;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setCnpjCode(String cnpjCode) {
        this.cnpjCode = cnpjCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SupplierEntity() {}
}

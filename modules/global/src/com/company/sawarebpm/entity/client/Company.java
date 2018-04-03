package com.company.sawarebpm.entity.client;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("company")
@Table(name = "SAWARECEA_COMPANY")
@Entity(name = "sawarecea$Company")
public class Company extends Client {
    private static final long serialVersionUID = 9181481346912396067L;

    @NotNull
    @Column(name = "INN", nullable = false, unique = true)
    protected String inn;

    @Column(name = "KPP")
    protected String kpp;

    @Column(name = "OGRN")
    protected String ogrn;

    @Column(name = "JURIDICAL_ADDRESS")
    protected String juridicalAddress;

    @Column(name = "FACT_ADDRESS")
    protected String factAddress;

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getKpp() {
        return kpp;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setJuridicalAddress(String juridicalAddress) {
        this.juridicalAddress = juridicalAddress;
    }

    public String getJuridicalAddress() {
        return juridicalAddress;
    }

    public void setFactAddress(String factAddress) {
        this.factAddress = factAddress;
    }

    public String getFactAddress() {
        return factAddress;
    }


}
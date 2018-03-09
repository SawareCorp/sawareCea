package com.company.sawarebpm.entity.client;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@DiscriminatorValue("phys")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SAWARECEA_CONTRACTOR_PHYS")
@Entity(name = "sawarecea$ContractorPhys")
public class ContractorPhys extends Client {
    private static final long serialVersionUID = -8911958685270570211L;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_BORN")
    protected Date dateBorn;

    @Column(name = "PASSPORT", length = 10)
    protected String passport;

    @Column(name = "ISSUE_BY")
    protected String issueBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "ISSUED_WHEN")
    protected Date issuedWhen;

    @Column(name = "DEVISION_CODE", length = 6)
    protected String devisionCode;

    @Column(name = "SNAILS", length = 11)
    protected String snails;

    @Column(name = "ADDRESS")
    protected String address;

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setIssueBy(String issueBy) {
        this.issueBy = issueBy;
    }

    public String getIssueBy() {
        return issueBy;
    }

    public void setIssuedWhen(Date issuedWhen) {
        this.issuedWhen = issuedWhen;
    }

    public Date getIssuedWhen() {
        return issuedWhen;
    }

    public void setDevisionCode(String devisionCode) {
        this.devisionCode = devisionCode;
    }

    public String getDevisionCode() {
        return devisionCode;
    }

    public void setSnails(String snails) {
        this.snails = snails;
    }

    public String getSnails() {
        return snails;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }



















}
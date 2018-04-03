package com.company.sawarebpm.entity.questionnaire;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("Quest")
@Table(name = "SAWARECEA_QUESTIONNAIRE")
@Entity(name = "sawarecea$Questionnaire")
public class Questionnaire extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -6168682323758563351L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    protected Long number;

    @Column(name = "NAME")
    protected String name;

    @Composition
    @OneToMany(mappedBy = "questionnaire")
    protected List<ClosedLoans> closedLoans;

    @Composition
    @OneToMany(mappedBy = "questionnaire")
    protected List<CurrentLoan> currentLoan;

    @Composition
    @OneToMany(mappedBy = "questionnaire")
    protected List<RequestedCredit> requsestedCredit;

    @Column(name = "PROPERTY", length = 2000)
    protected String property;

    @Column(name = "BAILIFFS_DEBT", length = 2000)
    protected String bailiffsDebt;

    @Column(name = "DELINQUENCIES", length = 2000)
    protected String delinquencies;

    @Column(name = "LITIGATIONS", length = 2000)
    protected String litigations;

    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Version
    @Column(name = "VERSION", nullable = false)
    protected Integer version;

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<CurrentLoan> getCurrentLoan() {
        return currentLoan;
    }

    public void setCurrentLoan(List<CurrentLoan> currentLoan) {
        this.currentLoan = currentLoan;
    }


    public void setClosedLoans(List<ClosedLoans> closedLoans) {
        this.closedLoans = closedLoans;
    }

    public List<ClosedLoans> getClosedLoans() {
        return closedLoans;
    }



    public void setRequsestedCredit(List<RequestedCredit> requsestedCredit) {
        this.requsestedCredit = requsestedCredit;
    }

    public List<RequestedCredit> getRequsestedCredit() {
        return requsestedCredit;
    }


    public void setBailiffsDebt(String bailiffsDebt) {
        this.bailiffsDebt = bailiffsDebt;
    }

    public String getBailiffsDebt() {
        return bailiffsDebt;
    }


    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void setDelinquencies(String delinquencies) {
        this.delinquencies = delinquencies;
    }

    public String getDelinquencies() {
        return delinquencies;
    }

    public void setLitigations(String litigations) {
        this.litigations = litigations;
    }

    public String getLitigations() {
        return litigations;
    }


    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    @Override
    public Date getCreateTs() {
        return createTs;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public Integer getVersion() {
        return version;
    }


}
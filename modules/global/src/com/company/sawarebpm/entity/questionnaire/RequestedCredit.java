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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "SAWARECEA_REQUESTED_CREDIT")
@Entity(name = "sawarecea$RequestedCredit")
public class RequestedCredit extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = 5966970548753499028L;

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

    @Column(name = "CREDIT_VALUE")
    protected String creditValue;

    @Column(name = "CREDIT_TERM")
    protected String creditTerm;

    @Column(name = "INTEREST_RATE")
    protected String interestRate;

    @Column(name = "PLEDGE", length = 2000)
    protected String pledge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUESTIONNAIRE_ID")
    protected Questionnaire questionnaire;

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
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

    public void setCreditValue(String creditValue) {
        this.creditValue = creditValue;
    }

    public String getCreditValue() {
        return creditValue;
    }

    public void setCreditTerm(String creditTerm) {
        this.creditTerm = creditTerm;
    }

    public String getCreditTerm() {
        return creditTerm;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }

    public String getPledge() {
        return pledge;
    }


}
package com.company.sawarebpm.entity.questionnaire;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "SAWARECEA_CURRENT_LOAN")
@Entity(name = "sawarecea$CurrentLoan")
public class CurrentLoan extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -2375762078230314512L;

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

    @Column(name = "ORGANIZATION")
    protected String organization;

    @Column(name = "TYPE_OF_CREDIT")
    protected String typeOfCredit;

    @Column(name = "AMOUNT_OF_CREDIT")
    protected Long amountOfCredit;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_ISSUE")
    protected Date dateOfIssue;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_PAYMENT")
    protected Date lastPayment;

    @Column(name = "BALANCE_OWED")
    protected Long balanceOwed;

    @Column(name = "MONTHLY_PAYMENT")
    protected Long monthlyPayment;

    @Column(name = "COMMENT_", length = 2000)
    protected String comment;

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

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setAmountOfCredit(Long amountOfCredit) {
        this.amountOfCredit = amountOfCredit;
    }

    public Long getAmountOfCredit() {
        return amountOfCredit;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setBalanceOwed(Long balanceOwed) {
        this.balanceOwed = balanceOwed;
    }

    public Long getBalanceOwed() {
        return balanceOwed;
    }

    public void setMonthlyPayment(Long monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Long getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


}
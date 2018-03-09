package com.company.sawarebpm.entity.questionnaire;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.company.sawarebpm.entity.directories.Bank;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "SAWARECEA_CLOSED_LOANS")
@Entity(name = "sawarecea$ClosedLoans")
public class ClosedLoans extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -163503580559927257L;

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

    @OneToMany(mappedBy = "closedLoans")
    protected List<Bank> bank;

    @Column(name = "TYPE_OF_CREDIT")
    protected String typeOfCredit;

    @Temporal(TemporalType.DATE)
    @Column(name = "CLOSING_DATE")
    protected Date closingDate;

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


    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
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

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public List<Bank> getBank() {
        return bank;
    }


}
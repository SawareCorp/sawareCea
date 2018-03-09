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

@Table(name = "SAWARECEA_SOURCES_OF_INCOME")
@Entity(name = "sawarecea$SourcesOfIncome")
public class SourcesOfIncome extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -2784730450276036783L;

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

    @Column(name = "SOURCE", length = 2000)
    protected String source;

    @Column(name = "EXPERIENCE")
    protected String experience;

    @Column(name = "POSITION_")
    protected String position;

    @Column(name = "DOCUMENT_BASE", length = 511)
    protected String documentBase;

    @Column(name = "AMOUNT_OF_INCOME", length = 2000)
    protected String amountOfIncome;

    @Column(name = "AMOUNT_OF_INCOME2NDFL", length = 511)
    protected String amountOfIncome2ndfl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUEST_INDIV_ID")
    protected Quest_Indiv quest_Indiv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUEST_PHYS_ID")
    protected Quest_phys quest_phys;

    public void setQuest_phys(Quest_phys quest_phys) {
        this.quest_phys = quest_phys;
    }

    public Quest_phys getQuest_phys() {
        return quest_phys;
    }


    public void setQuest_Indiv(Quest_Indiv quest_Indiv) {
        this.quest_Indiv = quest_Indiv;
    }

    public Quest_Indiv getQuest_Indiv() {
        return quest_Indiv;
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

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDocumentBase(String documentBase) {
        this.documentBase = documentBase;
    }

    public String getDocumentBase() {
        return documentBase;
    }

    public void setAmountOfIncome(String amountOfIncome) {
        this.amountOfIncome = amountOfIncome;
    }

    public String getAmountOfIncome() {
        return amountOfIncome;
    }

    public void setAmountOfIncome2ndfl(String amountOfIncome2ndfl) {
        this.amountOfIncome2ndfl = amountOfIncome2ndfl;
    }

    public String getAmountOfIncome2ndfl() {
        return amountOfIncome2ndfl;
    }


}
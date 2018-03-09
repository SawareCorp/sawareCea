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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.DiscriminatorValue;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@DiscriminatorValue("Quest_ph")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SAWARECEA_QUEST_INDIV")
@Entity(name = "sawarecea$Quest_Indiv")
public class Quest_Indiv extends Quest_legal {
    private static final long serialVersionUID = 4306878777981680219L;

    @Column(name = "CRIMINAL_AND_ADMINISTRATIVE_RESPONSIBILITY", length = 2000)
    protected String criminalAndAdministrativeResponsibility;

    @Column(name = "UNDERAGE_CHILDRENS", length = 2000)
    protected String underageChildrens;

    @Composition
    @OneToMany(mappedBy = "quest_Indiv")
    protected List<SourcesOfIncome> sourcesOfIncome;

    public void setUnderageChildrens(String underageChildrens) {
        this.underageChildrens = underageChildrens;
    }

    public String getUnderageChildrens() {
        return underageChildrens;
    }


    public void setSourcesOfIncome(List<SourcesOfIncome> sourcesOfIncome) {
        this.sourcesOfIncome = sourcesOfIncome;
    }

    public List<SourcesOfIncome> getSourcesOfIncome() {
        return sourcesOfIncome;
    }


    public void setCriminalAndAdministrativeResponsibility(String criminalAndAdministrativeResponsibility) {
        this.criminalAndAdministrativeResponsibility = criminalAndAdministrativeResponsibility;
    }

    public String getCriminalAndAdministrativeResponsibility() {
        return criminalAndAdministrativeResponsibility;
    }



}
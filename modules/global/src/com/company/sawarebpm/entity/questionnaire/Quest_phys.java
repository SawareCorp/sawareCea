package com.company.sawarebpm.entity.questionnaire;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("Quest_ph")
@Table(name = "SAWARECEA_QUEST_PHYS")
@Entity(name = "sawarecea$Quest_phys")
public class Quest_phys extends Questionnaire {
    private static final long serialVersionUID = -2155742975744658206L;

    @Column(name = "FULL_NAME", length = 2000)
    protected String fullName;

    @Column(name = "UNDERAGE_CHILDRENS", length = 2000)
    protected String underageChildrens;

    @Composition
    @OneToMany(mappedBy = "quest_phys")
    protected List<SourcesOfIncome> sourceOfIncome;

    @Column(name = "CRIMINAL_AND_ADMINISTRATIVE_RESPONSIBILITY", length = 2000)
    protected String criminalAndAdministrativeResponsibility;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    protected Date dateOfBirth;

    @Column(name = "REGISTRATION_ADDRESS", length = 2000)
    protected String registrationAddress;

    @Column(name = "FACT_ADRESS", length = 2000)
    protected String factAdress;

    @Column(name = "SCND_DOCUMENT", length = 2000)
    protected String scndDocument;

    @Column(name = "PARTICIPATION_IN_COMPANIES", length = 2000)
    protected String participationInCompanies;

    @Column(name = "REGISTRATION_OF_INDIVIDUAL", length = 2000)
    protected String registrationOfIndividual;

    public void setUnderageChildrens(String underageChildrens) {
        this.underageChildrens = underageChildrens;
    }

    public String getUnderageChildrens() {
        return underageChildrens;
    }

    public void setSourceOfIncome(List<SourcesOfIncome> sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public List<SourcesOfIncome> getSourceOfIncome() {
        return sourceOfIncome;
    }


    public void setCriminalAndAdministrativeResponsibility(String criminalAndAdministrativeResponsibility) {
        this.criminalAndAdministrativeResponsibility = criminalAndAdministrativeResponsibility;
    }

    public String getCriminalAndAdministrativeResponsibility() {
        return criminalAndAdministrativeResponsibility;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setFactAdress(String factAdress) {
        this.factAdress = factAdress;
    }

    public String getFactAdress() {
        return factAdress;
    }

    public void setScndDocument(String scndDocument) {
        this.scndDocument = scndDocument;
    }

    public String getScndDocument() {
        return scndDocument;
    }

    public void setParticipationInCompanies(String participationInCompanies) {
        this.participationInCompanies = participationInCompanies;
    }

    public String getParticipationInCompanies() {
        return participationInCompanies;
    }

    public void setRegistrationOfIndividual(String registrationOfIndividual) {
        this.registrationOfIndividual = registrationOfIndividual;
    }

    public String getRegistrationOfIndividual() {
        return registrationOfIndividual;
    }


}
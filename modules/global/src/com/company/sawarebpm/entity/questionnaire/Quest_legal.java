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

@Table(name = "SAWARECEA_QUEST_LEGAL")
@Entity(name = "sawarecea$Quest_legal")
public class Quest_legal extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -6015291532050628450L;

    @Column(name = "NAME_OF_COMPANY", length = 2000)
    protected String nameOfCompany;

    @Column(name = "OGRN")
    protected String ogrn;

    @Column(name = "INN")
    protected String inn;

    @Column(name = "KPP")
    protected String kpp;

    @Column(name = "TERM_OF_EXISTENCE", length = 2000)
    protected String termOfExistence;

    @Column(name = "TAXATION")
    protected String taxation;

    @Column(name = "RECEIPTS", length = 2000)
    protected String receipts;

    @Column(name = "PROFIT_LOSS", length = 2000)
    protected String profitLoss;

    @Column(name = "STAFF", length = 2000)
    protected String staff;

    @Column(name = "MAIN_ACTIVITY", length = 2000)
    protected String mainActivity;

    @Column(name = "OPEN_SETTLEMENT_ACCOUNTS", length = 2000)
    protected String openSettlementAccounts;

    @Column(name = "PURPOSE_OF_LENDING", length = 2000)
    protected String purposeOfLending;

    @Column(name = "LEGAL_ADDRESS", length = 2000)
    protected String legalAddress;

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

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return ogrn;
    }

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

    public void setTermOfExistence(String termOfExistence) {
        this.termOfExistence = termOfExistence;
    }

    public String getTermOfExistence() {
        return termOfExistence;
    }

    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    public String getTaxation() {
        return taxation;
    }

    public void setReceipts(String receipts) {
        this.receipts = receipts;
    }

    public String getReceipts() {
        return receipts;
    }

    public void setProfitLoss(String profitLoss) {
        this.profitLoss = profitLoss;
    }

    public String getProfitLoss() {
        return profitLoss;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getStaff() {
        return staff;
    }

    public void setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
    }

    public String getMainActivity() {
        return mainActivity;
    }

    public void setOpenSettlementAccounts(String openSettlementAccounts) {
        this.openSettlementAccounts = openSettlementAccounts;
    }

    public String getOpenSettlementAccounts() {
        return openSettlementAccounts;
    }

    public void setPurposeOfLending(String purposeOfLending) {
        this.purposeOfLending = purposeOfLending;
    }

    public String getPurposeOfLending() {
        return purposeOfLending;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getLegalAddress() {
        return legalAddress;
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

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }


}
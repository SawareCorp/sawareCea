package com.company.sawarebpm.entity.underwriting;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Version;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;

@Table(name = "SAWARECEA_UNDERWRITING")
@Entity(name = "sawarecea$Underwriting")
public class Underwriting extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -5608169265454408001L;

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

    @Column(name = "SECURITY_CHEK", length = 2000)
    protected String securityChek;

    @Column(name = "EMPLOYER_REVIEW", length = 2000)
    protected String employerReview;

    @Column(name = "CHECKING_SO_BORROWER", length = 2000)
    protected String checkingSoBorrower;

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

    public void setSecurityChek(String securityChek) {
        this.securityChek = securityChek;
    }

    public String getSecurityChek() {
        return securityChek;
    }

    public void setEmployerReview(String employerReview) {
        this.employerReview = employerReview;
    }

    public String getEmployerReview() {
        return employerReview;
    }

    public void setCheckingSoBorrower(String checkingSoBorrower) {
        this.checkingSoBorrower = checkingSoBorrower;
    }

    public String getCheckingSoBorrower() {
        return checkingSoBorrower;
    }


}
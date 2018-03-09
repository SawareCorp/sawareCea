package com.company.sawarebpm.entity.directories;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "SAWARECEA_BUSINESS_STATUS")
@Entity(name = "sawarecea$BusinessStatus")
public class BusinessStatus extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = -1032893395402272559L;

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

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "SERIAL_NUMBER", nullable = false, unique = true)
    protected Integer serialNumber;

    @NotNull
    @Column(name = "WITH_DATE", nullable = false)
    protected Boolean withDate = false;

    @NotNull
    @Column(name = "IS_DEFAULT_STATUS", nullable = false, unique = true)
    protected Boolean isDefaultStatus = false;

    @NotNull
    @Column(name = "BUSINESS_CLOSED", nullable = false)
    protected Boolean businessClosed = false;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWithDate(Boolean withDate) {
        this.withDate = withDate;
    }

    public Boolean getWithDate() {
        return withDate;
    }

    public void setIsDefaultStatus(Boolean isDefaultStatus) {
        this.isDefaultStatus = isDefaultStatus;
    }

    public Boolean getIsDefaultStatus() {
        return isDefaultStatus;
    }

    public void setBusinessClosed(Boolean businessClosed) {
        this.businessClosed = businessClosed;
    }

    public Boolean getBusinessClosed() {
        return businessClosed;
    }


}
package com.company.sawarebpm.entity.contract;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.company.sawarebpm.entity.directories.Service;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.Versioned;
import com.haulmont.cuba.core.entity.Updatable;
import com.haulmont.cuba.core.entity.Creatable;
import com.company.sawarebpm.entity.directories.ServiceStatus;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|service")
@Table(name = "SAWARECEA_SERVICE_LINE")
@Entity(name = "sawarecea$ServiceLine")
public class ServiceLine extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = 4855669825622318817L;

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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

    @NotNull
    @Column(name = "DESIRED_AMOUNT", nullable = false)
    protected Double desiredAmount;

    @Column(name = "PERCENT_")
    protected Integer percent;

    @NotNull
    @Column(name = "COST", nullable = false)
    protected Double cost;

    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SERVICE_STATE_ID")
    protected ServiceStatus serviceState;

    @Column(name = "COMMENT_", length = 1000)
    protected String comment;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACT_ID")
    protected Contract contract;

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }


    public void setServiceState(ServiceStatus serviceState) {
        this.serviceState = serviceState;
    }

    public ServiceStatus getServiceState() {
        return serviceState;
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

    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setDesiredAmount(Double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public Double getDesiredAmount() {
        return desiredAmount;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }


}
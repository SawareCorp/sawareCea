package com.company.sawarebpm.entity.contract;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("№ |")
@Table(name = "SAWARECEA_CONTRACT")
@Entity(name = "sawarecea$Contract")
public class Contract extends BaseUuidEntity implements Versioned, Updatable, Creatable {
    private static final long serialVersionUID = 4159544827790556737L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "CONCLUSION_DATE", nullable = false)
    protected Date conclusionDate;

    @Column(name = "COMPENSATION")
    protected Double compensation;

    @Composition
    @OneToMany(mappedBy = "contract")
    protected List<ServiceLine> services;

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


    public void setServices(List<ServiceLine> services) {
        this.services = services;
    }

    public List<ServiceLine> getServices() {
        return services;
    }


    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setCompensation(Double compensation) {
        this.compensation = compensation;
    }

    public Double getCompensation() {
        return compensation;
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




}
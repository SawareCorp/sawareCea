package com.company.sawarebpm.entity.client;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ClientType implements EnumClass<Integer> {

    Individual(10),
    Company(20),
    Individual_entrepreneur(30);

    private Integer id;

    ClientType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ClientType fromId(Integer id) {
        for (ClientType at : ClientType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
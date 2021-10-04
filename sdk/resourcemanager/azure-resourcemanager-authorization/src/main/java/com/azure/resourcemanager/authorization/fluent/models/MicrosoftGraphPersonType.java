// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** personType. */
@Fluent
public final class MicrosoftGraphPersonType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPersonType.class);

    /*
     * The type of data source, such as Person.
     */
    @JsonProperty(value = "class")
    private String classProperty;

    /*
     * The secondary type of data source, such as OrganizationUser.
     */
    @JsonProperty(value = "subclass")
    private String subclass;

    /*
     * personType
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the classProperty property: The type of data source, such as Person.
     *
     * @return the classProperty value.
     */
    public String classProperty() {
        return this.classProperty;
    }

    /**
     * Set the classProperty property: The type of data source, such as Person.
     *
     * @param classProperty the classProperty value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withClassProperty(String classProperty) {
        this.classProperty = classProperty;
        return this;
    }

    /**
     * Get the subclass property: The secondary type of data source, such as OrganizationUser.
     *
     * @return the subclass value.
     */
    public String subclass() {
        return this.subclass;
    }

    /**
     * Set the subclass property: The secondary type of data source, such as OrganizationUser.
     *
     * @param subclass the subclass value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withSubclass(String subclass) {
        this.subclass = subclass;
        return this;
    }

    /**
     * Get the additionalProperties property: personType.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: personType.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPersonType object itself.
     */
    public MicrosoftGraphPersonType withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
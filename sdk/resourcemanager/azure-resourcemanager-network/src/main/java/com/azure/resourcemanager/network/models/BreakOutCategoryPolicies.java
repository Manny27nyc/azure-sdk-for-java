// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network Virtual Appliance Sku Properties. */
@Fluent
public final class BreakOutCategoryPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BreakOutCategoryPolicies.class);

    /*
     * Flag to control breakout of o365 allow category.
     */
    @JsonProperty(value = "allow")
    private Boolean allow;

    /*
     * Flag to control breakout of o365 optimize category.
     */
    @JsonProperty(value = "optimize")
    private Boolean optimize;

    /*
     * Flag to control breakout of o365 default category.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Get the allow property: Flag to control breakout of o365 allow category.
     *
     * @return the allow value.
     */
    public Boolean allow() {
        return this.allow;
    }

    /**
     * Set the allow property: Flag to control breakout of o365 allow category.
     *
     * @param allow the allow value to set.
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Get the optimize property: Flag to control breakout of o365 optimize category.
     *
     * @return the optimize value.
     */
    public Boolean optimize() {
        return this.optimize;
    }

    /**
     * Set the optimize property: Flag to control breakout of o365 optimize category.
     *
     * @param optimize the optimize value to set.
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withOptimize(Boolean optimize) {
        this.optimize = optimize;
        return this;
    }

    /**
     * Get the defaultProperty property: Flag to control breakout of o365 default category.
     *
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Flag to control breakout of o365 default category.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
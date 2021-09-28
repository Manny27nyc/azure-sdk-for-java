// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.PrivateDnsZoneConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the private dns zone group. */
@Fluent
public final class PrivateDnsZoneGroupPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateDnsZoneGroupPropertiesFormat.class);

    /*
     * The provisioning state of the private dns zone group resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A collection of private dns zone configurations of the private dns zone
     * group.
     */
    @JsonProperty(value = "privateDnsZoneConfigs")
    private List<PrivateDnsZoneConfig> privateDnsZoneConfigs;

    /**
     * Get the provisioningState property: The provisioning state of the private dns zone group resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @return the privateDnsZoneConfigs value.
     */
    public List<PrivateDnsZoneConfig> privateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs;
    }

    /**
     * Set the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @param privateDnsZoneConfigs the privateDnsZoneConfigs value to set.
     * @return the PrivateDnsZoneGroupPropertiesFormat object itself.
     */
    public PrivateDnsZoneGroupPropertiesFormat withPrivateDnsZoneConfigs(
        List<PrivateDnsZoneConfig> privateDnsZoneConfigs) {
        this.privateDnsZoneConfigs = privateDnsZoneConfigs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateDnsZoneConfigs() != null) {
            privateDnsZoneConfigs().forEach(e -> e.validate());
        }
    }
}
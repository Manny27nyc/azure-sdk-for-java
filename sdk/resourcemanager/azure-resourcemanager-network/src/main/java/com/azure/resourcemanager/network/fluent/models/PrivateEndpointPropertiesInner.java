// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.CustomDnsConfigPropertiesFormat;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the private endpoint. */
@Fluent
public final class PrivateEndpointPropertiesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointPropertiesInner.class);

    /*
     * The ID of the subnet from which the private IP will be allocated.
     */
    @JsonProperty(value = "subnet")
    private SubnetInner subnet;

    /*
     * An array of references to the network interfaces created for this
     * private endpoint.
     */
    @JsonProperty(value = "networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /*
     * The provisioning state of the private endpoint resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A grouping of information about the connection to the remote resource.
     */
    @JsonProperty(value = "privateLinkServiceConnections")
    private List<PrivateLinkServiceConnection> privateLinkServiceConnections;

    /*
     * A grouping of information about the connection to the remote resource.
     * Used when the network admin does not have access to approve connections
     * to the remote resource.
     */
    @JsonProperty(value = "manualPrivateLinkServiceConnections")
    private List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections;

    /*
     * An array of custom dns configurations.
     */
    @JsonProperty(value = "customDnsConfigs")
    private List<CustomDnsConfigPropertiesFormat> customDnsConfigs;

    /**
     * Get the subnet property: The ID of the subnet from which the private IP will be allocated.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The ID of the subnet from which the private IP will be allocated.
     *
     * @param subnet the subnet value to set.
     * @return the PrivateEndpointPropertiesInner object itself.
     */
    public PrivateEndpointPropertiesInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the networkInterfaces property: An array of references to the network interfaces created for this private
     * endpoint.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateLinkServiceConnections property: A grouping of information about the connection to the remote
     * resource.
     *
     * @return the privateLinkServiceConnections value.
     */
    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        return this.privateLinkServiceConnections;
    }

    /**
     * Set the privateLinkServiceConnections property: A grouping of information about the connection to the remote
     * resource.
     *
     * @param privateLinkServiceConnections the privateLinkServiceConnections value to set.
     * @return the PrivateEndpointPropertiesInner object itself.
     */
    public PrivateEndpointPropertiesInner withPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> privateLinkServiceConnections) {
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        return this;
    }

    /**
     * Get the manualPrivateLinkServiceConnections property: A grouping of information about the connection to the
     * remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @return the manualPrivateLinkServiceConnections value.
     */
    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections;
    }

    /**
     * Set the manualPrivateLinkServiceConnections property: A grouping of information about the connection to the
     * remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @param manualPrivateLinkServiceConnections the manualPrivateLinkServiceConnections value to set.
     * @return the PrivateEndpointPropertiesInner object itself.
     */
    public PrivateEndpointPropertiesInner withManualPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections) {
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        return this;
    }

    /**
     * Get the customDnsConfigs property: An array of custom dns configurations.
     *
     * @return the customDnsConfigs value.
     */
    public List<CustomDnsConfigPropertiesFormat> customDnsConfigs() {
        return this.customDnsConfigs;
    }

    /**
     * Set the customDnsConfigs property: An array of custom dns configurations.
     *
     * @param customDnsConfigs the customDnsConfigs value to set.
     * @return the PrivateEndpointPropertiesInner object itself.
     */
    public PrivateEndpointPropertiesInner withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs) {
        this.customDnsConfigs = customDnsConfigs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
        if (privateLinkServiceConnections() != null) {
            privateLinkServiceConnections().forEach(e -> e.validate());
        }
        if (manualPrivateLinkServiceConnections() != null) {
            manualPrivateLinkServiceConnections().forEach(e -> e.validate());
        }
        if (customDnsConfigs() != null) {
            customDnsConfigs().forEach(e -> e.validate());
        }
    }
}
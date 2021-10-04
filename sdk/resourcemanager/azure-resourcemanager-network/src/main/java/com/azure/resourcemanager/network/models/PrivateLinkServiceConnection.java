// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.PrivateLinkServiceConnectionProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PrivateLinkServiceConnection resource. */
@Fluent
public final class PrivateLinkServiceConnection extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnection.class);

    /*
     * Properties of the private link service connection.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkServiceConnectionProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the private link service connection.
     *
     * @return the innerProperties value.
     */
    private PrivateLinkServiceConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkServiceConnection withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateLinkServiceId property: The resource id of private link service.
     *
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceId();
    }

    /**
     * Set the privateLinkServiceId property: The resource id of private link service.
     *
     * @param privateLinkServiceId the privateLinkServiceId value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceId(String privateLinkServiceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceId(privateLinkServiceId);
        return this;
    }

    /**
     * Get the groupIds property: The ID(s) of the group(s) obtained from the remote resource that this private endpoint
     * should connect to.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.innerProperties() == null ? null : this.innerProperties().groupIds();
    }

    /**
     * Set the groupIds property: The ID(s) of the group(s) obtained from the remote resource that this private endpoint
     * should connect to.
     *
     * @param groupIds the groupIds value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withGroupIds(List<String> groupIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceConnectionProperties();
        }
        this.innerProperties().withGroupIds(groupIds);
        return this;
    }

    /**
     * Get the requestMessage property: A message passed to the owner of the remote resource with this connection
     * request. Restricted to 140 chars.
     *
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().requestMessage();
    }

    /**
     * Set the requestMessage property: A message passed to the owner of the remote resource with this connection
     * request. Restricted to 140 chars.
     *
     * @param requestMessage the requestMessage value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withRequestMessage(String requestMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceConnectionProperties();
        }
        this.innerProperties().withRequestMessage(requestMessage);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of read-only information about the state of the
     * connection to the remote resource.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of read-only information about the state of the
     * connection to the remote resource.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateLinkServiceConnection object itself.
     */
    public PrivateLinkServiceConnection withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkServiceConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
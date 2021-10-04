// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Peer Express Route Circuit Connection in an ExpressRouteCircuitPeering resource. */
@Fluent
public final class PeerExpressRouteCircuitConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeerExpressRouteCircuitConnectionInner.class);

    /*
     * Properties of the peer express route circuit connection.
     */
    @JsonProperty(value = "properties")
    private PeerExpressRouteCircuitConnectionPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the peer express route circuit connection.
     *
     * @return the innerProperties value.
     */
    private PeerExpressRouteCircuitConnectionPropertiesFormat innerProperties() {
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
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public PeerExpressRouteCircuitConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteCircuitPeering();
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(
        SubResource expressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().peerExpressRouteCircuitPeering();
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withPeerExpressRouteCircuitPeering(peerExpressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().circuitConnectionStatus();
    }

    /**
     * Get the connectionName property: The name of the express route circuit connection resource.
     *
     * @return the connectionName value.
     */
    public String connectionName() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionName();
    }

    /**
     * Set the connectionName property: The name of the express route circuit connection resource.
     *
     * @param connectionName the connectionName value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withConnectionName(String connectionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withConnectionName(connectionName);
        return this;
    }

    /**
     * Get the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @return the authResourceGuid value.
     */
    public String authResourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().authResourceGuid();
    }

    /**
     * Set the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @param authResourceGuid the authResourceGuid value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAuthResourceGuid(String authResourceGuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerExpressRouteCircuitConnectionPropertiesFormat();
        }
        this.innerProperties().withAuthResourceGuid(authResourceGuid);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the peer express route circuit connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
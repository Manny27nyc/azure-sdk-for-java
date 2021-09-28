// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hop link properties. */
@Immutable
public final class HopLinkProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HopLinkProperties.class);

    /*
     * Minimum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "roundTripTimeMin", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeMin;

    /*
     * Average roundtrip time in milliseconds.
     */
    @JsonProperty(value = "roundTripTimeAvg", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeAvg;

    /*
     * Maximum roundtrip time in milliseconds.
     */
    @JsonProperty(value = "roundTripTimeMax", access = JsonProperty.Access.WRITE_ONLY)
    private Long roundTripTimeMax;

    /**
     * Get the roundTripTimeMin property: Minimum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMin value.
     */
    public Long roundTripTimeMin() {
        return this.roundTripTimeMin;
    }

    /**
     * Get the roundTripTimeAvg property: Average roundtrip time in milliseconds.
     *
     * @return the roundTripTimeAvg value.
     */
    public Long roundTripTimeAvg() {
        return this.roundTripTimeAvg;
    }

    /**
     * Get the roundTripTimeMax property: Maximum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMax value.
     */
    public Long roundTripTimeMax() {
        return this.roundTripTimeMax;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
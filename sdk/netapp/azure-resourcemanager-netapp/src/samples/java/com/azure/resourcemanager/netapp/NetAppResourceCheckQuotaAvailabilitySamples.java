// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.models.CheckQuotaNameResourceTypes;
import com.azure.resourcemanager.netapp.models.QuotaAvailabilityRequest;

/** Samples for NetAppResource CheckQuotaAvailability. */
public final class NetAppResourceCheckQuotaAvailabilitySamples {
    /*
     * operationId: NetAppResource_CheckQuotaAvailability
     * api-version: 2021-06-01
     * x-ms-examples: CheckQuotaAvailability
     */
    /**
     * Sample code: CheckQuotaAvailability.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void checkQuotaAvailability(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .netAppResources()
            .checkQuotaAvailabilityWithResponse(
                "eastus",
                new QuotaAvailabilityRequest()
                    .withName("resource1")
                    .withType(CheckQuotaNameResourceTypes.MICROSOFT_NET_APP_NET_APP_ACCOUNTS)
                    .withResourceGroup("myRG"),
                Context.NONE);
    }
}
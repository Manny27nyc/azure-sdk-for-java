// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Gateway GetEntityTag. */
public final class GatewayGetEntityTagSamples {
    /*
     * operationId: Gateway_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadGateway
     */
    /**
     * Sample code: ApiManagementHeadGateway.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadGateway(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gateways().getEntityTagWithResponse("rg1", "apimService1", "mygateway", Context.NONE);
    }
}
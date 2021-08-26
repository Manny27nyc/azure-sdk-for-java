// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for OpenIdConnectProvider ListByService. */
public final class OpenIdConnectProviderListByServiceSamples {
    /*
     * operationId: OpenIdConnectProvider_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListOpenIdConnectProviders
     */
    /**
     * Sample code: ApiManagementListOpenIdConnectProviders.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListOpenIdConnectProviders(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.openIdConnectProviders().listByService("rg1", "apimService1", null, null, null, Context.NONE);
    }
}
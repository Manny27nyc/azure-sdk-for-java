// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Api Delete. */
public final class ApiDeleteSamples {
    /*
     * operationId: Api_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteApi
     */
    /**
     * Sample code: ApiManagementDeleteApi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteApi(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apis().deleteWithResponse("rg1", "apimService1", "echo-api", "*", null, Context.NONE);
    }
}
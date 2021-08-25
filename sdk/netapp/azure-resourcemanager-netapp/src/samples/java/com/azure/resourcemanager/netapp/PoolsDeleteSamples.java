// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for Pools Delete. */
public final class PoolsDeleteSamples {
    /*
     * operationId: Pools_Delete
     * api-version: 2021-06-01
     * x-ms-examples: Pools_Delete
     */
    /**
     * Sample code: Pools_Delete.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.pools().delete("myRG", "account1", "pool1", Context.NONE);
    }
}
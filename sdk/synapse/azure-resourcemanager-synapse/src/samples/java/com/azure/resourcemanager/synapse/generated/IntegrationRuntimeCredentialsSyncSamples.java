// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimeCredentials Sync. */
public final class IntegrationRuntimeCredentialsSyncSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/IntegrationRuntimes_SyncCredentials.json
     */
    /**
     * Sample code: Sync credentials.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void syncCredentials(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .integrationRuntimeCredentials()
            .syncWithResponse("exampleResourceGroup", "exampleWorkspace", "exampleIntegrationRuntime", Context.NONE);
    }
}
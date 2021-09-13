// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.quota.models.CurrentQuotaLimitBase;
import com.azure.resourcemanager.quota.models.QuotaProperties;

public final class CurrentQuotaLimitBaseImpl
    implements CurrentQuotaLimitBase, CurrentQuotaLimitBase.Definition, CurrentQuotaLimitBase.Update {
    private CurrentQuotaLimitBaseInner innerObject;

    private final com.azure.resourcemanager.quota.QuotaManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public QuotaProperties properties() {
        return this.innerModel().properties();
    }

    public CurrentQuotaLimitBaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.quota.QuotaManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String scope;

    public CurrentQuotaLimitBaseImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public CurrentQuotaLimitBase create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .createOrUpdate(resourceName, scope, this.innerModel(), Context.NONE);
        return this;
    }

    public CurrentQuotaLimitBase create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getQuotas().createOrUpdate(resourceName, scope, this.innerModel(), context);
        return this;
    }

    CurrentQuotaLimitBaseImpl(String name, com.azure.resourcemanager.quota.QuotaManager serviceManager) {
        this.innerObject = new CurrentQuotaLimitBaseInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public CurrentQuotaLimitBaseImpl update() {
        return this;
    }

    public CurrentQuotaLimitBase apply() {
        this.innerObject =
            serviceManager.serviceClient().getQuotas().update(resourceName, scope, this.innerModel(), Context.NONE);
        return this;
    }

    public CurrentQuotaLimitBase apply(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getQuotas().update(resourceName, scope, this.innerModel(), context);
        return this;
    }

    CurrentQuotaLimitBaseImpl(
        CurrentQuotaLimitBaseInner innerObject, com.azure.resourcemanager.quota.QuotaManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceName =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.Quota/quotas/{resourceName}", "resourceName");
        this.scope =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.Quota/quotas/{resourceName}", "scope");
    }

    public CurrentQuotaLimitBase refresh() {
        this.innerObject =
            serviceManager.serviceClient().getQuotas().getWithResponse(resourceName, scope, Context.NONE).getValue();
        return this;
    }

    public CurrentQuotaLimitBase refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getQuotas().getWithResponse(resourceName, scope, context).getValue();
        return this;
    }

    public CurrentQuotaLimitBaseImpl withProperties(QuotaProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
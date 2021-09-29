// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Role definition properties.
 */
@Fluent
public final class RoleDefinitionProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RoleDefinitionProperties.class);

    /*
     * The role name.
     */
    @JsonProperty(value = "roleName")
    private String roleName;

    /*
     * The role definition description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The role type.
     */
    @JsonProperty(value = "type")
    private String roleType;

    /*
     * Role definition permissions.
     */
    @JsonProperty(value = "permissions")
    private List<PermissionInner> permissions;

    /*
     * Role definition assignable scopes.
     */
    @JsonProperty(value = "assignableScopes")
    private List<String> assignableScopes;

    /**
     * Get the roleName property: The role name.
     * 
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: The role name.
     * 
     * @param roleName the roleName value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the description property: The role definition description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The role definition description.
     * 
     * @param description the description value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roleType property: The role type.
     * 
     * @return the roleType value.
     */
    public String roleType() {
        return this.roleType;
    }

    /**
     * Set the roleType property: The role type.
     * 
     * @param roleType the roleType value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the permissions property: Role definition permissions.
     * 
     * @return the permissions value.
     */
    public List<PermissionInner> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Role definition permissions.
     * 
     * @param permissions the permissions value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withPermissions(List<PermissionInner> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the assignableScopes property: Role definition assignable scopes.
     * 
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes property: Role definition assignable scopes.
     * 
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissions() != null) {
            permissions().forEach(e -> e.validate());
        }
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** recentNotebook. */
@Fluent
public final class MicrosoftGraphRecentNotebook {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphRecentNotebook.class);

    /*
     * The name of the notebook.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The date and time when the notebook was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
     * this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @JsonProperty(value = "lastAccessedTime")
    private OffsetDateTime lastAccessedTime;

    /*
     * recentNotebookLinks
     */
    @JsonProperty(value = "links")
    private MicrosoftGraphRecentNotebookLinks links;

    /*
     * onenoteSourceService
     */
    @JsonProperty(value = "sourceService")
    private MicrosoftGraphOnenoteSourceService sourceService;

    /*
     * recentNotebook
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The name of the notebook.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the notebook.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphRecentNotebook object itself.
     */
    public MicrosoftGraphRecentNotebook withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastAccessedTime property: The date and time when the notebook was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @return the lastAccessedTime value.
     */
    public OffsetDateTime lastAccessedTime() {
        return this.lastAccessedTime;
    }

    /**
     * Set the lastAccessedTime property: The date and time when the notebook was last modified. The timestamp
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @param lastAccessedTime the lastAccessedTime value to set.
     * @return the MicrosoftGraphRecentNotebook object itself.
     */
    public MicrosoftGraphRecentNotebook withLastAccessedTime(OffsetDateTime lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
        return this;
    }

    /**
     * Get the links property: recentNotebookLinks.
     *
     * @return the links value.
     */
    public MicrosoftGraphRecentNotebookLinks links() {
        return this.links;
    }

    /**
     * Set the links property: recentNotebookLinks.
     *
     * @param links the links value to set.
     * @return the MicrosoftGraphRecentNotebook object itself.
     */
    public MicrosoftGraphRecentNotebook withLinks(MicrosoftGraphRecentNotebookLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the sourceService property: onenoteSourceService.
     *
     * @return the sourceService value.
     */
    public MicrosoftGraphOnenoteSourceService sourceService() {
        return this.sourceService;
    }

    /**
     * Set the sourceService property: onenoteSourceService.
     *
     * @param sourceService the sourceService value to set.
     * @return the MicrosoftGraphRecentNotebook object itself.
     */
    public MicrosoftGraphRecentNotebook withSourceService(MicrosoftGraphOnenoteSourceService sourceService) {
        this.sourceService = sourceService;
        return this;
    }

    /**
     * Get the additionalProperties property: recentNotebook.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: recentNotebook.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphRecentNotebook object itself.
     */
    public MicrosoftGraphRecentNotebook withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (links() != null) {
            links().validate();
        }
    }
}
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
import java.util.HashMap;
import java.util.Map;

/** mailboxSettings. */
@Fluent
public final class MicrosoftGraphMailboxSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphMailboxSettings.class);

    /*
     * Folder ID of an archive folder for the user.
     */
    @JsonProperty(value = "archiveFolder")
    private String archiveFolder;

    /*
     * automaticRepliesSetting
     */
    @JsonProperty(value = "automaticRepliesSetting")
    private MicrosoftGraphAutomaticRepliesSetting automaticRepliesSetting;

    /*
     * The date format for the user's mailbox.
     */
    @JsonProperty(value = "dateFormat")
    private String dateFormat;

    /*
     * The delegateMeetingMessageDeliveryOptions property.
     */
    @JsonProperty(value = "delegateMeetingMessageDeliveryOptions")
    private MicrosoftGraphDelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions;

    /*
     * localeInfo
     */
    @JsonProperty(value = "language")
    private MicrosoftGraphLocaleInfo language;

    /*
     * The time format for the user's mailbox.
     */
    @JsonProperty(value = "timeFormat")
    private String timeFormat;

    /*
     * The default time zone for the user's mailbox.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * workingHours
     */
    @JsonProperty(value = "workingHours")
    private MicrosoftGraphWorkingHours workingHours;

    /*
     * mailboxSettings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the archiveFolder property: Folder ID of an archive folder for the user.
     *
     * @return the archiveFolder value.
     */
    public String archiveFolder() {
        return this.archiveFolder;
    }

    /**
     * Set the archiveFolder property: Folder ID of an archive folder for the user.
     *
     * @param archiveFolder the archiveFolder value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withArchiveFolder(String archiveFolder) {
        this.archiveFolder = archiveFolder;
        return this;
    }

    /**
     * Get the automaticRepliesSetting property: automaticRepliesSetting.
     *
     * @return the automaticRepliesSetting value.
     */
    public MicrosoftGraphAutomaticRepliesSetting automaticRepliesSetting() {
        return this.automaticRepliesSetting;
    }

    /**
     * Set the automaticRepliesSetting property: automaticRepliesSetting.
     *
     * @param automaticRepliesSetting the automaticRepliesSetting value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withAutomaticRepliesSetting(
        MicrosoftGraphAutomaticRepliesSetting automaticRepliesSetting) {
        this.automaticRepliesSetting = automaticRepliesSetting;
        return this;
    }

    /**
     * Get the dateFormat property: The date format for the user's mailbox.
     *
     * @return the dateFormat value.
     */
    public String dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the dateFormat property: The date format for the user's mailbox.
     *
     * @param dateFormat the dateFormat value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the delegateMeetingMessageDeliveryOptions property: The delegateMeetingMessageDeliveryOptions property.
     *
     * @return the delegateMeetingMessageDeliveryOptions value.
     */
    public MicrosoftGraphDelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions() {
        return this.delegateMeetingMessageDeliveryOptions;
    }

    /**
     * Set the delegateMeetingMessageDeliveryOptions property: The delegateMeetingMessageDeliveryOptions property.
     *
     * @param delegateMeetingMessageDeliveryOptions the delegateMeetingMessageDeliveryOptions value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withDelegateMeetingMessageDeliveryOptions(
        MicrosoftGraphDelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions) {
        this.delegateMeetingMessageDeliveryOptions = delegateMeetingMessageDeliveryOptions;
        return this;
    }

    /**
     * Get the language property: localeInfo.
     *
     * @return the language value.
     */
    public MicrosoftGraphLocaleInfo language() {
        return this.language;
    }

    /**
     * Set the language property: localeInfo.
     *
     * @param language the language value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withLanguage(MicrosoftGraphLocaleInfo language) {
        this.language = language;
        return this;
    }

    /**
     * Get the timeFormat property: The time format for the user's mailbox.
     *
     * @return the timeFormat value.
     */
    public String timeFormat() {
        return this.timeFormat;
    }

    /**
     * Set the timeFormat property: The time format for the user's mailbox.
     *
     * @param timeFormat the timeFormat value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * Get the timeZone property: The default time zone for the user's mailbox.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: The default time zone for the user's mailbox.
     *
     * @param timeZone the timeZone value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the workingHours property: workingHours.
     *
     * @return the workingHours value.
     */
    public MicrosoftGraphWorkingHours workingHours() {
        return this.workingHours;
    }

    /**
     * Set the workingHours property: workingHours.
     *
     * @param workingHours the workingHours value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withWorkingHours(MicrosoftGraphWorkingHours workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    /**
     * Get the additionalProperties property: mailboxSettings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: mailboxSettings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphMailboxSettings object itself.
     */
    public MicrosoftGraphMailboxSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (automaticRepliesSetting() != null) {
            automaticRepliesSetting().validate();
        }
        if (language() != null) {
            language().validate();
        }
        if (workingHours() != null) {
            workingHours().validate();
        }
    }
}
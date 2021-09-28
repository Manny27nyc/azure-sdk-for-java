// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DevicesOrderby. */
public final class DevicesOrderby extends ExpandableStringEnum<DevicesOrderby> {
    /** Static value id for DevicesOrderby. */
    public static final DevicesOrderby ID = fromString("id");

    /** Static value id desc for DevicesOrderby. */
    public static final DevicesOrderby ID_DESC = fromString("id desc");

    /**
     * Creates or finds a DevicesOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DevicesOrderby.
     */
    @JsonCreator
    public static DevicesOrderby fromString(String name) {
        return fromString(name, DevicesOrderby.class);
    }

    /** @return known DevicesOrderby values. */
    public static Collection<DevicesOrderby> values() {
        return values(DevicesOrderby.class);
    }
}
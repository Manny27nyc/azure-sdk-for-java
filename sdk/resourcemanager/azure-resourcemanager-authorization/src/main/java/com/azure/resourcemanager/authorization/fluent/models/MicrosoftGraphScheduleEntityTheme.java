// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphScheduleEntityTheme. */
public final class MicrosoftGraphScheduleEntityTheme extends ExpandableStringEnum<MicrosoftGraphScheduleEntityTheme> {
    /** Static value white for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme WHITE = fromString("white");

    /** Static value blue for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme BLUE = fromString("blue");

    /** Static value green for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme GREEN = fromString("green");

    /** Static value purple for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme PURPLE = fromString("purple");

    /** Static value pink for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme PINK = fromString("pink");

    /** Static value yellow for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme YELLOW = fromString("yellow");

    /** Static value gray for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme GRAY = fromString("gray");

    /** Static value darkBlue for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme DARK_BLUE = fromString("darkBlue");

    /** Static value darkGreen for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme DARK_GREEN = fromString("darkGreen");

    /** Static value darkPurple for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme DARK_PURPLE = fromString("darkPurple");

    /** Static value darkPink for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme DARK_PINK = fromString("darkPink");

    /** Static value darkYellow for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme DARK_YELLOW = fromString("darkYellow");

    /** Static value unknownFutureValue for MicrosoftGraphScheduleEntityTheme. */
    public static final MicrosoftGraphScheduleEntityTheme UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphScheduleEntityTheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphScheduleEntityTheme.
     */
    @JsonCreator
    public static MicrosoftGraphScheduleEntityTheme fromString(String name) {
        return fromString(name, MicrosoftGraphScheduleEntityTheme.class);
    }

    /** @return known MicrosoftGraphScheduleEntityTheme values. */
    public static Collection<MicrosoftGraphScheduleEntityTheme> values() {
        return values(MicrosoftGraphScheduleEntityTheme.class);
    }
}
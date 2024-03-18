package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3665m0 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}

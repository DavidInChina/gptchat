package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;

/* renamed from: io.sentry.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3652i {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session(ParameterNames.SESSION),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");
    
    private final String category;

    EnumC3652i(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}

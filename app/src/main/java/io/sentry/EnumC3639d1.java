package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;

/* renamed from: io.sentry.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3639d1 implements AbstractC3656j0 {
    Session(ParameterNames.SESSION),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    CheckIn("check_in"),
    Statsd("statsd"),
    Unknown("__unknown__");
    
    private final String itemType;

    EnumC3639d1(String str) {
        this.itemType = str;
    }

    public static EnumC3639d1 resolve(Object obj) {
        if (obj instanceof Z0) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.z) {
            return Transaction;
        }
        if (obj instanceof y1) {
            return Session;
        }
        if (obj instanceof io.sentry.clientreport.a) {
            return ClientReport;
        }
        return Attachment;
    }

    public static EnumC3639d1 valueOfLabel(String str) {
        EnumC3639d1[] values;
        for (EnumC3639d1 enumC3639d1 : values()) {
            if (enumC3639d1.itemType.equals(str)) {
                return enumC3639d1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.AbstractC3656j0
    public void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(this.itemType);
    }
}

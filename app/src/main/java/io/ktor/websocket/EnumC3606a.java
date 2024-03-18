package io.ktor.websocket;

import java.util.LinkedHashMap;

/* renamed from: io.ktor.websocket.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3606a {
    NORMAL(1000),
    /* JADX INFO: Fake field, exist only in values array */
    GOING_AWAY(1001),
    /* JADX INFO: Fake field, exist only in values array */
    PROTOCOL_ERROR(1002),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_ACCEPT(1003),
    CLOSED_ABNORMALLY(1006),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_CONSISTENT(1007),
    /* JADX INFO: Fake field, exist only in values array */
    VIOLATED_POLICY(1008),
    TOO_BIG(1009),
    /* JADX INFO: Fake field, exist only in values array */
    NO_EXTENSION(1010),
    INTERNAL_ERROR(1011),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_RESTART(1012),
    /* JADX INFO: Fake field, exist only in values array */
    TRY_AGAIN_LATER(1013);
    

    /* renamed from: Z  reason: collision with root package name */
    public static final LinkedHashMap f33606Z;

    /* renamed from: Y  reason: collision with root package name */
    public final short f33612Y;

    static {
        EnumC3606a[] values = values();
        int n02 = P4.a.n0(values.length);
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (EnumC3606a enumC3606a : values) {
            linkedHashMap.put(Short.valueOf(enumC3606a.f33612Y), enumC3606a);
        }
        f33606Z = linkedHashMap;
    }

    EnumC3606a(short s10) {
        this.f33612Y = s10;
    }
}

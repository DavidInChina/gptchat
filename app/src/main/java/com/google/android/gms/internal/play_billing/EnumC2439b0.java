package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.play_billing.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2439b0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(E.class, E.f26839Z),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f26910Y;

    EnumC2439b0(Class cls, Serializable serializable) {
        this.f26910Y = serializable;
    }
}

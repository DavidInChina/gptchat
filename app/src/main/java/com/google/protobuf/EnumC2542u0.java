package com.google.protobuf;

import java.io.Serializable;

/* renamed from: com.google.protobuf.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2542u0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC2534q.class, AbstractC2534q.f27581Z),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f27621Y;

    EnumC2542u0(Class cls, Serializable serializable) {
        this.f27621Y = serializable;
    }
}

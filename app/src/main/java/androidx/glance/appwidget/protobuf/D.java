package androidx.glance.appwidget.protobuf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum D {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC2049i.class, AbstractC2049i.f25223Z),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f25158Y;

    D(Class cls, Serializable serializable) {
        this.f25158Y = serializable;
    }
}

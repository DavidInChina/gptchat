package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum E {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC2025j.class, AbstractC2025j.f25066Z),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f24972Y;

    E(Class cls, Serializable serializable) {
        this.f24972Y = serializable;
    }
}

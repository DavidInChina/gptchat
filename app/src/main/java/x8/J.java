package x8;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class J extends r implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f49517Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f49518Z;

    public J(Object obj, Object obj2) {
        this.f49517Y = obj;
        this.f49518Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f49517Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49518Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

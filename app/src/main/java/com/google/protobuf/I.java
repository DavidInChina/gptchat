package com.google.protobuf;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27410a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27411b;

    public I(int i10, Object obj) {
        this.f27410a = obj;
        this.f27411b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (this.f27410a != i10.f27410a || this.f27411b != i10.f27411b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f27410a) * 65535) + this.f27411b;
    }
}

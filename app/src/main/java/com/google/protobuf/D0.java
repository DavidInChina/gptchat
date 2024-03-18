package com.google.protobuf;

/* loaded from: classes.dex */
public final class D0 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public K0[] f27391a;

    @Override // com.google.protobuf.K0
    public final J0 a(Class cls) {
        K0[] k0Arr;
        for (K0 k02 : this.f27391a) {
            if (k02.b(cls)) {
                return k02.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.K0
    public final boolean b(Class cls) {
        for (K0 k02 : this.f27391a) {
            if (k02.b(cls)) {
                return true;
            }
        }
        return false;
    }
}

package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2453i0 implements AbstractC2465o0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2465o0[] f26929a;

    public C2453i0(AbstractC2465o0... abstractC2465o0Arr) {
        this.f26929a = abstractC2465o0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2465o0
    public final AbstractC2463n0 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            AbstractC2465o0 abstractC2465o0 = this.f26929a[i10];
            if (abstractC2465o0.b(cls)) {
                return abstractC2465o0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2465o0
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f26929a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}

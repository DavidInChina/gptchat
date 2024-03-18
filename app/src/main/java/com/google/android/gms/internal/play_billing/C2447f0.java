package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447f0 extends AbstractC2449g0 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC2449g0
    public final void a(long j6, Object obj) {
        AbstractC2483y abstractC2483y = (AbstractC2483y) ((X) J0.i(j6, obj));
        if (abstractC2483y.f26991Y) {
            abstractC2483y.f26991Y = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2449g0
    public final void b(long j6, Object obj, Object obj2) {
        X x10 = (X) J0.i(j6, obj);
        X x11 = (X) J0.i(j6, obj2);
        int size = x10.size();
        int size2 = x11.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC2483y) x10).f26991Y) {
                x10 = x10.u(size2 + size);
            }
            x10.addAll(x11);
        }
        if (size > 0) {
            x11 = x10;
        }
        J0.p(j6, obj, x11);
    }
}

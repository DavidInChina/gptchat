package E;

import E0.AbstractC0442a;
import E0.AbstractC0459s;
import E0.C0458q;
import l0.AbstractC4325q;

/* renamed from: E.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415c extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC0442a f3847s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f3848t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f3849u0;

    @Override // G0.C
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.d(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.e(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        long a5;
        int i10;
        int i11;
        int i12;
        int i13;
        int max;
        int i14;
        AbstractC0442a abstractC0442a = this.f3847s0;
        float f6 = this.f3848t0;
        float f10 = this.f3849u0;
        boolean z10 = abstractC0442a instanceof C0458q;
        if (z10) {
            a5 = Z0.a.a(j6, 0, 0, 0, 0, 11);
        } else {
            a5 = Z0.a.a(j6, 0, 0, 0, 0, 14);
        }
        E0.d0 o10 = m10.o(a5);
        int G10 = o10.G(abstractC0442a);
        if (G10 == Integer.MIN_VALUE) {
            G10 = 0;
        }
        if (z10) {
            i10 = o10.f4054Z;
        } else {
            i10 = o10.f4053Y;
        }
        if (z10) {
            i11 = Z0.a.g(j6);
        } else {
            i11 = Z0.a.h(j6);
        }
        if (!Z0.e.a(f6, Float.NaN)) {
            i12 = p10.a0(f6);
        } else {
            i12 = 0;
        }
        int i15 = i11 - i10;
        int p11 = com.google.android.gms.internal.play_billing.N.p(i12 - G10, 0, i15);
        if (!Z0.e.a(f10, Float.NaN)) {
            i13 = p10.a0(f10);
        } else {
            i13 = 0;
        }
        int p12 = com.google.android.gms.internal.play_billing.N.p((i13 - i10) + G10, 0, i15 - p11);
        if (z10) {
            max = o10.f4053Y;
        } else {
            max = Math.max(o10.f4053Y + p11 + p12, Z0.a.j(j6));
        }
        int i16 = max;
        if (z10) {
            i14 = Math.max(o10.f4054Z + p11 + p12, Z0.a.i(j6));
        } else {
            i14 = o10.f4054Z;
        }
        int i17 = i14;
        return p10.j0(i16, i17, kf.w.f37484Y, new C0413b(abstractC0442a, f6, p11, i16, p12, o10, i17));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }
}

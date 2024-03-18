package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2472s0 implements AbstractC2486z0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2481x f26970a;

    /* renamed from: b  reason: collision with root package name */
    public final D0 f26971b;

    /* renamed from: c  reason: collision with root package name */
    public final K f26972c;

    public C2472s0(D0 d02, K k10, AbstractC2481x abstractC2481x) {
        this.f26971b = d02;
        this.f26972c = k10;
        this.f26970a = abstractC2481x;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void a(Object obj) {
        this.f26971b.getClass();
        D0.c(obj);
        this.f26972c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final boolean b(Object obj) {
        this.f26972c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final int c(Object obj) {
        this.f26971b.getClass();
        return ((Q) obj).zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final int d(Object obj) {
        this.f26971b.getClass();
        C0 c02 = ((Q) obj).zzc;
        int i10 = c02.f26836d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < c02.f26833a; i12++) {
                int D12 = H.D1(8);
                int D13 = H.D1(c02.f26834b[i12] >>> 3) + H.D1(16);
                int D14 = H.D1(24);
                int I10 = ((E) c02.f26835c[i12]).I();
                i11 += D12 + D12 + D13 + android.gov.nist.core.a.c(I10, I10, D14);
            }
            c02.f26836d = i11;
            return i11;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void e(Object obj, Object obj2) {
        A0.t(this.f26971b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void f(Object obj, I i10) {
        this.f26972c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void g(Object obj, byte[] bArr, int i10, int i11, A a5) {
        Q q10 = (Q) obj;
        if (q10.zzc == C0.f26832f) {
            q10.zzc = C0.b();
        }
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final boolean h(Object obj, Object obj2) {
        this.f26971b.getClass();
        if (!((Q) obj).zzc.equals(((Q) obj2).zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final Q q() {
        AbstractC2481x abstractC2481x = this.f26970a;
        if (abstractC2481x instanceof Q) {
            return (Q) ((Q) abstractC2481x).m(4);
        }
        return ((P) ((Q) abstractC2481x).m(5)).d();
    }
}

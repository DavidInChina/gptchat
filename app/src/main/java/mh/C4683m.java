package mh;

import E0.j0;
import Z.C1724m0;
import id.AbstractC3557B;
import q0.C5251c;
import z.C6712n;

/* renamed from: mh.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4683m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4672b f39465Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4672b f39466Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4674d f39467h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f39468i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4686p f39469j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f39470k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4683m(C4672b c4672b, C4672b c4672b2, C4674d c4674d, long j6, C4686p c4686p, long j10) {
        super(1);
        this.f39465Y = c4672b;
        this.f39466Z = c4672b2;
        this.f39467h0 = c4674d;
        this.f39468i0 = j6;
        this.f39469j0 = c4686p;
        this.f39470k0 = j10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C6712n c6712n = (C6712n) obj;
        AbstractC3557B.c0("$this$animateTo", c6712n);
        C4672b c4672b = this.f39465Y;
        float f6 = c4672b.f39435b;
        C4672b c4672b2 = this.f39466Z;
        float f10 = c4672b2.f39435b;
        C1724m0 c1724m0 = c6712n.f51333e;
        float L10 = K4.J.L(f6, f10, ((Number) c1724m0.getValue()).floatValue());
        long L02 = P4.a.L0(C5251c.k(this.f39467h0.f39437a), c4672b.b());
        long L03 = P4.a.L0(C5251c.k(this.f39468i0), c4672b2.b());
        float floatValue = ((Number) c1724m0.getValue()).floatValue();
        long r10 = R4.b.r(K4.J.L(C5251c.d(L02), C5251c.d(L03), floatValue), K4.J.L(C5251c.e(L02), C5251c.e(L03), floatValue));
        C4686p c4686p = this.f39469j0;
        C4674d g10 = c4686p.g();
        AbstractC3557B.Z(g10);
        long k10 = C5251c.k(r10);
        long j6 = c4672b.f39434a;
        long a5 = androidx.compose.ui.layout.a.a(j0.a(j6) * L10, j0.b(j6) * L10);
        c4686p.f39487g.setValue(new C4674d(R4.b.r(C5251c.d(k10) / j0.a(a5), C5251c.e(k10) / j0.b(a5)), L10, this.f39470k0, g10.f39440d));
        return jf.y.f36177a;
    }
}

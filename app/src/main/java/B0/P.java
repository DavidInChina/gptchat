package B0;

import G0.AbstractC0579h;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Ng.D0;
import b0.C2104h;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4325q;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import q0.C5251c;
import q1.AbstractC5260f;
import w.C6077x;
import z.C6685Z;

/* loaded from: classes2.dex */
public final class P extends AbstractC4325q implements J, A, Z0.b {

    /* renamed from: s0  reason: collision with root package name */
    public wf.n f1617s0;

    /* renamed from: t0  reason: collision with root package name */
    public D0 f1618t0;

    /* renamed from: x0  reason: collision with root package name */
    public C0194k f1622x0;

    /* renamed from: u0  reason: collision with root package name */
    public C0194k f1619u0 = I.f1599a;

    /* renamed from: v0  reason: collision with root package name */
    public final C2104h f1620v0 = new C2104h(new N[16]);

    /* renamed from: w0  reason: collision with root package name */
    public final C2104h f1621w0 = new C2104h(new N[16]);

    /* renamed from: y0  reason: collision with root package name */
    public long f1623y0 = 0;

    public P(wf.n nVar) {
        this.f1617s0 = nVar;
    }

    @Override // G0.t0
    public final void A() {
        C0194k c0194k = this.f1622x0;
        if (c0194k == null) {
            return;
        }
        List list = c0194k.f1652a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(!((u) list.get(i10)).f1673d)) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    u uVar = (u) list.get(i11);
                    long j6 = uVar.f1670a;
                    long j10 = C5251c.f43619b;
                    boolean z10 = uVar.f1673d;
                    long j11 = uVar.f1671b;
                    long j12 = uVar.f1672c;
                    arrayList.add(new u(j6, j11, j12, false, uVar.f1674e, j11, j12, z10, z10, 1, j10));
                }
                C0194k c0194k2 = new C0194k(arrayList, null);
                this.f1619u0 = c0194k2;
                B0(c0194k2, EnumC0195l.f1656Y);
                B0(c0194k2, EnumC0195l.f1657Z);
                B0(c0194k2, EnumC0195l.f1658h0);
                this.f1622x0 = null;
                return;
            }
        }
    }

    public final Object A0(wf.n nVar, AbstractC4825e abstractC4825e) {
        EnumC5000a enumC5000a;
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        N n10 = new N(this, c1072l);
        synchronized (this.f1620v0) {
            this.f1620v0.b(n10);
            AbstractC4825e z10 = AbstractC5260f.z(AbstractC5260f.n(n10, n10, nVar));
            enumC5000a = EnumC5000a.f41328Y;
            new C4833m(enumC5000a, z10).resumeWith(jf.y.f36177a);
        }
        c1072l.w(new C6077x(28, n10));
        Object t10 = c1072l.t();
        if (t10 == enumC5000a) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        return t10;
    }

    public final void B0(C0194k c0194k, EnumC0195l enumC0195l) {
        AbstractC1070k abstractC1070k;
        AbstractC1070k abstractC1070k2;
        synchronized (this.f1620v0) {
            C2104h c2104h = this.f1621w0;
            c2104h.c(c2104h.f25569h0, this.f1620v0);
        }
        try {
            int ordinal = enumC0195l.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                    }
                } else {
                    C2104h c2104h2 = this.f1621w0;
                    int i10 = c2104h2.f25569h0;
                    if (i10 > 0) {
                        int i11 = i10 - 1;
                        Object[] objArr = c2104h2.f25567Y;
                        do {
                            N n10 = (N) objArr[i11];
                            if (enumC0195l == n10.f1613i0 && (abstractC1070k2 = n10.f1612h0) != null) {
                                n10.f1612h0 = null;
                                abstractC1070k2.resumeWith(c0194k);
                            }
                            i11--;
                        } while (i11 >= 0);
                    }
                }
            }
            C2104h c2104h3 = this.f1621w0;
            int i12 = c2104h3.f25569h0;
            if (i12 > 0) {
                Object[] objArr2 = c2104h3.f25567Y;
                int i13 = 0;
                do {
                    N n11 = (N) objArr2[i13];
                    if (enumC0195l == n11.f1613i0 && (abstractC1070k = n11.f1612h0) != null) {
                        n11.f1612h0 = null;
                        abstractC1070k.resumeWith(c0194k);
                    }
                    i13++;
                } while (i13 < i12);
            }
        } finally {
            this.f1621w0.f();
        }
    }

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    public final void C0() {
        D0 d02 = this.f1618t0;
        if (d02 != null) {
            d02.k(new C6685Z(4));
            this.f1618t0 = null;
        }
    }

    @Override // Z0.b
    public final long D(float f6) {
        return D0(K(f6));
    }

    public final /* synthetic */ long D0(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // G0.t0
    public final void N() {
        C0();
    }

    @Override // Z0.b
    public final float O() {
        return AbstractC0579h.A(this).f24859w0.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return AbstractC0579h.A(this).f24859w0.b();
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    @Override // G0.t0
    public final void h0() {
        C0();
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        this.f1623y0 = j6;
        if (enumC0195l == EnumC0195l.f1656Y) {
            this.f1619u0 = c0194k;
        }
        if (this.f1618t0 == null) {
            this.f1618t0 = Ad.l.O0(p0(), null, Ng.G.f12870i0, new O(this, null), 1);
        }
        B0(c0194k, enumC0195l);
        List list = c0194k.f1652a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!r9.y.Y((u) list.get(i10))) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!(!z10)) {
            c0194k = null;
        }
        this.f1622x0 = c0194k;
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        C0();
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }
}

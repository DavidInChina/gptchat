package lc;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1521a;
import W.AbstractC1617t1;
import W.G3;
import W.K2;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.m1;
import androidx.compose.material3.MinimumInteractiveModifier;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Iterator;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: lc.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4387K extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38095Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ zd.d f38096Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f38097h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f38098i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4387K(zd.d dVar, AbstractC1710f0 abstractC1710f0, wf.k kVar, int i10) {
        super(2);
        this.f38095Y = i10;
        this.f38096Z = dVar;
        this.f38097h0 = abstractC1710f0;
        this.f38098i0 = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        char c10;
        int i11;
        boolean z13 = false;
        C4323o c4323o = C4323o.f37719b;
        int i12 = this.f38095Y;
        zd.d dVar = this.f38096Z;
        wf.k kVar = this.f38098i0;
        AbstractC1710f0 abstractC1710f0 = this.f38097h0;
        switch (i12) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(L0.l.a(c4323o, false, J.a.f8713Y), p9.r.f42842f);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(r10);
                boolean z14 = rVar2.f22696a instanceof AbstractC1707e;
                if (z14) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar2, i13, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i14, rVar2, 0, 2058660585);
                    rVar2.W(218915681);
                    Iterator it = AbstractC4386J.f38094a.iterator();
                    while (it.hasNext()) {
                        zd.d dVar2 = (zd.d) it.next();
                        AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                        if (dVar == dVar2) {
                            z10 = true;
                        } else {
                            z10 = z13;
                        }
                        L0.g gVar = new L0.g(3);
                        rVar2.W(590649163);
                        boolean g10 = rVar2.g(abstractC1710f0) | rVar2.g(kVar) | rVar2.g(dVar2);
                        Object K10 = rVar2.K();
                        if (!g10 && K10 != C1723m.f22654Y) {
                            z11 = false;
                        } else {
                            z11 = false;
                            K10 = new C4385I(kVar, dVar2, abstractC1710f0, 0);
                            rVar2.h0(K10);
                        }
                        rVar2.t(z11);
                        AbstractC4326r q02 = M3.H.q0(d10, z10, gVar, (AbstractC6216a) K10, 2);
                        m1 m1Var = AbstractC1617t1.f20423a;
                        AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(q02.g(MinimumInteractiveModifier.f24779b), 0.0f, p9.r.f42840d, 1);
                        C0421f c0421f = AbstractC0429m.f3907a;
                        C0426j g11 = AbstractC0429m.g(p9.r.f42841e);
                        C4317i c4317i = C4310b.f37703p0;
                        rVar2.W(693286680);
                        E0.N a10 = p0.a(g11, c4317i, rVar2);
                        rVar2.W(-1323940314);
                        int i15 = rVar2.P;
                        AbstractC1732q0 p11 = rVar2.p();
                        AbstractC0584m.f5811i.getClass();
                        C0582k c0582k2 = C0583l.f5804b;
                        C3288a i16 = androidx.compose.ui.layout.a.i(t10);
                        if (z14) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k2);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a10, C0583l.f5808f);
                            U3.f.n0(rVar2, p11, C0583l.f5807e);
                            C0581j c0581j2 = C0583l.f5809g;
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i15))) {
                                AbstractC6463a.q(i15, rVar2, i15, c0581j2);
                            }
                            AbstractC6463a.t(rVar2, i16, rVar2, 0, 2058660585);
                            AbstractC4326r a11 = io.sentry.compose.b.a("SettingsNightModeItem");
                            if (dVar == dVar2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean z15 = z14;
                            Z.r rVar3 = rVar2;
                            K2.a(z12, null, a11, false, null, null, rVar3, 48, 60);
                            int ordinal = dVar2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    c10 = 2;
                                    if (ordinal == 2) {
                                        i11 = R.string.settings_color_dark;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    c10 = 2;
                                    i11 = R.string.settings_color_light;
                                }
                            } else {
                                c10 = 2;
                                i11 = R.string.settings_color_system;
                            }
                            j4.b(Ng.H.v(i11, rVar3), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131070);
                            z13 = false;
                            AbstractC6463a.v(rVar3, false, true, false, false);
                            rVar2 = rVar3;
                            z14 = z15;
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                    Z.r rVar4 = rVar2;
                    AbstractC6463a.v(rVar4, z13, z13, true, z13);
                    rVar4.t(z13);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("SettingsNightModeItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                G3.a(a12, AbstractC1521a.a(abstractC1725n), 0L, 0L, p9.i.f42785d, 0.0f, null, R4.b.X(abstractC1725n, 666145887, new C4387K(dVar, abstractC1710f0, kVar, 0)), abstractC1725n, 12582912, 109);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f38095Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

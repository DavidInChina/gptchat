package Z9;

import Ad.l;
import E.AbstractC0434s;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import N.D;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import android.os.Bundle;
import androidx.compose.foundation.layout.FillElement;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.C4310b;
import l0.C4323o;
import s3.C5562l;
import wf.p;
import x8.W;
import y.AbstractC6463a;
import y.C6480s;
import y.L;

/* loaded from: classes.dex */
public final class f extends o implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23429Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f23430Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(C3288a c3288a, int i10) {
        super(4);
        this.f23429Y = i10;
        this.f23430Z = c3288a;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i10 = this.f23429Y;
        p pVar = this.f23430Z;
        switch (i10) {
            case 0:
                L l10 = (L) obj;
                C5562l c5562l = (C5562l) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$composable", l10);
                AbstractC3557B.c0("backStackEntry", c5562l);
                u uVar = io.sentry.compose.b.f34309a;
                Bundle d10 = c5562l.d();
                if (d10 == null) {
                    d10 = new Bundle();
                }
                a X02 = l.X0(d10, abstractC1725n, 0);
                if (X02 != null) {
                    r rVar = (r) abstractC1725n;
                    rVar.W(-31126739);
                    AbstractC3256b.a(new Object[]{X02}, R4.b.X(rVar, 1629915830, new D(pVar, l10, c5562l, 11)), rVar, 56);
                    rVar.t(false);
                } else {
                    r rVar2 = (r) abstractC1725n;
                    rVar2.W(-31126443);
                    W.W(Pc.e.a(), R.a.r("Missing conversation component for ", c5562l.f45306Z.f45222m0), null, null, 6);
                    FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
                    rVar2.W(733328855);
                    N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                    rVar2.W(-1323940314);
                    int i11 = rVar2.P;
                    AbstractC1732q0 p10 = rVar2.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i12 = androidx.compose.ui.layout.a.i(fillElement);
                    if (rVar2.f22696a instanceof AbstractC1707e) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, c10, C0583l.f5808f);
                        U3.f.n0(rVar2, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                            AbstractC6463a.q(i11, rVar2, i11, c0581j);
                        }
                        AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
                        I2.b(androidx.compose.foundation.layout.b.f24731a.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar2, 0, 30);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        rVar2.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                return yVar;
            default:
                C6480s c6480s = (C6480s) obj;
                C5562l c5562l2 = (C5562l) obj2;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$composable", c6480s);
                AbstractC3557B.c0("backStackEntry", c5562l2);
                u uVar2 = io.sentry.compose.b.f34309a;
                Pc.c a5 = Pc.e.a();
                String str = c5562l2.f45306Z.f45222m0;
                W.M(a5, "Rendering destination: " + str, null, 6);
                pVar.h(c6480s, c5562l2, (AbstractC1725n) obj3, 72);
                return yVar;
        }
    }
}

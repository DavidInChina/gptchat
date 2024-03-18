package q9;

import Df.H;
import L0.u;
import N.C1021e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import Z.r;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import r9.y;
import wf.o;

/* renamed from: q9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5285b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f43981a = H.x0(30, Mg.d.f12133h0);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f43982b = 0;

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    public static final void a(String str, boolean z10, o oVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        u9.b bVar;
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        AbstractC3557B.c0("content", oVar);
        u uVar = io.sentry.compose.b.f34309a;
        r rVar = (r) abstractC1725n;
        rVar.X(-638252471);
        if ((i10 & 14) == 0) {
            if (rVar.g(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(z10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(oVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            if (z10) {
                bVar = y.C0();
            } else {
                bVar = null;
            }
            rVar.W(861624745);
            Object K10 = rVar.K();
            if (K10 == C1723m.f22654Y) {
                K10 = AbstractC4828h.Z(str, o1.f22665a);
                rVar.h0(K10);
            }
            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
            rVar.t(false);
            AbstractC1734s.e(str, new C5284a(str, bVar, abstractC1710f0, null), rVar);
            oVar.invoke((String) abstractC1710f0.getValue(), rVar, Integer.valueOf((i11 >> 3) & 112));
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1021e(str, z10, oVar, i10, 3);
        }
    }
}

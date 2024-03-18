package Zf;

import Bg.A;
import Bg.AbstractC0227u;
import Bg.D;
import Bg.Q;
import Bg.d0;
import Bg.o0;
import Cg.i;
import Lg.n;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import kf.t;
import l8.AbstractC4344b;
import mg.j;
import mg.m;
import mg.o;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class f extends AbstractC0227u {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(D d10, D d11) {
        this(d10, d11, false);
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
    }

    public static final ArrayList H0(m mVar, D d10) {
        List<d0> w02 = d10.w0();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(w02, 10));
        for (d0 d0Var : w02) {
            mVar.getClass();
            AbstractC3557B.c0("typeProjection", d0Var);
            StringBuilder sb2 = new StringBuilder();
            t.l2(AbstractC4344b.F0(d0Var), sb2, ", ", null, null, new j(mVar, 0), 60);
            String sb3 = sb2.toString();
            AbstractC3557B.b0("toString(...)", sb3);
            arrayList.add(sb3);
        }
        return arrayList;
    }

    public static final String I0(String str, String str2) {
        if (!n.a2(str, '<')) {
            return str;
        }
        return n.R2(str, '<') + '<' + str2 + '>' + n.P2('>', str, str);
    }

    @Override // Bg.A
    public final A A0(i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2158Z;
        AbstractC3557B.c0("type", d10);
        D d11 = this.f2159h0;
        AbstractC3557B.c0("type", d11);
        return new f(d10, d11, true);
    }

    @Override // Bg.o0
    public final o0 C0(boolean z10) {
        return new f(this.f2158Z.C0(z10), this.f2159h0.C0(z10));
    }

    @Override // Bg.o0
    public final o0 D0(i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2158Z;
        AbstractC3557B.c0("type", d10);
        D d11 = this.f2159h0;
        AbstractC3557B.c0("type", d11);
        return new f(d10, d11, true);
    }

    @Override // Bg.o0
    public final o0 E0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new f(this.f2158Z.E0(q10), this.f2159h0.E0(q10));
    }

    @Override // Bg.AbstractC0227u
    public final D F0() {
        return this.f2158Z;
    }

    @Override // Bg.AbstractC0227u
    public final String G0(m mVar, o oVar) {
        AbstractC3557B.c0("renderer", mVar);
        AbstractC3557B.c0("options", oVar);
        D d10 = this.f2158Z;
        String Y7 = mVar.Y(d10);
        D d11 = this.f2159h0;
        String Y10 = mVar.Y(d11);
        if (oVar.k()) {
            return "raw (" + Y7 + ".." + Y10 + ')';
        } else if (d11.w0().isEmpty()) {
            return mVar.E(Y7, Y10, Bi.c.P0(this));
        } else {
            ArrayList H02 = H0(mVar, d10);
            ArrayList H03 = H0(mVar, d11);
            String m22 = t.m2(H02, ", ", null, null, e.f23728Y, 30);
            ArrayList S22 = t.S2(H02, H03);
            if (!S22.isEmpty()) {
                Iterator it = S22.iterator();
                while (it.hasNext()) {
                    C3959i c3959i = (C3959i) it.next();
                    String str = (String) c3959i.f36156Z;
                    if (!AbstractC3557B.K((String) c3959i.f36155Y, n.v2("out ", str)) && !AbstractC3557B.K(str, Separators.STAR)) {
                        break;
                    }
                }
            }
            Y10 = I0(Y10, m22);
            String I02 = I0(Y7, m22);
            if (AbstractC3557B.K(I02, Y10)) {
                return I02;
            }
            return mVar.E(I02, Y10, Bi.c.P0(this));
        }
    }

    @Override // Bg.AbstractC0227u, Bg.A
    public final ug.n R() {
        AbstractC0997f abstractC0997f;
        AbstractC1000i k10 = y0().k();
        if (k10 instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) k10;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f != null) {
            ug.n E10 = abstractC0997f.E(new d());
            AbstractC3557B.b0("getMemberScope(...)", E10);
            return E10;
        }
        throw new IllegalStateException(("Incorrect classifier: " + y0().k()).toString());
    }

    public f(D d10, D d11, boolean z10) {
        super(d10, d11);
        if (!z10) {
            Cg.d.f3125a.b(d10, d11);
        }
    }
}

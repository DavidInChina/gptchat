package Jf;

import Bg.C0221n;
import Bg.p0;
import Mf.A;
import Mf.AbstractC1013w;
import Mf.C1008q;
import Mf.EnumC0998g;
import Pf.C1154l;
import Pf.H;
import Pf.Z;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kg.C4294f;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final H f9210a;

    static {
        Dg.m mVar = Dg.m.f3709a;
        Lf.l lVar = new Lf.l(Dg.m.f3710b, q.f9199f, 1);
        EnumC0998g enumC0998g = EnumC0998g.f12084Y;
        C4294f f6 = q.f9200g.f();
        Ag.c cVar = Ag.q.f870e;
        H h10 = new H(lVar, f6, cVar);
        h10.f14004o0 = A.f12054j0;
        C1008q c1008q = Mf.r.f12105e;
        if (c1008q != null) {
            h10.f14005p0 = c1008q;
            List F02 = AbstractC4344b.F0(Z.A0(h10, p0.f2147i0, C4294f.e(TokenNames.T), 0, cVar));
            if (h10.f14007r0 == null) {
                ArrayList arrayList = new ArrayList(F02);
                h10.f14007r0 = arrayList;
                h10.f14006q0 = new C0221n(h10, arrayList, h10.f14008s0, h10.f14009t0);
                Set<AbstractC1013w> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    for (AbstractC1013w abstractC1013w : emptySet) {
                        ((C1154l) abstractC1013w).G0(h10.n());
                    }
                    f9210a = h10;
                    return;
                }
                H.p0(13);
                throw null;
            }
            throw new IllegalStateException("Type parameters are already set for " + h10.getName());
        }
        H.p0(9);
        throw null;
    }
}

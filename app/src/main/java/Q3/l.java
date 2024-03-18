package Q3;

import L3.s;
import Ng.C1057d0;
import Ng.C1079o0;
import U3.q;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14423a;

    static {
        String f6 = s.f("WorkConstraintsTracker");
        AbstractC3557B.b0("tagWithPrefix(\"WorkConstraintsTracker\")", f6);
        f14423a = f6;
    }

    public static final C1079o0 a(j jVar, q qVar, C1057d0 c1057d0, e eVar) {
        AbstractC3557B.c0("<this>", jVar);
        AbstractC3557B.c0("dispatcher", c1057d0);
        AbstractC3557B.c0("listener", eVar);
        C1079o0 n10 = Ad.l.n();
        Ad.l.O0(Ad.l.g(c1057d0.plus(n10)), null, null, new k(jVar, qVar, eVar, null), 3);
        return n10;
    }
}

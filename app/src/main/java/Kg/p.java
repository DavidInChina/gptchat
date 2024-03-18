package Kg;

import G.X;
import id.AbstractC3557B;
import java.util.Iterator;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public abstract class p extends P4.a {
    public static k Z0(Iterator it) {
        AbstractC3557B.c0("<this>", it);
        return a1(new n(it, 0));
    }

    public static k a1(k kVar) {
        if (!(kVar instanceof a)) {
            return new a(kVar);
        }
        return kVar;
    }

    public static final h b1(k kVar) {
        o oVar = o.f9842Z;
        if (kVar instanceof s) {
            s sVar = (s) kVar;
            return new h(sVar.f9850a, sVar.f9851b, oVar);
        }
        return new h(kVar, o.f9843h0, oVar);
    }

    public static k c1(Object obj, wf.k kVar) {
        if (obj == null) {
            return d.f9815a;
        }
        return new j(new R5.c(12, obj), kVar);
    }

    public static k d1(AbstractC6216a abstractC6216a) {
        return a1(new j(abstractC6216a, new X(abstractC6216a, 13)));
    }

    public static k e1(Object... objArr) {
        if (objArr.length == 0) {
            return d.f9815a;
        }
        return kf.q.R2(objArr);
    }
}

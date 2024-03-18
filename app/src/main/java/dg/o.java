package dg;

import Sf.AbstractC1385d;
import eg.EnumC2893a;
import fg.C3032C;
import fg.C3042j;
import id.AbstractC3557B;
import java.util.Set;
import jf.C3959i;
import o1.C4885I;
import xg.C6452g;
import zg.EnumC6863j;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f28346b = R4.b.W1(EnumC2893a.f29380j0);

    /* renamed from: c  reason: collision with root package name */
    public static final Set f28347c = R4.b.X1(EnumC2893a.f29381k0, EnumC2893a.f29384n0);

    /* renamed from: d  reason: collision with root package name */
    public static final jg.g f28348d = new jg.g(new int[]{1, 1, 11}, false);

    /* renamed from: e  reason: collision with root package name */
    public static final jg.g f28349e = new jg.g(new int[]{1, 1, 13}, false);

    /* renamed from: a  reason: collision with root package name */
    public xg.m f28350a;

    static {
        new jg.g(new int[]{1, 1, 2}, false);
    }

    public static String[] g(AbstractC2653B abstractC2653B, Set set) {
        C4885I c4885i = ((Rf.c) abstractC2653B).f15500b;
        String[] strArr = (String[]) c4885i.f40439e;
        if (strArr == null) {
            strArr = c4885i.f40440f;
        }
        if (strArr == null || !set.contains((EnumC2893a) c4885i.f40437c)) {
            return null;
        }
        return strArr;
    }

    public final zg.q a(Pf.I i10, AbstractC2653B abstractC2653B) {
        C3959i c3959i;
        AbstractC3557B.c0("descriptor", i10);
        AbstractC3557B.c0("kotlinClass", abstractC2653B);
        String[] g10 = g(abstractC2653B, f28347c);
        if (g10 == null) {
            return null;
        }
        C4885I c4885i = ((Rf.c) abstractC2653B).f15500b;
        String[] strArr = c4885i.f40441g;
        Object obj = c4885i.f40438d;
        try {
        } catch (Throwable th2) {
            c().f50012c.getClass();
            AbstractC3557B.c0("<this>", c().f50012c);
            if (!((jg.g) obj).b(jg.g.f36187g)) {
                c3959i = null;
            } else {
                throw th2;
            }
        }
        if (strArr == null) {
            return null;
        }
        try {
            c3959i = jg.i.h(g10, strArr);
            if (c3959i == null) {
                return null;
            }
            jg.h hVar = (jg.h) c3959i.f36155Y;
            C3032C c3032c = (C3032C) c3959i.f36156Z;
            d(abstractC2653B);
            e(abstractC2653B);
            r rVar = new r(abstractC2653B, c3032c, hVar, b(abstractC2653B));
            return new zg.q(i10, c3032c, hVar, (jg.g) obj, rVar, c(), "scope for " + rVar + " in " + i10, C2674n.f28345Y);
        } catch (lg.t e10) {
            throw new IllegalStateException("Could not read data from " + ((Rf.c) abstractC2653B).a(), e10);
        }
    }

    public final EnumC6863j b(AbstractC2653B abstractC2653B) {
        boolean z10;
        c().f50012c.getClass();
        int i10 = ((Rf.c) abstractC2653B).f15500b.f40436b;
        if ((i10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i10 & 32) == 0) {
            return EnumC6863j.f52056Z;
        }
        if ((i10 & 16) != 0 && (i10 & 32) == 0) {
            return EnumC6863j.f52057h0;
        }
        return EnumC6863j.f52055Y;
    }

    public final xg.m c() {
        xg.m mVar = this.f28350a;
        if (mVar != null) {
            return mVar;
        }
        AbstractC3557B.C2("components");
        throw null;
    }

    public final xg.u d(AbstractC2653B abstractC2653B) {
        jg.g gVar;
        jg.g gVar2;
        c().f50012c.getClass();
        Rf.c cVar = (Rf.c) abstractC2653B;
        AbstractC3557B.c0("<this>", c().f50012c);
        jg.g gVar3 = jg.g.f36187g;
        if (((jg.g) cVar.f15500b.f40438d).b(gVar3)) {
            return null;
        }
        C4885I c4885i = cVar.f15500b;
        jg.g gVar4 = (jg.g) c4885i.f40438d;
        AbstractC3557B.c0("<this>", c().f50012c);
        AbstractC3557B.c0("<this>", c().f50012c);
        boolean z10 = ((jg.g) c4885i.f40438d).f36189f;
        gVar3.getClass();
        if (z10) {
            gVar = gVar3;
        } else {
            gVar = jg.g.f36188h;
        }
        gVar.getClass();
        int i10 = gVar3.f32291b;
        int i11 = gVar.f32291b;
        if (i11 > i10 || (i11 >= i10 && gVar.f32292c > gVar3.f32292c)) {
            gVar2 = gVar;
        } else {
            gVar2 = gVar3;
        }
        return new xg.u(gVar4, gVar3, gVar3, gVar2, cVar.a(), AbstractC1385d.a(cVar.f15499a));
    }

    public final boolean e(AbstractC2653B abstractC2653B) {
        c().f50012c.getClass();
        c().f50012c.getClass();
        C4885I c4885i = ((Rf.c) abstractC2653B).f15500b;
        if ((c4885i.f40436b & 2) != 0 && AbstractC3557B.K((jg.g) c4885i.f40438d, f28348d)) {
            return true;
        }
        return false;
    }

    public final C6452g f(AbstractC2653B abstractC2653B) {
        C3959i c3959i;
        String[] g10 = g(abstractC2653B, f28346b);
        if (g10 == null) {
            return null;
        }
        C4885I c4885i = ((Rf.c) abstractC2653B).f15500b;
        String[] strArr = c4885i.f40441g;
        Object obj = c4885i.f40438d;
        if (strArr == null) {
            return null;
        }
        try {
            try {
                c3959i = jg.i.f(g10, strArr);
            } catch (lg.t e10) {
                throw new IllegalStateException("Could not read data from " + ((Rf.c) abstractC2653B).a(), e10);
            }
        } catch (Throwable th2) {
            c().f50012c.getClass();
            AbstractC3557B.c0("<this>", c().f50012c);
            if (!((jg.g) obj).b(jg.g.f36187g)) {
                c3959i = null;
            } else {
                throw th2;
            }
        }
        if (c3959i == null) {
            return null;
        }
        d(abstractC2653B);
        e(abstractC2653B);
        return new C6452g((jg.h) c3959i.f36155Y, (C3042j) c3959i.f36156Z, (jg.g) obj, new C2655D(abstractC2653B, b(abstractC2653B)));
    }
}

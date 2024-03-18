package Ia;

import Ja.p;
import Ng.Q;
import Qg.F;
import Qg.F0;
import Qg.s0;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.t;
import fa.C2969F;
import id.AbstractC3557B;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import jf.C3963m;
import jf.y;
import kf.AbstractC4268D;
import kf.w;
import ld.C4428a;
import nf.AbstractC4825e;
import o9.C4957e;
import of.EnumC5000a;
import wd.C6168C;
import wd.u0;
import x8.W;
import yf.AbstractC6583a;
import zd.n;

/* loaded from: classes2.dex */
public final class l implements U9.a {

    /* renamed from: a  reason: collision with root package name */
    public final p f8526a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.h f8527b;

    /* renamed from: c  reason: collision with root package name */
    public final Pc.g f8528c = Bi.c.i1(Pc.b.f13929Z);

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f8529d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f8530e;

    /* renamed from: f  reason: collision with root package name */
    public final F0 f8531f;

    public l(p pVar, xd.h hVar, t tVar, C4428a c4428a) {
        this.f8526a = pVar;
        this.f8527b = hVar;
        this.f8529d = R4.b.D1(new e(tVar));
        F0 c10 = s0.c(w.f37484Y);
        this.f8530e = c10;
        this.f8531f = c10;
        Ad.l.O0(c4428a, null, null, new a(this, null), 3);
    }

    public static final boolean a(l lVar) {
        return ((Boolean) lVar.f8529d.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C2311c c2311c, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        SQLException e10;
        l lVar;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f8491j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f8491j0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f8489h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f8491j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2311c = bVar.f8488Z;
                        lVar = bVar.f8487Y;
                        try {
                            N.B0(obj);
                        } catch (SQLException e11) {
                            e10 = e11;
                            W.W(lVar.f8528c, "Delete SQLException", e10, null, 4);
                            return new wd.s0(1, e10);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    try {
                        p pVar = this.f8526a;
                        String str = c2311c.f26374a;
                        bVar.f8487Y = this;
                        bVar.f8488Z = c2311c;
                        bVar.f8491j0 = 1;
                        if (pVar.d(str, bVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        lVar = this;
                    } catch (SQLException e12) {
                        e10 = e12;
                        lVar = this;
                        W.W(lVar.f8528c, "Delete SQLException", e10, null, 4);
                        return new wd.s0(1, e10);
                    }
                }
                F0 f02 = lVar.f8530e;
                Map map = (Map) f02.getValue();
                C6168C c6168c = new C6168C(c2311c.f26374a);
                AbstractC3557B.c0("<this>", map);
                LinkedHashMap m12 = AbstractC4268D.m1(map);
                m12.remove(c6168c);
                f02.setValue(AbstractC4268D.d1(m12));
                return new u0(y.f36177a);
            }
        }
        bVar = new b(this, abstractC4825e);
        Object obj2 = bVar.f8489h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f8491j0;
        if (i10 == 0) {
        }
        F0 f022 = lVar.f8530e;
        Map map2 = (Map) f022.getValue();
        C6168C c6168c2 = new C6168C(c2311c.f26374a);
        AbstractC3557B.c0("<this>", map2);
        LinkedHashMap m122 = AbstractC4268D.m1(map2);
        m122.remove(c6168c2);
        f022.setValue(AbstractC4268D.d1(m122));
        return new u0(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        SQLException e10;
        l lVar;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f8495i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f8495i0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f8493Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f8495i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        lVar = cVar.f8492Y;
                        try {
                            N.B0(obj);
                        } catch (SQLException e11) {
                            e10 = e11;
                            W.W(lVar.f8528c, "DeleteAll SQLException", e10, null, 4);
                            return new wd.s0(1, e10);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    try {
                        p pVar = this.f8526a;
                        cVar.f8492Y = this;
                        cVar.f8495i0 = 1;
                        pVar.f8948a.getClass();
                        Object n12 = Ad.l.n1(cVar, Q.f12906c, new Ja.f(pVar, null));
                        if (n12 != enumC5000a) {
                            n12 = yVar;
                        }
                        if (n12 == enumC5000a) {
                            return enumC5000a;
                        }
                        lVar = this;
                    } catch (SQLException e12) {
                        e10 = e12;
                        lVar = this;
                        W.W(lVar.f8528c, "DeleteAll SQLException", e10, null, 4);
                        return new wd.s0(1, e10);
                    }
                }
                lVar.f8530e.setValue(w.f37484Y);
                return new u0(yVar);
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f8493Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f8495i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        lVar.f8530e.setValue(w.f37484Y);
        return new u0(yVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f8498h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f8498h0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f8496Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f8498h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    j jVar = ((rc.Q) this.f8527b).f44819b;
                    dVar.f8498h0 = 1;
                    obj = L4.a.m0(jVar, dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return Boolean.valueOf(((n) obj).f51982a);
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f8496Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f8498h0;
        if (i10 == 0) {
        }
        return Boolean.valueOf(((n) obj2).f51982a);
    }

    public final C4957e e(String str) {
        AbstractC3557B.c0("conversationId", str);
        return L4.a.I0(new g(this, null), L4.a.i0(new F(new f(this, str, null), new M1.w(new j(this.f8531f, 0, str), 20))));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Qg.F0, java.util.Map, ca.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(C2311c c2311c, boolean z10, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        C2311c c2311c2;
        int i11;
        int i12;
        Map map;
        l lVar;
        String str;
        SQLException e10;
        Map map2;
        l lVar2;
        IllegalArgumentException e11;
        C2311c c2311c3;
        boolean z11;
        F0 f02;
        ?? r52;
        l lVar3;
        Map map3;
        Object d10;
        String str2;
        l lVar4;
        Map map4;
        SQLException e12;
        Map map5;
        Map map6;
        F0 f03;
        F0 f04;
        Map map7;
        Map map8;
        Map map9;
        C2311c c2311c4 = c2311c;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i13 = kVar.f8525n0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f8525n0 = i13 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.f8523l0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar2.f8525n0;
                String str3 = "Update SQLException";
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                c2311c3 = kVar2.f8518Z;
                                lVar2 = kVar2.f8517Y;
                                try {
                                    N.B0(obj);
                                    c2311c2 = c2311c3;
                                    return new u0(new C6168C(c2311c2.f26374a));
                                } catch (IllegalArgumentException e13) {
                                    e11 = e13;
                                    i12 = 1;
                                    map2 = null;
                                    i11 = 4;
                                    W.W(lVar2.f8528c, "Update IllegalArgumentException", e11, map2, i11);
                                    return new wd.s0(i12, e11);
                                } catch (SQLException e14) {
                                    e10 = e14;
                                    lVar = lVar2;
                                    i12 = 1;
                                    map = null;
                                    i11 = 4;
                                    str = str3;
                                    W.W(lVar.f8528c, str, e10, map, i11);
                                    return new wd.s0(i12, e10);
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2311c3 = kVar2.f8518Z;
                        l lVar5 = kVar2.f8517Y;
                        N.B0(obj);
                        lVar = lVar5;
                        i12 = 1;
                        map = null;
                        i11 = 4;
                        str = str3;
                        if (!((Boolean) obj).booleanValue()) {
                            try {
                                p pVar = lVar.f8526a;
                                kVar2.f8517Y = lVar;
                                kVar2.f8518Z = c2311c3;
                                kVar2.f8525n0 = 3;
                                if (pVar.f(c2311c3, kVar2) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } catch (IllegalArgumentException e15) {
                                e11 = e15;
                                lVar2 = lVar;
                                map2 = map;
                                W.W(lVar2.f8528c, "Update IllegalArgumentException", e11, map2, i11);
                                return new wd.s0(i12, e11);
                            } catch (SQLException e16) {
                                e10 = e16;
                                W.W(lVar.f8528c, str, e10, map, i11);
                                return new wd.s0(i12, e10);
                            }
                        }
                        c2311c2 = c2311c3;
                        return new u0(new C6168C(c2311c2.f26374a));
                    }
                    boolean z12 = kVar2.f8522k0;
                    f03 = kVar2.f8521j0;
                    c2311c2 = kVar2.f8520i0;
                    Map map10 = kVar2.f8519h0;
                    C2311c c2311c5 = kVar2.f8518Z;
                    lVar4 = kVar2.f8517Y;
                    try {
                        N.B0(obj);
                        i12 = 1;
                        str2 = str3;
                        z11 = z12;
                        c2311c4 = c2311c5;
                        map5 = map10;
                        map6 = null;
                    } catch (SQLException e17) {
                        e12 = e17;
                        i12 = 1;
                        map4 = null;
                        str2 = str3;
                        W.W(lVar4.f8528c, str2, e12, map4, 4);
                        return new wd.s0(i12, e12);
                    }
                } else {
                    N.B0(obj);
                    F0 f05 = this.f8530e;
                    Map map11 = (Map) f05.getValue();
                    C2311c c2311c6 = (C2311c) map11.get(new C6168C(c2311c4.f26374a));
                    if (c2311c6 != null && c2311c6.f26377d.compareTo(c2311c4.f26377d) > 0 && c2311c6.c().compareTo(c2311c.c()) > 0 && c2311c6.f26387n.f14549c > c2311c4.f26387n.f14549c) {
                        map7 = map11;
                        f04 = f05;
                    } else {
                        if (c2311c6 != null) {
                            map9 = c2311c6.f26380g;
                        } else {
                            map9 = null;
                        }
                        if (map9 == null) {
                            map9 = w.f37484Y;
                        }
                        map7 = map11;
                        f04 = f05;
                        c2311c6 = C2311c.a(c2311c, null, null, null, null, null, AbstractC4268D.e1(c2311c4.f26380g, map9), null, null, null, 16319);
                    }
                    String str4 = c2311c6.f26375b;
                    if (str4 != null && !AbstractC3557B.K(c2311c6.f26374a, str4)) {
                        Collection<Qa.h> values = c2311c6.f26387n.f14548b.values();
                        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(values, 10));
                        for (Qa.h hVar : values) {
                            String str5 = str3;
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(Qa.h.a(hVar, null, null, C2969F.a((C2969F) hVar.f14557d, str4, null, false, false, false, null, false, 268435453), 7));
                            arrayList = arrayList2;
                            str3 = str5;
                        }
                        str2 = str3;
                        map8 = null;
                        c2311c6 = C2311c.a(c2311c6, str4, null, null, null, null, null, null, null, new Qa.e(arrayList), 8190);
                    } else {
                        str2 = str3;
                        map8 = null;
                    }
                    c2311c2 = c2311c6;
                    String str6 = c2311c2.f26374a;
                    String str7 = c2311c4.f26374a;
                    if (!AbstractC3557B.K(str6, str7)) {
                        try {
                            p pVar2 = this.f8526a;
                            kVar2.f8517Y = this;
                            kVar2.f8518Z = c2311c4;
                            map5 = map7;
                            kVar2.f8519h0 = map5;
                            kVar2.f8520i0 = c2311c2;
                            kVar2.getClass();
                            F0 f06 = f04;
                            kVar2.f8521j0 = f06;
                            z11 = z10;
                            kVar2.f8522k0 = z11;
                            i12 = 1;
                            try {
                                kVar2.f8525n0 = 1;
                                if (pVar2.d(str7, kVar2) == enumC5000a) {
                                    return enumC5000a;
                                }
                                f03 = f06;
                                lVar4 = this;
                                map6 = map8;
                            } catch (SQLException e18) {
                                e12 = e18;
                                lVar4 = this;
                                map4 = map8;
                                W.W(lVar4.f8528c, str2, e12, map4, 4);
                                return new wd.s0(i12, e12);
                            }
                        } catch (SQLException e19) {
                            e12 = e19;
                            i12 = 1;
                        }
                    } else {
                        z11 = z10;
                        str = str2;
                        f02 = f04;
                        i12 = 1;
                        i11 = 4;
                        map3 = AbstractC4268D.g1(map7, new C3959i(new C6168C(str6), c2311c2));
                        lVar3 = this;
                        r52 = map8;
                        f02.setValue(map3);
                        if (z11 && !c2311c2.f26386m) {
                            kVar2.f8517Y = lVar3;
                            kVar2.f8518Z = c2311c2;
                            kVar2.f8519h0 = r52;
                            kVar2.f8520i0 = r52;
                            kVar2.getClass();
                            kVar2.f8521j0 = r52;
                            kVar2.f8525n0 = 2;
                            d10 = lVar3.d(kVar2);
                            if (d10 != enumC5000a) {
                                return enumC5000a;
                            }
                            l lVar6 = lVar3;
                            obj = d10;
                            c2311c3 = c2311c2;
                            lVar = lVar6;
                            map = r52;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            c2311c2 = c2311c3;
                        }
                        return new u0(new C6168C(c2311c2.f26374a));
                    }
                }
                C6168C c6168c = new C6168C(c2311c4.f26374a);
                AbstractC3557B.c0("<this>", map5);
                LinkedHashMap m12 = AbstractC4268D.m1(map5);
                m12.remove(c6168c);
                map3 = AbstractC4268D.g1(AbstractC4268D.d1(m12), new C3959i(new C6168C(c2311c2.f26374a), c2311c2));
                lVar3 = lVar4;
                i11 = 4;
                f02 = f03;
                str = str2;
                r52 = map6;
                f02.setValue(map3);
                if (z11) {
                    kVar2.f8517Y = lVar3;
                    kVar2.f8518Z = c2311c2;
                    kVar2.f8519h0 = r52;
                    kVar2.f8520i0 = r52;
                    kVar2.getClass();
                    kVar2.f8521j0 = r52;
                    kVar2.f8525n0 = 2;
                    d10 = lVar3.d(kVar2);
                    if (d10 != enumC5000a) {
                    }
                }
                return new u0(new C6168C(c2311c2.f26374a));
            }
        }
        kVar = new k(this, abstractC4825e);
        k kVar22 = kVar;
        Object obj2 = kVar22.f8523l0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar22.f8525n0;
        String str32 = "Update SQLException";
        if (i10 == 0) {
        }
        C6168C c6168c2 = new C6168C(c2311c4.f26374a);
        AbstractC3557B.c0("<this>", map5);
        LinkedHashMap m122 = AbstractC4268D.m1(map5);
        m122.remove(c6168c2);
        map3 = AbstractC4268D.g1(AbstractC4268D.d1(m122), new C3959i(new C6168C(c2311c2.f26374a), c2311c2));
        lVar3 = lVar4;
        i11 = 4;
        f02 = f03;
        str = str2;
        r52 = map6;
        f02.setValue(map3);
        if (z11) {
        }
        return new u0(new C6168C(c2311c2.f26374a));
    }
}

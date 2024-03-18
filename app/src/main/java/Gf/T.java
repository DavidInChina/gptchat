package Gf;

import Sf.AbstractC1385d;
import dg.AbstractC2653B;
import eg.EnumC2893a;
import fg.C3032C;
import hg.C3422a;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import jf.C3964n;
import kg.C4290b;
import kg.C4291c;
import l8.AbstractC4344b;
import o1.C4885I;
import sg.C5625b;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class T extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6363Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f6364Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(U u10, int i10) {
        super(0);
        this.f6363Y = i10;
        this.f6364Z = u10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        C4885I c4885i;
        ?? r62;
        int i10 = this.f6363Y;
        List<String> list = null;
        U u10 = this.f6364Z;
        switch (i10) {
            case 0:
                u10.getClass();
                Df.v vVar = U.f6365g[0];
                Rf.c cVar = (Rf.c) u10.f6366c.mo122invoke();
                if (cVar == null || (c4885i = cVar.f15500b) == null) {
                    return null;
                }
                String[] strArr = (String[]) c4885i.f40439e;
                String[] strArr2 = c4885i.f40441g;
                if (strArr == null || strArr2 == null) {
                    return null;
                }
                C3959i h10 = jg.i.h(strArr, strArr2);
                return new C3964n((jg.h) h10.f36155Y, (C3032C) h10.f36156Z, (jg.g) c4885i.f40438d);
            default:
                u10.getClass();
                Df.v vVar2 = U.f6365g[0];
                Rf.c cVar2 = (Rf.c) u10.f6366c.mo122invoke();
                if (cVar2 != null) {
                    Df.v vVar3 = D.f6336b[0];
                    Object mo122invoke = u10.f6337a.mo122invoke();
                    AbstractC3557B.b0("getValue(...)", mo122invoke);
                    io.sentry.android.core.z zVar = ((Rf.g) mo122invoke).f15507b;
                    zVar.getClass();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zVar.f34265h0;
                    Class cls = cVar2.f15499a;
                    C4290b a5 = AbstractC1385d.a(cls);
                    Object obj = concurrentHashMap.get(a5);
                    if (obj == null) {
                        C4291c g10 = AbstractC1385d.a(cls).g();
                        AbstractC3557B.b0("getPackageFqName(...)", g10);
                        C4885I c4885i2 = cVar2.f15500b;
                        EnumC2893a enumC2893a = (EnumC2893a) c4885i2.f40437c;
                        EnumC2893a enumC2893a2 = EnumC2893a.f29383m0;
                        Object obj2 = zVar.f34263Y;
                        if (enumC2893a == enumC2893a2) {
                            String[] strArr3 = (String[]) c4885i2.f40439e;
                            if (enumC2893a != enumC2893a2) {
                                strArr3 = null;
                            }
                            if (strArr3 != null) {
                                list = kf.q.Q2(strArr3);
                            }
                            if (list == null) {
                                list = kf.v.f37483Y;
                            }
                            r62 = new ArrayList();
                            for (String str : list) {
                                C4290b j6 = C4290b.j(new C4291c(C5625b.d(str).f45577a.replace('/', '.')));
                                AbstractC3557B.c0("<this>", ((dg.o) obj2).c().f50012c);
                                AbstractC2653B L10 = P4.a.L((Rf.d) zVar.f34264Z, j6, jg.g.f36187g);
                                if (L10 != null) {
                                    r62.add(L10);
                                }
                            }
                        } else {
                            r62 = AbstractC4344b.F0(cVar2);
                        }
                        dg.o oVar = (dg.o) obj2;
                        Lf.l lVar = new Lf.l(oVar.c().f50011b, g10, 1);
                        ArrayList arrayList = new ArrayList();
                        for (AbstractC2653B abstractC2653B : r62) {
                            zg.q a10 = oVar.a(lVar, abstractC2653B);
                            if (a10 != null) {
                                arrayList.add(a10);
                            }
                        }
                        ug.n g11 = C3422a.g("package " + g10 + " (" + cVar2 + ')', kf.t.K2(arrayList));
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(a5, g11);
                        if (putIfAbsent == null) {
                            obj = g11;
                        } else {
                            obj = putIfAbsent;
                        }
                    }
                    AbstractC3557B.b0("getOrPut(...)", obj);
                    return (ug.n) obj;
                }
                return ug.m.f46797b;
        }
    }
}

package cg;

import Bg.A;
import Bg.AbstractC0227u;
import Bg.D;
import Bg.m0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Uf.C1442d;
import Uf.EnumC1440b;
import Yf.J;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.AbstractC3957g;
import kg.C4293e;
import ng.AbstractC4838e;
import s3.z;

/* renamed from: cg.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2425p {

    /* renamed from: a  reason: collision with root package name */
    public final Nf.a f26649a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26650b;

    /* renamed from: c  reason: collision with root package name */
    public final z f26651c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC1440b f26652d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26653e;

    public C2425p(Nf.a aVar, boolean z10, z zVar, EnumC1440b enumC1440b, boolean z11) {
        AbstractC3557B.c0("containerContext", zVar);
        this.f26649a = aVar;
        this.f26650b = z10;
        this.f26651c = zVar;
        this.f26652d = enumC1440b;
        this.f26653e = z11;
    }

    public static void a(Object obj, ArrayList arrayList, Oc.c cVar) {
        arrayList.add(obj);
        Iterable<Object> iterable = (Iterable) cVar.invoke(obj);
        if (iterable != null) {
            for (Object obj2 : iterable) {
                a(obj2, arrayList, cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static C2416g b(Eg.j jVar) {
        ?? r02;
        EnumC2415f enumC2415f;
        boolean z10;
        if (!(jVar instanceof J)) {
            return null;
        }
        List<Eg.f> y12 = AbstractC3557B.y1(jVar);
        if (y12.isEmpty()) {
            return null;
        }
        for (Eg.f fVar : y12) {
            if (!AbstractC3557B.K1(fVar)) {
                if (!y12.isEmpty()) {
                    for (Eg.f fVar2 : y12) {
                        if (d(fVar2) != null) {
                            r02 = y12;
                            break;
                        }
                    }
                }
                if (y12.isEmpty()) {
                    return null;
                }
                for (Eg.f fVar3 : y12) {
                    AbstractC3557B.c0("<this>", fVar3);
                    if (L4.a.u0((A) fVar3) != null) {
                        r02 = new ArrayList();
                        for (Eg.f fVar4 : y12) {
                            AbstractC3557B.c0("<this>", fVar4);
                            A u02 = L4.a.u0((A) fVar4);
                            if (u02 != null) {
                                r02.add(u02);
                            }
                        }
                        if (!r02.isEmpty()) {
                            for (Eg.f fVar5 : r02) {
                                if (!AbstractC3557B.S1(fVar5)) {
                                    enumC2415f = EnumC2415f.f26630h0;
                                    break;
                                }
                            }
                        }
                        enumC2415f = EnumC2415f.f26629Z;
                        if (r02 != y12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return new C2416g(enumC2415f, z10);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static C4293e c(D d10) {
        AbstractC0997f abstractC0997f;
        Dg.j jVar = m0.f2138a;
        AbstractC1000i k10 = d10.y0().k();
        if (k10 instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) k10;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f == null) {
            return null;
        }
        return AbstractC4838e.g(abstractC0997f);
    }

    public static EnumC2415f d(Eg.f fVar) {
        D d10;
        D d11;
        AbstractC3557B.c0("<this>", fVar);
        AbstractC0227u Q = AbstractC3557B.Q(fVar);
        if (Q == null || (d10 = AbstractC3557B.e2(Q)) == null) {
            d10 = AbstractC3557B.R(fVar);
            AbstractC3557B.Z(d10);
        }
        if (AbstractC3557B.Q1(d10)) {
            return EnumC2415f.f26629Z;
        }
        AbstractC0227u Q10 = AbstractC3557B.Q(fVar);
        if (Q10 == null || (d11 = AbstractC3557B.K2(Q10)) == null) {
            d11 = AbstractC3557B.R(fVar);
            AbstractC3557B.Z(d11);
        }
        if (!AbstractC3557B.Q1(d11)) {
            return EnumC2415f.f26630h0;
        }
        return null;
    }

    public final ArrayList e(Eg.f fVar) {
        Cg.p pVar = Cg.p.f3146a;
        z zVar = this.f26651c;
        C1442d c1442d = ((Xf.a) zVar.f45394a).f21968q;
        AbstractC3557B.c0("<this>", fVar);
        C2410a c2410a = new C2410a(fVar, c1442d.b((Uf.z) ((AbstractC3957g) zVar.f45397d).getValue(), ((A) fVar).getAnnotations()), null);
        Oc.c cVar = new Oc.c(this, 24, pVar);
        ArrayList arrayList = new ArrayList(1);
        a(c2410a, arrayList, cVar);
        return arrayList;
    }
}

package zg;

import Bg.D;
import M3.I;
import Mf.AbstractC1003l;
import fg.C3033a;
import fg.C3039g;
import fg.C3056y;
import fg.G;
import fg.Q;
import fg.T;
import fg.f0;
import hg.AbstractC3423b;
import hg.AbstractC3427f;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4294f;
import lc.C4385I;
import xg.K;
import xg.z;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52062Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f52063Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f52062Y = i10;
        this.f52063Z = oVar;
    }

    public final Collection a(C4294f c4294f) {
        Collection<G> collection = kf.v.f37483Y;
        int i10 = this.f52062Y;
        o oVar = this.f52063Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", c4294f);
                LinkedHashMap linkedHashMap = oVar.f52065a;
                C3033a c3033a = C3056y.f30765A0;
                AbstractC3557B.b0("PARSER", c3033a);
                byte[] bArr = (byte[]) linkedHashMap.get(c4294f);
                p pVar = oVar.f52073i;
                if (bArr != null) {
                    collection = Kg.m.p1(Kg.p.d1(new C4385I(c3033a, new ByteArrayInputStream(bArr), pVar, 10)));
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (C3056y c3056y : collection) {
                    AbstractC3557B.Z(c3056y);
                    s e10 = ((z) pVar.f52075b.f11544i).e(c3056y);
                    if (!pVar.r(e10)) {
                        e10 = null;
                    }
                    if (e10 != null) {
                        arrayList.add(e10);
                    }
                }
                pVar.j(c4294f, arrayList);
                return Ig.i.e(arrayList);
            default:
                AbstractC3557B.c0("it", c4294f);
                LinkedHashMap linkedHashMap2 = oVar.f52066b;
                C3033a c3033a2 = G.f30308A0;
                AbstractC3557B.b0("PARSER", c3033a2);
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c4294f);
                p pVar2 = oVar.f52073i;
                if (bArr2 != null) {
                    collection = Kg.m.p1(Kg.p.d1(new C4385I(c3033a2, new ByteArrayInputStream(bArr2), pVar2, 10)));
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                for (G g10 : collection) {
                    AbstractC3557B.Z(g10);
                    arrayList2.add(((z) pVar2.f52075b.f11544i).f(g10));
                }
                pVar2.k(c4294f, arrayList2);
                return Ig.i.e(arrayList2);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Nf.i jVar;
        I a5;
        Q q10;
        Q q11;
        switch (this.f52062Y) {
            case 0:
                return a((C4294f) obj);
            case 1:
                return a((C4294f) obj);
            default:
                C4294f c4294f = (C4294f) obj;
                AbstractC3557B.c0("it", c4294f);
                o oVar = this.f52063Z;
                byte[] bArr = (byte[]) oVar.f52067c.get(c4294f);
                if (bArr == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                p pVar = oVar.f52073i;
                T t10 = (T) T.f30424u0.a(byteArrayInputStream, ((xg.m) pVar.f52075b.f11536a).f50025p);
                if (t10 == null) {
                    return null;
                }
                z zVar = (z) pVar.f52075b.f11544i;
                zVar.getClass();
                List list = t10.f30434p0;
                AbstractC3557B.b0("getAnnotationList(...)", list);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    I i10 = zVar.f50057a;
                    if (hasNext) {
                        C3039g c3039g = (C3039g) it.next();
                        AbstractC3557B.Z(c3039g);
                        arrayList.add(zVar.f50058b.k(c3039g, i10.f11537b));
                    } else {
                        if (arrayList.isEmpty()) {
                            jVar = Nf.h.f12822a;
                        } else {
                            jVar = new Nf.j(0, arrayList);
                        }
                        Nf.i iVar = jVar;
                        t tVar = new t(i10.c(), (AbstractC1003l) i10.f11538c, iVar, R4.b.o1(i10.f11537b, t10.f30428j0), Bi.c.K0((f0) AbstractC3427f.f32315d.c(t10.f30427i0)), t10, i10.f11537b, (C3430i) i10.f11539d, (C3432k) i10.f11540e, (AbstractC6864k) i10.f11542g);
                        List list2 = t10.f30429k0;
                        AbstractC3557B.b0("getTypeParameterList(...)", list2);
                        a5 = i10.a(tVar, list2, i10.f11537b, (C3430i) i10.f11539d, (C3432k) i10.f11540e, (AbstractC3423b) i10.f11541f);
                        K k10 = (K) a5.f11543h;
                        List b10 = k10.b();
                        C3430i c3430i = (C3430i) i10.f11539d;
                        AbstractC3557B.c0("typeTable", c3430i);
                        int i11 = t10.f30426h0;
                        if ((i11 & 4) == 4) {
                            q10 = t10.f30430l0;
                            AbstractC3557B.b0("getUnderlyingType(...)", q10);
                        } else if ((i11 & 8) == 8) {
                            q10 = c3430i.a(t10.f30431m0);
                        } else {
                            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
                        }
                        D d10 = k10.d(q10, false);
                        C3430i c3430i2 = (C3430i) i10.f11539d;
                        AbstractC3557B.c0("typeTable", c3430i2);
                        int i12 = t10.f30426h0;
                        if ((i12 & 16) == 16) {
                            q11 = t10.f30432n0;
                            AbstractC3557B.b0("getExpandedType(...)", q11);
                        } else if ((i12 & 32) == 32) {
                            q11 = c3430i2.a(t10.f30433o0);
                        } else {
                            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
                        }
                        tVar.z0(b10, d10, k10.d(q11, false));
                        return tVar;
                    }
                }
        }
    }
}

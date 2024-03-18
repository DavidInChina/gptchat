package Yf;

import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.P;
import bg.AbstractC2199g;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.C4294f;
import l8.AbstractC4344b;
import sg.C5624a;
import ug.C5925g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f22310p = 0;

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC2199g f22311n;

    /* renamed from: o  reason: collision with root package name */
    public final Wf.c f22312o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(s3.z zVar, AbstractC2199g abstractC2199g, Wf.c cVar) {
        super(zVar, null);
        AbstractC3557B.c0("jClass", abstractC2199g);
        AbstractC3557B.c0("ownerDescriptor", cVar);
        this.f22311n = abstractC2199g;
        this.f22312o = cVar;
    }

    public static P v(P p10) {
        if (p10.e() != 2) {
            return p10;
        }
        Collection m10 = p10.m();
        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
        Collection<P> collection = m10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection, 10));
        for (P p11 : collection) {
            AbstractC3557B.Z(p11);
            arrayList.add(v(p11));
        }
        return (P) kf.t.B2(kf.t.Y1(arrayList));
    }

    @Override // ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return null;
    }

    @Override // Yf.B
    public final Set h(C5925g c5925g, ug.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        return kf.x.f37485Y;
    }

    @Override // Yf.B
    public final Set i(C5925g c5925g, ug.k kVar) {
        Set set;
        AbstractC3557B.c0("kindFilter", c5925g);
        Set O22 = kf.t.O2(((AbstractC1691c) this.f22295e.mo122invoke()).a());
        Wf.c cVar = this.f22312o;
        H o12 = AbstractC3557B.o1(cVar);
        if (o12 != null) {
            set = o12.b();
        } else {
            set = null;
        }
        if (set == null) {
            set = kf.x.f37485Y;
        }
        O22.addAll(set);
        if (((Sf.q) this.f22311n).f16621a.isEnum()) {
            O22.addAll(AbstractC4344b.G0(Jf.q.f9196c, Jf.q.f9194a));
        }
        s3.z zVar = this.f22292b;
        O22.addAll(((C5624a) ((Xf.a) zVar.f45394a).f21975x).g(zVar, cVar));
        return O22;
    }

    @Override // Yf.B
    public final void j(ArrayList arrayList, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        s3.z zVar = this.f22292b;
        ((C5624a) ((Xf.a) zVar.f45394a).f21975x).d(zVar, this.f22312o, c4294f, arrayList);
    }

    @Override // Yf.B
    public final AbstractC1691c k() {
        return new C1689a(this.f22311n, D.f22304Y);
    }

    @Override // Yf.B
    public final void m(LinkedHashSet linkedHashSet, C4294f c4294f) {
        Collection collection;
        AbstractC3557B.c0("name", c4294f);
        Wf.c cVar = this.f22312o;
        H o12 = AbstractC3557B.o1(cVar);
        if (o12 == null) {
            collection = kf.x.f37485Y;
        } else {
            collection = kf.t.P2(o12.a(c4294f, Tf.d.f17215j0));
        }
        Xf.a aVar = (Xf.a) this.f22292b.f45394a;
        linkedHashSet.addAll(N.u0(c4294f, collection, linkedHashSet, this.f22312o, aVar.f21957f, ((Cg.o) aVar.f21972u).f3145e));
        if (((Sf.q) this.f22311n).f16621a.isEnum()) {
            if (AbstractC3557B.K(c4294f, Jf.q.f9196c)) {
                linkedHashSet.add(R4.b.f0(cVar));
            } else if (AbstractC3557B.K(c4294f, Jf.q.f9194a)) {
                linkedHashSet.add(R4.b.g0(cVar));
            }
        }
    }

    @Override // Yf.I, Yf.B
    public final void n(ArrayList arrayList, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Lf.o oVar = new Lf.o(c4294f, 1);
        Wf.c cVar = this.f22312o;
        Ig.i.f(AbstractC4344b.F0(cVar), C.f22303Y, new G(cVar, linkedHashSet, oVar));
        boolean z10 = !arrayList.isEmpty();
        s3.z zVar = this.f22292b;
        if (z10) {
            Xf.a aVar = (Xf.a) zVar.f45394a;
            arrayList.addAll(N.u0(c4294f, linkedHashSet, arrayList, this.f22312o, aVar.f21957f, ((Cg.o) aVar.f21972u).f3145e));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                P v10 = v((P) obj);
                Object obj2 = linkedHashMap.get(v10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v10, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection collection = (Collection) entry.getValue();
                Xf.a aVar2 = (Xf.a) zVar.f45394a;
                kf.s.N1(N.u0(c4294f, collection, arrayList, this.f22312o, aVar2.f21957f, ((Cg.o) aVar2.f21972u).f3145e), arrayList2);
            }
            arrayList.addAll(arrayList2);
        }
        if (((Sf.q) this.f22311n).f16621a.isEnum() && AbstractC3557B.K(c4294f, Jf.q.f9195b)) {
            Ig.i.b(R4.b.e0(cVar), arrayList);
        }
    }

    @Override // Yf.B
    public final Set o(C5925g c5925g) {
        AbstractC3557B.c0("kindFilter", c5925g);
        Set O22 = kf.t.O2(((AbstractC1691c) this.f22295e.mo122invoke()).e());
        E e10 = E.f22305Y;
        Wf.c cVar = this.f22312o;
        Ig.i.f(AbstractC4344b.F0(cVar), C.f22303Y, new G(cVar, O22, e10));
        if (((Sf.q) this.f22311n).f16621a.isEnum()) {
            O22.add(Jf.q.f9195b);
        }
        return O22;
    }

    @Override // Yf.B
    public final AbstractC1003l q() {
        return this.f22312o;
    }
}

package Yf;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import bg.AbstractC2199g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kg.AbstractC4296h;
import kg.C4294f;
import ud.C5902a;
import ug.C5925g;

/* loaded from: classes.dex */
public final class v extends I {

    /* renamed from: n  reason: collision with root package name */
    public final Sf.A f22389n;

    /* renamed from: o  reason: collision with root package name */
    public final q f22390o;

    /* renamed from: p  reason: collision with root package name */
    public final Ag.j f22391p;

    /* renamed from: q  reason: collision with root package name */
    public final Ag.m f22392q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s3.z zVar, Sf.A a5, q qVar) {
        super(zVar, null);
        AbstractC3557B.c0("jPackage", a5);
        AbstractC3557B.c0("ownerDescriptor", qVar);
        this.f22389n = a5;
        this.f22390o = qVar;
        Ag.u e10 = zVar.e();
        C5902a c5902a = new C5902a(zVar, 21, this);
        Ag.q qVar2 = (Ag.q) e10;
        qVar2.getClass();
        this.f22391p = new Ag.j(qVar2, c5902a);
        this.f22392q = ((Ag.q) zVar.e()).c(new Oc.c(this, 21, zVar));
    }

    @Override // Yf.B, ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        if (!c5925g.a(C5925g.f46780k | C5925g.f46773d)) {
            return kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) this.f22294d.mo122invoke()) {
            AbstractC1003l abstractC1003l = (AbstractC1003l) obj;
            if (abstractC1003l instanceof AbstractC0997f) {
                C4294f name = ((AbstractC0997f) abstractC1003l).getName();
                AbstractC3557B.b0("getName(...)", name);
                if (((Boolean) kVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return v(c4294f, null);
    }

    @Override // Yf.B, ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return kf.v.f37483Y;
    }

    @Override // Yf.B
    public final Set h(C5925g c5925g, ug.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        if (!c5925g.a(C5925g.f46773d)) {
            return kf.x.f37485Y;
        }
        Set<String> set = (Set) this.f22391p.mo122invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String str : set) {
                hashSet.add(C4294f.e(str));
            }
            return hashSet;
        }
        this.f22389n.getClass();
        return new LinkedHashSet();
    }

    @Override // Yf.B
    public final Set i(C5925g c5925g, ug.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        return kf.x.f37485Y;
    }

    @Override // Yf.B
    public final AbstractC1691c k() {
        return C1690b.f22321a;
    }

    @Override // Yf.B
    public final void m(LinkedHashSet linkedHashSet, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
    }

    @Override // Yf.B
    public final Set o(C5925g c5925g) {
        AbstractC3557B.c0("kindFilter", c5925g);
        return kf.x.f37485Y;
    }

    @Override // Yf.B
    public final AbstractC1003l q() {
        return this.f22390o;
    }

    public final AbstractC0997f v(C4294f c4294f, AbstractC2199g abstractC2199g) {
        C4294f c4294f2 = AbstractC4296h.f37511a;
        AbstractC3557B.c0("name", c4294f);
        String b10 = c4294f.b();
        AbstractC3557B.b0("asString(...)", b10);
        if (b10.length() <= 0 || c4294f.f37508Z) {
            return null;
        }
        Set set = (Set) this.f22391p.mo122invoke();
        if (abstractC2199g == null && set != null && !set.contains(c4294f.b())) {
            return null;
        }
        return (AbstractC0997f) this.f22392q.invoke(new r(c4294f, abstractC2199g));
    }
}

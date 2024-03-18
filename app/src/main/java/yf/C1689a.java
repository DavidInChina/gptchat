package Yf;

import bg.AbstractC2199g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kg.C4294f;
import yf.AbstractC6583a;

/* renamed from: Yf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689a implements AbstractC1691c {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2199g f22315a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f22316b;

    /* renamed from: c  reason: collision with root package name */
    public final Xf.f f22317c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f22318d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f22319e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f22320f;

    public C1689a(AbstractC2199g abstractC2199g, wf.k kVar) {
        AbstractC3557B.c0("jClass", abstractC2199g);
        this.f22315a = abstractC2199g;
        this.f22316b = kVar;
        Xf.f fVar = new Xf.f(1, this);
        this.f22317c = fVar;
        Kg.f h12 = Kg.m.h1(kf.t.V1(((Sf.q) abstractC2199g).c()), fVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Kg.e eVar = new Kg.e(h12);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            C4294f b10 = ((Sf.z) next).b();
            Object obj = linkedHashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b10, obj);
            }
            ((List) obj).add(next);
        }
        this.f22318d = linkedHashMap;
        Kg.f h13 = Kg.m.h1(kf.t.V1(((Sf.q) this.f22315a).a()), this.f22316b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Kg.e eVar2 = new Kg.e(h13);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((Sf.w) next2).b(), next2);
        }
        this.f22319e = linkedHashMap2;
        ArrayList e10 = ((Sf.q) this.f22315a).e();
        wf.k kVar2 = this.f22316b;
        ArrayList arrayList = new ArrayList();
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) kVar2.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int n02 = P4.a.n0(AbstractC6583a.H1(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(n02 < 16 ? 16 : n02);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((Sf.C) next4).b(), next4);
        }
        this.f22320f = linkedHashMap3;
    }

    @Override // Yf.AbstractC1691c
    public final Set a() {
        Kg.f h12 = Kg.m.h1(kf.t.V1(((Sf.q) this.f22315a).c()), this.f22317c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Kg.e eVar = new Kg.e(h12);
        while (eVar.hasNext()) {
            linkedHashSet.add(((Sf.z) eVar.next()).b());
        }
        return linkedHashSet;
    }

    @Override // Yf.AbstractC1691c
    public final Collection b(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        List list = (List) this.f22318d.get(c4294f);
        if (list == null) {
            return kf.v.f37483Y;
        }
        return list;
    }

    @Override // Yf.AbstractC1691c
    public final Sf.w c(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        return (Sf.w) this.f22319e.get(c4294f);
    }

    @Override // Yf.AbstractC1691c
    public final Set d() {
        return this.f22320f.keySet();
    }

    @Override // Yf.AbstractC1691c
    public final Set e() {
        Kg.f h12 = Kg.m.h1(kf.t.V1(((Sf.q) this.f22315a).a()), this.f22316b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Kg.e eVar = new Kg.e(h12);
        while (eVar.hasNext()) {
            linkedHashSet.add(((Sf.w) eVar.next()).b());
        }
        return linkedHashSet;
    }

    @Override // Yf.AbstractC1691c
    public final Sf.C f(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        return (Sf.C) this.f22320f.get(c4294f);
    }
}

package Z;

import h0.C3288a;
import h0.C3291d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import nf.AbstractC4828h;
import nf.AbstractC4831k;

/* renamed from: Z.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729p extends AbstractC1738u {

    /* renamed from: a  reason: collision with root package name */
    public final int f22666a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22667b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22668c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet f22669d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f22670e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final C1724m0 f22671f = AbstractC4828h.Z(C3291d.f31684i0, F0.f22489a);

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f22672g;

    public C1729p(r rVar, int i10, boolean z10, boolean z11, G6.a aVar) {
        this.f22672g = rVar;
        this.f22666a = i10;
        this.f22667b = z10;
        this.f22668c = z11;
    }

    @Override // Z.AbstractC1738u
    public final void a(D d10, C3288a c3288a) {
        this.f22672g.f22697b.a(d10, c3288a);
    }

    @Override // Z.AbstractC1738u
    public final void b() {
        r rVar = this.f22672g;
        rVar.f22721z--;
    }

    @Override // Z.AbstractC1738u
    public final boolean c() {
        return this.f22667b;
    }

    @Override // Z.AbstractC1738u
    public final boolean d() {
        return this.f22668c;
    }

    @Override // Z.AbstractC1738u
    public final AbstractC1732q0 e() {
        return (AbstractC1732q0) this.f22671f.getValue();
    }

    @Override // Z.AbstractC1738u
    public final int f() {
        return this.f22666a;
    }

    @Override // Z.AbstractC1738u
    public final AbstractC4831k g() {
        return this.f22672g.f22697b.g();
    }

    @Override // Z.AbstractC1738u
    public final void h(D d10) {
        r rVar = this.f22672g;
        rVar.f22697b.h(rVar.f22702g);
        rVar.f22697b.h(d10);
    }

    @Override // Z.AbstractC1738u
    public final AbstractC1702b0 i(AbstractC1704c0 abstractC1704c0) {
        return this.f22672g.f22697b.i(abstractC1704c0);
    }

    @Override // Z.AbstractC1738u
    public final void j(Set set) {
        HashSet hashSet = this.f22669d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f22669d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // Z.AbstractC1738u
    public final void k(r rVar) {
        this.f22670e.add(rVar);
    }

    @Override // Z.AbstractC1738u
    public final void l(D d10) {
        this.f22672g.f22697b.l(d10);
    }

    @Override // Z.AbstractC1738u
    public final void m() {
        this.f22672g.f22721z++;
    }

    @Override // Z.AbstractC1738u
    public final void n(r rVar) {
        HashSet hashSet = this.f22669d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(rVar.f22698c);
            }
        }
        Ad.l.H(this.f22670e).remove(rVar);
    }

    @Override // Z.AbstractC1738u
    public final void o(D d10) {
        this.f22672g.f22697b.o(d10);
    }

    public final void p() {
        LinkedHashSet<r> linkedHashSet = this.f22670e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f22669d;
            if (hashSet != null) {
                for (r rVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(rVar.f22698c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}

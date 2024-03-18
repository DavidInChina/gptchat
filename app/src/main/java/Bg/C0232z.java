package Bg;

import Mf.AbstractC1000i;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import me.C4634g;
import yf.AbstractC6583a;

/* renamed from: Bg.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0232z implements Y, Eg.i {

    /* renamed from: a  reason: collision with root package name */
    public A f2166a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f2167b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2168c;

    public C0232z(AbstractCollection abstractCollection) {
        AbstractC3557B.c0("typesToIntersect", abstractCollection);
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f2167b = linkedHashSet;
        this.f2168c = linkedHashSet.hashCode();
    }

    public final D b() {
        Q.f2084Z.getClass();
        return C0213f.o(Q.f2085h0, this, kf.v.f37483Y, false, C3422a.f("member scope for intersection type", this.f2167b), new Xf.f(12, this));
    }

    public final String c(wf.k kVar) {
        AbstractC3557B.c0("getProperTypeRelatedToStringify", kVar);
        return kf.t.m2(kf.t.F2(this.f2167b, new N.b0(8, kVar)), " & ", "{", "}", new C4634g(2, kVar), 24);
    }

    public final C0232z d(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        LinkedHashSet<A> linkedHashSet = this.f2167b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(linkedHashSet, 10));
        boolean z10 = false;
        for (A a5 : linkedHashSet) {
            arrayList.add(a5.A0(iVar));
            z10 = true;
        }
        C0232z c0232z = null;
        A a10 = null;
        if (z10) {
            A a11 = this.f2166a;
            if (a11 != null) {
                a10 = a11.A0(iVar);
            }
            C0232z c0232z2 = new C0232z(new C0232z(arrayList).f2167b);
            c0232z2.f2166a = a10;
            c0232z = c0232z2;
        }
        if (c0232z == null) {
            return this;
        }
        return c0232z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0232z)) {
            return false;
        }
        return AbstractC3557B.K(this.f2167b, ((C0232z) obj).f2167b);
    }

    @Override // Bg.Y
    public final List getParameters() {
        return kf.v.f37483Y;
    }

    public final int hashCode() {
        return this.f2168c;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        Jf.l j6 = ((A) this.f2167b.iterator().next()).y0().j();
        AbstractC3557B.b0("getBuiltIns(...)", j6);
        return j6;
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        return null;
    }

    @Override // Bg.Y
    public final Collection l() {
        return this.f2167b;
    }

    @Override // Bg.Y
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return c(C0231y.f2165Y);
    }
}

package Bg;

import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import ng.AbstractC4838e;

/* renamed from: Bg.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0218k implements Y {

    /* renamed from: a  reason: collision with root package name */
    public int f2129a;

    /* renamed from: b  reason: collision with root package name */
    public final Ag.e f2130b;

    public AbstractC0218k(Ag.u uVar) {
        AbstractC3557B.c0("storageManager", uVar);
        this.f2130b = new Ag.e((Ag.q) uVar, new Uf.A(14, this), new C0217j(this, 4));
    }

    public abstract Collection b();

    public abstract A c();

    /* renamed from: d */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y) || obj.hashCode() != hashCode()) {
            return false;
        }
        Y y10 = (Y) obj;
        if (y10.getParameters().size() != getParameters().size()) {
            return false;
        }
        AbstractC1000i k10 = k();
        AbstractC1000i k11 = y10.k();
        if (k11 == null || Dg.m.f(k10) || AbstractC4838e.o(k10) || Dg.m.f(k11) || AbstractC4838e.o(k11)) {
            return false;
        }
        return i(k11);
    }

    public Collection e(boolean z10) {
        return kf.v.f37483Y;
    }

    public abstract Mf.Z f();

    /* renamed from: g */
    public final List l() {
        return ((C0215h) this.f2130b.mo122invoke()).f2122b;
    }

    /* renamed from: h */
    public final int hashCode() {
        int i10;
        int i11 = this.f2129a;
        if (i11 != 0) {
            return i11;
        }
        AbstractC1000i k10 = k();
        if (!Dg.m.f(k10) && !AbstractC4838e.o(k10)) {
            i10 = AbstractC4838e.g(k10).f37503a.hashCode();
        } else {
            i10 = System.identityHashCode(this);
        }
        this.f2129a = i10;
        return i10;
    }

    public abstract boolean i(AbstractC1000i abstractC1000i);

    public void o(A a5) {
        AbstractC3557B.c0("type", a5);
    }

    public List n(List list) {
        return list;
    }
}

package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6205s {
    public static final C6202o Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final C6205s f48452c;

    /* renamed from: d  reason: collision with root package name */
    public static final C6205s f48453d;

    /* renamed from: e  reason: collision with root package name */
    public static final C6205s f48454e;

    /* renamed from: f  reason: collision with root package name */
    public static final C6205s f48455f;

    /* renamed from: g  reason: collision with root package name */
    public static final C6205s f48456g;

    /* renamed from: a  reason: collision with root package name */
    public final C6189g f48457a;

    /* renamed from: b  reason: collision with root package name */
    public final K0 f48458b;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd.o, java.lang.Object] */
    static {
        C6179b c6179b = C6189g.Companion;
        c6179b.getClass();
        C6189g c6189g = C6189g.f48405l;
        J0 j02 = K0.Companion;
        j02.getClass();
        K0 k02 = K0.f48351f;
        new C6205s(c6189g, k02);
        c6179b.getClass();
        C6189g c6189g2 = C6189g.f48404k;
        j02.getClass();
        f48452c = new C6205s(c6189g2, k02);
        c6179b.getClass();
        C6189g c6189g3 = C6189g.f48406m;
        j02.getClass();
        f48453d = new C6205s(c6189g3, k02);
        c6179b.getClass();
        C6189g c6189g4 = C6189g.f48407n;
        j02.getClass();
        f48454e = new C6205s(c6189g4, k02);
        c6179b.getClass();
        C6189g c6189g5 = C6189g.f48408o;
        j02.getClass();
        f48455f = new C6205s(c6189g5, k02);
        c6179b.getClass();
        C6189g c6189g6 = C6189g.f48409p;
        j02.getClass();
        f48456g = new C6205s(c6189g6, k02);
    }

    public C6205s(int i10, C6189g c6189g, K0 k02) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C6201n.f48445b);
            throw null;
        }
        this.f48457a = c6189g;
        this.f48458b = k02;
    }

    public final String a() {
        C6189g c6189g = this.f48457a;
        if (c6189g != null) {
            return c6189g.f48410a;
        }
        return null;
    }

    public final String b() {
        if (e()) {
            C6189g c6189g = this.f48457a;
            if (c6189g != null) {
                return c6189g.f48418i;
            }
            return null;
        }
        return this.f48458b.f48355d;
    }

    public final String c() {
        EnumC6198k0 enumC6198k0;
        C6189g c6189g = this.f48457a;
        if (c6189g != null && (enumC6198k0 = c6189g.f48416g) != null) {
            return enumC6198k0.f48437Y;
        }
        return null;
    }

    public final boolean d() {
        C6189g c6189g = this.f48457a;
        if (c6189g == null || !c6189g.f48417h) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        C6189g c6189g = this.f48457a;
        if (c6189g == null || !c6189g.b()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6205s)) {
            return false;
        }
        C6205s c6205s = (C6205s) obj;
        if (AbstractC3557B.K(this.f48457a, c6205s.f48457a) && AbstractC3557B.K(this.f48458b, c6205s.f48458b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        C6189g c6189g = this.f48457a;
        if (c6189g == null) {
            i10 = 0;
        } else {
            i10 = c6189g.hashCode();
        }
        return this.f48458b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "AccountUser(account=" + this.f48457a + ", user=" + this.f48458b + Separators.RPAREN;
    }

    public C6205s(C6189g c6189g, K0 k02) {
        AbstractC3557B.c0("user", k02);
        this.f48457a = c6189g;
        this.f48458b = k02;
    }
}

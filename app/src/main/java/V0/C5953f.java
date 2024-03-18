package v0;

import id.AbstractC3557B;
import p0.C5035b;
import y.AbstractC6463a;

/* renamed from: v0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5953f {

    /* renamed from: k  reason: collision with root package name */
    public static final C5035b f46938k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static int f46939l;

    /* renamed from: a  reason: collision with root package name */
    public final String f46940a;

    /* renamed from: b  reason: collision with root package name */
    public final float f46941b;

    /* renamed from: c  reason: collision with root package name */
    public final float f46942c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46943d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46944e;

    /* renamed from: f  reason: collision with root package name */
    public final C5943G f46945f;

    /* renamed from: g  reason: collision with root package name */
    public final long f46946g;

    /* renamed from: h  reason: collision with root package name */
    public final int f46947h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f46948i;

    /* renamed from: j  reason: collision with root package name */
    public final int f46949j;

    public C5953f(String str, float f6, float f10, float f11, float f12, C5943G c5943g, long j6, int i10, boolean z10) {
        int i11;
        synchronized (f46938k) {
            i11 = f46939l;
            f46939l = i11 + 1;
        }
        this.f46940a = str;
        this.f46941b = f6;
        this.f46942c = f10;
        this.f46943d = f11;
        this.f46944e = f12;
        this.f46945f = c5943g;
        this.f46946g = j6;
        this.f46947h = i10;
        this.f46948i = z10;
        this.f46949j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5953f)) {
            return false;
        }
        C5953f c5953f = (C5953f) obj;
        if (AbstractC3557B.K(this.f46940a, c5953f.f46940a) && Z0.e.a(this.f46941b, c5953f.f46941b) && Z0.e.a(this.f46942c, c5953f.f46942c) && this.f46943d == c5953f.f46943d && this.f46944e == c5953f.f46944e && AbstractC3557B.K(this.f46945f, c5953f.f46945f) && r0.r.c(this.f46946g, c5953f.f46946g) && r0.G.b(this.f46947h, c5953f.f46947h) && this.f46948i == c5953f.f46948i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f46944e, AbstractC6463a.e(this.f46943d, AbstractC6463a.e(this.f46942c, AbstractC6463a.e(this.f46941b, this.f46940a.hashCode() * 31, 31), 31), 31), 31);
        int i11 = r0.r.f44264l;
        int n10 = (R.a.n(this.f46946g, (this.f46945f.hashCode() + e10) * 31, 31) + this.f46947h) * 31;
        if (this.f46948i) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return n10 + i10;
    }
}

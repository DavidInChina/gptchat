package G0;

import id.AbstractC3557B;
import z.C6672L;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f5647a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5648b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5650d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5651e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5652f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5653g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5654h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5655i;

    /* renamed from: j  reason: collision with root package name */
    public int f5656j;

    /* renamed from: k  reason: collision with root package name */
    public int f5657k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5658l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5659m;

    /* renamed from: n  reason: collision with root package name */
    public int f5660n;

    /* renamed from: p  reason: collision with root package name */
    public L f5662p;

    /* renamed from: c  reason: collision with root package name */
    public int f5649c = 5;

    /* renamed from: o  reason: collision with root package name */
    public final M f5661o = new M(this);

    /* renamed from: q  reason: collision with root package name */
    public long f5663q = A7.b.n(0, 0, 0, 0, 15);

    /* renamed from: r  reason: collision with root package name */
    public final C6672L f5664r = new C6672L(23, this);

    public O(androidx.compose.ui.node.a aVar) {
        this.f5647a = aVar;
    }

    public final g0 a() {
        return this.f5647a.f24831B0.f5702c;
    }

    public final void b(int i10) {
        boolean z10;
        O o10;
        int i11 = this.f5660n;
        this.f5660n = i10;
        boolean z11 = false;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            androidx.compose.ui.node.a E10 = this.f5647a.E();
            if (E10 != null) {
                o10 = E10.t();
            } else {
                o10 = null;
            }
            if (o10 != null) {
                if (i10 == 0) {
                    o10.b(o10.f5660n - 1);
                } else {
                    o10.b(o10.f5660n + 1);
                }
            }
        }
    }

    public final void c(boolean z10) {
        if (this.f5659m != z10) {
            this.f5659m = z10;
            if (z10 && !this.f5658l) {
                b(this.f5660n + 1);
            } else if (!z10 && !this.f5658l) {
                b(this.f5660n - 1);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f5658l != z10) {
            this.f5658l = z10;
            if (z10 && !this.f5659m) {
                b(this.f5660n + 1);
            } else if (!z10 && !this.f5659m) {
                b(this.f5660n - 1);
            }
        }
    }

    public final void e() {
        M m10 = this.f5661o;
        Object obj = m10.f5640v0;
        androidx.compose.ui.node.a aVar = this.f5647a;
        O o10 = m10.f5628J0;
        if ((obj != null || o10.a().u() != null) && m10.f5639u0) {
            m10.f5639u0 = false;
            m10.f5640v0 = o10.a().u();
            androidx.compose.ui.node.a E10 = aVar.E();
            if (E10 != null) {
                androidx.compose.ui.node.a.p0(E10, false, 3);
            }
        }
        L l10 = this.f5662p;
        if (l10 != null) {
            Object obj2 = l10.f5618z0;
            O o11 = l10.f5602B0;
            if (obj2 == null) {
                T E02 = o11.a().E0();
                AbstractC3557B.Z(E02);
                if (E02.f5673n0.u() == null) {
                    return;
                }
            }
            if (l10.f5617y0) {
                l10.f5617y0 = false;
                T E03 = o11.a().E0();
                AbstractC3557B.Z(E03);
                l10.f5618z0 = E03.f5673n0.u();
                if (AbstractC0579h.x(aVar)) {
                    androidx.compose.ui.node.a E11 = aVar.E();
                    if (E11 != null) {
                        androidx.compose.ui.node.a.p0(E11, false, 3);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.node.a E12 = aVar.E();
                if (E12 != null) {
                    androidx.compose.ui.node.a.n0(E12, false, 3);
                }
            }
        }
    }
}

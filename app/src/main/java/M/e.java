package M;

import H0.B0;
import N0.C1042a;
import N0.E;
import Ng.H;
import S0.r;
import id.AbstractC3557B;
import kf.v;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f11288a;

    /* renamed from: b  reason: collision with root package name */
    public E f11289b;

    /* renamed from: c  reason: collision with root package name */
    public r f11290c;

    /* renamed from: d  reason: collision with root package name */
    public int f11291d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11292e;

    /* renamed from: f  reason: collision with root package name */
    public int f11293f;

    /* renamed from: g  reason: collision with root package name */
    public int f11294g;

    /* renamed from: i  reason: collision with root package name */
    public Z0.b f11296i;

    /* renamed from: j  reason: collision with root package name */
    public C1042a f11297j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11298k;

    /* renamed from: m  reason: collision with root package name */
    public b f11300m;

    /* renamed from: n  reason: collision with root package name */
    public N0.o f11301n;

    /* renamed from: o  reason: collision with root package name */
    public Z0.l f11302o;

    /* renamed from: h  reason: collision with root package name */
    public long f11295h = a.f11260a;

    /* renamed from: l  reason: collision with root package name */
    public long f11299l = H.c(0, 0);

    /* renamed from: p  reason: collision with root package name */
    public long f11303p = B0.d(0, 0);

    /* renamed from: q  reason: collision with root package name */
    public int f11304q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f11305r = -1;

    public e(String str, E e10, r rVar, int i10, boolean z10, int i11, int i12) {
        this.f11288a = str;
        this.f11289b = e10;
        this.f11290c = rVar;
        this.f11291d = i10;
        this.f11292e = z10;
        this.f11293f = i11;
        this.f11294g = i12;
    }

    public final int a(int i10, Z0.l lVar) {
        int i11 = this.f11304q;
        int i12 = this.f11305r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int t10 = AbstractC4828h.t(b(A7.b.m(0, i10, 0, Integer.MAX_VALUE), lVar).b());
        this.f11304q = i10;
        this.f11305r = t10;
        return t10;
    }

    public final C1042a b(long j6, Z0.l lVar) {
        int i10;
        N0.o d10 = d(lVar);
        long G10 = Df.H.G(j6, this.f11292e, this.f11291d, d10.c());
        boolean z10 = this.f11292e;
        int i11 = this.f11291d;
        int i12 = this.f11293f;
        if (!z10 && AbstractC3557B.D0(i11, 2)) {
            i10 = 1;
        } else {
            if (i12 < 1) {
                i12 = 1;
            }
            i10 = i12;
        }
        return new C1042a((V0.c) d10, i10, AbstractC3557B.D0(this.f11291d, 2), G10);
    }

    public final void c(Z0.b bVar) {
        long j6;
        Z0.b bVar2 = this.f11296i;
        if (bVar != null) {
            int i10 = a.f11261b;
            j6 = a.a(bVar.b(), bVar.O());
        } else {
            j6 = a.f11260a;
        }
        if (bVar2 == null) {
            this.f11296i = bVar;
            this.f11295h = j6;
        } else if (bVar == null || this.f11295h != j6) {
            this.f11296i = bVar;
            this.f11295h = j6;
            this.f11297j = null;
            this.f11301n = null;
            this.f11302o = null;
            this.f11304q = -1;
            this.f11305r = -1;
            this.f11303p = B0.d(0, 0);
            this.f11299l = H.c(0, 0);
            this.f11298k = false;
        }
    }

    public final N0.o d(Z0.l lVar) {
        N0.o oVar = this.f11301n;
        if (oVar == null || lVar != this.f11302o || oVar.a()) {
            this.f11302o = lVar;
            String str = this.f11288a;
            E U12 = R4.b.U1(this.f11289b, lVar);
            Z0.b bVar = this.f11296i;
            AbstractC3557B.Z(bVar);
            r rVar = this.f11290c;
            v vVar = v.f37483Y;
            oVar = new V0.c(U12, rVar, bVar, str, vVar, vVar);
        }
        this.f11301n = oVar;
        return oVar;
    }
}

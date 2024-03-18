package M;

import Df.H;
import N0.B;
import N0.C;
import N0.C1046e;
import N0.E;
import S0.r;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public C1046e f11272a;

    /* renamed from: b  reason: collision with root package name */
    public E f11273b;

    /* renamed from: c  reason: collision with root package name */
    public r f11274c;

    /* renamed from: d  reason: collision with root package name */
    public int f11275d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11276e;

    /* renamed from: f  reason: collision with root package name */
    public int f11277f;

    /* renamed from: g  reason: collision with root package name */
    public int f11278g;

    /* renamed from: h  reason: collision with root package name */
    public List f11279h;

    /* renamed from: i  reason: collision with root package name */
    public b f11280i;

    /* renamed from: k  reason: collision with root package name */
    public Z0.b f11282k;

    /* renamed from: l  reason: collision with root package name */
    public N0.k f11283l;

    /* renamed from: m  reason: collision with root package name */
    public Z0.l f11284m;

    /* renamed from: n  reason: collision with root package name */
    public C f11285n;

    /* renamed from: j  reason: collision with root package name */
    public long f11281j = a.f11260a;

    /* renamed from: o  reason: collision with root package name */
    public int f11286o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f11287p = -1;

    public d(C1046e c1046e, E e10, r rVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f11272a = c1046e;
        this.f11273b = e10;
        this.f11274c = rVar;
        this.f11275d = i10;
        this.f11276e = z10;
        this.f11277f = i11;
        this.f11278g = i12;
        this.f11279h = list;
    }

    public final int a(int i10, Z0.l lVar) {
        int i11 = this.f11286o;
        int i12 = this.f11287p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int t10 = AbstractC4828h.t(b(A7.b.m(0, i10, 0, Integer.MAX_VALUE), lVar).f12528e);
        this.f11286o = i10;
        this.f11287p = t10;
        return t10;
    }

    public final N0.i b(long j6, Z0.l lVar) {
        N0.k d10 = d(lVar);
        long G10 = H.G(j6, this.f11276e, this.f11275d, d10.c());
        boolean z10 = this.f11276e;
        int i10 = this.f11275d;
        int i11 = this.f11277f;
        int i12 = 1;
        if (z10 || !AbstractC3557B.D0(i10, 2)) {
            if (i11 < 1) {
                i11 = 1;
            }
            i12 = i11;
        }
        return new N0.i(d10, G10, i12, AbstractC3557B.D0(this.f11275d, 2));
    }

    public final void c(Z0.b bVar) {
        long j6;
        Z0.b bVar2 = this.f11282k;
        if (bVar != null) {
            int i10 = a.f11261b;
            j6 = a.a(bVar.b(), bVar.O());
        } else {
            j6 = a.f11260a;
        }
        if (bVar2 == null) {
            this.f11282k = bVar;
            this.f11281j = j6;
        } else if (bVar == null || this.f11281j != j6) {
            this.f11282k = bVar;
            this.f11281j = j6;
            this.f11283l = null;
            this.f11285n = null;
            this.f11287p = -1;
            this.f11286o = -1;
        }
    }

    public final N0.k d(Z0.l lVar) {
        N0.k kVar = this.f11283l;
        if (kVar == null || lVar != this.f11284m || kVar.a()) {
            this.f11284m = lVar;
            C1046e c1046e = this.f11272a;
            E U12 = R4.b.U1(this.f11273b, lVar);
            Z0.b bVar = this.f11282k;
            AbstractC3557B.Z(bVar);
            r rVar = this.f11274c;
            List list = this.f11279h;
            if (list == null) {
                list = v.f37483Y;
            }
            kVar = new N0.k(c1046e, U12, list, bVar, rVar);
        }
        this.f11283l = kVar;
        return kVar;
    }

    public final C e(Z0.l lVar, long j6, N0.i iVar) {
        float min = Math.min(iVar.f12524a.c(), iVar.f12527d);
        C1046e c1046e = this.f11272a;
        E e10 = this.f11273b;
        List list = this.f11279h;
        if (list == null) {
            list = v.f37483Y;
        }
        int i10 = this.f11277f;
        boolean z10 = this.f11276e;
        int i11 = this.f11275d;
        Z0.b bVar = this.f11282k;
        AbstractC3557B.Z(bVar);
        return new C(new B(c1046e, e10, list, i10, z10, i11, bVar, lVar, this.f11274c, j6), iVar, A7.b.q0(j6, Ng.H.c(AbstractC4828h.t(min), AbstractC4828h.t(iVar.f12528e))));
    }
}

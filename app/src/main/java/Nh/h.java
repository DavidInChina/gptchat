package Nh;

import io.sentry.android.core.z;

/* loaded from: classes2.dex */
public final class h extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f13070d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13071e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13072f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13073g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13074h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13075i;

    /* renamed from: j  reason: collision with root package name */
    public a f13076j;

    /* renamed from: k  reason: collision with root package name */
    public a f13077k;

    /* renamed from: l  reason: collision with root package name */
    public a f13078l;

    /* renamed from: m  reason: collision with root package name */
    public a f13079m;

    /* renamed from: n  reason: collision with root package name */
    public z f13080n;

    public h(q qVar, int i10, String str, String str2, String str3, Object obj) {
        super(589824, 3);
        this.f13070d = qVar;
        this.f13071e = i10;
        this.f13072f = qVar.j(str);
        this.f13073g = qVar.j(str2);
        if (str3 != null) {
            this.f13074h = qVar.j(str3);
        }
        if (obj != null) {
            this.f13075i = qVar.c(obj).f13187a;
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        q qVar = this.f13070d;
        if (z10) {
            a E10 = a.E(qVar, str, this.f13076j);
            this.f13076j = E10;
            return E10;
        }
        a E11 = a.E(qVar, str, this.f13077k);
        this.f13077k = E11;
        return E11;
    }

    @Override // io.sentry.vendor.b
    public final void f(z zVar) {
        zVar.f34265h0 = this.f13080n;
        this.f13080n = zVar;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        q qVar = this.f13070d;
        if (z10) {
            a D6 = a.D(qVar, i10, hVar, str, this.f13078l);
            this.f13078l = D6;
            return D6;
        }
        a D10 = a.D(qVar, i10, hVar, str, this.f13079m);
        this.f13079m = D10;
        return D10;
    }

    @Override // io.sentry.vendor.b
    public final void g() {
    }
}

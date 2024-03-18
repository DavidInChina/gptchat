package Nh;

import io.sentry.android.core.z;

/* loaded from: classes2.dex */
public final class o extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f13178d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13179e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13180f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13181g;

    /* renamed from: h  reason: collision with root package name */
    public a f13182h;

    /* renamed from: i  reason: collision with root package name */
    public a f13183i;

    /* renamed from: j  reason: collision with root package name */
    public a f13184j;

    /* renamed from: k  reason: collision with root package name */
    public a f13185k;

    /* renamed from: l  reason: collision with root package name */
    public z f13186l;

    public o(q qVar, String str, String str2, String str3) {
        super(589824, 5);
        this.f13178d = qVar;
        this.f13179e = qVar.j(str);
        this.f13180f = qVar.j(str2);
        if (str3 != null) {
            this.f13181g = qVar.j(str3);
        }
    }

    public final void A(I5.h hVar) {
        int i10;
        hVar.k(this.f13179e);
        hVar.k(this.f13180f);
        int i11 = this.f13181g;
        if (i11 != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f13182h != null) {
            i10++;
        }
        if (this.f13183i != null) {
            i10++;
        }
        if (this.f13184j != null) {
            i10++;
        }
        if (this.f13185k != null) {
            i10++;
        }
        z zVar = this.f13186l;
        if (zVar != null) {
            i10 += zVar.c();
        }
        hVar.k(i10);
        q qVar = this.f13178d;
        z.e(qVar, 0, i11, hVar);
        a.G(this.f13178d, this.f13182h, this.f13183i, this.f13184j, this.f13185k, hVar);
        z zVar2 = this.f13186l;
        if (zVar2 != null) {
            d dVar = qVar.f13196a;
            while (zVar2 != null) {
                byte[] bArr = (byte[]) zVar2.f34264Z;
                int length = bArr.length;
                hVar.k(qVar.j((String) zVar2.f34263Y));
                hVar.j(length);
                hVar.i(bArr, 0, length);
                zVar2 = (z) zVar2.f34265h0;
            }
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        q qVar = this.f13178d;
        if (z10) {
            a E10 = a.E(qVar, str, this.f13182h);
            this.f13182h = E10;
            return E10;
        }
        a E11 = a.E(qVar, str, this.f13183i);
        this.f13183i = E11;
        return E11;
    }

    @Override // io.sentry.vendor.b
    public final void f(z zVar) {
        zVar.f34265h0 = this.f13186l;
        this.f13186l = zVar;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        q qVar = this.f13178d;
        if (z10) {
            a D6 = a.D(qVar, i10, hVar, str, this.f13184j);
            this.f13184j = D6;
            return D6;
        }
        a D10 = a.D(qVar, i10, hVar, str, this.f13185k);
        this.f13185k = D10;
        return D10;
    }

    @Override // io.sentry.vendor.b
    public final void g() {
    }
}

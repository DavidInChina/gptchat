package Nh;

/* loaded from: classes2.dex */
public final class n extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f13161d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13162e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13163f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13164g;

    /* renamed from: h  reason: collision with root package name */
    public int f13165h;

    /* renamed from: j  reason: collision with root package name */
    public int f13167j;

    /* renamed from: l  reason: collision with root package name */
    public int f13169l;

    /* renamed from: n  reason: collision with root package name */
    public int f13171n;

    /* renamed from: p  reason: collision with root package name */
    public int f13173p;

    /* renamed from: r  reason: collision with root package name */
    public int f13175r;

    /* renamed from: t  reason: collision with root package name */
    public int f13177t;

    /* renamed from: i  reason: collision with root package name */
    public final I5.h f13166i = new I5.h();

    /* renamed from: k  reason: collision with root package name */
    public final I5.h f13168k = new I5.h();

    /* renamed from: m  reason: collision with root package name */
    public final I5.h f13170m = new I5.h();

    /* renamed from: o  reason: collision with root package name */
    public final I5.h f13172o = new I5.h();

    /* renamed from: q  reason: collision with root package name */
    public final I5.h f13174q = new I5.h();

    /* renamed from: s  reason: collision with root package name */
    public final I5.h f13176s = new I5.h();

    public n(q qVar, int i10, int i11, int i12) {
        super(589824, 4);
        this.f13161d = qVar;
        this.f13162e = i10;
        this.f13163f = i11;
        this.f13164g = i12;
    }

    @Override // io.sentry.vendor.b
    public final void i(String str, int i10, String... strArr) {
        q qVar = this.f13161d;
        p k10 = qVar.k(20, str);
        I5.h hVar = this.f13168k;
        hVar.k(k10.f13187a);
        hVar.k(i10);
        if (strArr == null) {
            hVar.k(0);
        } else {
            hVar.k(strArr.length);
            for (String str2 : strArr) {
                hVar.k(qVar.k(19, str2).f13187a);
            }
        }
        this.f13167j++;
    }

    @Override // io.sentry.vendor.b
    public final void l(String str) {
        this.f13177t = this.f13161d.k(7, str).f13187a;
    }

    @Override // io.sentry.vendor.b
    public final void q(String str, int i10, String... strArr) {
        q qVar = this.f13161d;
        p k10 = qVar.k(20, str);
        I5.h hVar = this.f13170m;
        hVar.k(k10.f13187a);
        hVar.k(i10);
        if (strArr == null) {
            hVar.k(0);
        } else {
            hVar.k(strArr.length);
            for (String str2 : strArr) {
                hVar.k(qVar.k(19, str2).f13187a);
            }
        }
        this.f13169l++;
    }

    @Override // io.sentry.vendor.b
    public final void s(String str) {
        this.f13176s.k(this.f13161d.k(20, str).f13187a);
        this.f13175r++;
    }

    @Override // io.sentry.vendor.b
    public final void u(String str, String... strArr) {
        q qVar = this.f13161d;
        p k10 = qVar.k(7, str);
        I5.h hVar = this.f13174q;
        hVar.k(k10.f13187a);
        hVar.k(strArr.length);
        for (String str2 : strArr) {
            hVar.k(qVar.k(7, str2).f13187a);
        }
        this.f13173p++;
    }

    @Override // io.sentry.vendor.b
    public final void w(int i10, String str, String str2) {
        int i11;
        q qVar = this.f13161d;
        p k10 = qVar.k(19, str);
        I5.h hVar = this.f13166i;
        hVar.k(k10.f13187a);
        hVar.k(i10);
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = qVar.j(str2);
        }
        hVar.k(i11);
        this.f13165h++;
    }

    @Override // io.sentry.vendor.b
    public final void z(String str) {
        this.f13172o.k(this.f13161d.k(7, str).f13187a);
        this.f13171n++;
    }

    @Override // io.sentry.vendor.b
    public final void g() {
    }
}

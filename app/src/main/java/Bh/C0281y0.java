package Bh;

/* renamed from: Bh.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281y0 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.D f2402d;

    /* renamed from: e  reason: collision with root package name */
    public String f2403e;

    public C0281y0(B0 b02, androidx.lifecycle.D d10) {
        super(Sh.I.f16703b, b02, 0);
        this.f2402d = d10;
    }

    @Override // io.sentry.vendor.b
    public final void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        String[] k10;
        this.f2403e = str;
        androidx.lifecycle.D d10 = this.f2402d;
        String j6 = d10.j(str);
        String h10 = d10.h(str2, false);
        String j10 = d10.j(str3);
        if (strArr == null) {
            k10 = null;
        } else {
            k10 = d10.k(strArr);
        }
        super.a(i10, i11, j6, h10, j10, k10);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        androidx.lifecycle.D d10 = this.f2402d;
        io.sentry.vendor.b d11 = super.d(d10.d(str), z10);
        if (d11 == null) {
            return null;
        }
        return new Oh.a(this.f34787b, str, d11, d10).B(new Oh.a(this.f34787b, null, d11, d10));
    }

    @Override // io.sentry.vendor.b
    public final void f(io.sentry.android.core.z zVar) {
        super.f(zVar);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b j(int i10, Object obj, String str, String str2, String str3) {
        Object obj2;
        String str4 = this.f2403e;
        androidx.lifecycle.D d10 = this.f2402d;
        String e10 = d10.e(str4, str);
        String d11 = d10.d(str2);
        String h10 = d10.h(str3, true);
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = d10.l(obj);
        }
        io.sentry.vendor.b j6 = super.j(i10, obj2, e10, d11, h10);
        if (j6 == null) {
            return null;
        }
        return new O0(this.f34787b, j6, d10);
    }

    @Override // io.sentry.vendor.b
    public final void k(String str, int i10, String str2, String str3) {
        String str4;
        androidx.lifecycle.D d10 = this.f2402d;
        String j6 = d10.j(str);
        String str5 = null;
        if (str2 == null) {
            str4 = null;
        } else {
            str4 = d10.j(str2);
        }
        if (str3 != null) {
            String j10 = d10.j(str);
            if (!j10.equals(str)) {
                int lastIndexOf = str.lastIndexOf(47);
                int lastIndexOf2 = j10.lastIndexOf(47);
                if ((lastIndexOf == -1 || lastIndexOf2 == -1 || !str.substring(lastIndexOf).equals(j10.substring(lastIndexOf2))) && j10.contains("$")) {
                    int lastIndexOf3 = j10.lastIndexOf(36);
                    do {
                        lastIndexOf3++;
                        if (lastIndexOf3 >= j10.length()) {
                            break;
                        }
                    } while (Character.isDigit(j10.charAt(lastIndexOf3)));
                    str3 = j10.substring(lastIndexOf3);
                }
            }
            str5 = str3;
        }
        super.k(j6, i10, str4, str5);
    }

    @Override // io.sentry.vendor.b
    public final Nh.l m(int i10, String str, String str2, String str3, String[] strArr) {
        String[] strArr2;
        androidx.lifecycle.D d10 = this.f2402d;
        String f6 = d10.f(str2);
        String g10 = d10.g(this.f2403e, str, str2);
        String h10 = d10.h(str3, false);
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = d10.k(strArr);
        }
        Nh.l m10 = super.m(i10, g10, f6, h10, strArr2);
        if (m10 == null) {
            return null;
        }
        return new Oh.b(this.f34787b, m10, d10);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b n(int i10, String str, String str2) {
        androidx.lifecycle.D d10 = this.f2402d;
        d10.getClass();
        io.sentry.vendor.b n10 = super.n(i10, str, str2);
        if (n10 == null) {
            return null;
        }
        return new Oh.c(this.f34787b, n10, d10);
    }

    @Override // io.sentry.vendor.b
    public final void o(String str) {
        super.o(this.f2402d.j(str));
    }

    @Override // io.sentry.vendor.b
    public final void p(String str) {
        super.p(this.f2402d.j(str));
    }

    @Override // io.sentry.vendor.b
    public final void r(String str, String str2, String str3) {
        String str4;
        androidx.lifecycle.D d10 = this.f2402d;
        String j6 = d10.j(str);
        String str5 = null;
        if (str2 == null) {
            str4 = null;
        } else {
            str4 = d10.g(str, str2, str3);
        }
        if (str3 != null) {
            str5 = d10.f(str3);
        }
        super.r(j6, str4, str5);
    }

    @Override // io.sentry.vendor.b
    public final void t(String str) {
        super.t(this.f2402d.j(str));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b v(String str, String str2, String str3) {
        androidx.lifecycle.D d10 = this.f2402d;
        d10.getClass();
        io.sentry.vendor.b v10 = super.v(str, d10.d(str2), d10.h(str3, true));
        if (v10 == null) {
            return null;
        }
        return new Oh.d(this.f34787b, v10, d10);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        androidx.lifecycle.D d10 = this.f2402d;
        io.sentry.vendor.b y10 = super.y(i10, hVar, d10.d(str), z10);
        if (y10 == null) {
            return null;
        }
        return new Oh.a(this.f34787b, str, y10, d10).B(new Oh.a(this.f34787b, null, y10, d10));
    }
}

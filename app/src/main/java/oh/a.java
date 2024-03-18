package Oh;

import androidx.lifecycle.D;

/* loaded from: classes.dex */
public final class a extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final String f13761d;

    /* renamed from: e  reason: collision with root package name */
    public final D f13762e;

    public a(int i10, String str, io.sentry.vendor.b bVar, D d10) {
        super(i10, bVar);
        this.f13761d = str;
        this.f13762e = d10;
    }

    public final String A(String str) {
        String str2 = this.f13761d;
        if (str2 == null) {
            return str;
        }
        D d10 = this.f13762e;
        d10.getClass();
        String str3 = (String) d10.f25290b.get(str2 + '.' + str);
        if (str3 != null) {
            return str3;
        }
        return str;
    }

    public final io.sentry.vendor.b B(a aVar) {
        if (aVar.f34787b == this.f34787b && ((io.sentry.vendor.b) aVar.f34788c) == ((io.sentry.vendor.b) this.f34788c) && aVar.f13762e == this.f13762e) {
            return this;
        }
        return aVar;
    }

    @Override // io.sentry.vendor.b
    public final void b(String str, Object obj) {
        super.b(A(str), this.f13762e.l(obj));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b c(String str, String str2) {
        String A10 = A(str);
        D d10 = this.f13762e;
        io.sentry.vendor.b c10 = super.c(A10, d10.d(str2));
        if (c10 == null) {
            return null;
        }
        if (c10 == ((io.sentry.vendor.b) this.f34788c)) {
            return this;
        }
        return new a(this.f34787b, str2, c10, d10).B(new a(this.f34787b, null, c10, d10));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b e(String str) {
        io.sentry.vendor.b e10 = super.e(A(str));
        if (e10 == null) {
            return null;
        }
        if (e10 == ((io.sentry.vendor.b) this.f34788c)) {
            return this;
        }
        int i10 = this.f34787b;
        D d10 = this.f13762e;
        return new a(i10, null, e10, d10).B(new a(this.f34787b, null, e10, d10));
    }

    @Override // io.sentry.vendor.b
    public final void h(String str, String str2, String str3) {
        super.h(A(str), this.f13762e.d(str2), str3);
    }
}

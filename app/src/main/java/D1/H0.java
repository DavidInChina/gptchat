package D1;

import android.os.Build;
import android.view.View;
import s1.C5523e;

/* loaded from: classes.dex */
public class H0 {

    /* renamed from: b  reason: collision with root package name */
    public static final J0 f3229b;

    /* renamed from: a  reason: collision with root package name */
    public final J0 f3230a;

    static {
        A0 a02;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a02 = new z0();
        } else if (i10 >= 29) {
            a02 = new y0();
        } else {
            a02 = new x0();
        }
        f3229b = a02.b().f3232a.a().f3232a.b().f3232a.c();
    }

    public H0(J0 j02) {
        this.f3230a = j02;
    }

    public J0 a() {
        return this.f3230a;
    }

    public J0 b() {
        return this.f3230a;
    }

    public J0 c() {
        return this.f3230a;
    }

    public C0359k e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (o() == h02.o() && n() == h02.n() && C1.b.a(k(), h02.k()) && C1.b.a(i(), h02.i()) && C1.b.a(e(), h02.e())) {
            return true;
        }
        return false;
    }

    public C5523e f(int i10) {
        return C5523e.f45105e;
    }

    public C5523e g(int i10) {
        if ((i10 & 8) == 0) {
            return C5523e.f45105e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C5523e h() {
        return k();
    }

    public int hashCode() {
        return C1.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public C5523e i() {
        return C5523e.f45105e;
    }

    public C5523e j() {
        return k();
    }

    public C5523e k() {
        return C5523e.f45105e;
    }

    public C5523e l() {
        return k();
    }

    public J0 m(int i10, int i11, int i12, int i13) {
        return f3229b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(C5523e[] c5523eArr) {
    }

    public void r(J0 j02) {
    }

    public void s(C5523e c5523e) {
    }
}

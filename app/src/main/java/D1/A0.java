package D1;

import s1.C5523e;

/* loaded from: classes2.dex */
public abstract class A0 {

    /* renamed from: a  reason: collision with root package name */
    public final J0 f3204a;

    /* renamed from: b  reason: collision with root package name */
    public C5523e[] f3205b;

    public A0() {
        this(new J0());
    }

    public final void a() {
        C5523e[] c5523eArr = this.f3205b;
        if (c5523eArr != null) {
            C5523e c5523e = c5523eArr[r9.y.B0(1)];
            C5523e c5523e2 = this.f3205b[r9.y.B0(2)];
            J0 j02 = this.f3204a;
            if (c5523e2 == null) {
                c5523e2 = j02.f3232a.f(2);
            }
            if (c5523e == null) {
                c5523e = j02.f3232a.f(1);
            }
            g(C5523e.a(c5523e, c5523e2));
            C5523e c5523e3 = this.f3205b[r9.y.B0(16)];
            if (c5523e3 != null) {
                f(c5523e3);
            }
            C5523e c5523e4 = this.f3205b[r9.y.B0(32)];
            if (c5523e4 != null) {
                d(c5523e4);
            }
            C5523e c5523e5 = this.f3205b[r9.y.B0(64)];
            if (c5523e5 != null) {
                h(c5523e5);
            }
        }
    }

    public abstract J0 b();

    public void c(int i10, C5523e c5523e) {
        if (this.f3205b == null) {
            this.f3205b = new C5523e[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f3205b[r9.y.B0(i11)] = c5523e;
            }
        }
    }

    public abstract void e(C5523e c5523e);

    public abstract void g(C5523e c5523e);

    public A0(J0 j02) {
        this.f3204a = j02;
    }

    public void d(C5523e c5523e) {
    }

    public void f(C5523e c5523e) {
    }

    public void h(C5523e c5523e) {
    }
}

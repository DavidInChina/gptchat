package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final H f26849a;

    public I(H h10) {
        Charset charset = Y.f26890a;
        this.f26849a = h10;
        h10.f26845l = this;
    }

    public final void a(int i10, int i11) {
        int i12 = (i11 >> 31) ^ (i11 + i11);
        H h10 = this.f26849a;
        h10.x1(i10 << 3);
        h10.x1(i12);
    }

    public final void b(int i10, long j6) {
        this.f26849a.y1(i10, (j6 >> 63) ^ (j6 + j6));
    }

    public final void c(int i10, List list) {
        boolean z10 = list instanceof AbstractC2443d0;
        int i11 = 0;
        H h10 = this.f26849a;
        if (z10) {
            AbstractC2443d0 abstractC2443d0 = (AbstractC2443d0) list;
            while (i11 < list.size()) {
                Object O10 = abstractC2443d0.O(i11);
                if (O10 instanceof String) {
                    h10.v1(i10, (String) O10);
                } else {
                    h10.q1(i10, (E) O10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            h10.v1(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void d(int i10, int i11) {
        H h10 = this.f26849a;
        h10.x1(i10 << 3);
        h10.x1(i11);
    }

    public final void e(int i10, long j6) {
        this.f26849a.y1(i10, j6);
    }

    public final void f(int i10, boolean z10) {
        H h10 = this.f26849a;
        h10.x1(i10 << 3);
        h10.o1(z10 ? (byte) 1 : (byte) 0);
    }

    public final void g(int i10, E e10) {
        this.f26849a.q1(i10, e10);
    }

    public final void h(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f26849a.q1(i10, (E) list.get(i11));
        }
    }

    public final void i(int i10, double d10) {
        this.f26849a.t1(i10, Double.doubleToRawLongBits(d10));
    }

    public final void j(int i10, int i11) {
        H h10 = this.f26849a;
        h10.x1(i10 << 3);
        if (i11 >= 0) {
            h10.x1(i11);
        } else {
            h10.z1(i11);
        }
    }

    public final void k(int i10, int i11) {
        this.f26849a.r1(i10, i11);
    }

    public final void l(int i10, long j6) {
        this.f26849a.t1(i10, j6);
    }

    public final void m(int i10, float f6) {
        this.f26849a.r1(i10, Float.floatToRawIntBits(f6));
    }

    public final void n(int i10, AbstractC2486z0 abstractC2486z0, Object obj) {
        H h10 = this.f26849a;
        h10.w1(i10, 3);
        abstractC2486z0.f((AbstractC2481x) obj, h10.f26845l);
        h10.w1(i10, 4);
    }

    public final void o(int i10, int i11) {
        H h10 = this.f26849a;
        h10.x1(i10 << 3);
        if (i11 >= 0) {
            h10.x1(i11);
        } else {
            h10.z1(i11);
        }
    }

    public final void p(int i10, long j6) {
        this.f26849a.y1(i10, j6);
    }

    public final void q(int i10, AbstractC2486z0 abstractC2486z0, Object obj) {
        AbstractC2481x abstractC2481x = (AbstractC2481x) obj;
        H h10 = this.f26849a;
        h10.x1((i10 << 3) | 2);
        h10.x1(abstractC2481x.a(abstractC2486z0));
        abstractC2486z0.f(abstractC2481x, h10.f26845l);
    }

    public final void r(int i10, int i11) {
        this.f26849a.r1(i10, i11);
    }

    public final void s(int i10, long j6) {
        this.f26849a.t1(i10, j6);
    }
}

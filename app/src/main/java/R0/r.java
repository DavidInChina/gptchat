package r0;

import id.AbstractC3557B;
import jf.C3970t;
import s0.AbstractC5501c;
import s0.AbstractC5502d;
import s0.C5503e;
import s0.C5504f;
import s0.C5505g;
import s0.C5506h;
import s0.C5515q;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final long f44254b = androidx.compose.ui.graphics.a.c(4278190080L);

    /* renamed from: c  reason: collision with root package name */
    public static final long f44255c = androidx.compose.ui.graphics.a.c(4282664004L);

    /* renamed from: d  reason: collision with root package name */
    public static final long f44256d = androidx.compose.ui.graphics.a.c(4287137928L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f44257e = androidx.compose.ui.graphics.a.c(4291611852L);

    /* renamed from: f  reason: collision with root package name */
    public static final long f44258f = androidx.compose.ui.graphics.a.c(4294967295L);

    /* renamed from: g  reason: collision with root package name */
    public static final long f44259g = androidx.compose.ui.graphics.a.c(4294901760L);

    /* renamed from: h  reason: collision with root package name */
    public static final long f44260h = androidx.compose.ui.graphics.a.c(4278255360L);

    /* renamed from: i  reason: collision with root package name */
    public static final long f44261i = androidx.compose.ui.graphics.a.c(4278190335L);

    /* renamed from: j  reason: collision with root package name */
    public static final long f44262j = androidx.compose.ui.graphics.a.b(0);

    /* renamed from: k  reason: collision with root package name */
    public static final long f44263k = androidx.compose.ui.graphics.a.a(0.0f, 0.0f, 0.0f, 0.0f, C5503e.f45044s);

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f44264l = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f44265a;

    static {
        androidx.compose.ui.graphics.a.c(4294967040L);
        androidx.compose.ui.graphics.a.c(4278255615L);
        androidx.compose.ui.graphics.a.c(4294902015L);
    }

    public /* synthetic */ r(long j6) {
        this.f44265a = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(long j6, AbstractC5502d abstractC5502d) {
        C5506h c5506h;
        C5506h c5506h2;
        AbstractC5502d f6 = f(j6);
        if (AbstractC3557B.K(abstractC5502d, f6)) {
            return j6;
        }
        C5515q c5515q = C5503e.f45028c;
        if (f6 == c5515q) {
            if (abstractC5502d == c5515q) {
                c5506h = C5506h.f45050e;
            } else {
                if (abstractC5502d == C5503e.f45045t) {
                    c5506h = C5506h.f45051f;
                }
                if (f6 != abstractC5502d) {
                    C5504f c5504f = C5506h.f45050e;
                    c5506h = new C5506h(f6, f6, 1);
                } else {
                    long j10 = f6.f45024b;
                    long j11 = AbstractC5501c.f45018a;
                    if (AbstractC5501c.a(j10, j11) && AbstractC5501c.a(abstractC5502d.f45024b, j11)) {
                        c5506h2 = new C5505g((C5515q) f6, (C5515q) abstractC5502d, 0);
                    } else {
                        c5506h2 = new C5506h(f6, abstractC5502d, 0);
                    }
                    c5506h = c5506h2;
                }
            }
            return c5506h.a(h(j6), g(j6), e(j6), d(j6));
        }
        if (f6 == C5503e.f45045t && abstractC5502d == c5515q) {
            c5506h = C5506h.f45052g;
            return c5506h.a(h(j6), g(j6), e(j6), d(j6));
        }
        if (f6 != abstractC5502d) {
        }
        return c5506h.a(h(j6), g(j6), e(j6), d(j6));
    }

    public static long b(long j6, float f6) {
        return androidx.compose.ui.graphics.a.a(h(j6), g(j6), e(j6), f6, f(j6));
    }

    public static final boolean c(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final float d(long j6) {
        float a02;
        float f6;
        if ((63 & j6) == 0) {
            a02 = (float) r.f.a0((j6 >>> 56) & 255);
            f6 = 255.0f;
        } else {
            a02 = (float) r.f.a0((j6 >>> 6) & 1023);
            f6 = 1023.0f;
        }
        return a02 / f6;
    }

    public static final float e(long j6) {
        if ((63 & j6) == 0) {
            return ((float) r.f.a0((j6 >>> 32) & 255)) / 255.0f;
        }
        return w.b((short) ((j6 >>> 16) & 65535));
    }

    public static final AbstractC5502d f(long j6) {
        float[] fArr = C5503e.f45026a;
        return C5503e.f45046u[(int) (j6 & 63)];
    }

    public static final float g(long j6) {
        if ((63 & j6) == 0) {
            return ((float) r.f.a0((j6 >>> 40) & 255)) / 255.0f;
        }
        return w.b((short) ((j6 >>> 32) & 65535));
    }

    public static final float h(long j6) {
        if ((63 & j6) == 0) {
            return ((float) r.f.a0((j6 >>> 48) & 255)) / 255.0f;
        }
        return w.b((short) ((j6 >>> 48) & 65535));
    }

    public static String i(long j6) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j6));
        sb2.append(", ");
        sb2.append(g(j6));
        sb2.append(", ");
        sb2.append(e(j6));
        sb2.append(", ");
        sb2.append(d(j6));
        sb2.append(", ");
        return android.gov.nist.core.a.n(sb2, f(j6).f45023a, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this.f44265a != ((r) obj).f44265a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3970t.a(this.f44265a);
    }

    public final String toString() {
        return i(this.f44265a);
    }
}

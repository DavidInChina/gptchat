package v9;

import android.gov.nist.core.Separators;
import jf.C3970t;
import r0.r;

/* renamed from: v9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5999a {

    /* renamed from: c  reason: collision with root package name */
    public static final C5999a f47378c;

    /* renamed from: d  reason: collision with root package name */
    public static final C5999a f47379d;

    /* renamed from: e  reason: collision with root package name */
    public static final C5999a f47380e;

    /* renamed from: h  reason: collision with root package name */
    public static final C5999a f47383h;

    /* renamed from: a  reason: collision with root package name */
    public final long f47387a;

    /* renamed from: b  reason: collision with root package name */
    public final long f47388b;

    /* renamed from: f  reason: collision with root package name */
    public static final C5999a f47381f = new C5999a(b.f47394f, b.f47395g);

    /* renamed from: g  reason: collision with root package name */
    public static final C5999a f47382g = new C5999a(b.f47396h, b.f47397i);

    /* renamed from: i  reason: collision with root package name */
    public static final C5999a f47384i = new C5999a(b.f47399k, b.f47400l);

    /* renamed from: j  reason: collision with root package name */
    public static final C5999a f47385j = new C5999a(b.f47401m, b.f47402n);

    /* renamed from: k  reason: collision with root package name */
    public static final C5999a f47386k = new C5999a(b.f47403o, b.f47404p);

    static {
        long j6 = b.f47389a;
        long j10 = b.f47390b;
        f47378c = new C5999a(j6, j10);
        long j11 = b.f47391c;
        long j12 = b.f47392d;
        f47379d = new C5999a(j11, j12);
        f47380e = new C5999a(b.f47393e, j10);
        f47383h = new C5999a(b.f47398j, j12);
    }

    public C5999a(long j6, long j10) {
        this.f47387a = j6;
        this.f47388b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5999a)) {
            return false;
        }
        C5999a c5999a = (C5999a) obj;
        if (r.c(this.f47387a, c5999a.f47387a) && r.c(this.f47388b, c5999a.f47388b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        return C3970t.a(this.f47388b) + (C3970t.a(this.f47387a) * 31);
    }

    public final String toString() {
        String i10 = r.i(this.f47387a);
        String i11 = r.i(this.f47388b);
        return "ColorPairing(background=" + i10 + ", foreground=" + i11 + Separators.RPAREN;
    }
}

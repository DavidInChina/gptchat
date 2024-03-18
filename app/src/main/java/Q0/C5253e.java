package q0;

import Ng.H;
import y.AbstractC6463a;

/* renamed from: q0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5253e {

    /* renamed from: a  reason: collision with root package name */
    public final float f43629a;

    /* renamed from: b  reason: collision with root package name */
    public final float f43630b;

    /* renamed from: c  reason: collision with root package name */
    public final float f43631c;

    /* renamed from: d  reason: collision with root package name */
    public final float f43632d;

    /* renamed from: e  reason: collision with root package name */
    public final long f43633e;

    /* renamed from: f  reason: collision with root package name */
    public final long f43634f;

    /* renamed from: g  reason: collision with root package name */
    public final long f43635g;

    /* renamed from: h  reason: collision with root package name */
    public final long f43636h;

    static {
        long j6 = AbstractC5249a.f43613a;
        H.b(AbstractC5249a.b(j6), AbstractC5249a.c(j6));
    }

    public C5253e(float f6, float f10, float f11, float f12, long j6, long j10, long j11, long j12) {
        this.f43629a = f6;
        this.f43630b = f10;
        this.f43631c = f11;
        this.f43632d = f12;
        this.f43633e = j6;
        this.f43634f = j10;
        this.f43635g = j11;
        this.f43636h = j12;
    }

    public final float a() {
        return this.f43632d - this.f43630b;
    }

    public final float b() {
        return this.f43631c - this.f43629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5253e)) {
            return false;
        }
        C5253e c5253e = (C5253e) obj;
        if (Float.compare(this.f43629a, c5253e.f43629a) == 0 && Float.compare(this.f43630b, c5253e.f43630b) == 0 && Float.compare(this.f43631c, c5253e.f43631c) == 0 && Float.compare(this.f43632d, c5253e.f43632d) == 0 && AbstractC5249a.a(this.f43633e, c5253e.f43633e) && AbstractC5249a.a(this.f43634f, c5253e.f43634f) && AbstractC5249a.a(this.f43635g, c5253e.f43635g) && AbstractC5249a.a(this.f43636h, c5253e.f43636h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = AbstractC6463a.e(this.f43632d, AbstractC6463a.e(this.f43631c, AbstractC6463a.e(this.f43630b, Float.floatToIntBits(this.f43629a) * 31, 31), 31), 31);
        long j6 = this.f43633e;
        long j10 = this.f43634f;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f43635g;
        int i11 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f43636h;
        return ((int) (j12 ^ (j12 >>> 32))) + ((i11 + ((i10 + ((((int) (j6 ^ (j6 >>> 32))) + e10) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = M3.H.A0(this.f43629a) + ", " + M3.H.A0(this.f43630b) + ", " + M3.H.A0(this.f43631c) + ", " + M3.H.A0(this.f43632d);
        long j6 = this.f43633e;
        long j10 = this.f43634f;
        boolean a5 = AbstractC5249a.a(j6, j10);
        long j11 = this.f43635g;
        long j12 = this.f43636h;
        if (a5 && AbstractC5249a.a(j10, j11) && AbstractC5249a.a(j11, j12)) {
            if (AbstractC5249a.b(j6) == AbstractC5249a.c(j6)) {
                StringBuilder s10 = android.gov.nist.core.a.s("RoundRect(rect=", str, ", radius=");
                s10.append(M3.H.A0(AbstractC5249a.b(j6)));
                s10.append(')');
                return s10.toString();
            }
            StringBuilder s11 = android.gov.nist.core.a.s("RoundRect(rect=", str, ", x=");
            s11.append(M3.H.A0(AbstractC5249a.b(j6)));
            s11.append(", y=");
            s11.append(M3.H.A0(AbstractC5249a.c(j6)));
            s11.append(')');
            return s11.toString();
        }
        StringBuilder s12 = android.gov.nist.core.a.s("RoundRect(rect=", str, ", topLeft=");
        s12.append((Object) AbstractC5249a.d(j6));
        s12.append(", topRight=");
        s12.append((Object) AbstractC5249a.d(j10));
        s12.append(", bottomRight=");
        s12.append((Object) AbstractC5249a.d(j11));
        s12.append(", bottomLeft=");
        s12.append((Object) AbstractC5249a.d(j12));
        s12.append(')');
        return s12.toString();
    }
}

package T0;

import N0.C1046e;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f16830a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16831b;

    /* renamed from: c  reason: collision with root package name */
    public final N0.D f16832c;

    static {
        i0.r rVar = i0.s.f32436a;
    }

    public z(String str, long j6, int i10) {
        this(new C1046e((i10 & 1) != 0 ? "" : str, null, 6), (i10 & 2) != 0 ? N0.D.f12483b : j6, (N0.D) null);
    }

    public static z a(z zVar, C1046e c1046e, long j6, int i10) {
        N0.D d10;
        if ((i10 & 1) != 0) {
            c1046e = zVar.f16830a;
        }
        if ((i10 & 2) != 0) {
            j6 = zVar.f16831b;
        }
        if ((i10 & 4) != 0) {
            d10 = zVar.f16832c;
        } else {
            d10 = null;
        }
        zVar.getClass();
        return new z(c1046e, j6, d10);
    }

    public static z b(z zVar, String str) {
        long j6 = zVar.f16831b;
        N0.D d10 = zVar.f16832c;
        zVar.getClass();
        return new z(new C1046e(str, null, 6), j6, d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (N0.D.a(this.f16831b, zVar.f16831b) && AbstractC3557B.K(this.f16832c, zVar.f16832c) && AbstractC3557B.K(this.f16830a, zVar.f16830a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = N0.D.f12484c;
        long j6 = this.f16831b;
        int hashCode = (((int) (j6 ^ (j6 >>> 32))) + (this.f16830a.hashCode() * 31)) * 31;
        N0.D d10 = this.f16832c;
        if (d10 != null) {
            long j10 = d10.f12485a;
            i10 = (int) ((j10 >>> 32) ^ j10);
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f16830a) + "', selection=" + ((Object) N0.D.g(this.f16831b)) + ", composition=" + this.f16832c + ')';
    }

    public z(C1046e c1046e, long j6, N0.D d10) {
        N0.D d11;
        this.f16830a = c1046e;
        int length = c1046e.f12512Y.length();
        int i10 = N0.D.f12484c;
        int i11 = (int) (j6 >> 32);
        int p10 = N.p(i11, 0, length);
        int i12 = (int) (j6 & 4294967295L);
        int p11 = N.p(i12, 0, length);
        this.f16831b = (p10 == i11 && p11 == i12) ? j6 : U3.f.e(p10, p11);
        if (d10 != null) {
            int length2 = c1046e.f12512Y.length();
            long j10 = d10.f12485a;
            int i13 = (int) (j10 >> 32);
            int p12 = N.p(i13, 0, length2);
            int i14 = (int) (j10 & 4294967295L);
            int p13 = N.p(i14, 0, length2);
            d11 = new N0.D((p12 == i13 && p13 == i14) ? j10 : U3.f.e(p12, p13));
        } else {
            d11 = null;
        }
        this.f16832c = d11;
    }
}

package rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: rb.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5406G {
    public static final C5405F Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f44657d = {null, null, new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final double f44658a;

    /* renamed from: b  reason: collision with root package name */
    public final double f44659b;

    /* renamed from: c  reason: collision with root package name */
    public final List f44660c;

    public C5406G(int i10, double d10, double d11, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C5404E.f44656b);
            throw null;
        }
        this.f44658a = d10;
        this.f44659b = d11;
        if ((i10 & 4) == 0) {
            this.f44660c = kf.v.f37483Y;
        } else {
            this.f44660c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5406G)) {
            return false;
        }
        C5406G c5406g = (C5406G) obj;
        if (Double.compare(this.f44658a, c5406g.f44658a) == 0 && Double.compare(this.f44659b, c5406g.f44659b) == 0 && AbstractC3557B.K(this.f44660c, c5406g.f44660c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44658a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44659b);
        return this.f44660c.hashCode() + (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31);
    }

    public final String toString() {
        return "FusedLocation(latitude=" + this.f44658a + ", longitude=" + this.f44659b + ", addresses=" + this.f44660c + Separators.RPAREN;
    }

    public C5406G(double d10, double d11, List list) {
        this.f44658a = d10;
        this.f44659b = d11;
        this.f44660c = list;
    }
}

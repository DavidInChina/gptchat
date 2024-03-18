package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class Y implements AbstractC6211y {
    public static final Q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48372a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48373b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48374c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48375d;

    /* renamed from: e  reason: collision with root package name */
    public final X f48376e;

    public Y(int i10, String str, int i11, int i12, int i13, X x10) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, P.f48364b);
            throw null;
        }
        this.f48372a = str;
        this.f48373b = i11;
        this.f48374c = i12;
        this.f48375d = i13;
        if ((i10 & 16) == 0) {
            this.f48376e = null;
        } else {
            this.f48376e = x10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (AbstractC3557B.K(this.f48372a, y10.f48372a) && this.f48373b == y10.f48373b && this.f48374c == y10.f48374c && this.f48375d == y10.f48375d && AbstractC3557B.K(this.f48376e, y10.f48376e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((((((this.f48372a.hashCode() * 31) + this.f48373b) * 31) + this.f48374c) * 31) + this.f48375d) * 31;
        X x10 = this.f48376e;
        if (x10 == null) {
            i10 = 0;
        } else {
            i10 = x10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ImageAssetPointer(assetPointer=", C6209w.a(this.f48372a), ", sizeBytes=");
        s10.append(this.f48373b);
        s10.append(", width=");
        s10.append(this.f48374c);
        s10.append(", height=");
        s10.append(this.f48375d);
        s10.append(", metadata=");
        s10.append(this.f48376e);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public Y(String str, int i10, int i11, int i12) {
        this.f48372a = str;
        this.f48373b = i10;
        this.f48374c = i11;
        this.f48375d = i12;
        this.f48376e = null;
    }
}

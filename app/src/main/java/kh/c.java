package kh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import r0.G;
import s0.AbstractC5502d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f37547a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5502d f37548b;

    public c(int i10, AbstractC5502d abstractC5502d) {
        this.f37547a = i10;
        this.f37548b = abstractC5502d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (G.e(this.f37547a, cVar.f37547a) && AbstractC3557B.K(this.f37548b, cVar.f37548b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f37547a * 31;
        AbstractC5502d abstractC5502d = this.f37548b;
        if (abstractC5502d == null) {
            i10 = 0;
        } else {
            i10 = abstractC5502d.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        String i10 = G.i(this.f37547a);
        return "ImageBitmapOptions(config=" + i10 + ", colorSpace=" + this.f37548b + Separators.RPAREN;
    }
}

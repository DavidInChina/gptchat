package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

/* renamed from: gb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3234k {

    /* renamed from: a  reason: collision with root package name */
    public final String f31470a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31471b;

    public C3234k(String str, String str2) {
        AbstractC3557B.c0("assetPointer", str);
        this.f31470a = str;
        this.f31471b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3234k)) {
            return false;
        }
        C3234k c3234k = (C3234k) obj;
        if (AbstractC3557B.K(this.f31470a, c3234k.f31470a) && AbstractC3557B.K(this.f31471b, c3234k.f31471b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f31470a.hashCode() * 31;
        String str = this.f31471b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.s("ImageSelection(assetPointer=", C6209w.a(this.f31470a), ", genId="), this.f31471b, Separators.RPAREN);
    }
}

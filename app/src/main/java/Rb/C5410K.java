package rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: rb.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5410K {
    public static final C5409J Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f44664a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44665b;

    public C5410K(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C5408I.f44663b);
            throw null;
        }
        this.f44664a = str;
        this.f44665b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5410K)) {
            return false;
        }
        C5410K c5410k = (C5410K) obj;
        if (AbstractC3557B.K(this.f44664a, c5410k.f44664a) && AbstractC3557B.K(this.f44665b, c5410k.f44665b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44665b.hashCode() + (this.f44664a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneContact(name=");
        sb2.append(this.f44664a);
        sb2.append(", phone=");
        return R.a.t(sb2, this.f44665b, Separators.RPAREN);
    }

    public C5410K(String str, String str2) {
        this.f44664a = str;
        this.f44665b = str2;
    }
}

package jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: jc.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3942j {
    public static final C3941i Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f36111a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36112b;

    public C3942j(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f36111a = str;
            this.f36112b = str2;
            return;
        }
        R4.b.e2(i10, 3, C3940h.f36110b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3942j)) {
            return false;
        }
        C3942j c3942j = (C3942j) obj;
        if (AbstractC3557B.K(this.f36111a, c3942j.f36111a) && AbstractC3557B.K(this.f36112b, c3942j.f36112b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36112b.hashCode() + (this.f36111a.hashCode() * 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.s("MemoryItem(id=", R.a.t(new StringBuilder("MemoryId(value="), this.f36111a, Separators.RPAREN), ", content="), this.f36112b, Separators.RPAREN);
    }
}

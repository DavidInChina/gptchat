package id;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;

@AbstractC1998i
/* renamed from: id.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3560E {
    public static final C3559D Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f33087a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33088b;

    public C3560E(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f33087a = str;
            this.f33088b = str2;
            return;
        }
        R4.b.e2(i10, 3, C3558C.f33086b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3560E)) {
            return false;
        }
        C3560E c3560e = (C3560E) obj;
        if (AbstractC3557B.K(this.f33087a, c3560e.f33087a) && AbstractC3557B.K(this.f33088b, c3560e.f33088b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33088b.hashCode() + (this.f33087a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpreadsheetSuggestion(title=");
        sb2.append(this.f33087a);
        sb2.append(", justification=");
        return R.a.t(sb2, this.f33088b, Separators.RPAREN);
    }
}

package nd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class h extends k {
    public static final g Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f40288a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f40289b;

    public h(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f40288a = str;
            this.f40289b = true;
            return;
        }
        R4.b.e2(i10, 1, f.f40287b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f40288a, hVar.f40288a) && this.f40289b == hVar.f40289b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f40288a.hashCode() * 31;
        if (this.f40289b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Authenticated(userId=" + this.f40288a + ", persisted=" + this.f40289b + Separators.RPAREN;
    }

    public h(String str, boolean z10) {
        AbstractC3557B.c0("userId", str);
        this.f40288a = str;
        this.f40289b = z10;
    }
}

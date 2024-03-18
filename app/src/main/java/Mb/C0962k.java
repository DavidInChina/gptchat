package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962k implements AbstractC0966m {

    /* renamed from: a  reason: collision with root package name */
    public final String f11951a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11952b = true;

    public C0962k(String str) {
        this.f11951a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962k)) {
            return false;
        }
        C0962k c0962k = (C0962k) obj;
        if (AbstractC3557B.K(this.f11951a, c0962k.f11951a) && this.f11952b == c0962k.f11952b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f11951a.hashCode() * 31;
        if (this.f11952b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        String F22 = AbstractC3557B.F2(this.f11951a);
        return "NavigateTo(route=" + F22 + ", replace=" + this.f11952b + Separators.RPAREN;
    }
}

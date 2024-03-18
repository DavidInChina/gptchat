package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ec.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2854f implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final String f29232a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29233b = true;

    public C2854f(String str) {
        this.f29232a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2854f)) {
            return false;
        }
        C2854f c2854f = (C2854f) obj;
        if (AbstractC3557B.K(this.f29232a, c2854f.f29232a) && this.f29233b == c2854f.f29233b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f29232a.hashCode() * 31;
        if (this.f29233b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        String F22 = AbstractC3557B.F2(this.f29232a);
        return "NavigateTo(route=" + F22 + ", replace=" + this.f29233b + Separators.RPAREN;
    }
}

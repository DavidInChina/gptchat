package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class O {
    public static final N Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48362a;

    public /* synthetic */ O(String str) {
        this.f48362a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("GizmoId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48362a, ((O) obj).f48362a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48362a.hashCode();
    }

    public final String toString() {
        return a(this.f48362a);
    }
}

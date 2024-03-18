package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6195j {
    public static final C6193i Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48426a;

    public /* synthetic */ C6195j(String str) {
        this.f48426a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("AccountId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6195j)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48426a, ((C6195j) obj).f48426a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48426a.hashCode();
    }

    public final String toString() {
        return a(this.f48426a);
    }
}

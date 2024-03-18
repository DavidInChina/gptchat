package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6190g0 {
    public static final C6188f0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48419a;

    public /* synthetic */ C6190g0(String str) {
        this.f48419a = str;
    }

    public static final EnumC6192h0 a(String str) {
        if (Lg.n.Z1(str, "gpt-4", false)) {
            return EnumC6192h0.f48423Z;
        }
        return EnumC6192h0.f48422Y;
    }

    public static String b(String str) {
        return android.gov.nist.core.a.A("ModelSlug(name=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6190g0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48419a, ((C6190g0) obj).f48419a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48419a.hashCode();
    }

    public final String toString() {
        return b(this.f48419a);
    }
}

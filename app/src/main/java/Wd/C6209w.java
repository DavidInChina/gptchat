package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6209w {
    public static final C6208v Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48469a;

    public /* synthetic */ C6209w(String str) {
        this.f48469a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("AssetPointer(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6209w)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48469a, ((C6209w) obj).f48469a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48469a.hashCode();
    }

    public final String toString() {
        return a(this.f48469a);
    }
}

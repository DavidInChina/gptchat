package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985w implements AbstractC0989y {

    /* renamed from: a  reason: collision with root package name */
    public final String f11994a;

    public C0985w(String str) {
        this.f11994a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0985w)) {
            return false;
        }
        if (AbstractC3557B.K(this.f11994a, ((C0985w) obj).f11994a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11994a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f11994a), Separators.RPAREN);
    }
}

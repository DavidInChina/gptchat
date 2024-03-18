package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0973p0 implements AbstractC0976r0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11971a;

    public C0973p0(String str) {
        this.f11971a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973p0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f11971a, ((C0973p0) obj).f11971a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11971a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f11971a), Separators.RPAREN);
    }
}

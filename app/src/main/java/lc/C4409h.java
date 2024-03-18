package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lc.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4409h implements AbstractC4411j {

    /* renamed from: a  reason: collision with root package name */
    public final String f38262a;

    public C4409h(String str) {
        this.f38262a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4409h)) {
            return false;
        }
        if (AbstractC3557B.K(this.f38262a, ((C4409h) obj).f38262a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38262a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f38262a), Separators.RPAREN);
    }
}

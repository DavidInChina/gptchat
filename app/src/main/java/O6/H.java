package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* loaded from: classes2.dex */
public final class H extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final C4564c f40643j = new C4564c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        if (AbstractC3557B.K(this.f40643j, ((H) obj).f40643j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40643j.hashCode();
    }

    public final String toString() {
        return "WebViewEvent(eventTime=" + this.f40643j + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40643j;
    }
}

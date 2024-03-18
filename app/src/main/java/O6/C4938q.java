package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4938q extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final C4564c f40895j = new C4564c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4938q)) {
            return false;
        }
        if (AbstractC3557B.K(this.f40895j, ((C4938q) obj).f40895j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40895j.hashCode();
    }

    public final String toString() {
        return "KeepAlive(eventTime=" + this.f40895j + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40895j;
    }
}

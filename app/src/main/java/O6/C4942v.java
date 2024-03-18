package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4942v extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40904j;

    /* renamed from: k  reason: collision with root package name */
    public final C4564c f40905k;

    public C4942v(String str) {
        C4564c c4564c = new C4564c();
        this.f40904j = str;
        this.f40905k = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4942v)) {
            return false;
        }
        C4942v c4942v = (C4942v) obj;
        if (AbstractC3557B.K(this.f40904j, c4942v.f40904j) && AbstractC3557B.K(this.f40905k, c4942v.f40905k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40905k.hashCode() + (this.f40904j.hashCode() * 31);
    }

    public final String toString() {
        return "ResourceSent(viewId=" + this.f40904j + ", eventTime=" + this.f40905k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40905k;
    }
}

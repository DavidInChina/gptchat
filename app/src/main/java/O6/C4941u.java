package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4941u extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40902j;

    /* renamed from: k  reason: collision with root package name */
    public final C4564c f40903k;

    public C4941u(String str) {
        C4564c c4564c = new C4564c();
        this.f40902j = str;
        this.f40903k = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4941u)) {
            return false;
        }
        C4941u c4941u = (C4941u) obj;
        if (AbstractC3557B.K(this.f40902j, c4941u.f40902j) && AbstractC3557B.K(this.f40903k, c4941u.f40903k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40903k.hashCode() + (this.f40902j.hashCode() * 31);
    }

    public final String toString() {
        return "ResourceDropped(viewId=" + this.f40902j + ", eventTime=" + this.f40903k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40903k;
    }
}

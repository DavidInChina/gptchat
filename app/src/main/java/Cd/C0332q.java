package Cd;

import aa.C1939b;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Cd.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332q implements y {

    /* renamed from: a  reason: collision with root package name */
    public final C1939b f3067a;

    /* renamed from: b  reason: collision with root package name */
    public final ha.K f3068b;

    public C0332q(C1939b c1939b, ha.K k10) {
        AbstractC3557B.c0("data", c1939b);
        AbstractC3557B.c0("action", k10);
        this.f3067a = c1939b;
        this.f3068b = k10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0332q)) {
            return false;
        }
        C0332q c0332q = (C0332q) obj;
        if (AbstractC3557B.K(this.f3067a, c0332q.f3067a) && AbstractC3557B.K(this.f3068b, c0332q.f3068b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3068b.hashCode() + (this.f3067a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomActionClick(data=" + this.f3067a + ", action=" + this.f3068b + Separators.RPAREN;
    }
}

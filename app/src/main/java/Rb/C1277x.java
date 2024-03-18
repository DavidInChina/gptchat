package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Rb.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277x implements AbstractC1279z {

    /* renamed from: a  reason: collision with root package name */
    public final C1272s f15378a;

    /* renamed from: b  reason: collision with root package name */
    public final C f15379b;

    public C1277x(C1272s c1272s, C c10) {
        AbstractC3557B.c0("contentId", c1272s);
        AbstractC3557B.c0("reason", c10);
        this.f15378a = c1272s;
        this.f15379b = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1277x)) {
            return false;
        }
        C1277x c1277x = (C1277x) obj;
        if (AbstractC3557B.K(this.f15378a, c1277x.f15378a) && AbstractC3557B.K(this.f15379b, c1277x.f15379b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15379b.hashCode() + (this.f15378a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectReason(contentId=" + this.f15378a + ", reason=" + this.f15379b + Separators.RPAREN;
    }
}

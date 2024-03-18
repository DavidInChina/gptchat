package kd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: kd.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4239c {
    public static final C4238b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f37297a;

    /* renamed from: b  reason: collision with root package name */
    public final Yg.p f37298b;

    public C4239c(int i10, String str, Yg.p pVar) {
        if (3 == (i10 & 3)) {
            this.f37297a = str;
            this.f37298b = pVar;
            return;
        }
        R4.b.e2(i10, 3, C4237a.f37296b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4239c)) {
            return false;
        }
        C4239c c4239c = (C4239c) obj;
        if (AbstractC3557B.K(this.f37297a, c4239c.f37297a) && AbstractC3557B.K(this.f37298b, c4239c.f37298b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37298b.f22419Y.hashCode() + (this.f37297a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterWebSocketResponse(wssUrl=" + this.f37297a + ", expiresAt=" + this.f37298b + Separators.RPAREN;
    }
}

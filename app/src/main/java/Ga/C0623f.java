package Ga;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Ga.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623f {
    public static final C0622e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C0621d f6208a;

    public C0623f(int i10, C0621d c0621d) {
        if (1 == (i10 & 1)) {
            this.f6208a = c0621d;
        } else {
            R4.b.e2(i10, 1, C0618a.f6204b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0623f) && AbstractC3557B.K(this.f6208a, ((C0623f) obj).f6208a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6208a.f6207a.hashCode();
    }

    public final String toString() {
        return "BotTokenHeader(botToken=" + this.f6208a + Separators.RPAREN;
    }

    public C0623f(String str) {
        this.f6208a = new C0621d(str);
    }
}

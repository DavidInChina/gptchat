package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class y0 {
    public static final x0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48473a;

    public /* synthetic */ y0(String str) {
        this.f48473a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("SharedConversationId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48473a, ((y0) obj).f48473a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48473a.hashCode();
    }

    public final String toString() {
        return a(this.f48473a);
    }
}

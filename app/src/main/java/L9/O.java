package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class O {
    public static final N Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10890a;

    public O(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f10890a = str;
        } else {
            R4.b.e2(i10, 1, M.f10889b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        if (AbstractC3557B.K(this.f10890a, ((O) obj).f10890a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10890a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("GenerateTitleRequest(messageId=", C6182c0.a(this.f10890a), Separators.RPAREN);
    }

    public O(String str) {
        AbstractC3557B.c0("messageId", str);
        this.f10890a = str;
    }
}

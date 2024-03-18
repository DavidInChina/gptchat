package ca;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* renamed from: ca.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2316h extends AbstractC2313e {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f26391a;

    public C2316h(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f26391a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2316h) && AbstractC3557B.K(this.f26391a, ((C2316h) obj).f26391a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26391a.hashCode();
    }

    public final String toString() {
        return "SingleMessage(message=" + this.f26391a + Separators.RPAREN;
    }
}

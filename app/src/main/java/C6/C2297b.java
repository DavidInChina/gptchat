package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: c6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297b {

    /* renamed from: a  reason: collision with root package name */
    public final C2298c f26294a;

    public C2297b(C2298c c2298c) {
        this.f26294a = c2298c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2297b) && AbstractC3557B.K(this.f26294a, ((C2297b) obj).f26294a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26294a.f26295a.hashCode();
    }

    public final String toString() {
        return "Dd(device=" + this.f26294a + Separators.RPAREN;
    }
}

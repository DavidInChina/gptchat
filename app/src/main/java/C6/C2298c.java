package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: c6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2298c {

    /* renamed from: a  reason: collision with root package name */
    public final String f26295a;

    public C2298c(String str) {
        AbstractC3557B.c0("architecture", str);
        this.f26295a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2298c) && AbstractC3557B.K(this.f26295a, ((C2298c) obj).f26295a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26295a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Device(architecture="), this.f26295a, Separators.RPAREN);
    }
}

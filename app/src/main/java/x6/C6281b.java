package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6281b {

    /* renamed from: a  reason: collision with root package name */
    public final String f49254a;

    public C6281b(String str) {
        AbstractC3557B.c0("name", str);
        this.f49254a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6281b) && AbstractC3557B.K(this.f49254a, ((C6281b) obj).f49254a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49254a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ActionEventActionTarget(name="), this.f49254a, Separators.RPAREN);
    }
}

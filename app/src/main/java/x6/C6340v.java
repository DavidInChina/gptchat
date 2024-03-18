package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: x6.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6340v {

    /* renamed from: a  reason: collision with root package name */
    public final List f49451a;

    public C6340v(List list) {
        AbstractC3557B.c0("type", list);
        this.f49451a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6340v) && AbstractC3557B.K(this.f49451a, ((C6340v) obj).f49451a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49451a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Frustration(type="), this.f49451a, Separators.RPAREN);
    }
}

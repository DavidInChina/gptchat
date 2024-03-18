package df;

import id.AbstractC3557B;

/* renamed from: df.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2643h {

    /* renamed from: a  reason: collision with root package name */
    public final String f28272a;

    public C2643h(String str) {
        this.f28272a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2643h) && AbstractC3557B.K(this.f28272a, ((C2643h) obj).f28272a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28272a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("SdpMsid(value="), this.f28272a, ')');
    }
}

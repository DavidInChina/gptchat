package A5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f682a;

    /* renamed from: b  reason: collision with root package name */
    public final List f683b;

    /* renamed from: c  reason: collision with root package name */
    public final long f684c = System.nanoTime();

    public h(String str, ArrayList arrayList) {
        AbstractC3557B.c0("hostname", str);
        this.f682a = str;
        this.f683b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f682a, hVar.f682a) && AbstractC3557B.K(this.f683b, hVar.f683b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f683b.hashCode() + (this.f682a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedHost(hostname=" + this.f682a + ", addresses=" + this.f683b + Separators.RPAREN;
    }
}

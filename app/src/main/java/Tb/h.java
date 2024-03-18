package tb;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Map f46059a;

    public h(Map map) {
        AbstractC3557B.c0("urls", map);
        this.f46059a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && AbstractC3557B.K(this.f46059a, ((h) obj).f46059a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46059a.hashCode();
    }

    public final String toString() {
        return "MessageSpreadsheetState(urls=" + this.f46059a + Separators.RPAREN;
    }
}

package n6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f39639a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39640b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39641c = "view";

    public e(long j6, String str) {
        AbstractC3557B.c0("viewId", str);
        this.f39639a = str;
        this.f39640b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f39639a, eVar.f39639a) && this.f39640b == eVar.f39640b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f39640b;
        return (this.f39639a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "View(viewId=" + this.f39639a + ", documentVersion=" + this.f39640b + Separators.RPAREN;
    }
}

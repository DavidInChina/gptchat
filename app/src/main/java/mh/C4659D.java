package mh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import u0.AbstractC5824b;

/* renamed from: mh.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4659D implements AbstractC4658C {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5824b f39398a;

    public /* synthetic */ C4659D(Z6.a aVar) {
        this.f39398a = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4659D)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f39398a, ((C4659D) obj).f39398a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC5824b abstractC5824b = this.f39398a;
        if (abstractC5824b == null) {
            return 0;
        }
        return abstractC5824b.hashCode();
    }

    public final String toString() {
        return "PainterDelegate(painter=" + this.f39398a + Separators.RPAREN;
    }
}

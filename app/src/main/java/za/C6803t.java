package za;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.AbstractC6211y;

/* renamed from: za.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6803t implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6211y f51801a;

    public C6803t(AbstractC6211y abstractC6211y) {
        this.f51801a = abstractC6211y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6803t) && AbstractC3557B.K(this.f51801a, ((C6803t) obj).f51801a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC6211y abstractC6211y = this.f51801a;
        if (abstractC6211y == null) {
            return 0;
        }
        return abstractC6211y.hashCode();
    }

    public final String toString() {
        return "OpenImageDetailScreen(assetPointer=" + this.f51801a + Separators.RPAREN;
    }
}

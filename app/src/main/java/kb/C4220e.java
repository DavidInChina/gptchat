package kb;

import Jc.AbstractC0809c;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: kb.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4220e implements AbstractC4224i {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0809c f37254a;

    static {
        int i10 = AbstractC0809c.f9045Y;
    }

    public C4220e(AbstractC0809c abstractC0809c) {
        AbstractC3557B.c0("error", abstractC0809c);
        this.f37254a = abstractC0809c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4220e) && AbstractC3557B.K(this.f37254a, ((C4220e) obj).f37254a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37254a.hashCode();
    }

    public final String toString() {
        return "DownloadError(error=" + this.f37254a + Separators.RPAREN;
    }
}

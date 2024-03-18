package kb;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: kb.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4231p implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f37264a;

    public C4231p(Uri uri) {
        this.f37264a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4231p) && AbstractC3557B.K(this.f37264a, ((C4231p) obj).f37264a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37264a.hashCode();
    }

    public final String toString() {
        return "TransformImage(image=" + this.f37264a + Separators.RPAREN;
    }
}

package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: za.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6798o implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f51796a;

    public C6798o(Uri uri) {
        this.f51796a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6798o) && AbstractC3557B.K(this.f51796a, ((C6798o) obj).f51796a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f51796a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "FileSelected(file=" + this.f51796a + Separators.RPAREN;
    }
}

package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: za.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6802s implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f51800a;

    public C6802s(Uri uri) {
        this.f51800a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6802s) && AbstractC3557B.K(this.f51800a, ((C6802s) obj).f51800a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f51800a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "ImageSelected(file=" + this.f51800a + Separators.RPAREN;
    }
}

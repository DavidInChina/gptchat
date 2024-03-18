package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: za.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6793j implements AbstractC6794k {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f51790a;

    public C6793j(Uri uri) {
        this.f51790a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6793j) && AbstractC3557B.K(this.f51790a, ((C6793j) obj).f51790a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51790a.hashCode();
    }

    public final String toString() {
        return "TakePhoto(file=" + this.f51790a + Separators.RPAREN;
    }
}

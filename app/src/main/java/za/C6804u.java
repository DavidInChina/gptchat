package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: za.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6804u implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f51802a;

    public C6804u(Uri uri) {
        AbstractC3557B.c0("file", uri);
        this.f51802a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6804u) && AbstractC3557B.K(this.f51802a, ((C6804u) obj).f51802a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51802a.hashCode();
    }

    public final String toString() {
        return "RemoveImage(file=" + this.f51802a + Separators.RPAREN;
    }
}

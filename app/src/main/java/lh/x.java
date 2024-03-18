package lh;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final w f38521a;

    public x(w wVar) {
        this.f38521a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f38521a == ((x) obj).f38521a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38521a.hashCode();
    }

    public final String toString() {
        return "ExifMetadata(orientation=" + this.f38521a + Separators.RPAREN;
    }
}

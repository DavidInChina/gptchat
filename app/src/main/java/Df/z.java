package Df;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f3648c = new z(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final A f3649a;

    /* renamed from: b  reason: collision with root package name */
    public final w f3650b;

    public z(A a5, w wVar) {
        boolean z10;
        String str;
        this.f3649a = a5;
        this.f3650b = wVar;
        boolean z11 = true;
        if (a5 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == (wVar != null ? false : z11)) {
            return;
        }
        if (a5 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + a5 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3649a == zVar.f3649a && AbstractC3557B.K(this.f3650b, zVar.f3650b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        A a5 = this.f3649a;
        if (a5 == null) {
            i10 = 0;
        } else {
            i10 = a5.hashCode();
        }
        int i12 = i10 * 31;
        w wVar = this.f3650b;
        if (wVar != null) {
            i11 = wVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        int i10;
        A a5 = this.f3649a;
        if (a5 == null) {
            i10 = -1;
        } else {
            i10 = y.f3647a[a5.ordinal()];
        }
        if (i10 != -1) {
            w wVar = this.f3650b;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "out " + wVar;
                    }
                    throw new RuntimeException();
                }
                return "in " + wVar;
            }
            return String.valueOf(wVar);
        }
        return Separators.STAR;
    }
}

package jf;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: jf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3959i implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f36155Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f36156Z;

    public C3959i(Object obj, Object obj2) {
        this.f36155Y = obj;
        this.f36156Z = obj2;
    }

    public final Object a() {
        return this.f36155Y;
    }

    public final Object b() {
        return this.f36156Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3959i)) {
            return false;
        }
        C3959i c3959i = (C3959i) obj;
        if (AbstractC3557B.K(this.f36155Y, c3959i.f36155Y) && AbstractC3557B.K(this.f36156Z, c3959i.f36156Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f36155Y;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = i10 * 31;
        Object obj2 = this.f36156Z;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return Separators.LPAREN + this.f36155Y + ", " + this.f36156Z + ')';
    }
}

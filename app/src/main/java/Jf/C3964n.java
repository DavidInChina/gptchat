package jf;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: jf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3964n implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f36165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f36166Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f36167h0;

    public C3964n(Object obj, Object obj2, Object obj3) {
        this.f36165Y = obj;
        this.f36166Z = obj2;
        this.f36167h0 = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3964n)) {
            return false;
        }
        C3964n c3964n = (C3964n) obj;
        if (AbstractC3557B.K(this.f36165Y, c3964n.f36165Y) && AbstractC3557B.K(this.f36166Z, c3964n.f36166Z) && AbstractC3557B.K(this.f36167h0, c3964n.f36167h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f36165Y;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i13 = i10 * 31;
        Object obj2 = this.f36166Z;
        if (obj2 == null) {
            i11 = 0;
        } else {
            i11 = obj2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Object obj3 = this.f36167h0;
        if (obj3 != null) {
            i12 = obj3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return Separators.LPAREN + this.f36165Y + ", " + this.f36166Z + ", " + this.f36167h0 + ')';
    }
}

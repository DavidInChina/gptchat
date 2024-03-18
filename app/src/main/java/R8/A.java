package R8;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class A extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15130g;

    /* renamed from: h  reason: collision with root package name */
    public final B f15131h;

    public A(boolean z10, B b10) {
        this.f15130g = z10;
        this.f15131h = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a5 = (A) obj;
        if (this.f15130g == a5.f15130g && this.f15131h == a5.f15131h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f15130g) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f15131h.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.f15130g + ", alignment=" + this.f15131h + Separators.RPAREN;
    }
}

package x6;

import android.gov.nist.core.Separators;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6288d0 f49099a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49100b;

    public U(EnumC6288d0 enumC6288d0, int i10) {
        this.f49099a = enumC6288d0;
        this.f49100b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (this.f49099a == u10.f49099a && this.f49100b == u10.f49100b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        EnumC6288d0 enumC6288d0 = this.f49099a;
        if (enumC6288d0 == null) {
            i10 = 0;
        } else {
            i10 = enumC6288d0.hashCode();
        }
        int i12 = i10 * 31;
        int i13 = this.f49100b;
        if (i13 != 0) {
            i11 = AbstractC6708l.f(i13);
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdSession(plan=" + this.f49099a + ", sessionPrecondition=" + AbstractC6287d.L(this.f49100b) + Separators.RPAREN;
    }
}

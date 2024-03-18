package x6;

import android.gov.nist.core.Separators;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6352z f49424a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49425b;

    public r(EnumC6352z enumC6352z, int i10) {
        this.f49424a = enumC6352z;
        this.f49425b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f49424a == rVar.f49424a && this.f49425b == rVar.f49425b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        EnumC6352z enumC6352z = this.f49424a;
        if (enumC6352z == null) {
            i10 = 0;
        } else {
            i10 = enumC6352z.hashCode();
        }
        int i12 = i10 * 31;
        int i13 = this.f49425b;
        if (i13 != 0) {
            i11 = AbstractC6708l.f(i13);
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdSession(plan=" + this.f49424a + ", sessionPrecondition=" + AbstractC6287d.e0(this.f49425b) + Separators.RPAREN;
    }
}

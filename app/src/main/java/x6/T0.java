package x6;

import android.gov.nist.core.Separators;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6286c1 f49093a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49094b;

    public T0(EnumC6286c1 enumC6286c1, int i10) {
        this.f49093a = enumC6286c1;
        this.f49094b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t02 = (T0) obj;
        if (this.f49093a == t02.f49093a && this.f49094b == t02.f49094b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        EnumC6286c1 enumC6286c1 = this.f49093a;
        if (enumC6286c1 == null) {
            i10 = 0;
        } else {
            i10 = enumC6286c1.hashCode();
        }
        int i12 = i10 * 31;
        int i13 = this.f49094b;
        if (i13 != 0) {
            i11 = AbstractC6708l.f(i13);
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdSession(plan=" + this.f49093a + ", sessionPrecondition=" + AbstractC6301h1.m(this.f49094b) + Separators.RPAREN;
    }
}

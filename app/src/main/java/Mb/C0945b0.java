package Mb;

import android.gov.nist.core.Separators;
import b9.EnumC2132a;

/* renamed from: Mb.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945b0 extends AbstractC0947c0 {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2132a f11902a;

    public C0945b0(EnumC2132a enumC2132a) {
        this.f11902a = enumC2132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0945b0) && this.f11902a == ((C0945b0) obj).f11902a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11902a.hashCode();
    }

    public final String toString() {
        return "Login(provider=" + this.f11902a + Separators.RPAREN;
    }
}

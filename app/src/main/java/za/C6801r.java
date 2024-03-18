package za;

import android.gov.nist.core.Separators;

/* renamed from: za.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6801r implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6785b f51799a;

    public C6801r(EnumC6785b enumC6785b) {
        this.f51799a = enumC6785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6801r) && this.f51799a == ((C6801r) obj).f51799a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51799a.hashCode();
    }

    public final String toString() {
        return "ImageSelect(option=" + this.f51799a + Separators.RPAREN;
    }
}

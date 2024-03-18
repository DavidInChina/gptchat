package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: I9.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762i0 implements AbstractC0775p {

    /* renamed from: a  reason: collision with root package name */
    public final P0 f8367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8368b;

    public C0762i0(P0 p02) {
        AbstractC3557B.c0("range", p02);
        this.f8367a = p02;
        this.f8368b = p02.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0762i0) && AbstractC3557B.K(this.f8367a, ((C0762i0) obj).f8367a)) {
            return true;
        }
        return false;
    }

    @Override // I9.AbstractC0775p
    public final String getId() {
        return this.f8368b;
    }

    public final int hashCode() {
        return this.f8367a.hashCode();
    }

    public final String toString() {
        return "HeaderItem(range=" + this.f8367a + Separators.RPAREN;
    }
}

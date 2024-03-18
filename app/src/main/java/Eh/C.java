package Eh;

import Bh.AbstractC0261o;
import Bh.AbstractC0265q;

/* loaded from: classes.dex */
public final class C implements AbstractC0261o {

    /* renamed from: Y  reason: collision with root package name */
    public final int f4746Y;

    public C(int i10) {
        this.f4746Y = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        if (this.f4746Y == ((C) obj).f4746Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (C.class.hashCode() * 31) + this.f4746Y;
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}

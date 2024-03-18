package Rh;

import th.AbstractC5802j;

/* loaded from: classes2.dex */
public final class I implements J {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5802j f15631a;

    public I(B0 b02) {
        this.f15631a = b02;
    }

    @Override // Rh.J
    public final AbstractC5802j a() {
        return this.f15631a;
    }

    @Override // Rh.J
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        if (this.f15631a.equals(((I) obj).f15631a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15631a.hashCode() + (I.class.hashCode() * 31);
    }
}

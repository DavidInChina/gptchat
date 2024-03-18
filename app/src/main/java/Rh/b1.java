package Rh;

import wh.AbstractC6242g;

/* loaded from: classes.dex */
public final class b1 implements c1 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15796Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f15797Z;

    public b1(String str, boolean z10) {
        this.f15796Y = str.replace('/', '.');
        this.f15797Z = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f15797Z == b1Var.f15797Z && this.f15796Y.equals(b1Var.f15796Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return E9.f.v(this.f15796Y, b1.class.hashCode() * 31, 31) + (this.f15797Z ? 1 : 0);
    }

    @Override // Rh.c1
    public final boolean m() {
        return this.f15797Z;
    }

    @Override // Rh.c1
    public final boolean n() {
        return false;
    }

    @Override // Rh.c1
    public final yh.l1 o(p1 p1Var) {
        return p1Var.a(this.f15796Y).a();
    }

    @Override // Rh.c1
    public final AbstractC6242g p(p1 p1Var) {
        return null;
    }
}

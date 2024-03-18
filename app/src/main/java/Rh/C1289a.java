package Rh;

import yh.C6637t;

/* renamed from: Rh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1289a implements o1 {

    /* renamed from: a  reason: collision with root package name */
    public final o1 f15783a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15784b;

    public C1289a(o1 o1Var, int i10) {
        this.f15783a = o1Var;
        this.f15784b = i10;
    }

    @Override // Rh.o1
    public final yh.l1 a() {
        return C6637t.l1(this.f15783a.a(), this.f15784b);
    }

    @Override // Rh.o1
    public final boolean b() {
        return this.f15783a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1289a.class != obj.getClass()) {
            return false;
        }
        C1289a c1289a = (C1289a) obj;
        if (this.f15784b == c1289a.f15784b && this.f15783a.equals(c1289a.f15783a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15783a.hashCode() + (C1289a.class.hashCode() * 31)) * 31) + this.f15784b;
    }
}

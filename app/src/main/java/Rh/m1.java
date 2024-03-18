package Rh;

import he.C3416a;

/* loaded from: classes2.dex */
public final class m1 implements o1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15927a;

    public m1(String str) {
        this.f15927a = str;
    }

    @Override // Rh.o1
    public final yh.l1 a() {
        throw new C3416a(this.f15927a);
    }

    @Override // Rh.o1
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        if (this.f15927a.equals(((m1) obj).f15927a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15927a.hashCode() + (m1.class.hashCode() * 31);
    }
}

package Rh;

/* loaded from: classes2.dex */
public final class n1 implements o1 {

    /* renamed from: a  reason: collision with root package name */
    public final yh.l1 f15932a;

    public n1(yh.l1 l1Var) {
        this.f15932a = l1Var;
    }

    @Override // Rh.o1
    public final yh.l1 a() {
        return this.f15932a;
    }

    @Override // Rh.o1
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        if (this.f15932a.equals(((n1) obj).f15932a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15932a.hashCode() + (n1.class.hashCode() * 31);
    }
}

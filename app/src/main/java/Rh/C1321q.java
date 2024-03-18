package Rh;

/* renamed from: Rh.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1321q implements AbstractC1324s, AbstractC1291b {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15938Y;

    public C1321q(String str) {
        String h10 = Nh.r.n(str).h();
        String f6 = Nh.r.v(Nh.r.q(h10), h10.length(), h10).f();
        this.f15938Y = f6.substring(0, f6.length() - 2);
    }

    @Override // Rh.AbstractC1291b
    public final String a() {
        return this.f15938Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1321q.class != obj.getClass()) {
            return false;
        }
        if (this.f15938Y.equals(((C1321q) obj).f15938Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15938Y.hashCode() + (C1321q.class.hashCode() * 31);
    }

    @Override // Rh.AbstractC1324s
    public final AbstractC1291b b(String str) {
        return this;
    }
}

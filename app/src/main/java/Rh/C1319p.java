package Rh;

/* renamed from: Rh.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1319p implements AbstractC1324s {

    /* renamed from: Y  reason: collision with root package name */
    public final p1 f15935Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f15936Z;

    public C1319p(j1 j1Var, String str) {
        this.f15935Y = j1Var;
        this.f15936Z = str.substring(1, str.length() - 1).replace('/', '.');
    }

    @Override // Rh.AbstractC1324s
    public final AbstractC1291b b(String str) {
        return new C1317o(this, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1319p.class != obj.getClass()) {
            return false;
        }
        C1319p c1319p = (C1319p) obj;
        if (this.f15936Z.equals(c1319p.f15936Z) && this.f15935Y.equals(c1319p.f15935Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15935Y.hashCode();
        return this.f15936Z.hashCode() + ((hashCode + (C1319p.class.hashCode() * 31)) * 31);
    }
}

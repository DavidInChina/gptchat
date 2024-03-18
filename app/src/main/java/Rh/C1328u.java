package Rh;

/* renamed from: Rh.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1328u implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1332w f15947Y;

    public C1328u(C1332w c1332w) {
        this.f15947Y = c1332w;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15947Y.f15956i0.add(abstractC1337y0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1328u.class != obj.getClass()) {
            return false;
        }
        if (this.f15947Y.equals(((C1328u) obj).f15947Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15947Y.hashCode() + (C1328u.class.hashCode() * 31);
    }
}

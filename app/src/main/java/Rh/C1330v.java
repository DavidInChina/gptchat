package Rh;

/* renamed from: Rh.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1330v implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1332w f15951Y;

    public C1330v(C1332w c1332w) {
        this.f15951Y = c1332w;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15951Y.f15958k0 = abstractC1337y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1330v.class != obj.getClass()) {
            return false;
        }
        if (this.f15951Y.equals(((C1330v) obj).f15951Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15951Y.hashCode() + (C1330v.class.hashCode() * 31);
    }
}

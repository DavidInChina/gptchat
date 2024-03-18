package Rh;

/* renamed from: Rh.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1326t implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1332w f15944Y;

    public C1326t(C1332w c1332w) {
        this.f15944Y = c1332w;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15944Y.f15957j0.add(abstractC1337y0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1326t.class != obj.getClass()) {
            return false;
        }
        if (this.f15944Y.equals(((C1326t) obj).f15944Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15944Y.hashCode() + (C1326t.class.hashCode() * 31);
    }
}

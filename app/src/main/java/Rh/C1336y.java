package Rh;

/* renamed from: Rh.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1336y implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1338z f15962Y;

    public C1336y(C1338z c1338z) {
        this.f15962Y = c1338z;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15962Y.f15964j0 = abstractC1337y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1336y.class != obj.getClass()) {
            return false;
        }
        if (this.f15962Y.equals(((C1336y) obj).f15962Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15962Y.hashCode() + (C1336y.class.hashCode() * 31);
    }
}

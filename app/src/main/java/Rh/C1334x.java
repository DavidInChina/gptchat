package Rh;

/* renamed from: Rh.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1334x implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1338z f15961Y;

    public C1334x(C1338z c1338z) {
        this.f15961Y = c1338z;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15961Y.f15963i0.add(abstractC1337y0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1334x.class != obj.getClass()) {
            return false;
        }
        if (this.f15961Y.equals(((C1334x) obj).f15961Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15961Y.hashCode() + (C1334x.class.hashCode() * 31);
    }
}

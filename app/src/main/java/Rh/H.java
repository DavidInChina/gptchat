package Rh;

import th.AbstractC5802j;

/* loaded from: classes2.dex */
public final class H implements J {

    /* renamed from: a  reason: collision with root package name */
    public final String f15628a;

    public H(String str) {
        this.f15628a = str;
    }

    @Override // Rh.J
    public final AbstractC5802j a() {
        throw new IllegalStateException("Annotation type is not available: " + this.f15628a);
    }

    @Override // Rh.J
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        if (this.f15628a.equals(((H) obj).f15628a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15628a.hashCode() + (H.class.hashCode() * 31);
    }
}

package Ng;

/* loaded from: classes.dex */
public final class V implements AbstractC1063g0 {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f12912Y;

    public V(boolean z10) {
        this.f12912Y = z10;
    }

    @Override // Ng.AbstractC1063g0
    public final boolean a() {
        return this.f12912Y;
    }

    @Override // Ng.AbstractC1063g0
    public final y0 e() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f12912Y) {
            str = "Active";
        } else {
            str = "New";
        }
        return android.gov.nist.core.a.n(sb2, str, '}');
    }
}

package D4;

import A.AbstractC0044t0;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3370a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3371b;

    public g(String str, int i10, boolean z10) {
        this.f3370a = i10;
        this.f3371b = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        if (!lVar.f47216n0) {
            I4.b.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new x4.k(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + AbstractC0044t0.L(this.f3370a) + '}';
    }
}

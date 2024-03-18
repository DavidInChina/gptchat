package D4;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import v4.C5971a;
import x4.q;

/* loaded from: classes2.dex */
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3399a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3400b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.a f3401c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3402d;

    public n(String str, int i10, C4.a aVar, boolean z10) {
        this.f3399a = str;
        this.f3400b = i10;
        this.f3401c = aVar;
        this.f3402d = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new q(lVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f3399a);
        sb2.append(", index=");
        return AbstractC2469q0.j(sb2, this.f3400b, '}');
    }
}

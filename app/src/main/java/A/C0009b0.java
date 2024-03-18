package A;

import G0.AbstractC0579h;
import G0.AbstractC0585n;
import l0.AbstractC4325q;

/* renamed from: A.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009b0 extends AbstractC4325q implements AbstractC0585n, G0.j0 {

    /* renamed from: s0  reason: collision with root package name */
    public G.M f172s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f173t0;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // G0.j0
    public final void X() {
        ?? obj = new Object();
        AbstractC0579h.y(this, new C0007a0(obj, 0, this));
        G.M m10 = (G.M) obj.f37622Y;
        if (this.f173t0) {
            G.M m11 = this.f172s0;
            if (m11 != null) {
                m11.b();
            }
            if (m10 != null) {
                m10.a();
            } else {
                m10 = null;
            }
            this.f172s0 = m10;
        }
    }

    @Override // l0.AbstractC4325q
    public final void v0() {
        G.M m10 = this.f172s0;
        if (m10 != null) {
            m10.b();
        }
        this.f172s0 = null;
    }
}

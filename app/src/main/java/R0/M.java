package r0;

import A.AbstractC0044t0;
import A.C0043t;
import E0.AbstractC0459s;
import E0.d0;
import l0.AbstractC4325q;
import w.C6077x;

/* loaded from: classes2.dex */
public final class M extends AbstractC4325q implements G0.C {

    /* renamed from: A0  reason: collision with root package name */
    public float f44206A0;

    /* renamed from: B0  reason: collision with root package name */
    public float f44207B0;

    /* renamed from: C0  reason: collision with root package name */
    public long f44208C0;

    /* renamed from: D0  reason: collision with root package name */
    public L f44209D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f44210E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f44211F0;

    /* renamed from: G0  reason: collision with root package name */
    public long f44212G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f44213H0;

    /* renamed from: I0  reason: collision with root package name */
    public C6077x f44214I0;

    /* renamed from: s0  reason: collision with root package name */
    public float f44215s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f44216t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f44217u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f44218v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f44219w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f44220x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f44221y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f44222z0;

    @Override // G0.C
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.d(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.e(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        d0 o10 = m10.o(j6);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new C0043t(o10, 17, this));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }

    @Override // l0.AbstractC4325q
    public final boolean q0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f44215s0);
        sb2.append(", scaleY=");
        sb2.append(this.f44216t0);
        sb2.append(", alpha = ");
        sb2.append(this.f44217u0);
        sb2.append(", translationX=");
        sb2.append(this.f44218v0);
        sb2.append(", translationY=");
        sb2.append(this.f44219w0);
        sb2.append(", shadowElevation=");
        sb2.append(this.f44220x0);
        sb2.append(", rotationX=");
        sb2.append(this.f44221y0);
        sb2.append(", rotationY=");
        sb2.append(this.f44222z0);
        sb2.append(", rotationZ=");
        sb2.append(this.f44206A0);
        sb2.append(", cameraDistance=");
        sb2.append(this.f44207B0);
        sb2.append(", transformOrigin=");
        sb2.append((Object) P.c(this.f44208C0));
        sb2.append(", shape=");
        sb2.append(this.f44209D0);
        sb2.append(", clip=");
        sb2.append(this.f44210E0);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0044t0.B(this.f44211F0, sb2, ", spotShadowColor=");
        AbstractC0044t0.B(this.f44212G0, sb2, ", compositingStrategy=");
        int i10 = this.f44213H0;
        sb2.append((Object) ("CompositingStrategy(value=" + i10 + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}

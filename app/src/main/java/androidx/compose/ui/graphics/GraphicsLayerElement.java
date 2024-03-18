package androidx.compose.ui.graphics;

import A.AbstractC0044t0;
import G0.AbstractC0579h;
import G0.X;
import G0.g0;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import r0.G;
import r0.L;
import r0.M;
import r0.P;
import r0.r;
import w.C6077x;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LG0/X;", "Lr0/M;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class GraphicsLayerElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final float f24795b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24796c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24797d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24798e;

    /* renamed from: f  reason: collision with root package name */
    public final float f24799f;

    /* renamed from: g  reason: collision with root package name */
    public final float f24800g;

    /* renamed from: h  reason: collision with root package name */
    public final float f24801h;

    /* renamed from: i  reason: collision with root package name */
    public final float f24802i;

    /* renamed from: j  reason: collision with root package name */
    public final float f24803j;

    /* renamed from: k  reason: collision with root package name */
    public final float f24804k;

    /* renamed from: l  reason: collision with root package name */
    public final long f24805l;

    /* renamed from: m  reason: collision with root package name */
    public final L f24806m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f24807n;

    /* renamed from: o  reason: collision with root package name */
    public final long f24808o;

    /* renamed from: p  reason: collision with root package name */
    public final long f24809p;

    /* renamed from: q  reason: collision with root package name */
    public final int f24810q;

    public GraphicsLayerElement(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, L l10, boolean z10, long j10, long j11, int i10) {
        this.f24795b = f6;
        this.f24796c = f10;
        this.f24797d = f11;
        this.f24798e = f12;
        this.f24799f = f13;
        this.f24800g = f14;
        this.f24801h = f15;
        this.f24802i = f16;
        this.f24803j = f17;
        this.f24804k = f18;
        this.f24805l = j6;
        this.f24806m = l10;
        this.f24807n = z10;
        this.f24808o = j10;
        this.f24809p = j11;
        this.f24810q = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.f24795b, graphicsLayerElement.f24795b) != 0 || Float.compare(this.f24796c, graphicsLayerElement.f24796c) != 0 || Float.compare(this.f24797d, graphicsLayerElement.f24797d) != 0 || Float.compare(this.f24798e, graphicsLayerElement.f24798e) != 0 || Float.compare(this.f24799f, graphicsLayerElement.f24799f) != 0 || Float.compare(this.f24800g, graphicsLayerElement.f24800g) != 0 || Float.compare(this.f24801h, graphicsLayerElement.f24801h) != 0 || Float.compare(this.f24802i, graphicsLayerElement.f24802i) != 0 || Float.compare(this.f24803j, graphicsLayerElement.f24803j) != 0 || Float.compare(this.f24804k, graphicsLayerElement.f24804k) != 0) {
            return false;
        }
        int i10 = P.f44226c;
        if (this.f24805l == graphicsLayerElement.f24805l && AbstractC3557B.K(this.f24806m, graphicsLayerElement.f24806m) && this.f24807n == graphicsLayerElement.f24807n && AbstractC3557B.K(null, null) && r.c(this.f24808o, graphicsLayerElement.f24808o) && r.c(this.f24809p, graphicsLayerElement.f24809p) && G.c(this.f24810q, graphicsLayerElement.f24810q)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f24804k, AbstractC6463a.e(this.f24803j, AbstractC6463a.e(this.f24802i, AbstractC6463a.e(this.f24801h, AbstractC6463a.e(this.f24800g, AbstractC6463a.e(this.f24799f, AbstractC6463a.e(this.f24798e, AbstractC6463a.e(this.f24797d, AbstractC6463a.e(this.f24796c, Float.floatToIntBits(this.f24795b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i11 = P.f44226c;
        long j6 = this.f24805l;
        int hashCode = (this.f24806m.hashCode() + ((((int) (j6 ^ (j6 >>> 32))) + e10) * 31)) * 31;
        if (this.f24807n) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = r.f44264l;
        return R.a.n(this.f24809p, R.a.n(this.f24808o, (hashCode + i10) * 961, 31), 31) + this.f24810q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, r0.M, java.lang.Object] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f44215s0 = this.f24795b;
        abstractC4325q.f44216t0 = this.f24796c;
        abstractC4325q.f44217u0 = this.f24797d;
        abstractC4325q.f44218v0 = this.f24798e;
        abstractC4325q.f44219w0 = this.f24799f;
        abstractC4325q.f44220x0 = this.f24800g;
        abstractC4325q.f44221y0 = this.f24801h;
        abstractC4325q.f44222z0 = this.f24802i;
        abstractC4325q.f44206A0 = this.f24803j;
        abstractC4325q.f44207B0 = this.f24804k;
        abstractC4325q.f44208C0 = this.f24805l;
        abstractC4325q.f44209D0 = this.f24806m;
        abstractC4325q.f44210E0 = this.f24807n;
        abstractC4325q.f44211F0 = this.f24808o;
        abstractC4325q.f44212G0 = this.f24809p;
        abstractC4325q.f44213H0 = this.f24810q;
        abstractC4325q.f44214I0 = new C6077x(25, abstractC4325q);
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        M m10 = (M) abstractC4325q;
        m10.f44215s0 = this.f24795b;
        m10.f44216t0 = this.f24796c;
        m10.f44217u0 = this.f24797d;
        m10.f44218v0 = this.f24798e;
        m10.f44219w0 = this.f24799f;
        m10.f44220x0 = this.f24800g;
        m10.f44221y0 = this.f24801h;
        m10.f44222z0 = this.f24802i;
        m10.f44206A0 = this.f24803j;
        m10.f44207B0 = this.f24804k;
        m10.f44208C0 = this.f24805l;
        m10.f44209D0 = this.f24806m;
        m10.f44210E0 = this.f24807n;
        m10.f44211F0 = this.f24808o;
        m10.f44212G0 = this.f24809p;
        m10.f44213H0 = this.f24810q;
        g0 g0Var = AbstractC0579h.z(m10, 2).f5771o0;
        if (g0Var != null) {
            g0Var.Y0(m10.f44214I0, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f24795b);
        sb2.append(", scaleY=");
        sb2.append(this.f24796c);
        sb2.append(", alpha=");
        sb2.append(this.f24797d);
        sb2.append(", translationX=");
        sb2.append(this.f24798e);
        sb2.append(", translationY=");
        sb2.append(this.f24799f);
        sb2.append(", shadowElevation=");
        sb2.append(this.f24800g);
        sb2.append(", rotationX=");
        sb2.append(this.f24801h);
        sb2.append(", rotationY=");
        sb2.append(this.f24802i);
        sb2.append(", rotationZ=");
        sb2.append(this.f24803j);
        sb2.append(", cameraDistance=");
        sb2.append(this.f24804k);
        sb2.append(", transformOrigin=");
        sb2.append((Object) P.c(this.f24805l));
        sb2.append(", shape=");
        sb2.append(this.f24806m);
        sb2.append(", clip=");
        sb2.append(this.f24807n);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0044t0.B(this.f24808o, sb2, ", spotShadowColor=");
        sb2.append((Object) r.i(this.f24809p));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f24810q + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}

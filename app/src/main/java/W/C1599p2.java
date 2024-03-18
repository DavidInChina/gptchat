package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: W.p2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1599p2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1608r2 f20288Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f20289Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f20290h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D.l f20291i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N3 f20292j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20293k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ float f20294l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f20295m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f20296n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f20297o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599p2(C1608r2 c1608r2, boolean z10, boolean z11, D.l lVar, N3 n32, r0.L l10, float f6, float f10, int i10, int i11) {
        super(2);
        this.f20288Y = c1608r2;
        this.f20289Z = z10;
        this.f20290h0 = z11;
        this.f20291i0 = lVar;
        this.f20292j0 = n32;
        this.f20293k0 = l10;
        this.f20294l0 = f6;
        this.f20295m0 = f10;
        this.f20296n0 = i10;
        this.f20297o0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f20296n0 | 1);
        float f6 = this.f20294l0;
        float f10 = this.f20295m0;
        this.f20288Y.a(this.f20289Z, this.f20290h0, this.f20291i0, this.f20292j0, this.f20293k0, f6, f10, (AbstractC1725n) obj, p10, this.f20297o0);
        return jf.y.f36177a;
    }
}

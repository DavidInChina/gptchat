package W;

import A.C0051x;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: W.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1606r0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20365Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f20366Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f20367h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f20368i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20369j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C1572k0 f20370k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C1597p0 f20371l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C0051x f20372m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E.g0 f20373n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ D.m f20374o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.o f20375p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ int f20376q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ int f20377r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1606r0(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, C1572k0 c1572k0, C1597p0 c1597p0, C0051x c0051x, E.g0 g0Var, D.m mVar, wf.o oVar, int i10, int i11, int i12) {
        super(2);
        this.f20365Y = i12;
        this.f20366Z = abstractC6216a;
        this.f20367h0 = abstractC4326r;
        this.f20368i0 = z10;
        this.f20369j0 = l10;
        this.f20370k0 = c1572k0;
        this.f20371l0 = c1597p0;
        this.f20372m0 = c0051x;
        this.f20373n0 = g0Var;
        this.f20374o0 = mVar;
        this.f20375p0 = oVar;
        this.f20376q0 = i10;
        this.f20377r0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20365Y;
        int i12 = this.f20376q0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                Ng.H.a(this.f20366Z, this.f20367h0, this.f20368i0, this.f20369j0, this.f20370k0, this.f20371l0, this.f20372m0, this.f20373n0, this.f20374o0, this.f20375p0, abstractC1725n, p10, this.f20377r0);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                Ng.H.d(this.f20366Z, this.f20367h0, this.f20368i0, this.f20369j0, this.f20370k0, this.f20371l0, this.f20372m0, this.f20373n0, this.f20374o0, this.f20375p0, abstractC1725n, p11, this.f20377r0);
                return;
            default:
                int p12 = AbstractC1734s.p(i12 | 1);
                Ng.H.f(this.f20366Z, this.f20367h0, this.f20368i0, this.f20369j0, this.f20370k0, this.f20371l0, this.f20372m0, this.f20373n0, this.f20374o0, this.f20375p0, abstractC1725n, p12, this.f20377r0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20365Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

package H;

import B.W0;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6672Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ G.J f6673Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f6674h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ t f6675i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f6676j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ W0 f6677k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4311c f6678l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4312d f6679m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ boolean f6680n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f6681o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(G.J j6, long j10, t tVar, long j11, W0 w02, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d, boolean z10, int i10, int i11) {
        super(1);
        this.f6672Y = i11;
        this.f6673Z = j6;
        this.f6674h0 = j10;
        this.f6675i0 = tVar;
        this.f6676j0 = j11;
        this.f6677k0 = w02;
        this.f6678l0 = abstractC4311c;
        this.f6679m0 = abstractC4312d;
        this.f6680n0 = z10;
        this.f6681o0 = i10;
    }

    public final C0659h a(int i10) {
        switch (this.f6672Y) {
            case 0:
                G.J j6 = this.f6673Z;
                Z0.l layoutDirection = ((G.K) j6).f5435Z.getLayoutDirection();
                return AbstractC4828h.J(j6, i10, this.f6674h0, this.f6675i0, this.f6676j0, this.f6677k0, this.f6678l0, this.f6679m0, layoutDirection, this.f6680n0, this.f6681o0);
            default:
                G.J j10 = this.f6673Z;
                Z0.l layoutDirection2 = ((G.K) j10).f5435Z.getLayoutDirection();
                return AbstractC4828h.J(j10, i10, this.f6674h0, this.f6675i0, this.f6676j0, this.f6677k0, this.f6678l0, this.f6679m0, layoutDirection2, this.f6680n0, this.f6681o0);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f6672Y) {
            case 0:
                return a(((Number) obj).intValue());
            default:
                return a(((Number) obj).intValue());
        }
    }
}

package pc;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class P extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final P f42934Z = new P(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final P f42935h0 = new P(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final P f42936i0 = new P(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final P f42937j0 = new P(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final P f42938k0 = new P(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42939Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i10) {
        super(1);
        this.f42939Y = i10;
    }

    public final m0 a(l0 l0Var) {
        switch (this.f42939Y) {
            case 3:
                AbstractC3557B.c0("$this$setStateIfLoaded", l0Var);
                return l0.e(l0Var, null, null, 13);
            default:
                AbstractC3557B.c0("$this$setStateIfLoaded", l0Var);
                return l0.e(l0Var, null, null, 9);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f42939Y) {
            case 0:
                C5129h c5129h = (C5129h) obj;
                AbstractC3557B.c0("it", c5129h);
                return c5129h.f42992a;
            case 1:
                return null;
            case 2:
                AbstractC3557B.c0("$this$setState", (m0) obj);
                return k0.f43004a;
            case 3:
                return a((l0) obj);
            default:
                return a((l0) obj);
        }
    }
}

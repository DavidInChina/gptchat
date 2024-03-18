package G9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import jf.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2334C f6140Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Sc.n f6141Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Ba.c f6142h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f6143i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f6144j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6145k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6146l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f6147m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C2334C c2334c, Sc.n nVar, Ba.c cVar, wf.k kVar, wf.k kVar2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, int i10) {
        super(2);
        this.f6140Y = c2334c;
        this.f6141Z = nVar;
        this.f6142h0 = cVar;
        this.f6143i0 = kVar;
        this.f6144j0 = kVar2;
        this.f6145k0 = abstractC6216a;
        this.f6146l0 = abstractC6216a2;
        this.f6147m0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f6147m0 | 1);
        AbstractC6216a abstractC6216a = this.f6145k0;
        AbstractC6216a abstractC6216a2 = this.f6146l0;
        A7.b.q(this.f6140Y, this.f6141Z, this.f6142h0, this.f6143i0, this.f6144j0, abstractC6216a, abstractC6216a2, (AbstractC1725n) obj, p10);
        return y.f36177a;
    }
}

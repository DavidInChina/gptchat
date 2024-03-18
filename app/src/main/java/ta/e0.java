package ta;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ T0.z f45937Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f45938Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f45939h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45940i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45941j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f45942k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i10, T0.z zVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, wf.k kVar, boolean z10) {
        super(2);
        this.f45937Y = zVar;
        this.f45938Z = kVar;
        this.f45939h0 = z10;
        this.f45940i0 = abstractC6216a;
        this.f45941j0 = abstractC6216a2;
        this.f45942k0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f45942k0 | 1);
        AbstractC6216a abstractC6216a = this.f45940i0;
        AbstractC6216a abstractC6216a2 = this.f45941j0;
        Bi.c.A(this.f45937Y, this.f45938Z, this.f45939h0, abstractC6216a, abstractC6216a2, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}

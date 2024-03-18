package A;

import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f18Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f19Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L0.g f20h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f21i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f22j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f23k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f24l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(L0.g gVar, String str, String str2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, boolean z10) {
        super(3);
        this.f18Y = z10;
        this.f19Z = str;
        this.f20h0 = gVar;
        this.f21i0 = str2;
        this.f22j0 = abstractC6216a;
        this.f23k0 = abstractC6216a2;
        this.f24l0 = abstractC6216a3;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
        ((Number) obj3).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
        rVar.W(1969174843);
        C4323o c4323o = C4323o.f37719b;
        AbstractC0040r0 abstractC0040r0 = (AbstractC0040r0) rVar.m(AbstractC0048v0.f314a);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
            K10 = kotlin.jvm.internal.m.d();
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC4326r i10 = androidx.compose.foundation.a.i(c4323o, (D.m) K10, abstractC0040r0, this.f18Y, this.f19Z, this.f20h0, this.f21i0, this.f22j0, this.f23k0, this.f24l0);
        rVar.t(false);
        return i10;
    }
}

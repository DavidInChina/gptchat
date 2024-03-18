package ic;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g0 f33026Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33027Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g0 f33028h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33029i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33028h0 = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33027Z = obj;
        this.f33029i0 |= Integer.MIN_VALUE;
        return g0.p(this.f33028h0, null, this);
    }
}

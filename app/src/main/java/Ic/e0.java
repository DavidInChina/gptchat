package ic;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g0 f33019Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33020Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g0 f33021h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33022i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33021h0 = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33020Z = obj;
        this.f33022i0 |= Integer.MIN_VALUE;
        return g0.o(this.f33021h0, this);
    }
}

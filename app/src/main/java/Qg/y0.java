package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class y0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14951Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N.W f14952Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14953h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(N.W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14952Z = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14951Y = obj;
        this.f14953h0 |= Integer.MIN_VALUE;
        return this.f14952Z.a(0, this);
    }
}

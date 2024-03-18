package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class A1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39701Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39702Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f39703h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39703h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39701Y = obj;
        this.f39702Z |= Integer.MIN_VALUE;
        return this.f39703h0.c(null, this);
    }
}

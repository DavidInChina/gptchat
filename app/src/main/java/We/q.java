package We;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f21045Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f21046Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f21047h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f21047h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f21045Y = obj;
        this.f21046Z |= Integer.MIN_VALUE;
        return this.f21047h0.c(null, this);
    }
}

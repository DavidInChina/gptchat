package De;

import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3585Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3586Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f3587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ce.c f3588i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Ce.c cVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3588i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3585Y = obj;
        this.f3586Z |= Integer.MIN_VALUE;
        return this.f3588i0.c(null, this);
    }
}

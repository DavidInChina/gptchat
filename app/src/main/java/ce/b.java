package Ce;

import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3077Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3078Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f3079h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ c f3080i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3080i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3077Y = obj;
        this.f3078Z |= Integer.MIN_VALUE;
        return this.f3080i0.c(null, this);
    }
}

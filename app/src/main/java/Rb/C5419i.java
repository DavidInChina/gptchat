package rb;

import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5419i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44694Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44695Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f44696h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ y.F f44697i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5419i(y.F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44697i0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44694Y = obj;
        this.f44695Z |= Integer.MIN_VALUE;
        return this.f44697i0.c(null, this);
    }
}

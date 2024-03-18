package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class z1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f40161Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f40162Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f40163h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40163h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40161Y = obj;
        this.f40162Z |= Integer.MIN_VALUE;
        return this.f40163h0.c(null, this);
    }
}

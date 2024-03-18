package bb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class D0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f25702Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f25703Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f25704h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25704h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25702Y = obj;
        this.f25703Z |= Integer.MIN_VALUE;
        return this.f25704h0.c(null, this);
    }
}

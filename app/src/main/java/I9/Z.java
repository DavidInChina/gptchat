package I9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class Z extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8260Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f8262h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8262h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8260Y = obj;
        this.f8261Z |= Integer.MIN_VALUE;
        return this.f8262h0.c(null, this);
    }
}

package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class A0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18608Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18609Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18610h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(E0 e02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18609Z = e02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18608Y = obj;
        this.f18610h0 |= Integer.MIN_VALUE;
        return this.f18609Z.p(null, null, null, this);
    }
}

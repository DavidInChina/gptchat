package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class W0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f11863Y;

    /* renamed from: Z  reason: collision with root package name */
    public X0 f11864Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f11865h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ X0 f11866i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11867j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(X0 x02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11866i0 = x02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11865h0 = obj;
        this.f11867j0 |= Integer.MIN_VALUE;
        return X0.n(this.f11866i0, this);
    }
}

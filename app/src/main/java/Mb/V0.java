package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class V0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public X0 f11858Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11859Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X0 f11860h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11861i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(X0 x02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11860h0 = x02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11859Z = obj;
        this.f11861i0 |= Integer.MIN_VALUE;
        return X0.m(this.f11860h0, this);
    }
}

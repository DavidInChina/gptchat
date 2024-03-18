package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class N extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public S f11816Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11817Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ S f11818h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11819i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11818h0 = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11817Z = obj;
        this.f11819i0 |= Integer.MIN_VALUE;
        return S.n(this.f11818h0, this);
    }
}

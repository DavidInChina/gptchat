package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class Q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14783Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f14784Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14785h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14784Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14783Y = obj;
        this.f14785h0 |= Integer.MIN_VALUE;
        return this.f14784Z.c(null, this);
    }
}

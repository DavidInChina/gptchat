package Ia;

import N.W;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8511Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8512Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f8513h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8513h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8511Y = obj;
        this.f8512Z |= Integer.MIN_VALUE;
        return this.f8513h0.c(null, this);
    }
}

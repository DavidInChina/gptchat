package Cb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class P extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f2901Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2902h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2901Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2900Y = obj;
        this.f2902h0 |= Integer.MIN_VALUE;
        return this.f2901Z.d(this);
    }
}

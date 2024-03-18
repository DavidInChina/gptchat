package Rg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class r extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f15568Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s f15569Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f15570h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f15569Z = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f15568Y = obj;
        this.f15570h0 |= Integer.MIN_VALUE;
        return this.f15569Z.c(null, this);
    }
}

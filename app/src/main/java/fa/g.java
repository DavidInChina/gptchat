package Fa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5131Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f5132Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f5133h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5132Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5131Y = obj;
        this.f5133h0 |= Integer.MIN_VALUE;
        return this.f5132Z.g(null, null, this);
    }
}

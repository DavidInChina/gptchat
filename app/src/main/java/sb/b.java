package Sb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f16485Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f16486Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f16487h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16488i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f16487h0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f16486Z = obj;
        this.f16488i0 |= Integer.MIN_VALUE;
        return g.m(this.f16487h0, null, this);
    }
}

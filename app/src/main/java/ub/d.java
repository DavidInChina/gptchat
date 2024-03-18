package Ub;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public e f17597Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17598Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e f17599h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17600i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17599h0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17598Z = obj;
        this.f17600i0 |= Integer.MIN_VALUE;
        return this.f17599h0.f(this);
    }
}

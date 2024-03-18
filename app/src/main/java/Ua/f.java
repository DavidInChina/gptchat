package Ua;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f17582Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17583Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f17584h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17585i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17584h0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17583Z = obj;
        this.f17585i0 |= Integer.MIN_VALUE;
        return this.f17584h0.a(this);
    }
}

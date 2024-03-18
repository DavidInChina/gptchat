package Fc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5202Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f5203Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f5204h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5203Z = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5202Y = obj;
        this.f5204h0 |= Integer.MIN_VALUE;
        return this.f5203Z.i(this);
    }
}

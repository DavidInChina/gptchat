package V;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public p f17936Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17937Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f17938h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17939i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17938h0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17937Z = obj;
        this.f17939i0 |= Integer.MIN_VALUE;
        return this.f17938h0.a(this);
    }
}

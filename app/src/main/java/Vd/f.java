package Vd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f18591Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC6216a f18592Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18593h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f18594i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f18595j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18594i0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18593h0 = obj;
        this.f18595j0 |= Integer.MIN_VALUE;
        return this.f18594i0.d(null, this);
    }
}

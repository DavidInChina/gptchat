package b9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f25669Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f25670Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25671h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25670Z = oVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25669Y = obj;
        this.f25671h0 |= Integer.MIN_VALUE;
        return this.f25670Z.a(this);
    }
}

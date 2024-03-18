package n9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public n f39689Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39690Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ n f39691h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39692i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39691h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39690Z = obj;
        this.f39692i0 |= Integer.MIN_VALUE;
        return this.f39691h0.e(null, this);
    }
}

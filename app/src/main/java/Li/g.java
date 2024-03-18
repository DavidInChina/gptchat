package Li;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11220Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11221Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f11222h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11222h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11220Y = obj;
        this.f11221Z |= Integer.MIN_VALUE;
        return this.f11222h0.a(null, this);
    }
}

package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class x0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18916Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18917Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18918h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(E0 e02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18917Z = e02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18916Y = obj;
        this.f18918h0 |= Integer.MIN_VALUE;
        return this.f18917Z.n(null, null, null, null, this);
    }
}

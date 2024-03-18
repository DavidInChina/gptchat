package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f1248Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1249Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1250h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1249Z = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1248Y = obj;
        this.f1250h0 |= Integer.MIN_VALUE;
        return this.f1249Z.y(this);
    }
}

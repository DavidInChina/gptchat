package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class u1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public B1 f40124Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f40125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f40126h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f40127i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(B1 b1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40126h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40125Z = obj;
        this.f40127i0 |= Integer.MIN_VALUE;
        return B1.p(this.f40126h0, null, this);
    }
}

package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: na.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4743c1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public B1 f39939Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39940Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f39941h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39942i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4743c1(B1 b1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39941h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39940Z = obj;
        this.f39942i0 |= Integer.MIN_VALUE;
        return B1.m(this.f39941h0, this);
    }
}

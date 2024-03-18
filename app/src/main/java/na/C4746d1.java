package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: na.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4746d1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public B1 f39965Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39966Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f39967h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39968i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4746d1(B1 b1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39967h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39966Z = obj;
        this.f39968i0 |= Integer.MIN_VALUE;
        return B1.n(this.f39967h0, this);
    }
}

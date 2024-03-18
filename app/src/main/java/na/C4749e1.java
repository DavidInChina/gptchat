package na;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: na.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4749e1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public B1 f39971Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39972Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f39973h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39974i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4749e1(B1 b1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39973h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39972Z = obj;
        this.f39974i0 |= Integer.MIN_VALUE;
        return B1.o(this.f39973h0, this);
    }
}

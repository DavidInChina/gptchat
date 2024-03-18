package W;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: W.h1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558h1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1563i1 f20110Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f20111Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f20112h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1563i1 f20113i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f20114j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558h1(C1563i1 c1563i1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20113i0 = c1563i1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20112h0 = obj;
        this.f20114j0 |= Integer.MIN_VALUE;
        return this.f20113i0.l(0L, 0L, this);
    }
}

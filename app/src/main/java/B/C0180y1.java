package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.y1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180y1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public A1 f1564Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1565Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A1 f1566h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1567i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180y1(A1 a12, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1566h0 = a12;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1565Z = obj;
        this.f1567i0 |= Integer.MIN_VALUE;
        return this.f1566h0.c(0L, this);
    }
}

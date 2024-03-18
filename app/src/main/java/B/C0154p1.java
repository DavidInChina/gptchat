package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0154p1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0157q1 f1452Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f1453Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1454h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0157q1 f1455i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1456j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154p1(C0157q1 c0157q1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1455i0 = c0157q1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1454h0 = obj;
        this.f1456j0 |= Integer.MIN_VALUE;
        return this.f1455i0.l(0L, 0L, this);
    }
}

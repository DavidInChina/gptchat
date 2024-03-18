package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112b1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0115c1 f1272Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1273Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1274h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1275i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112b1(C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1274h0 = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1273Z = obj;
        this.f1275i0 |= Integer.MIN_VALUE;
        return this.f1274h0.k0(this);
    }
}

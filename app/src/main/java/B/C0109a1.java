package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109a1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0115c1 f1258Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1259Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1260h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1261i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109a1(C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1260h0 = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1259Z = obj;
        this.f1261i0 |= Integer.MIN_VALUE;
        return this.f1260h0.a(this);
    }
}

package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172w extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public H f1542Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1543Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f1544h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1545i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172w(H h10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1544h0 = h10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1543Z = obj;
        this.f1545i0 |= Integer.MIN_VALUE;
        return this.f1544h0.a(null, null, this);
    }
}

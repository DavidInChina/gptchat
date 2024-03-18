package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181z extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public H f1568Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1569Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f1570h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1571i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181z(H h10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1570h0 = h10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1569Z = obj;
        this.f1571i0 |= Integer.MIN_VALUE;
        return this.f1570h0.b(null, null, null, this);
    }
}

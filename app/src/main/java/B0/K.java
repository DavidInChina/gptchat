package B0;

import Ng.D0;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class K extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public D0 f1600Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1601Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N f1602h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1603i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1602h0 = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1601Z = obj;
        this.f1603i0 |= Integer.MIN_VALUE;
        return this.f1602h0.f(0L, null, this);
    }
}

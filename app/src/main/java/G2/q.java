package g2;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public D5.a f31124Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f31125Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31126h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D5.a f31127i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f31128j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D5.a aVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31127i0 = aVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31126h0 = obj;
        this.f31128j0 |= Integer.MIN_VALUE;
        return this.f31127i0.d(null, null, this);
    }
}

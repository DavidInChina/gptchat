package bb;

import cb.C2350T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class C0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f25688Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2350T f25689Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f25690h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F0 f25691i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f25692j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(F0 f02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25691i0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25690h0 = obj;
        this.f25692j0 |= Integer.MIN_VALUE;
        return F0.p(this.f25691i0, null, this);
    }
}

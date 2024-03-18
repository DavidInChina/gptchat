package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class C extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14721Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14722Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D f14723h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f14724i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC1207j f14725j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14723h0 = d10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14721Y = obj;
        this.f14722Z |= Integer.MIN_VALUE;
        return this.f14723h0.b(null, this);
    }
}

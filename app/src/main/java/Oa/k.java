package oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f41120Y;

    /* renamed from: Z  reason: collision with root package name */
    public Vc.q f41121Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41122h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41123i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f41124j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41123i0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41122h0 = obj;
        this.f41124j0 |= Integer.MIN_VALUE;
        return C4972C.a(this.f41123i0, null, this);
    }
}

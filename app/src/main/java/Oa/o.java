package oa;

import ca.C2311c;
import fa.C2969F;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4972C f41142Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2969F f41143Z;

    /* renamed from: h0  reason: collision with root package name */
    public C2311c f41144h0;

    /* renamed from: i0  reason: collision with root package name */
    public C2969F f41145i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f41146j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41147k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f41148l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41147k0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41146j0 = obj;
        this.f41148l0 |= Integer.MIN_VALUE;
        return this.f41147k0.j(null, this);
    }
}

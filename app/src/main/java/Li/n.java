package Li;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11244Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11245Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f11246h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f11247i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f11248j0;

    /* renamed from: k0  reason: collision with root package name */
    public d f11249k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11250l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11246h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11244Y = obj;
        this.f11245Z |= Integer.MIN_VALUE;
        return this.f11246h0.f(null, null, false, null, null, this);
    }
}

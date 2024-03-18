package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class z0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f12006Y;

    /* renamed from: Z  reason: collision with root package name */
    public F0 f12007Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f12008h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f12009i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ F0 f12010j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f12011k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(F0 f02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f12010j0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f12009i0 = obj;
        this.f12011k0 |= Integer.MIN_VALUE;
        return F0.m(this.f12010j0, false, this);
    }
}

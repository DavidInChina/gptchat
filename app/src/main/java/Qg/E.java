package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class E extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14730Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14731Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f14732h0;

    /* renamed from: i0  reason: collision with root package name */
    public F f14733i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC1207j f14734j0;

    /* renamed from: k0  reason: collision with root package name */
    public Rg.C f14735k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14732h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14730Y = obj;
        this.f14731Z |= Integer.MIN_VALUE;
        return this.f14732h0.b(null, this);
    }
}

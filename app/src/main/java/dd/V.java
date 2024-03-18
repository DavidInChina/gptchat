package Dd;

import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class V extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3542Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3543Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f3544h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N.W f3545i0;

    /* renamed from: j0  reason: collision with root package name */
    public Ed.h f3546j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(N.W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3545i0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3542Y = obj;
        this.f3543Z |= Integer.MIN_VALUE;
        return this.f3545i0.c(null, this);
    }
}

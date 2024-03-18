package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public StringBuilder f33516Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33517Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ t f33518h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33519i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33518h0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33517Z = obj;
        this.f33519i0 |= Integer.MIN_VALUE;
        return t.H(this.f33518h0, 0, this);
    }
}

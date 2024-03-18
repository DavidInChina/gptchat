package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f14760Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14761Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ K f14762h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14763i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14762h0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14761Z = obj;
        this.f14763i0 |= Integer.MIN_VALUE;
        return this.f14762h0.c(null, this);
    }
}

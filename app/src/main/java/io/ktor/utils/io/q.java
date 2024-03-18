package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33560Y;

    /* renamed from: Z  reason: collision with root package name */
    public Me.d f33561Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33562h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ t f33563i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33564j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33563i0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33562h0 = obj;
        this.f33564j0 |= Integer.MIN_VALUE;
        return this.f33563i0.c0(null, this);
    }
}

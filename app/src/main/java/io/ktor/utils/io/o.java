package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33548Y;

    /* renamed from: Z  reason: collision with root package name */
    public Me.a f33549Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33550h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ t f33551i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33552j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33551i0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33550h0 = obj;
        this.f33552j0 |= Integer.MIN_VALUE;
        return this.f33551i0.Z(null, this);
    }
}

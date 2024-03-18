package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class r extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33565Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f33566Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33567h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33568i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f33569j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ t f33570k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33571l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33570k0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33569j0 = obj;
        this.f33571l0 |= Integer.MIN_VALUE;
        return this.f33570k0.e0(null, 0, 0, this);
    }
}

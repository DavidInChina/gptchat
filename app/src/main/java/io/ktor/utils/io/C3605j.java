package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3605j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33481Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33482Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33483h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ t f33484i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33485j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3605j(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33484i0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33483h0 = obj;
        this.f33485j0 |= Integer.MIN_VALUE;
        return this.f33484i0.G(0, this);
    }
}

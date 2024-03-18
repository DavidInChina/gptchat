package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3597b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33390Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33391Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ t f33392h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33393i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3597b(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33392h0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33391Z = obj;
        this.f33393i0 |= Integer.MIN_VALUE;
        return this.f33392h0.e(0, null, this);
    }
}

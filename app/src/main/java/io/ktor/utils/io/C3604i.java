package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3604i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33441Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33442Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ t f33443h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33444i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3604i(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33443h0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33442Z = obj;
        this.f33444i0 |= Integer.MIN_VALUE;
        return this.f33443h0.F(0, this);
    }
}

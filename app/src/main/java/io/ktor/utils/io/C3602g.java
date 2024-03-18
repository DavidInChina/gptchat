package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3602g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33427Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f33428Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33429h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f33430i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ t f33431j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33432k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3602g(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33431j0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33430i0 = obj;
        this.f33432k0 |= Integer.MIN_VALUE;
        return this.f33431j0.B(0, null, this);
    }
}

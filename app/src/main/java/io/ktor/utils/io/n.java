package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33542Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f33543Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33544h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f33545i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ t f33546j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33547k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33546j0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33545i0 = obj;
        this.f33547k0 |= Integer.MIN_VALUE;
        return t.V(this.f33546j0, 0, null, this);
    }
}

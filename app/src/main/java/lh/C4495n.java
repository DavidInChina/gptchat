package lh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lh.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4495n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f38489Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f38490Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4496o f38491h0;

    /* renamed from: i0  reason: collision with root package name */
    public C4496o f38492i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4495n(C4496o c4496o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38491h0 = c4496o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38489Y = obj;
        this.f38490Z |= Integer.MIN_VALUE;
        return this.f38491h0.c(null, this);
    }
}

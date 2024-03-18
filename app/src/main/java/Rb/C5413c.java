package rb;

import N.W;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5413c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44672Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44673Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f44674h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5413c(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44674h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44672Y = obj;
        this.f44673Z |= Integer.MIN_VALUE;
        return this.f44674h0.c(null, this);
    }
}

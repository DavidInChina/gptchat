package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class O extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14777Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14778Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ P f14779h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f14780i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14779h0 = p10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14777Y = obj;
        this.f14778Z |= Integer.MIN_VALUE;
        return this.f14779h0.b(null, this);
    }
}

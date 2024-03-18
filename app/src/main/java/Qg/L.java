package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class L extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public M f14766Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f14767Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f14768h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ M f14769i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f14770j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14769i0 = m10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14768h0 = obj;
        this.f14770j0 |= Integer.MIN_VALUE;
        return this.f14769i0.c(null, this);
    }
}

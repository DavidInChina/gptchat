package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class V extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public W f14792Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14793Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14794h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ W f14795i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f14796j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14795i0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14793Z = obj;
        this.f14794h0 |= Integer.MIN_VALUE;
        return this.f14795i0.c(null, this);
    }
}

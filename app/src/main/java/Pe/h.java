package pe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;

/* loaded from: classes.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f43108Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6410O f43109Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f43110h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f43111i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f43112j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43111i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43110h0 = obj;
        this.f43112j0 |= Integer.MIN_VALUE;
        return this.f43111i0.h(null, this);
    }
}

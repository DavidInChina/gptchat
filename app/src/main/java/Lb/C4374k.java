package lb;

import Z8.AbstractC1819s;
import ha.C3370m;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4374k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f38019Y;

    /* renamed from: Z  reason: collision with root package name */
    public C3370m f38020Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1819s f38021h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f38022i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ K f38023j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f38024k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4374k(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38023j0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38022i0 = obj;
        this.f38024k0 |= Integer.MIN_VALUE;
        return this.f38023j0.u(null, null, null, this);
    }
}

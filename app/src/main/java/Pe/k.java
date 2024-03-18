package pe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import te.C5760d;

/* loaded from: classes.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5760d f43123Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f43124Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f43125h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f43126i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43125h0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43124Z = obj;
        this.f43126i0 |= Integer.MIN_VALUE;
        return this.f43125h0.j(null, this);
    }
}

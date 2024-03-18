package ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ve.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6042k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f47515Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6043l f47516Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f47517h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6042k(C6043l c6043l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f47516Z = c6043l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f47515Y = obj;
        this.f47517h0 |= Integer.MIN_VALUE;
        return this.f47516Z.d(this);
    }
}

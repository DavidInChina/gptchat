package ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ve.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6040i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f47508Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f47509Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f47510h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6043l f47511i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f47512j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6040i(C6043l c6043l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f47511i0 = c6043l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f47510h0 = obj;
        this.f47512j0 |= Integer.MIN_VALUE;
        return this.f47511i0.c(null, this);
    }
}

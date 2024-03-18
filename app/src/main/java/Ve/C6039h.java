package ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ve.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6039h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f47505Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6043l f47506Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f47507h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6039h(C6043l c6043l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f47506Z = c6043l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f47505Y = obj;
        this.f47507h0 |= Integer.MIN_VALUE;
        return this.f47506Z.a(null, this);
    }
}

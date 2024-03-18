package h2;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: h2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3307d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31766Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3309f f31767Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f31768h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3307d(C3309f c3309f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31767Z = c3309f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31766Y = obj;
        this.f31768h0 |= Integer.MIN_VALUE;
        return this.f31767Z.c(null, null, null, this);
    }
}

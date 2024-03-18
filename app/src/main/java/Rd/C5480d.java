package rd;

import N.W;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rd.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5480d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44950Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44951Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f44952h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5480d(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44952h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44950Y = obj;
        this.f44951Z |= Integer.MIN_VALUE;
        return this.f44952h0.c(null, this);
    }
}

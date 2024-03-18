package W;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: W.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1601q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public r f20315Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f20316Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f20317h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r f20318i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f20319j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601q(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20318i0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20317h0 = obj;
        this.f20319j0 |= Integer.MIN_VALUE;
        return this.f20318i0.c(null, this);
    }
}

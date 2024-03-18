package rb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5430t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5436z f44738Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f44739Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44740h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44741i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44742j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5430t(C5436z c5436z, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44741i0 = c5436z;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44740h0 = obj;
        this.f44742j0 |= Integer.MIN_VALUE;
        return this.f44741i0.l(null, this);
    }
}

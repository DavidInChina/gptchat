package Ab;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public c f745Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f746Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f747h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ c f748i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f749j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f748i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f747h0 = obj;
        this.f749j0 |= Integer.MIN_VALUE;
        return this.f748i0.a(false, this);
    }
}

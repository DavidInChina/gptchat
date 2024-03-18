package Li;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11223Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11224Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f11225h0;

    /* renamed from: i0  reason: collision with root package name */
    public q f11226i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f11227j0;

    /* renamed from: k0  reason: collision with root package name */
    public Object f11228k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11225h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11223Y = obj;
        this.f11224Z |= Integer.MIN_VALUE;
        return this.f11225h0.b(null, null, this);
    }
}

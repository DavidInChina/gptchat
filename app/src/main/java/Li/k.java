package Li;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11235Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11236Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f11237h0;

    /* renamed from: i0  reason: collision with root package name */
    public q f11238i0;

    /* renamed from: j0  reason: collision with root package name */
    public b f11239j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11237h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11235Y = obj;
        this.f11236Z |= Integer.MIN_VALUE;
        return this.f11237h0.d(null, this);
    }
}

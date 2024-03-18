package ke;

import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f37396Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC4831k f37397Z;

    /* renamed from: h0  reason: collision with root package name */
    public He.b f37398h0;

    /* renamed from: i0  reason: collision with root package name */
    public o f37399i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f37400j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ k f37401k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f37402l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37401k0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37400j0 = obj;
        this.f37402l0 |= Integer.MIN_VALUE;
        return this.f37401k0.m(null, null, null, this);
    }
}

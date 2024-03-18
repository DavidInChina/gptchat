package ke;

import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5156c;
import te.C5761e;

/* loaded from: classes2.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f37389Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC4831k f37390Z;

    /* renamed from: h0  reason: collision with root package name */
    public C5761e f37391h0;

    /* renamed from: i0  reason: collision with root package name */
    public He.b f37392i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f37393j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ k f37394k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f37395l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37394k0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37393j0 = obj;
        this.f37395l0 |= Integer.MIN_VALUE;
        return this.f37394k0.k(null, null, null, null, this);
    }
}

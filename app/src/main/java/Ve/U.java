package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class U extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1503i0 f18702Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f18703Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18704h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18705i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f18706j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18705i0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18704h0 = obj;
        this.f18706j0 |= Integer.MIN_VALUE;
        return this.f18705i0.g(null, null, null, null, this);
    }
}

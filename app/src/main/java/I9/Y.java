package I9;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class Y extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8253Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f8254Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8255h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8256i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8257j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8256i0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8255h0 = obj;
        this.f8257j0 |= Integer.MIN_VALUE;
        return C0758g0.q(this.f8256i0, null, null, this);
    }
}

package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class T extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1503i0 f18696Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f18697Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f18698h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f18699i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18700j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f18701k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18700j0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18699i0 = obj;
        this.f18701k0 |= Integer.MIN_VALUE;
        return this.f18700j0.e(null, this);
    }
}

package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1513s extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f18888Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18889Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18890h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18891i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513s(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18890h0 = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18889Z = obj;
        this.f18891i0 |= Integer.MIN_VALUE;
        return this.f18890h0.f(null, this);
    }
}

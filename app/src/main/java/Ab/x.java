package ab;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class x extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1945C f24135Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f24136Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f24137h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1945C f24138i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f24139j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1945C c1945c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f24138i0 = c1945c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f24137h0 = obj;
        this.f24139j0 |= Integer.MIN_VALUE;
        return C1945C.m(this.f24138i0, null, this);
    }
}

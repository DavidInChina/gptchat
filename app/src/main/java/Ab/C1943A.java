package ab;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ab.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1943A extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1945C f24050Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1963q f24051Z;

    /* renamed from: h0  reason: collision with root package name */
    public Wa.n f24052h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f24053i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1945C f24054j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f24055k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943A(C1945C c1945c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f24054j0 = c1945c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f24053i0 = obj;
        this.f24055k0 |= Integer.MIN_VALUE;
        return C1945C.n(this.f24054j0, null, this);
    }
}

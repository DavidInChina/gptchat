package Z1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1762g f22998Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22999Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1771m f23000h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f23001i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770l(C1771m c1771m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f23000h0 = c1771m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22999Z = obj;
        this.f23001i0 |= Integer.MIN_VALUE;
        return this.f23000h0.e(this);
    }
}

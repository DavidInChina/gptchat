package ta;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ta.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5713l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5715n f45965Y;

    /* renamed from: Z  reason: collision with root package name */
    public Yg.p f45966Z;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f45967h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f45968i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5715n f45969j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f45970k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5713l(C5715n c5715n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f45969j0 = c5715n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f45968i0 = obj;
        this.f45970k0 |= Integer.MIN_VALUE;
        return this.f45969j0.b(null, null, this);
    }
}

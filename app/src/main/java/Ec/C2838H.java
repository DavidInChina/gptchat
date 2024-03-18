package ec;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ec.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2838H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2847Q f29148Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29149Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29150h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f29151i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2838H(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29150h0 = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29149Z = obj;
        this.f29151i0 |= Integer.MIN_VALUE;
        return C2847Q.p(this.f29150h0, this);
    }
}

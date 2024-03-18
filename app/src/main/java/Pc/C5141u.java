package pc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: pc.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5141u extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5144x f43030Y;

    /* renamed from: Z  reason: collision with root package name */
    public C5144x f43031Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f43032h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5144x f43033i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f43034j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5141u(C5144x c5144x, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43033i0 = c5144x;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43032h0 = obj;
        this.f43034j0 |= Integer.MIN_VALUE;
        return C5144x.a(this.f43033i0, this);
    }
}

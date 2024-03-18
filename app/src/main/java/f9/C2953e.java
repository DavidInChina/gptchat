package f9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: f9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2953e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2954f f29778Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC2949a f29779Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f29780h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2954f f29781i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f29782j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953e(C2954f c2954f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29781i0 = c2954f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29780h0 = obj;
        this.f29782j0 |= Integer.MIN_VALUE;
        return C2954f.a(this.f29781i0, null, this);
    }
}

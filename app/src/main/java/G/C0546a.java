package G;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: G.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0546a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC4825e f5478Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f5479Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0547b f5480h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5481i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0546a(C0547b c0547b, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5480h0 = c0547b;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5479Z = obj;
        this.f5481i0 |= Integer.MIN_VALUE;
        return this.f5480h0.j(this);
    }
}

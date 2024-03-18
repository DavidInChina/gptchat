package I;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5252d f7915Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f7916Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f7917h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7918i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f7919j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ f f7920k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f7921l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f7920k0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f7919j0 = obj;
        this.f7921l0 |= Integer.MIN_VALUE;
        return this.f7920k0.a(null, this);
    }
}

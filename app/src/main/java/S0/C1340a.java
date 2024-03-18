package S0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: S0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1340a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1341b f15996Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC1356q f15997Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f15998h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1341b f15999i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16000j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340a(C1341b c1341b, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f15999i0 = c1341b;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f15998h0 = obj;
        this.f16000j0 |= Integer.MIN_VALUE;
        return this.f15999i0.a(null, this);
    }
}

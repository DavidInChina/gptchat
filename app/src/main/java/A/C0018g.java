package A;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: A.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0018g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0026k f201Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f202Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f203h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0026k f204i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f205j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018g(C0026k c0026k, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f204i0 = c0026k;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f203h0 = obj;
        this.f205j0 |= Integer.MIN_VALUE;
        return this.f204i0.d(0L, null, this);
    }
}

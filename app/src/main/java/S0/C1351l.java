package S0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: S0.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1351l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1352m f16033Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1350k f16034Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f16035h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f16036i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1352m f16037j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f16038k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351l(C1352m c1352m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f16037j0 = c1352m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f16036i0 = obj;
        this.f16038k0 |= Integer.MIN_VALUE;
        return this.f16037j0.c(null, null, null, this);
    }
}

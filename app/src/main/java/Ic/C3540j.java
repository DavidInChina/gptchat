package ic;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ic.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3540j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3541k f33051Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33052Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3541k f33053h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33054i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540j(C3541k c3541k, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33053h0 = c3541k;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33052Z = obj;
        this.f33054i0 |= Integer.MIN_VALUE;
        return this.f33053h0.b(this);
    }
}

package Ia;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f8487Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f8488Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8489h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f8490i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8491j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8490i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8489h0 = obj;
        this.f8491j0 |= Integer.MIN_VALUE;
        return this.f8490i0.b(null, this);
    }
}

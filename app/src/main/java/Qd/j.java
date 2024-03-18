package Qd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f14616Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14617Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ com.segment.analytics.kotlin.core.a f14618h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14619i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.segment.analytics.kotlin.core.a aVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14618h0 = aVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14617Z = obj;
        this.f14619i0 |= Integer.MIN_VALUE;
        return this.f14618h0.a(null, this);
    }
}

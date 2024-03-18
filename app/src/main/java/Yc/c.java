package Yc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import te.C5760d;

/* loaded from: classes.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5760d f22233Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22234Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f22235h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f22236i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22235h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22234Z = obj;
        this.f22236i0 |= Integer.MIN_VALUE;
        return this.f22235h0.a(null, this);
    }
}

package Lc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f10988Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f10989Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e f10990h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f10991i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f10990h0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f10989Z = obj;
        this.f10991i0 |= Integer.MIN_VALUE;
        return this.f10990h0.a(this);
    }
}

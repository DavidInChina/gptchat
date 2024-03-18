package Ia;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f8492Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8493Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f8494h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8495i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8494h0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8493Z = obj;
        this.f8495i0 |= Integer.MIN_VALUE;
        return this.f8494h0.c(this);
    }
}

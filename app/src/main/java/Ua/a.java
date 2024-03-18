package Ua;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f17572Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f17573Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f17574h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17573Z = cVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17572Y = obj;
        this.f17574h0 |= Integer.MIN_VALUE;
        return this.f17573Z.a(null, this);
    }
}

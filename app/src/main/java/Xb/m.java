package Xb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* loaded from: classes.dex */
public final class m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f21832Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f21833Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f21834h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f21834h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f21832Y = obj;
        this.f21833Z |= Integer.MIN_VALUE;
        return this.f21834h0.c(null, this);
    }
}

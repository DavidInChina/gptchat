package Ja;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public p f8943Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f8944Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8945h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p f8946i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8947j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8946i0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8945h0 = obj;
        this.f8947j0 |= Integer.MIN_VALUE;
        return p.c(this.f8946i0, null, null, null, this);
    }
}

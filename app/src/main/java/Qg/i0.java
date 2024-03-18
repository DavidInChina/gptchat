package Qg;

import nf.AbstractC4825e;
import o9.C4956d;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class i0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14859Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14860Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4956d f14861h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f14862i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC1207j f14863j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(C4956d c4956d, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14861h0 = c4956d;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14859Y = obj;
        this.f14860Z |= Integer.MIN_VALUE;
        return this.f14861h0.c(null, this);
    }
}

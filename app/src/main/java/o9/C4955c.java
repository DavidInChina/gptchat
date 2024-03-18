package o9;

import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: o9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4955c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f40986Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f40987Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f40988h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4956d f40989i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4955c(C4956d c4956d, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40989i0 = c4956d;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40986Y = obj;
        this.f40987Z |= Integer.MIN_VALUE;
        return this.f40989i0.c(null, this);
    }
}

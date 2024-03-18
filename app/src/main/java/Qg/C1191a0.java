package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191a0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1193b0 f14813Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14814Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14815h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1193b0 f14816i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f14817j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1191a0(C1193b0 c1193b0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14816i0 = c1193b0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14814Z = obj;
        this.f14815h0 |= Integer.MIN_VALUE;
        return this.f14816i0.c(null, this);
    }
}

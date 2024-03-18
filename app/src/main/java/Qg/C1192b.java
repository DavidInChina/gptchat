package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1192b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Pg.A f14818Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14819Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1194c f14820h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14821i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1192b(C1194c c1194c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14820h0 = c1194c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14819Z = obj;
        this.f14821i0 |= Integer.MIN_VALUE;
        return this.f14820h0.h(null, this);
    }
}

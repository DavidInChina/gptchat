package lh;

import Ng.C1057d0;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4483b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public z f38457Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1057d0 f38458Z;

    /* renamed from: h0  reason: collision with root package name */
    public kh.l f38459h0;

    /* renamed from: i0  reason: collision with root package name */
    public kh.c f38460i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f38461j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4484c f38462k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f38463l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4483b(C4484c c4484c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38462k0 = c4484c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38461j0 = obj;
        this.f38463l0 |= Integer.MIN_VALUE;
        return this.f38462k0.a(null, this);
    }
}

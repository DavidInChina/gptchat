package Ug;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public f f17867Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17868Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f17869h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17870i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17869h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17868Z = obj;
        this.f17870i0 |= Integer.MIN_VALUE;
        return this.f17869h0.f(this);
    }
}

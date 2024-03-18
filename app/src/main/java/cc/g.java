package cc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public i f26568Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f26569Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f26570h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f26571i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f26570h0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f26569Z = obj;
        this.f26571i0 |= Integer.MIN_VALUE;
        return this.f26570h0.m(null, this);
    }
}

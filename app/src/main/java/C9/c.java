package C9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f2752Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f2753Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f2754h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f2755i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2756j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2755i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2754h0 = obj;
        this.f2756j0 |= Integer.MIN_VALUE;
        return this.f2755i0.c(this);
    }
}

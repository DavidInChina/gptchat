package C9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2768Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f2769Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2770h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2769Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2768Y = obj;
        this.f2770h0 |= Integer.MIN_VALUE;
        return this.f2769Z.f(this);
    }
}

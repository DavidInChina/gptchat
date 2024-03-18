package sa;

import M1.v;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: sa.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5598d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f45479Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f45480Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f45481h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5598d(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f45481h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f45479Y = obj;
        this.f45480Z |= Integer.MIN_VALUE;
        return this.f45481h0.c(null, this);
    }
}

package Pa;

import M1.v;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f13898Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f13899Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f13900h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f13900h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f13898Y = obj;
        this.f13899Z |= Integer.MIN_VALUE;
        return this.f13900h0.c(null, this);
    }
}

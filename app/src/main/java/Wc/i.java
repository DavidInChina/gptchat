package Wc;

import Ii.q;
import me.T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public T f20906Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20907Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f20908h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20909i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20908h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20907Z = obj;
        this.f20909i0 |= Integer.MIN_VALUE;
        return this.f20908h0.j(null, this);
    }
}

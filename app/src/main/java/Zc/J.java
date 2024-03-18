package zc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f51836Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f51837Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51838h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f51839i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Q q10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f51838h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f51837Z = obj;
        this.f51839i0 |= Integer.MIN_VALUE;
        return Q.m(this.f51838h0, null, this);
    }
}

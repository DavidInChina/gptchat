package oa;

import fa.C2969F;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4972C f41108Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2969F f41109Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41110h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41111i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f41112j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41111i0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41110h0 = obj;
        this.f41112j0 |= Integer.MIN_VALUE;
        return this.f41111i0.e(null, this);
    }
}

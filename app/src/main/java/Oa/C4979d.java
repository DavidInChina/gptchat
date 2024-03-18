package oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: oa.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4979d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4972C f41092Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41093Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41094h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41095i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4979d(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41094h0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41093Z = obj;
        this.f41095i0 |= Integer.MIN_VALUE;
        return this.f41094h0.b(this);
    }
}

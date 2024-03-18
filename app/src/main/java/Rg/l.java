package Rg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public m f15551Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f15552Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f15553h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ m f15554i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f15555j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f15554i0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f15553h0 = obj;
        this.f15555j0 |= Integer.MIN_VALUE;
        return this.f15554i0.c(null, this);
    }
}

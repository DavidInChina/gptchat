package Kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class D extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public I f9653Y;

    /* renamed from: Z  reason: collision with root package name */
    public Dd.K f9654Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f9655h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ I f9656i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9657j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f9656i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f9655h0 = obj;
        this.f9657j0 |= Integer.MIN_VALUE;
        return this.f9656i0.f(null, this);
    }
}

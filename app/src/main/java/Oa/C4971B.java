package oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: oa.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4971B extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4972C f41041Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.n f41042Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41043h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41044i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f41045j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4971B(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41044i0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41043h0 = obj;
        this.f41045j0 |= Integer.MIN_VALUE;
        return this.f41044i0.q(null, this);
    }
}

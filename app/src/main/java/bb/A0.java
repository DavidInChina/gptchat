package bb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class A0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f25680Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f25681Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f25682h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F0 f25683i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f25684j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(F0 f02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25683i0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25682h0 = obj;
        this.f25684j0 |= Integer.MIN_VALUE;
        return F0.o(this.f25683i0, null, this);
    }
}

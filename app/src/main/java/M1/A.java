package M1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class A extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f11369Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f11370Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f11371h0;

    /* renamed from: i0  reason: collision with root package name */
    public kotlin.jvm.internal.B f11372i0;

    /* renamed from: j0  reason: collision with root package name */
    public J f11373j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f11374k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ B f11375l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f11376m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11375l0 = b10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11374k0 = obj;
        this.f11376m0 |= Integer.MIN_VALUE;
        return this.f11375l0.a(null, this);
    }
}

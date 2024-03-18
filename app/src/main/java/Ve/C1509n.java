package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1509n extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f18827Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1519y f18828Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18829h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1509n(C1519y c1519y, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18828Z = c1519y;
        this.f18829h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1509n(this.f18828Z, this.f18829h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1509n) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18827Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        if (this.f18828Z.f18926h.get()) {
            return null;
        }
        this.f18827Y = 1;
        Object invoke = this.f18829h0.invoke(this);
        if (invoke == enumC5000a) {
            return enumC5000a;
        }
        return invoke;
    }
}

package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f19847Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f19848Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C1550f3 c1550f3, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f19848Z = c1550f3;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Y1(this.f19848Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f19847Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f19847Y = 1;
            EnumC1555g3 enumC1555g3 = EnumC1555g3.f20079Z;
            C c10 = this.f19848Z.f20062c;
            Object p10 = kotlin.jvm.internal.m.p(c10, enumC1555g3, c10.f19001j.h(), this);
            if (p10 != enumC5000a) {
                p10 = yVar;
            }
            if (p10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

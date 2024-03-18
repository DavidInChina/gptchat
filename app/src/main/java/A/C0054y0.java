package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: A.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0054y0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f329Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0056z0 f330Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054y0(C0056z0 c0056z0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f330Z = c0056z0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0054y0(this.f330Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0054y0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f329Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0041s c0041s = C0041s.f291i0;
            this.f329Y = 1;
            if (kotlin.jvm.internal.m.v(getContext()).S(new y.Y(11, c0041s), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        M0 m02 = this.f330Z.f340E0;
        if (m02 != null) {
            ((O0) m02).d();
        }
        return jf.y.f36177a;
    }
}

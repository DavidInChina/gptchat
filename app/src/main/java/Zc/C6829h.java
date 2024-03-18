package zc;

import Cd.X;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6829h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51905Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51906Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6829h(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51906Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6829h(this.f51906Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6829h) create((X) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51905Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            long j6 = S.f51872a;
            this.f51905Y = 1;
            if (R4.b.q0(j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f51906Z.j(Cd.r.f3069a);
        return jf.y.f36177a;
    }
}

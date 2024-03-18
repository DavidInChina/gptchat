package g2;

import G0.C0571a;
import Ng.C1072l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;

/* renamed from: g2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3152j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31098Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3153k f31099Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3152j(C3153k c3153k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31099Z = c3153k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3152j(this.f31099Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3152j) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31098Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f31099Z.c();
            C3153k c3153k = this.f31099Z;
            this.f31098Y = 1;
            C1072l c1072l = new C1072l(1, AbstractC5260f.z(this));
            c1072l.u();
            synchronized (c3153k.f31106l0) {
                c3153k.f31107m0 = c3153k.f31102h0;
                c3153k.f31109o0 = c1072l;
            }
            c1072l.w(new C0571a(12, c3153k));
            Object t10 = c1072l.t();
            if (t10 == enumC5000a) {
                com.google.android.gms.internal.play_billing.N.k0(this);
            }
            if (t10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}

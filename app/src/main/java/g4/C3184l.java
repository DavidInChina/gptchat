package g4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: g4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3184l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31228Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3188p f31229Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3184l(C3188p c3188p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31229Z = c3188p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3184l(this.f31229Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3184l) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31228Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C3188p c3188p = this.f31229Z;
            Rg.o F02 = L4.a.F0(new C3182j(c3188p, null), AbstractC4828h.o0(new X0.b(11, c3188p)));
            C3183k c3183k = new C3183k(c3188p);
            this.f31228Y = 1;
            if (F02.b(c3183k, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}

package ta;

import Z8.AbstractC1809m0;
import Z8.T0;
import Z8.U0;
import android.net.Uri;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.AbstractC6211y;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import za.AbstractC6790g;
import za.C6786c;
import za.C6787d;
import za.C6788e;
import za.C6789f;
import za.C6792i;
import za.C6808y;

/* loaded from: classes2.dex */
public final class W extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f45858Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f45859Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Jc.E f45860h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ X f45861i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Uri f45862j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Jc.E e10, X x10, Uri uri, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45860h0 = e10;
        this.f45861i0 = x10;
        this.f45862j0 = uri;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        W w10 = new W(this.f45860h0, this.f45861i0, this.f45862j0, abstractC4825e);
        w10.f45859Z = obj;
        return w10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Ic.h) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C6789f c6789f;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45858Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ic.h hVar = (Ic.h) this.f45859Z;
            boolean z10 = hVar instanceof Ic.e;
            X x10 = this.f45861i0;
            if (z10) {
                c6789f = new C6789f(null);
            } else if (hVar instanceof Ic.f) {
                c6789f = new C6789f(new Float(((Ic.f) hVar).f8541a));
            } else if (hVar instanceof Ic.g) {
                c6789f = new C6789f(null);
            } else if (hVar instanceof Ic.d) {
                v0 v0Var = ((Ic.d) hVar).f8539a;
                boolean z11 = v0Var instanceof u0;
                AbstractC6790g abstractC6790g = C6787d.f51785a;
                if (z11) {
                    AbstractC6211y abstractC6211y = (AbstractC6211y) ((u0) v0Var).f48468a;
                    AbstractC1809m0.a().b(T0.f23274c, kf.w.f37484Y);
                    if (abstractC6211y != null) {
                        abstractC6790g = new C6788e(abstractC6211y);
                    }
                } else if (v0Var instanceof q0) {
                    AbstractC1809m0.a().b(U0.f23276c, kf.w.f37484Y);
                    x10.f(new C6792i((q0) v0Var));
                } else if (v0Var instanceof p0) {
                    AbstractC1809m0.a().b(T0.f23274c, kf.w.f37484Y);
                } else {
                    throw new RuntimeException();
                }
                c6789f = abstractC6790g;
            } else {
                throw new RuntimeException();
            }
            C6786c c6786c = new C6786c(this.f45860h0, c6789f);
            C6808y c6808y = x10.f45864k;
            V v10 = new V(this.f45862j0, c6786c, 0);
            this.f45858Y = 1;
            c6808y.a(v10);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

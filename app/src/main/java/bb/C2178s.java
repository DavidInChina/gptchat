package bb;

import cb.C2337F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* renamed from: bb.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178s extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25895Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Va.e f25896Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2179t f25897h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178s(Va.e eVar, C2179t c2179t, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25896Z = eVar;
        this.f25897h0 = c2179t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2178s(this.f25896Z, this.f25897h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2178s) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25895Y;
        C2179t c2179t = this.f25897h0;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            String str = ((C2177q) c2179t.f808e.getValue()).f25888a;
            this.f25895Y = 1;
            obj = ((Ya.r) this.f25896Z).d(str, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.u0) {
            c2179t.l(new C6383b(27, (C2337F) ((wd.u0) v0Var).f48468a));
        } else if (v0Var instanceof wd.q0) {
            c2179t.g(new Ad.q((wd.q0) v0Var));
        } else if (!(v0Var instanceof wd.p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}

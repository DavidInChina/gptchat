package bb;

import cb.C2356Z;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes.dex */
public final class H extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public L f25717Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f25718Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L f25719h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L l10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25719h0 = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new H(this.f25719h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((H) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wd.v0 v0Var;
        Integer num;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25718Z;
        L l10 = this.f25719h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    l10 = this.f25717Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    v0Var = (wd.v0) obj;
                    if (v0Var instanceof wd.q0) {
                        l10.g(new Ad.q((wd.q0) v0Var));
                    }
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Va.e eVar = l10.f25732j;
            String str = ((C2152D) l10.f808e.getValue()).f25693a;
            this.f25718Z = 1;
            obj = ((Ya.r) eVar).f(str, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var2 = (wd.v0) obj;
        if (v0Var2 instanceof wd.u0) {
            l10.l(new C6383b(28, (C2356Z) ((wd.u0) v0Var2).f48468a));
        } else if (v0Var2 instanceof wd.q0) {
            wd.q0 q0Var = (wd.q0) v0Var2;
            if ((q0Var instanceof wd.t0) && (num = ((wd.t0) q0Var).f48463b) != null && num.intValue() == 404) {
                l10.l(C2170j.f25839i0);
                String str2 = ((C2152D) l10.f808e.getValue()).f25693a;
                C2356Z c2356z = new C2356Z(null, null, Boolean.FALSE);
                this.f25717Y = l10;
                this.f25718Z = 2;
                obj = ((Ya.r) l10.f25732j).l(c2356z, str2, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                }
            } else {
                l10.g(new Ad.q(q0Var));
            }
        } else if (!(v0Var2 instanceof wd.p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}

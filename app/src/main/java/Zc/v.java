package zc;

import Cd.U;
import Cd.W;
import Cd.X;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51945Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51946Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Q q10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51946Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new v(this.f51946Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((v) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r5 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51945Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f51945Y = 1;
            Q q10 = this.f51946Z;
            U3.f fVar = ((X) q10.e()).f3027b;
            if (AbstractC3557B.K(fVar, U.f3023g) || AbstractC3557B.K(fVar, Cd.M.f3017g) || AbstractC3557B.K(fVar, Cd.N.f3018g)) {
                obj2 = q10.n(Ed.n.f4691h0, this);
            } else {
                boolean K10 = AbstractC3557B.K(fVar, W.f3025g);
                Kd.I i11 = q10.f51860l;
                if (!K10) {
                    obj2 = yVar;
                    if (obj2 != enumC5000a) {
                        return enumC5000a;
                    }
                }
                obj2 = yVar;
                if (obj2 != enumC5000a) {
                }
            }
        }
        return yVar;
    }
}

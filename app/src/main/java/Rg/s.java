package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class s implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Pg.o f15571Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f15572Z;

    public s(Pg.o oVar, int i10) {
        this.f15571Y = oVar;
        this.f15572Z = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        r rVar;
        EnumC5000a enumC5000a;
        int i10;
        if (abstractC4825e instanceof r) {
            rVar = (r) abstractC4825e;
            int i11 = rVar.f15570h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f15570h0 = i11 - Integer.MIN_VALUE;
                Object obj2 = rVar.f15568Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = rVar.f15570h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj2);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj2);
                } else {
                    N.B0(obj2);
                    kf.y yVar = new kf.y(this.f15572Z, obj);
                    rVar.f15570h0 = 1;
                    if (this.f15571Y.n(yVar, rVar) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                rVar.f15570h0 = 2;
                if (L4.a.a1(rVar) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        rVar = new r(this, abstractC4825e);
        Object obj22 = rVar.f15568Y;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = rVar.f15570h0;
        if (i10 == 0) {
        }
        rVar.f15570h0 = 2;
        if (L4.a.a1(rVar) == enumC5000a) {
        }
        return jf.y.f36177a;
    }
}

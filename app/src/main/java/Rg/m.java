package Rg;

import Ng.AbstractC1073l0;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class m implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f15556Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ng.F f15557Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f15558h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15559i0;

    public m(kotlin.jvm.internal.B b10, Ng.F f6, o oVar, AbstractC1207j abstractC1207j) {
        this.f15556Y = b10;
        this.f15557Z = f6;
        this.f15558h0 = oVar;
        this.f15559i0 = abstractC1207j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        m mVar;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f15555j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f15555j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = lVar.f15553h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f15555j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = lVar.f15552Z;
                        mVar = lVar.f15551Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f15556Y.f37622Y;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(new q());
                        lVar.f15551Y = this;
                        lVar.f15552Z = obj;
                        lVar.getClass();
                        lVar.f15555j0 = 1;
                        if (abstractC1073l0.F(lVar) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    mVar = this;
                }
                mVar.f15556Y.f37622Y = Ad.l.O0(mVar.f15557Z, null, Ng.G.f12870i0, new k(mVar.f15558h0, mVar.f15559i0, obj, null), 1);
                return jf.y.f36177a;
            }
        }
        lVar = new l(this, abstractC4825e);
        Object obj22 = lVar.f15553h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f15555j0;
        if (i10 == 0) {
        }
        mVar.f15556Y.f37622Y = Ad.l.O0(mVar.f15557Z, null, Ng.G.f12870i0, new k(mVar.f15558h0, mVar.f15559i0, obj, null), 1);
        return jf.y.f36177a;
    }
}

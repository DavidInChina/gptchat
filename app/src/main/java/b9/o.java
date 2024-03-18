package b9;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public abstract class o implements AbstractC2133b {

    /* renamed from: a  reason: collision with root package name */
    public final p f25672a;

    public o(p pVar) {
        this.f25672a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        n nVar;
        int i10;
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i11 = nVar.f25671h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f25671h0 = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f25669Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f25671h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    nVar.f25671h0 = 1;
                    obj = L4.a.m0(((C9.l) this).f2800i, nVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return Boolean.valueOf(obj instanceof nd.h);
            }
        }
        nVar = new n(this, abstractC4825e);
        Object obj2 = nVar.f25669Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f25671h0;
        if (i10 == 0) {
        }
        return Boolean.valueOf(obj2 instanceof nd.h);
    }
}

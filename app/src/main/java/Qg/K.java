package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class K implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14764Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14765Z;

    public K(AbstractC1207j abstractC1207j, kotlin.jvm.internal.B b10) {
        this.f14764Y = abstractC1207j;
        this.f14765Z = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        J j6;
        int i10;
        Throwable th2;
        K k10;
        if (abstractC4825e instanceof J) {
            j6 = (J) abstractC4825e;
            int i11 = j6.f14763i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j6.f14763i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = j6.f14761Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = j6.f14763i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        k10 = j6.f14760Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            k10.f14765Z.f37622Y = th2;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    try {
                        AbstractC1207j abstractC1207j = this.f14764Y;
                        j6.f14760Y = this;
                        j6.f14763i0 = 1;
                        if (abstractC1207j.c(obj, j6) == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        k10 = this;
                        k10.f14765Z.f37622Y = th2;
                        throw th2;
                    }
                }
                return jf.y.f36177a;
            }
        }
        j6 = new J(this, abstractC4825e);
        Object obj22 = j6.f14761Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = j6.f14763i0;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }
}

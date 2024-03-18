package Qg;

import Rg.C1280a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class P implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14781Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f14782Z = 1;

    public P(C5426p c5426p) {
        this.f14781Y = c5426p;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.internal.z] */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        O o10;
        int i10;
        C1280a e10;
        Object obj;
        if (abstractC4825e instanceof O) {
            o10 = (O) abstractC4825e;
            int i11 = o10.f14778Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o10.f14778Z = i11 - Integer.MIN_VALUE;
                Object obj2 = o10.f14777Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = o10.f14778Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = o10.f14780i0;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } catch (C1280a e11) {
                            e10 = e11;
                            if (e10.f15524Y != obj) {
                                throw e10;
                            }
                            return jf.y.f36177a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    Object obj3 = new Object();
                    ?? obj4 = new Object();
                    try {
                        AbstractC1206i abstractC1206i = this.f14781Y;
                        S s10 = new S(obj4, this.f14782Z, abstractC1207j, obj3);
                        o10.f14780i0 = obj3;
                        o10.f14778Z = 1;
                        if (abstractC1206i.b(s10, o10) == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (C1280a e12) {
                        e10 = e12;
                        obj = obj3;
                        if (e10.f15524Y != obj) {
                        }
                        return jf.y.f36177a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        o10 = new O(this, abstractC4825e);
        Object obj22 = o10.f14777Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = o10.f14778Z;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }
}

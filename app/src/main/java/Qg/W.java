package Qg;

import Rg.C1280a;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class W implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f14797Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14798Z;

    public W(wf.n nVar, kotlin.jvm.internal.B b10) {
        this.f14797Y = nVar;
        this.f14798Z = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        V v10;
        Object obj2;
        int i10;
        W w10;
        if (abstractC4825e instanceof V) {
            v10 = (V) abstractC4825e;
            int i11 = v10.f14794h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v10.f14794h0 = i11 - Integer.MIN_VALUE;
                obj2 = v10.f14793Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = v10.f14794h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = v10.f14796j0;
                        w10 = v10.f14792Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    v10.f14792Y = this;
                    v10.f14796j0 = obj;
                    v10.f14794h0 = 1;
                    obj2 = this.f14797Y.invoke(obj, v10);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    w10 = this;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return jf.y.f36177a;
                }
                w10.f14798Z.f37622Y = obj;
                throw new C1280a(w10);
            }
        }
        v10 = new V(this, abstractC4825e);
        obj2 = v10.f14793Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = v10.f14794h0;
        if (i10 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}

package Qg;

import Rg.C1280a;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: Qg.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193b0 implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f14822Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14823Z;

    public C1193b0(wf.n nVar, kotlin.jvm.internal.B b10) {
        this.f14822Y = nVar;
        this.f14823Z = b10;
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
        C1191a0 c1191a0;
        Object obj2;
        int i10;
        C1193b0 c1193b0;
        if (abstractC4825e instanceof C1191a0) {
            c1191a0 = (C1191a0) abstractC4825e;
            int i11 = c1191a0.f14815h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1191a0.f14815h0 = i11 - Integer.MIN_VALUE;
                obj2 = c1191a0.f14814Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1191a0.f14815h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = c1191a0.f14817j0;
                        c1193b0 = c1191a0.f14813Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    c1191a0.f14813Y = this;
                    c1191a0.f14817j0 = obj;
                    c1191a0.f14815h0 = 1;
                    obj2 = this.f14822Y.invoke(obj, c1191a0);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c1193b0 = this;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return jf.y.f36177a;
                }
                c1193b0.f14823Z.f37622Y = obj;
                throw new C1280a(c1193b0);
            }
        }
        c1191a0 = new C1191a0(this, abstractC4825e);
        obj2 = c1191a0.f14814Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1191a0.f14815h0;
        if (i10 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}

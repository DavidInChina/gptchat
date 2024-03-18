package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class S implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f14786Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f14787Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14788h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f14789i0;

    public S(kotlin.jvm.internal.z zVar, int i10, AbstractC1207j abstractC1207j, Object obj) {
        this.f14786Y = zVar;
        this.f14787Z = i10;
        this.f14788h0 = abstractC1207j;
        this.f14789i0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        Q q10;
        int i10;
        if (abstractC4825e instanceof Q) {
            q10 = (Q) abstractC4825e;
            int i11 = q10.f14785h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q10.f14785h0 = i11 - Integer.MIN_VALUE;
                Object obj2 = q10.f14783Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = q10.f14785h0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    kotlin.jvm.internal.z zVar = this.f14786Y;
                    int i12 = zVar.f37647Y + 1;
                    zVar.f37647Y = i12;
                    int i13 = this.f14787Z;
                    AbstractC1207j abstractC1207j = this.f14788h0;
                    if (i12 < i13) {
                        q10.f14785h0 = 1;
                        if (abstractC1207j.c(obj, q10) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        q10.f14785h0 = 2;
                        K4.J.f(abstractC1207j, obj, this.f14789i0, q10);
                        return enumC5000a;
                    }
                }
                return yVar;
            }
        }
        q10 = new Q(this, abstractC4825e);
        Object obj22 = q10.f14783Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = q10.f14785h0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        return yVar2;
    }
}

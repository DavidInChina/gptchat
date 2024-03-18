package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class M implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f14771Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14772Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f14773h0;

    public M(kotlin.jvm.internal.x xVar, AbstractC1207j abstractC1207j, wf.n nVar) {
        this.f14771Y = xVar;
        this.f14772Z = abstractC1207j;
        this.f14773h0 = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        L l10;
        int i10;
        M m10;
        if (abstractC4825e instanceof L) {
            l10 = (L) abstractC4825e;
            int i11 = l10.f14770j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l10.f14770j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = l10.f14768h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = l10.f14770j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            obj = l10.f14767Z;
                            m10 = l10.f14766Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            if (!((Boolean) obj2).booleanValue()) {
                                m10.f14771Y.f37645Y = true;
                                l10.f14766Y = null;
                                l10.f14767Z = null;
                                l10.f14770j0 = 3;
                                if (m10.f14772Z.c(obj, l10) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        return yVar;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    if (this.f14771Y.f37645Y) {
                        l10.f14770j0 = 1;
                        if (this.f14772Z.c(obj, l10) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                    l10.f14766Y = this;
                    l10.f14767Z = obj;
                    l10.f14770j0 = 2;
                    obj2 = this.f14773h0.invoke(obj, l10);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    m10 = this;
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                }
                return yVar;
            }
        }
        l10 = new L(this, abstractC4825e);
        Object obj22 = l10.f14768h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = l10.f14770j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        return yVar2;
    }
}

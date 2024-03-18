package We;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5162i;

/* loaded from: classes2.dex */
public final class v implements AbstractC1207j, AbstractC5162i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f21056Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Xe.B f21057Z;

    public v(AbstractC1207j abstractC1207j, Xe.B b10) {
        this.f21056Y = abstractC1207j;
        this.f21057Z = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        u uVar;
        int i10;
        if (abstractC4825e instanceof u) {
            uVar = (u) abstractC4825e;
            int i11 = uVar.f21054Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f21054Z = i11 - Integer.MIN_VALUE;
                Object obj2 = uVar.f21053Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = uVar.f21054Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    Xe.z zVar = (Xe.z) obj;
                    Xe.B b10 = this.f21057Z;
                    C3959i c3959i = new C3959i(b10, b10.a());
                    uVar.f21054Z = 1;
                    if (this.f21056Y.c(c3959i, uVar) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        uVar = new u(this, abstractC4825e);
        Object obj22 = uVar.f21053Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = uVar.f21054Z;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }
}

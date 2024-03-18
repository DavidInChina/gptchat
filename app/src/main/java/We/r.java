package We;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import java.util.LinkedHashMap;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5162i;

/* loaded from: classes2.dex */
public final class r implements AbstractC1207j, AbstractC5162i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21048Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f21049Z;

    public /* synthetic */ r(AbstractC1207j abstractC1207j, int i10) {
        this.f21048Y = i10;
        this.f21049Z = abstractC1207j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        q qVar;
        int i10;
        s sVar;
        int i11;
        jf.y yVar = jf.y.f36177a;
        int i12 = this.f21048Y;
        AbstractC1207j abstractC1207j = this.f21049Z;
        switch (i12) {
            case 0:
                if (abstractC4825e instanceof q) {
                    qVar = (q) abstractC4825e;
                    int i13 = qVar.f21046Z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qVar.f21046Z = i13 - Integer.MIN_VALUE;
                        Object obj2 = qVar.f21045Y;
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        i10 = qVar.f21046Z;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                N.B0(obj2);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            if (((Xe.B) entry.getValue()).f21845d == 1) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        qVar.f21046Z = 1;
                        if (abstractC1207j.c(linkedHashMap, qVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                }
                qVar = new q(this, abstractC4825e);
                Object obj22 = qVar.f21045Y;
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                i10 = qVar.f21046Z;
                if (i10 == 0) {
                }
            default:
                if (abstractC4825e instanceof s) {
                    sVar = (s) abstractC4825e;
                    int i14 = sVar.f21051Z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        sVar.f21051Z = i14 - Integer.MIN_VALUE;
                        Object obj3 = sVar.f21050Y;
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        i11 = sVar.f21051Z;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                N.B0(obj3);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj3);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            if (((Xe.B) entry2.getValue()).f21845d == 2) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        sVar.f21051Z = 1;
                        if (abstractC1207j.c(linkedHashMap2, sVar) == enumC5000a3) {
                            return enumC5000a3;
                        }
                        return yVar;
                    }
                }
                sVar = new s(this, abstractC4825e);
                Object obj32 = sVar.f21050Y;
                EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
                i11 = sVar.f21051Z;
                if (i11 == 0) {
                }
        }
    }
}

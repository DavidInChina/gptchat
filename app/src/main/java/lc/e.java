package Lc;

import bb.B0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.UUID;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final g f10992a;

    public e(g gVar) {
        this.f10992a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        String str;
        e eVar;
        String str2;
        String str3;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f10991i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f10991i0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f10989Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f10991i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            str = (String) dVar.f10988Y;
                            N.B0(obj);
                            return str;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (e) dVar.f10988Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    Ia.j jVar = this.f10992a.f44961e;
                    dVar.f10988Y = this;
                    dVar.f10991i0 = 1;
                    obj = L4.a.m0(jVar, dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    eVar = this;
                }
                str2 = ((k) obj).f10997a;
                if (str2 != null) {
                    try {
                        str3 = UUID.randomUUID().toString();
                    } catch (Exception e10) {
                        W.G(Pc.e.a(), "Failed to generate device UUID", e10, 4);
                        str3 = "unknown";
                    }
                    AbstractC3557B.Z(str3);
                    g gVar = eVar.f10992a;
                    B0 b02 = new B0(str3, 9);
                    dVar.f10988Y = str3;
                    dVar.f10991i0 = 2;
                    if (gVar.b(b02, dVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    str = str3;
                    return str;
                }
                return str2;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f10989Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f10991i0;
        if (i10 == 0) {
        }
        str2 = ((k) obj2).f10997a;
        if (str2 != null) {
        }
    }
}

package Yc;

import bb.B0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.C5760d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final nd.l f22237a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22238b = true;

    public d(nd.l lVar) {
        this.f22237a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C5760d c5760d, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        String str;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f22236i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f22236i0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f22234Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f22236i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c5760d = cVar.f22233Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (c5760d.f46130f.a(Vc.m.f18553a)) {
                        return yVar;
                    }
                    cVar.f22233Y = c5760d;
                    cVar.f22236i0 = 1;
                    obj = ((C9.l) this.f22237a).h(cVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    P4.a.d0(c5760d, new B0(str, 10));
                    return yVar;
                }
                throw new IllegalArgumentException("Token is missing");
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f22234Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f22236i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }
}

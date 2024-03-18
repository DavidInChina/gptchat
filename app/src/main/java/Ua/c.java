package Ua;

import Yc.n;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wd.r0;
import wd.u0;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class c implements Ic.a {

    /* renamed from: a  reason: collision with root package name */
    public final n f17579a;

    public c(n nVar) {
        this.f17579a = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Type inference failed for: r7v7, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        try {
            if (abstractC4825e instanceof a) {
                aVar = (a) abstractC4825e;
                int i11 = aVar.f17574h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f17574h0 = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f17572Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = aVar.f17574h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        ge.d dVar = this.f17579a.f22255a;
                        C5760d c5760d = new C5760d();
                        P4.a.Q0(c5760d, str);
                        C6396A c6396a = C6396A.f49811b;
                        c5760d.c(C6396A.f49811b);
                        C6043l c6043l = new C6043l(c5760d, dVar);
                        ?? abstractC5163j = new AbstractC5163j(2, null);
                        aVar.f17574h0 = 1;
                        obj = c6043l.c(abstractC5163j, aVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return new u0((String) obj);
                }
            }
            if (i10 == 0) {
            }
            return new u0((String) obj);
        } catch (Exception e10) {
            return new r0(e10);
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f17572Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f17574h0;
    }
}

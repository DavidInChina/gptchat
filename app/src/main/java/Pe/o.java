package pe;

import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import kf.v;
import me.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import xe.C6410O;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Ei.a f43135a = Ad.l.o("io.ktor.client.plugins.HttpCookies");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ge.d dVar, C6410O c6410o, AbstractC4825e abstractC4825e) {
        m mVar;
        int i10;
        List list;
        if (abstractC4825e instanceof m) {
            m mVar2 = (m) abstractC4825e;
            int i11 = mVar2.f43133Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar2.f43133Z = i11 - Integer.MIN_VALUE;
                mVar = mVar2;
                Object obj = mVar.f43132Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = mVar.f43133Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    l lVar = (l) y.b(dVar, l.f43127i0);
                    if (lVar != null) {
                        mVar.f43133Z = 1;
                        obj = lVar.h(c6410o, mVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return v.f37483Y;
                }
                list = (List) obj;
                if (list != null) {
                    return list;
                }
                return v.f37483Y;
            }
        }
        mVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = mVar.f43132Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = mVar.f43133Z;
        if (i10 == 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return v.f37483Y;
    }
}

package Pa;

import Df.H;
import Df.w;
import Ga.E;
import Vc.q;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.u0;
import x8.W;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final E f13912a;

    public k(E e10) {
        this.f13912a = e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, int i10, AbstractC4825e abstractC4825e) {
        j jVar;
        int i11;
        x xVar;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i12 = jVar.f13911h0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f13911h0 = i12 - Integer.MIN_VALUE;
                Object obj = jVar.f13909Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = jVar.f13911h0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    jVar.f13911h0 = 1;
                    E e10 = this.f13912a;
                    e10.getClass();
                    Ga.x xVar2 = new Ga.x(new R9.c(i10, str2, str3), str, null);
                    w a5 = C.a(R9.f.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(R9.f.class), a5);
                    Yc.a aVar = e10.f6196b;
                    aVar.getClass();
                    obj = W.S(aVar, n22, xVar2, jVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new u0(((R9.f) ((Vc.w) xVar).f18565a).f15186a);
                }
                if (xVar instanceof q) {
                    return p0.f48449a;
                }
                if (xVar instanceof r) {
                    xVar.getClass();
                    return x.a((r) xVar);
                }
                throw new RuntimeException();
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f13909Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = jVar.f13911h0;
        if (i11 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}

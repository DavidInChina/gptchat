package kc;

import Df.H;
import Df.w;
import Vc.q;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import jc.C3933a;
import jc.C3934b;
import jc.C3935c;
import jc.C3942j;
import jc.C3948p;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.u0;
import x8.W;

/* renamed from: kc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4235c {

    /* renamed from: a  reason: collision with root package name */
    public final C3935c f37293a;

    public C4235c(C3935c c3935c) {
        this.f37293a = c3935c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, C3942j c3942j, AbstractC4825e abstractC4825e) {
        C4233a c4233a;
        int i10;
        if (abstractC4825e instanceof C4233a) {
            c4233a = (C4233a) abstractC4825e;
            int i11 = c4233a.f37289h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4233a.f37289h0 = i11 - Integer.MIN_VALUE;
                Object obj = c4233a.f37287Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4233a.f37289h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c4233a.f37289h0 = 1;
                    C3935c c3935c = this.f37293a;
                    c3935c.getClass();
                    C3933a c3933a = new C3933a(str, c3942j, null);
                    w a5 = C.a(y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                    Yc.a aVar = c3935c.f36104a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, c3933a, c4233a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        c4233a = new C4233a(this, abstractC4825e);
        Object obj2 = c4233a.f37287Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4233a.f37289h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AbstractC4825e abstractC4825e) {
        C4234b c4234b;
        int i10;
        x xVar;
        if (abstractC4825e instanceof C4234b) {
            c4234b = (C4234b) abstractC4825e;
            int i11 = c4234b.f37292h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4234b.f37292h0 = i11 - Integer.MIN_VALUE;
                Object obj = c4234b.f37290Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4234b.f37292h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c4234b.f37292h0 = 1;
                    C3935c c3935c = this.f37293a;
                    c3935c.getClass();
                    C3934b c3934b = new C3934b(str, null);
                    w a5 = C.a(C3948p.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C3948p.class), a5);
                    Yc.a aVar = c3935c.f36104a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, c3934b, c4234b);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new u0(((C3948p) ((Vc.w) xVar).f18565a).f36119a);
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
        c4234b = new C4234b(this, abstractC4825e);
        Object obj2 = c4234b.f37290Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4234b.f37292h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}

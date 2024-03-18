package tc;

import Df.H;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;
import yd.AbstractC6580a;

/* renamed from: tc.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5739h implements AbstractC6580a {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.f f46083a;

    public C5739h(Yc.f fVar) {
        this.f46083a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Type inference failed for: r8v10, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C5735d c5735d;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof C5735d) {
            c5735d = (C5735d) abstractC4825e;
            int i11 = c5735d.f46075h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5735d.f46075h0 = i11 - Integer.MIN_VALUE;
                Object obj = c5735d.f46073Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5735d.f46075h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = C.a(C5743l.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C5743l.class), a5);
                    c5735d.f46075h0 = 1;
                    Yc.f fVar = this.f46083a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, abstractC5163j, c5735d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w(((C5743l) ((Vc.w) xVar).f18565a).a());
                }
                if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                }
                throw new RuntimeException();
            }
        }
        c5735d = new C5735d(this, abstractC4825e);
        Object obj2 = c5735d.f46073Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5735d.f46075h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Type inference failed for: r8v10, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5737f c5737f;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof C5737f) {
            c5737f = (C5737f) abstractC4825e;
            int i11 = c5737f.f46080h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5737f.f46080h0 = i11 - Integer.MIN_VALUE;
                Object obj = c5737f.f46078Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5737f.f46080h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = C.a(C5743l.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C5743l.class), a5);
                    c5737f.f46080h0 = 1;
                    Yc.f fVar = this.f46083a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, abstractC5163j, c5737f);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w(((C5743l) ((Vc.w) xVar).f18565a).a());
                }
                if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                }
                throw new RuntimeException();
            }
        }
        c5737f = new C5737f(this, abstractC4825e);
        Object obj2 = c5737f.f46078Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5737f.f46080h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}

package e9;

import Mb.C0972p;
import Mb.C0986w0;
import Mb.Q0;
import bb.H0;
import ec.C2873y;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import pd.s;
import wd.l0;
import wd.o0;
import wd.q0;

/* renamed from: e9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2808a extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29043Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q0 f29044Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2808a(q0 q0Var, int i10) {
        super(1);
        this.f29043Y = i10;
        this.f29044Z = q0Var;
    }

    public final C0972p a(C0972p c0972p) {
        int i10 = this.f29043Y;
        q0 q0Var = this.f29044Z;
        switch (i10) {
            case 3:
                AbstractC3557B.c0("$this$setState", c0972p);
                AbstractC3557B.c0("error", q0Var);
                return new C0972p(new l0(q0Var));
            default:
                AbstractC3557B.c0("$this$setState", c0972p);
                AbstractC3557B.c0("error", q0Var);
                return new C0972p(new l0(q0Var));
        }
    }

    public final C0986w0 c(C0986w0 c0986w0) {
        int i10 = this.f29043Y;
        q0 q0Var = this.f29044Z;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("$this$setState", c0986w0);
                AbstractC3557B.c0("error", q0Var);
                return C0986w0.e(c0986w0, null, null, new l0(q0Var), 7);
            default:
                AbstractC3557B.c0("$this$setState", c0986w0);
                AbstractC3557B.c0("error", q0Var);
                return C0986w0.e(c0986w0, null, new l0(q0Var), null, 11);
        }
    }

    public final C2873y e(C2873y c2873y) {
        int i10 = this.f29043Y;
        q0 q0Var = this.f29044Z;
        switch (i10) {
            case 8:
                AbstractC3557B.c0("$this$setState", c2873y);
                AbstractC3557B.c0("error", q0Var);
                return C2873y.e(c2873y, null, null, new l0(q0Var), null, null, null, null, null, 1019);
            case 9:
                AbstractC3557B.c0("$this$setState", c2873y);
                AbstractC3557B.c0("error", q0Var);
                return C2873y.e(c2873y, null, new l0(q0Var), null, null, null, null, null, null, 1021);
            case 10:
                AbstractC3557B.c0("$this$setState", c2873y);
                AbstractC3557B.c0("error", q0Var);
                return C2873y.e(c2873y, null, null, null, null, new l0(q0Var), null, null, null, 1007);
            default:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, new l0(q0Var), null, null, null, null, 1015);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f29043Y;
        q0 q0Var = this.f29044Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", (s) obj);
                return new pd.n(q0Var);
            case 1:
                H0 h02 = (H0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", h02);
                        AbstractC3557B.c0("error", q0Var);
                        l0 l0Var = new l0(q0Var);
                        o0 o0Var = h02.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var);
                        return new H0(o0Var, l0Var);
                    default:
                        AbstractC3557B.c0("it", h02);
                        AbstractC3557B.c0("error", q0Var);
                        l0 l0Var2 = new l0(q0Var);
                        o0 o0Var2 = h02.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var2);
                        return new H0(o0Var2, l0Var2);
                }
            case 2:
                H0 h03 = (H0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", h03);
                        AbstractC3557B.c0("error", q0Var);
                        l0 l0Var3 = new l0(q0Var);
                        o0 o0Var3 = h03.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var3);
                        return new H0(o0Var3, l0Var3);
                    default:
                        AbstractC3557B.c0("it", h03);
                        AbstractC3557B.c0("error", q0Var);
                        l0 l0Var4 = new l0(q0Var);
                        o0 o0Var4 = h03.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var4);
                        return new H0(o0Var4, l0Var4);
                }
            case 3:
                return a((C0972p) obj);
            case 4:
                return a((C0972p) obj);
            case 5:
                return c((C0986w0) obj);
            case 6:
                return c((C0986w0) obj);
            case 7:
                Q0 q02 = (Q0) obj;
                AbstractC3557B.c0("$this$setState", q02);
                AbstractC3557B.c0("error", q0Var);
                return Q0.e(q02, null, "", new l0(q0Var), false, 9);
            case 8:
                return e((C2873y) obj);
            case 9:
                return e((C2873y) obj);
            case 10:
                return e((C2873y) obj);
            default:
                return e((C2873y) obj);
        }
    }
}

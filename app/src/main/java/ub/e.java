package Ub;

import Df.H;
import Df.w;
import Ng.Q;
import Qg.F0;
import Qg.s0;
import Vb.i;
import Vb.l;
import Vc.x;
import Wc.o;
import Wc.p;
import Yc.n;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;
import of.EnumC5000a;
import pd.t;
import pd.u;
import pd.v;
import pd.z;
import x8.W;

/* loaded from: classes2.dex */
public final class e implements AbstractC4991b, t {

    /* renamed from: d  reason: collision with root package name */
    public static final long f17601d = H.x0(60, Mg.d.f12134i0);

    /* renamed from: a  reason: collision with root package name */
    public final Vb.e f17602a;

    /* renamed from: b  reason: collision with root package name */
    public final F0 f17603b;

    /* renamed from: c  reason: collision with root package name */
    public final F0 f17604c;

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    public e(Vb.e eVar) {
        this.f17602a = eVar;
        F0 c10 = s0.c(new v(null, null, null));
        this.f17603b = c10;
        this.f17604c = c10;
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final Tg.e c() {
        return Q.f12904a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0055 -> B:13:0x002b). Please submit an issue!!! */
    @Override // od.AbstractC4991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        e eVar;
        e eVar2;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f17596i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f17596i0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f17594Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f17596i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            eVar = cVar.f17593Y;
                            N.B0(obj);
                            eVar2 = eVar;
                            cVar.f17593Y = eVar2;
                            cVar.f17596i0 = 1;
                            if (eVar2.f(cVar) != enumC5000a) {
                                return enumC5000a;
                            }
                            eVar = eVar2;
                            cVar.f17593Y = eVar;
                            cVar.f17596i0 = 2;
                            if (R4.b.q0(f17601d, cVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            eVar2 = eVar;
                            cVar.f17593Y = eVar2;
                            cVar.f17596i0 = 1;
                            if (eVar2.f(cVar) != enumC5000a) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        eVar = cVar.f17593Y;
                        N.B0(obj);
                        cVar.f17593Y = eVar;
                        cVar.f17596i0 = 2;
                        if (R4.b.q0(f17601d, cVar) == enumC5000a) {
                        }
                        eVar2 = eVar;
                        cVar.f17593Y = eVar2;
                        cVar.f17596i0 = 1;
                        if (eVar2.f(cVar) != enumC5000a) {
                        }
                    }
                } else {
                    N.B0(obj);
                    eVar2 = this;
                    cVar.f17593Y = eVar2;
                    cVar.f17596i0 = 1;
                    if (eVar2.f(cVar) != enumC5000a) {
                    }
                }
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f17594Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f17596i0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        e eVar;
        x xVar;
        Object obj;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f17600i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f17600i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = dVar.f17598Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f17600i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        eVar = dVar.f17597Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    W.F(Pc.e.a(), "Checking server status", null, 6);
                    i iVar = new i();
                    dVar.f17597Y = this;
                    dVar.f17600i0 = 1;
                    Vb.e eVar2 = this.f17602a;
                    eVar2.getClass();
                    Vb.d dVar2 = new Vb.d(iVar, null);
                    w a5 = C.a(l.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(l.class), a5);
                    n nVar = eVar2.f18511a;
                    nVar.getClass();
                    obj2 = W.S(nVar, n22, dVar2, dVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    eVar = this;
                }
                xVar = (x) obj2;
                if (!(xVar instanceof Vc.w)) {
                    l lVar = (l) ((Vc.w) xVar).f18565a;
                    int ordinal = lVar.f18520a.ordinal();
                    String str = lVar.f18523d;
                    String str2 = lVar.f18522c;
                    String str3 = lVar.f18521b;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                obj = new v(str3, str2, str);
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            obj = new u(str3, str2, str);
                        }
                    } else {
                        obj = new pd.w(str3, str2, str);
                    }
                } else {
                    boolean z10 = xVar instanceof Vc.v;
                    pd.y yVar = pd.y.f43079a;
                    if (z10) {
                        Throwable th2 = ((Vc.v) xVar).f18561a;
                        if (th2 instanceof p) {
                            p pVar = (p) th2;
                            if (pVar.f20920h0.f20914b == o.f20917Z) {
                                Pc.c a10 = Pc.e.a();
                                W.W(a10, "Unsupported country: " + pVar.f20920h0, th2, null, 4);
                                obj = z.f43080a;
                            }
                        }
                    }
                    obj = yVar;
                }
                eVar.f17603b.setValue(obj);
                return y.f36177a;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj22 = dVar.f17598Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f17600i0;
        if (i10 == 0) {
        }
        xVar = (x) obj22;
        if (!(xVar instanceof Vc.w)) {
        }
        eVar.f17603b.setValue(obj);
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final void e() {
    }
}

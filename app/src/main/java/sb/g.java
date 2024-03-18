package Sb;

import Df.H;
import Df.w;
import Qg.F0;
import Rb.AbstractC1279z;
import Rb.C1265k;
import Rb.C1266l;
import Rb.C1267m;
import Rb.C1268n;
import Rb.C1269o;
import Rb.C1272s;
import Rb.C1273t;
import Rb.C1274u;
import Rb.C1275v;
import Rb.C1276w;
import Rb.C1277x;
import Rb.C1278y;
import Rb.F;
import Rb.I;
import Rb.L;
import Rb.M;
import Rb.N;
import Rb.O;
import Vc.q;
import Vc.r;
import Vc.x;
import android.content.Intent;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.q0;
import wd.s0;
import wd.u0;
import wd.v0;
import x8.W;

/* loaded from: classes.dex */
public final class g extends O {

    /* renamed from: j  reason: collision with root package name */
    public final Tb.d f16501j;

    public g(Tb.d dVar) {
        super(new M(null, 31));
        this.f16501j = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(g gVar, C1274u c1274u, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        x xVar;
        N n10;
        gVar.getClass();
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f16488i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f16488i0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f16486Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f16488i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        gVar = bVar.f16485Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C1272s c1272s = c1274u.f15372a;
                    AbstractC3557B.c0("<this>", c1272s);
                    String str = c1272s.f15370c;
                    String str2 = c1272s.f15368a;
                    String str3 = c1272s.f15369b;
                    if (str3 == null || str2 == null || str != null) {
                        if (str3 != null) {
                            n10 = N.f15283Y;
                        } else if (str != null) {
                            n10 = N.f15284Z;
                        } else if (str2 != null) {
                            n10 = N.f15285h0;
                        }
                        gVar.l(new nb.d(10, n10));
                        if (n10 != null) {
                            bVar.f16485Y = gVar;
                            bVar.f16488i0 = 1;
                            Tb.d dVar = gVar.f16501j;
                            dVar.getClass();
                            Tb.a aVar = new Tb.a(dVar, c1274u.f15372a, null);
                            w a5 = C.a(F.class);
                            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(F.class), a5);
                            Yc.a aVar2 = dVar.f17035a;
                            aVar2.getClass();
                            obj = W.S(aVar2, n22, aVar, bVar);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return y.f36177a;
                    }
                    n10 = null;
                    gVar.l(new nb.d(10, n10));
                    if (n10 != null) {
                    }
                    return y.f36177a;
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    gVar.l(new nb.d(11, (F) ((Vc.w) xVar).f18565a));
                } else if (xVar instanceof r) {
                    r rVar = (r) xVar;
                    gVar.f(new C1268n(x.a(rVar)));
                    W.W(Pc.e.a(), "Error fetching gizmo abuse report reasons", rVar.f18561a, null, 4);
                } else if (!(xVar instanceof q)) {
                    throw new RuntimeException();
                }
                return y.f36177a;
            }
        }
        bVar = new b(gVar, abstractC4825e);
        Object obj2 = bVar.f16486Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f16488i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[LOOP:0: B:32:0x00b1->B:34:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(g gVar, C1275v c1275v, AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        v0 b10;
        int i11;
        String str;
        String str2;
        String str3;
        C1272s c1272s;
        gVar.getClass();
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i12 = fVar.f16500i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f16500i0 = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f16498Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f16500i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        gVar = fVar.f16497Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    F0 f02 = gVar.f808e;
                    if (!((M) f02.getValue()).f15282g) {
                        gVar.f(new C1268n(new s0(0, new Exception("Please fill out all required fields"))));
                        return yVar;
                    }
                    gVar.l(a.f16482i0);
                    C1272s c1272s2 = c1275v.f15373a;
                    N n10 = ((M) f02.getValue()).f15276a;
                    if (n10 == null) {
                        i11 = -1;
                    } else {
                        i11 = h.f16502a[n10.ordinal()];
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c1272s = new C1272s((String) null, (String) null, c1272s2.f15370c, 3);
                            }
                            Map map = c1275v.f15376d;
                            ArrayList arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList.add(new C3959i(((C1265k) entry.getKey()).f15358a, entry.getValue()));
                            }
                            Map k12 = AbstractC4268D.k1(arrayList);
                            fVar.f16497Y = gVar;
                            fVar.f16500i0 = 1;
                            Tb.d dVar = gVar.f16501j;
                            dVar.getClass();
                            L l10 = new L(c1275v.f15374b, c1275v.f15375c);
                            str = c1272s2.f15368a;
                            String str4 = c1272s2.f15370c;
                            String str5 = c1272s2.f15369b;
                            if (str != null) {
                                if (str5 == null) {
                                    if (str4 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = str4;
                                    }
                                } else {
                                    str2 = str5;
                                }
                            } else {
                                str2 = str;
                            }
                            if (str == null) {
                                str3 = "gizmo";
                            } else if (str5 != null) {
                                str3 = "conversation";
                            } else if (str4 != null) {
                                str3 = "share_link";
                            } else {
                                throw new IllegalArgumentException("Invalid report content id");
                            }
                            Tb.c cVar = new Tb.c(new I(l10, str3, str2, k12), null);
                            w a5 = C.a(y.class);
                            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                            Yc.a aVar = dVar.f17035a;
                            aVar.getClass();
                            obj = W.S(aVar, n22, cVar, fVar);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                        } else {
                            c1272s = new C1272s((String) null, c1272s2.f15369b, (String) null, 5);
                        }
                    } else {
                        c1272s = new C1272s(c1272s2.f15368a, (String) null, (String) null, 6);
                    }
                    c1272s2 = c1272s;
                    Map map2 = c1275v.f15376d;
                    ArrayList arrayList2 = new ArrayList(map2.size());
                    while (r6.hasNext()) {
                    }
                    Map k122 = AbstractC4268D.k1(arrayList2);
                    fVar.f16497Y = gVar;
                    fVar.f16500i0 = 1;
                    Tb.d dVar2 = gVar.f16501j;
                    dVar2.getClass();
                    L l102 = new L(c1275v.f15374b, c1275v.f15375c);
                    str = c1272s2.f15368a;
                    String str42 = c1272s2.f15370c;
                    String str52 = c1272s2.f15369b;
                    if (str != null) {
                    }
                    if (str == null) {
                    }
                    Tb.c cVar2 = new Tb.c(new I(l102, str3, str2, k122), null);
                    w a52 = C.a(y.class);
                    Je.a n222 = R4.b.n2(H.O(a52), C.f37623a.b(y.class), a52);
                    Yc.a aVar2 = dVar2.f17035a;
                    aVar2.getClass();
                    obj = W.S(aVar2, n222, cVar2, fVar);
                    if (obj == enumC5000a) {
                    }
                }
                b10 = ((x) obj).b();
                if (!(b10 instanceof u0)) {
                    y yVar2 = (y) ((u0) b10).f48468a;
                    gVar.l(a.f16481h0);
                    gVar.f(C1269o.f15365a);
                } else if (b10 instanceof q0) {
                    q0 q0Var = (q0) b10;
                    gVar.f(new C1268n(q0Var));
                    W.W(Pc.e.a(), "Error reporting gizmo", q0Var.f48450a, null, 4);
                } else if (!(b10 instanceof p0)) {
                    throw new RuntimeException();
                }
                gVar.l(a.f16483j0);
                return yVar;
            }
        }
        fVar = new f(gVar, abstractC4825e);
        Object obj2 = fVar.f16498Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f16500i0;
        y yVar3 = y.f36177a;
        if (i10 == 0) {
        }
        b10 = ((x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
        gVar.l(a.f16483j0);
        return yVar3;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC1279z abstractC1279z = (AbstractC1279z) iVar;
        AbstractC3557B.c0("intent", abstractC1279z);
        if (abstractC1279z instanceof C1275v) {
            h(new c(this, abstractC1279z, null));
        } else if (abstractC1279z instanceof C1277x) {
            l(new d(abstractC1279z, 0));
        } else if (abstractC1279z instanceof C1278y) {
            l(new d(abstractC1279z, 1));
        } else if (AbstractC3557B.K(abstractC1279z, C1273t.f15371a)) {
            if (((M) this.f808e.getValue()).f15278c.isEmpty()) {
                l(a.f16481h0);
                f(C1266l.f15362a);
            }
            l(a.f16480Z);
        } else if (abstractC1279z instanceof C1276w) {
            String str = ((C1276w) abstractC1279z).f15377a;
            if (str != null) {
                Intent intent = new Intent();
                A7.b.G0(intent, str);
                f(new C1267m(intent));
            }
        } else if (abstractC1279z instanceof C1274u) {
            h(new e(this, abstractC1279z, null));
        }
    }
}

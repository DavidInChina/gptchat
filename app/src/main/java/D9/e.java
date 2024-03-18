package D9;

import Ad.l;
import Df.H;
import Df.w;
import E9.h;
import E9.o;
import E9.r;
import E9.u;
import Qg.F0;
import Qg.s0;
import Vc.q;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import jf.y;
import kotlin.jvm.internal.C;
import ld.p;
import m9.AbstractC4569a;
import m9.C4570b;
import m9.C4571c;
import m9.C4573e;
import m9.EnumC4572d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;

/* loaded from: classes.dex */
public final class e implements AbstractC4569a {

    /* renamed from: a  reason: collision with root package name */
    public final h f3433a;

    /* renamed from: b  reason: collision with root package name */
    public final t f3434b;

    /* renamed from: c  reason: collision with root package name */
    public final F0 f3435c;

    /* renamed from: d  reason: collision with root package name */
    public final F0 f3436d;

    public e(h hVar, p pVar, t tVar) {
        this.f3433a = hVar;
        this.f3434b = tVar;
        F0 c10 = s0.c(null);
        this.f3435c = c10;
        this.f3436d = c10;
        l.O0(pVar, null, null, new a(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Type inference failed for: r9v9, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(EnumC4572d enumC4572d, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        e eVar;
        v0 b10;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f3428i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f3428i0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f3426Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f3428i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        eVar = cVar.f3425Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (((G) this.f3434b).c(ExperimentKey.ComplianceCheckEnabled.INSTANCE)) {
                        if (b.f3424a[enumC4572d.ordinal()] == 1) {
                            cVar.f3425Y = this;
                            cVar.f3428i0 = 1;
                            h hVar = this.f3433a;
                            hVar.getClass();
                            ?? abstractC5163j = new AbstractC5163j(2, null);
                            w a5 = C.a(E9.c.class);
                            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(E9.c.class), a5);
                            Yc.f fVar = hVar.f4557a;
                            fVar.getClass();
                            obj = W.S(fVar, n22, abstractC5163j, cVar);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            eVar = this;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        return new u0(y.f36177a);
                    }
                }
                b10 = ((x) obj).b();
                if (b10 instanceof q0) {
                    W.W(Pc.e.a(), "Error logging compliance", ((q0) b10).f48450a, null, 4);
                }
                if (b10 instanceof u0) {
                    y yVar = (y) ((u0) b10).f48468a;
                    eVar.f3435c.setValue(null);
                }
                return b10;
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f3426Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f3428i0;
        if (i10 == 0) {
        }
        b10 = ((x) obj2).b();
        if (b10 instanceof q0) {
        }
        if (b10 instanceof u0) {
        }
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Type inference failed for: r2v8, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        e eVar;
        x xVar;
        Object obj;
        C4573e c4573e;
        o oVar;
        String str;
        String str2;
        C4571c c4571c;
        boolean z10;
        String str3;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f3432i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f3432i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = dVar.f3430Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f3432i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        eVar = dVar.f3429Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    if (((G) this.f3434b).c(ExperimentKey.ComplianceCheckEnabled.INSTANCE)) {
                        dVar.f3429Y = this;
                        dVar.f3432i0 = 1;
                        h hVar = this.f3433a;
                        hVar.getClass();
                        ?? abstractC5163j = new AbstractC5163j(2, null);
                        w a5 = C.a(E9.l.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(E9.l.class), a5);
                        Yc.f fVar = hVar.f4557a;
                        fVar.getClass();
                        obj2 = W.S(fVar, n22, abstractC5163j, dVar);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                        eVar = this;
                    } else {
                        return new u0(null);
                    }
                }
                xVar = (x) obj2;
                if (!(xVar instanceof Vc.w)) {
                    eVar.getClass();
                    r rVar = ((E9.l) ((Vc.w) xVar).f18565a).f4561a;
                    if (rVar.f4569a && (oVar = rVar.f4570b) != null) {
                        EnumC4572d enumC4572d = EnumC4572d.f39001Y;
                        String str4 = oVar.f4564a;
                        if (str4 != null && (str = oVar.f4565b) != null) {
                            C4570b c4570b = new C4570b();
                            u uVar = oVar.f4566c;
                            if (uVar != null) {
                                str2 = uVar.f4573a;
                            } else {
                                str2 = null;
                            }
                            if (uVar != null && (str3 = uVar.f4574b) != null) {
                                c4571c = new C4571c(str3);
                            } else {
                                c4571c = null;
                            }
                            if (uVar != null) {
                                z10 = uVar.f4575c;
                            } else {
                                z10 = false;
                            }
                            c4573e = new C4573e(str4, str, c4570b, str2, c4571c, z10);
                            obj = new u0(c4573e);
                        }
                    }
                    c4573e = null;
                    obj = new u0(c4573e);
                } else if (xVar instanceof q) {
                    obj = p0.f48449a;
                } else if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    obj = x.a((Vc.r) xVar);
                } else {
                    throw new RuntimeException();
                }
                if (obj instanceof q0) {
                    W.W(Pc.e.a(), "Error fetching compliance status", ((q0) obj).f48450a, null, 4);
                }
                if (obj instanceof u0) {
                    eVar.f3435c.setValue((C4573e) ((u0) obj).f48468a);
                }
                return obj;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj22 = dVar.f3430Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f3432i0;
        if (i10 == 0) {
        }
        xVar = (x) obj22;
        if (!(xVar instanceof Vc.w)) {
        }
        if (obj instanceof q0) {
        }
        if (obj instanceof u0) {
        }
        return obj;
    }
}

package lb;

import Jc.AbstractC0810d;
import Ng.Q;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import jb.AbstractC3932a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: lb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4368e {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3932a f37994a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0810d f37995b;

    public C4368e(AbstractC3932a abstractC3932a, AbstractC0810d abstractC0810d) {
        this.f37994a = abstractC3932a;
        this.f37995b = abstractC0810d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z10, wf.k kVar, wf.n nVar, wf.n nVar2, AbstractC4825e abstractC4825e) {
        C4365b c4365b;
        int i10;
        v0 v0Var;
        wf.n nVar3;
        wf.n nVar4;
        v0 v0Var2;
        C4368e c4368e;
        wf.n nVar5;
        Vc.x xVar;
        String str2 = str;
        wf.k kVar2 = kVar;
        wf.n nVar6 = nVar;
        if (abstractC4825e instanceof C4365b) {
            c4365b = (C4365b) abstractC4825e;
            int i11 = c4365b.f37988m0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4365b.f37988m0 = i11 - Integer.MIN_VALUE;
                Object obj = c4365b.f37986k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4365b.f37988m0;
                jf.y yVar = jf.y.f36177a;
                switch (i10) {
                    case 0:
                        N.B0(obj);
                        if (z10) {
                            String v22 = Lg.n.v2("file-service://", str2);
                            c4365b.f37981Y = this;
                            c4365b.f37982Z = str2;
                            c4365b.f37983h0 = kVar2;
                            c4365b.f37984i0 = nVar6;
                            nVar5 = nVar2;
                            c4365b.f37985j0 = nVar5;
                            c4365b.f37988m0 = 1;
                            obj = ((Ta.l) this.f37995b).a(v22, c4365b);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            c4368e = this;
                            xVar = (Vc.x) obj;
                            if (!(xVar instanceof Vc.w)) {
                                String str3 = ((Jc.g) ((Vc.w) xVar).f18565a).f9050b;
                                if (str3 != null) {
                                    AbstractC3932a abstractC3932a = c4368e.f37994a;
                                    c4365b.f37981Y = kVar2;
                                    c4365b.f37982Z = nVar6;
                                    c4365b.f37983h0 = null;
                                    c4365b.f37984i0 = null;
                                    c4365b.f37985j0 = null;
                                    c4365b.f37988m0 = 2;
                                    nb.g gVar = (nb.g) abstractC3932a;
                                    gVar.f40184b.getClass();
                                    obj = Ad.l.n1(c4365b, Q.f12906c, new nb.c(str2, str3, gVar, true, null));
                                    if (obj == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    nVar3 = nVar6;
                                    v0Var = (v0) obj;
                                    if (v0Var instanceof u0) {
                                        Uri uri = (Uri) ((u0) v0Var).f48468a;
                                        c4365b.f37981Y = nVar3;
                                        c4365b.f37982Z = v0Var;
                                        c4365b.f37988m0 = 3;
                                        if (kVar2.invoke(c4365b) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        nVar4 = nVar3;
                                        v0Var2 = v0Var;
                                        v0Var = v0Var2;
                                        nVar3 = nVar4;
                                    }
                                    if (v0Var instanceof q0) {
                                        c4365b.f37981Y = v0Var;
                                        c4365b.f37982Z = null;
                                        c4365b.f37988m0 = 4;
                                        if (nVar3.invoke((q0) v0Var, c4365b) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                    }
                                }
                            } else if (xVar instanceof Vc.r) {
                                c4365b.f37981Y = null;
                                c4365b.f37982Z = null;
                                c4365b.f37983h0 = null;
                                c4365b.f37984i0 = null;
                                c4365b.f37985j0 = null;
                                c4365b.f37988m0 = 5;
                                if (nVar5.invoke((Vc.r) xVar, c4365b) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else if (!(xVar instanceof Vc.q)) {
                                throw new RuntimeException();
                            }
                            return yVar;
                        }
                        C4366c c4366c = new C4366c(kVar2, null);
                        C4367d c4367d = new C4367d(nVar6, null);
                        c4365b.f37988m0 = 6;
                        if (b(str2, c4366c, c4367d, c4365b) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    case 1:
                        wf.n nVar7 = c4365b.f37985j0;
                        wf.n nVar8 = c4365b.f37984i0;
                        wf.k kVar3 = c4365b.f37983h0;
                        String str4 = (String) c4365b.f37982Z;
                        c4368e = (C4368e) c4365b.f37981Y;
                        N.B0(obj);
                        nVar5 = nVar7;
                        str2 = str4;
                        nVar6 = nVar8;
                        kVar2 = kVar3;
                        xVar = (Vc.x) obj;
                        if (!(xVar instanceof Vc.w)) {
                        }
                        return yVar;
                    case 2:
                        nVar3 = (wf.n) c4365b.f37982Z;
                        kVar2 = (wf.k) c4365b.f37981Y;
                        N.B0(obj);
                        v0Var = (v0) obj;
                        if (v0Var instanceof u0) {
                        }
                        if (v0Var instanceof q0) {
                        }
                        return yVar;
                    case 3:
                        v0Var2 = (v0) c4365b.f37982Z;
                        nVar4 = (wf.n) c4365b.f37981Y;
                        N.B0(obj);
                        v0Var = v0Var2;
                        nVar3 = nVar4;
                        if (v0Var instanceof q0) {
                        }
                        return yVar;
                    case 4:
                        v0 v0Var3 = (v0) c4365b.f37981Y;
                        N.B0(obj);
                        return yVar;
                    case 5:
                        N.B0(obj);
                        return yVar;
                    case 6:
                        N.B0(obj);
                        return yVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c4365b = new C4365b(this, abstractC4825e);
        Object obj2 = c4365b.f37986k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4365b.f37988m0;
        jf.y yVar2 = jf.y.f36177a;
        switch (i10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, wf.n nVar, wf.n nVar2, AbstractC4825e abstractC4825e) {
        C4364a c4364a;
        int i10;
        v0 v0Var;
        wf.n nVar3;
        if (abstractC4825e instanceof C4364a) {
            c4364a = (C4364a) abstractC4825e;
            int i11 = c4364a.f37980j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4364a.f37980j0 = i11 - Integer.MIN_VALUE;
                Object obj = c4364a.f37978h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4364a.f37980j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                v0 v0Var2 = (v0) c4364a.f37976Y;
                                N.B0(obj);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v0Var = (v0) c4364a.f37977Z;
                        nVar3 = (wf.n) c4364a.f37976Y;
                        N.B0(obj);
                        nVar2 = nVar3;
                        if (v0Var instanceof q0) {
                            c4364a.f37976Y = v0Var;
                            c4364a.f37977Z = null;
                            c4364a.f37980j0 = 3;
                            if (nVar2.invoke((q0) v0Var, c4364a) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return jf.y.f36177a;
                    }
                    nVar2 = (wf.n) c4364a.f37977Z;
                    nVar = (wf.n) c4364a.f37976Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c4364a.f37976Y = nVar;
                    c4364a.f37977Z = nVar2;
                    c4364a.f37980j0 = 1;
                    nb.g gVar = (nb.g) this.f37994a;
                    gVar.f40184b.getClass();
                    obj = Ad.l.n1(c4364a, Q.f12906c, new nb.e(str, gVar, true, null));
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (v0Var instanceof u0) {
                    c4364a.f37976Y = nVar2;
                    c4364a.f37977Z = v0Var;
                    c4364a.f37980j0 = 2;
                    if (nVar.invoke((Uri) ((u0) v0Var).f48468a, c4364a) == enumC5000a) {
                        return enumC5000a;
                    }
                    nVar3 = nVar2;
                    nVar2 = nVar3;
                }
                if (v0Var instanceof q0) {
                }
                return jf.y.f36177a;
            }
        }
        c4364a = new C4364a(this, abstractC4825e);
        Object obj2 = c4364a.f37978h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4364a.f37980j0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var instanceof u0) {
        }
        if (v0Var instanceof q0) {
        }
        return jf.y.f36177a;
    }
}

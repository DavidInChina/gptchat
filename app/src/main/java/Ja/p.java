package Ja;

import G0.C0571a;
import Ng.Q;
import ca.C2311c;
import ca.EnumC2320l;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.C3963m;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import o9.C4953a;
import of.EnumC5000a;
import pa.C5108d;
import wd.C6168C;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final C4953a f8948a;

    /* renamed from: b  reason: collision with root package name */
    public final Pc.g f8949b = Bi.c.i1(Pc.b.f13938p0);

    /* renamed from: c  reason: collision with root package name */
    public final C4726e f8950c;

    /* renamed from: d  reason: collision with root package name */
    public final n9.n f8951d;

    public p(r rVar, C4953a c4953a) {
        this.f8948a = c4953a;
        C3963m c3963m = ((C5108d) rVar).f42864c;
        this.f8950c = ((W9.e) ((V9.a) c3963m.getValue())).f20835b;
        this.f8951d = ((W9.e) ((V9.a) c3963m.getValue())).f20836c;
    }

    public static final C2311c a(p pVar, C2311c c2311c) {
        pVar.getClass();
        String str = c2311c.f26374a;
        n9.n nVar = pVar.f8951d;
        nVar.getClass();
        AbstractC3557B.c0("conversationId", str);
        n9.j jVar = new n9.j(nVar, str, new s3.r(n9.l.f39688Y, 15, nVar));
        List<n9.i> list = (List) jVar.a(new C0571a(17, jVar)).f27991b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (n9.i iVar : list) {
            arrayList.add(iVar.f39681c);
        }
        return C2311c.a(c2311c, null, null, null, null, null, null, null, EnumC2320l.f26400h0, new Qa.e(arrayList), 6143);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, C2311c c2311c, AbstractC4825e abstractC4825e) {
        p pVar2;
        n nVar;
        EnumC5000a enumC5000a;
        int i10;
        Iterator it;
        boolean hasNext;
        y yVar;
        C6168C c6168c;
        pVar.getClass();
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i11 = nVar.f8942j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f8942j0 = i11 - Integer.MIN_VALUE;
                pVar2 = pVar;
                Object obj = nVar.f8940h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f8942j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        it = nVar.f8939Z;
                        pVar2 = nVar.f8938Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Collection<Qa.h> values = c2311c.f26387n.f14548b.values();
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(values, 10));
                    for (Qa.h hVar : values) {
                        String str = ((C2969F) hVar.f14557d).f30009b;
                        String str2 = c2311c.f26374a;
                        if (str == null || !AbstractC3557B.K(str, str2)) {
                            hVar = Qa.h.a(hVar, null, null, C2969F.a((C2969F) hVar.f14557d, str2, null, false, false, false, null, false, 268435453), 7);
                        }
                        arrayList.add(hVar);
                    }
                    it = arrayList.iterator();
                }
                do {
                    hasNext = it.hasNext();
                    yVar = y.f36177a;
                    if (!hasNext) {
                        Qa.h hVar2 = (Qa.h) it.next();
                        n9.n nVar2 = pVar2.f8951d;
                        nVar.f8938Y = pVar2;
                        nVar.f8939Z = it;
                        nVar.f8942j0 = 1;
                        C2969F c2969f = (C2969F) hVar2.f14557d;
                        String str3 = c2969f.f30008a;
                        String str4 = c2969f.f30009b;
                        if (str4 != null) {
                            c6168c = new C6168C(str4);
                        } else {
                            c6168c = null;
                        }
                        if (c6168c != null) {
                            Object e10 = nVar2.e(new n9.i(str3, c6168c.f48321a, hVar2), nVar);
                            if (e10 == EnumC5000a.f41328Y) {
                                yVar = e10;
                                continue;
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        return yVar;
                    }
                } while (yVar != enumC5000a);
                return enumC5000a;
            }
        }
        pVar2 = pVar;
        nVar = new n(pVar2, abstractC4825e);
        Object obj2 = nVar.f8940h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = nVar.f8942j0;
        if (i10 == 0) {
        }
        do {
            hasNext = it.hasNext();
            yVar = y.f36177a;
            if (!hasNext) {
            }
        } while (yVar != enumC5000a);
        return enumC5000a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(p pVar, C4726e c4726e, String str, wf.n nVar, AbstractC4825e abstractC4825e) {
        o oVar;
        int i10;
        pVar.getClass();
        try {
            if (abstractC4825e instanceof o) {
                oVar = (o) abstractC4825e;
                int i11 = oVar.f8947j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    oVar.f8947j0 = i11 - Integer.MIN_VALUE;
                    Object obj = oVar.f8945h0;
                    Object obj2 = EnumC5000a.f41328Y;
                    i10 = oVar.f8947j0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            str = oVar.f8944Z;
                            pVar = oVar.f8943Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        W.F(pVar.f8949b, "Executing " + str, null, 6);
                        oVar.f8943Y = pVar;
                        oVar.f8944Z = str;
                        oVar.f8947j0 = 1;
                        obj = nVar.invoke(c4726e, oVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    Pc.g gVar = pVar.f8949b;
                    W.F(gVar, "Successfully executed " + str, null, 6);
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            Pc.g gVar2 = pVar.f8949b;
            W.F(gVar2, "Successfully executed " + str, null, 6);
            return obj;
        } catch (Throwable th2) {
            W.G(pVar.f8949b, android.gov.nist.core.a.A("CompleteConversationQueries ", str, " encountered error"), th2, 4);
            throw th2;
        }
        oVar = new o(pVar, abstractC4825e);
        Object obj3 = oVar.f8945h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = oVar.f8947j0;
    }

    public final Object d(String str, AbstractC4825e abstractC4825e) {
        this.f8948a.getClass();
        Object n12 = Ad.l.n1(abstractC4825e, Q.f12906c, new c(this, str, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }

    public final Object e(boolean z10, AbstractC4825e abstractC4825e) {
        this.f8948a.getClass();
        return Ad.l.n1(abstractC4825e, Q.f12906c, new j(this, null, z10));
    }

    public final Object f(C2311c c2311c, Ia.k kVar) {
        this.f8948a.getClass();
        Object n12 = Ad.l.n1(kVar, Q.f12906c, new m(this, c2311c, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }
}

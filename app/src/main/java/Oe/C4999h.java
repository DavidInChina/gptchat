package oe;

import Df.AbstractC0405d;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.y;
import kf.t;
import kotlin.jvm.internal.C;
import l8.AbstractC4344b;
import me.C4628a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.AbstractC5766j;
import te.C5760d;
import we.C6215c;
import xe.AbstractC6435x;
import xe.C6405J;
import xe.C6410O;
import xe.C6417f;
import xe.C6433v;
import yf.AbstractC6583a;
import ze.AbstractC6848g;
import ze.C6843b;

/* renamed from: oe.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4999h {

    /* renamed from: c  reason: collision with root package name */
    public static final C4628a f41320c = new C4628a(6, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final Fe.a f41321d = new Fe.a("ContentNegotiation");

    /* renamed from: a  reason: collision with root package name */
    public final List f41322a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f41323b;

    public C4999h(ArrayList arrayList, Set set) {
        AbstractC3557B.c0("registrations", arrayList);
        AbstractC3557B.c0("ignoredTypes", set);
        this.f41322a = arrayList;
        this.f41323b = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ea -> B:71:0x01f4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C5760d c5760d, Object obj, AbstractC4825e abstractC4825e) {
        C4996e c4996e;
        int i10;
        C6417f c6417f;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Object obj2;
        C5760d c5760d2 = c5760d;
        Object obj3 = obj;
        if (abstractC4825e instanceof C4996e) {
            c4996e = (C4996e) abstractC4825e;
            int i11 = c4996e.f41314n0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4996e.f41314n0 = i11 - Integer.MIN_VALUE;
                Object obj4 = c4996e.f41312l0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4996e.f41314n0;
                AbstractC6848g abstractC6848g = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        C4993b c4993b = c4996e.f41311k0;
                        Iterator it2 = c4996e.f41310j0;
                        List list = c4996e.f41309i0;
                        C6417f c6417f2 = c4996e.f41308h0;
                        Object obj5 = c4996e.f41307Z;
                        C5760d c5760d3 = c4996e.f41306Y;
                        N.B0(obj4);
                        c6417f = c6417f2;
                        ArrayList arrayList3 = list;
                        C4996e c4996e2 = c4996e;
                        Iterator it3 = it2;
                        obj3 = obj5;
                        AbstractC6848g abstractC6848g2 = (AbstractC6848g) obj4;
                        if (abstractC6848g2 != null) {
                            i.f41324a.c("Converted request body using " + c4993b.f41300a + " for " + c5760d3.f46125a);
                        }
                        if (abstractC6848g2 == null) {
                            abstractC6848g = abstractC6848g2;
                            arrayList = arrayList3;
                            if (abstractC6848g == null) {
                                return abstractC6848g;
                            }
                            throw new C4992a("Can't convert " + obj3 + " with contentType " + c6417f + " using converters " + t.m2(arrayList, null, null, null, C4997f.f41315Y, 31), 0);
                        }
                        it = it3;
                        c4996e = c4996e2;
                        arrayList2 = arrayList3;
                        c5760d2 = c5760d3;
                        if (!it.hasNext()) {
                            C4993b c4993b2 = (C4993b) it.next();
                            De.i iVar = c4993b2.f41300a;
                            Charset S = AbstractC4344b.S(c6417f);
                            if (S == null) {
                                S = Lg.a.f11131a;
                            }
                            Charset charset = S;
                            c5760d2.getClass();
                            Je.a aVar = (Je.a) c5760d2.f46130f.d(AbstractC5766j.f46160a);
                            AbstractC3557B.Z(aVar);
                            if (!AbstractC3557B.K(obj3, C6843b.f52007a)) {
                                obj2 = obj3;
                            } else {
                                obj2 = null;
                            }
                            c4996e.f41306Y = c5760d2;
                            c4996e.f41307Z = obj3;
                            c4996e.f41308h0 = c6417f;
                            c4996e.f41309i0 = arrayList2;
                            c4996e.f41310j0 = it;
                            c4996e.f41311k0 = c4993b2;
                            c4996e.f41314n0 = 1;
                            Object b10 = iVar.b(c6417f, charset, aVar, obj2, c4996e);
                            if (b10 == enumC5000a) {
                                return enumC5000a;
                            }
                            c5760d3 = c5760d2;
                            c4993b = c4993b2;
                            C4996e c4996e3 = c4996e;
                            it3 = it;
                            obj4 = b10;
                            arrayList3 = arrayList2;
                            c4996e2 = c4996e3;
                            AbstractC6848g abstractC6848g22 = (AbstractC6848g) obj4;
                            if (abstractC6848g22 != null) {
                            }
                            if (abstractC6848g22 == null) {
                            }
                        } else {
                            arrayList = arrayList2;
                            if (abstractC6848g == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj4);
                    List<C4993b> list2 = this.f41322a;
                    for (C4993b c4993b3 : list2) {
                        i.f41324a.c("Adding Accept=" + c4993b3.f41301b.f49886c + " header for " + c5760d2.f46125a);
                        List list3 = AbstractC6435x.f49956a;
                        C6417f c6417f3 = c4993b3.f41301b;
                        String abstractC6429r = c6417f3.toString();
                        C6433v c6433v = c5760d2.f46127c;
                        c6433v.getClass();
                        AbstractC3557B.c0("value", abstractC6429r);
                        List list4 = (List) c6433v.f5366b.get(SIPHeaderNames.ACCEPT);
                        if (list4 == null || !list4.contains(abstractC6429r)) {
                            c5760d.a().f(SIPHeaderNames.ACCEPT, c6417f3.toString());
                        }
                    }
                    if (!(obj3 instanceof AbstractC6848g)) {
                        Set<AbstractC0405d> set = this.f41323b;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (AbstractC0405d abstractC0405d : set) {
                                if (abstractC0405d.r(obj3)) {
                                    i.f41324a.c("Body type " + C.f37623a.b(obj.getClass()) + " is in ignored types. Skipping ContentNegotiation for " + c5760d2.f46125a + '.');
                                    return null;
                                }
                            }
                        }
                        C6417f l02 = AbstractC3557B.l0(c5760d);
                        C6405J c6405j = c5760d2.f46125a;
                        if (l02 == null) {
                            i.f41324a.c("Request doesn't have Content-Type header. Skipping ContentNegotiation for " + c6405j + '.');
                            return null;
                        }
                        boolean z10 = obj3 instanceof y;
                        C6433v c6433v2 = c5760d2.f46127c;
                        if (z10) {
                            i.f41324a.c("Sending empty body for " + c6405j);
                            List list5 = AbstractC6435x.f49956a;
                            c6433v2.j(SIPHeaderNames.CONTENT_TYPE);
                            return C6215c.f48500a;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : list2) {
                            if (((C4993b) obj6).f41302c.a(l02)) {
                                arrayList4.add(obj6);
                            }
                        }
                        if (!(!arrayList4.isEmpty())) {
                            arrayList4 = null;
                        }
                        if (arrayList4 == null) {
                            i.f41324a.c("None of the registered converters match request Content-Type=" + l02 + ". Skipping ContentNegotiation for " + c6405j + '.');
                            return null;
                        }
                        if (((Je.a) c5760d2.f46130f.d(AbstractC5766j.f46160a)) == null) {
                            i.f41324a.c("Request has unknown body type. Skipping ContentNegotiation for " + c6405j + '.');
                            return null;
                        }
                        List list6 = AbstractC6435x.f49956a;
                        c6433v2.j(SIPHeaderNames.CONTENT_TYPE);
                        it = arrayList4.iterator();
                        c6417f = l02;
                        arrayList2 = arrayList4;
                        if (!it.hasNext()) {
                        }
                    } else {
                        i.f41324a.c("Body type " + C.f37623a.b(obj.getClass()) + " is in ignored types. Skipping ContentNegotiation for " + c5760d2.f46125a + '.');
                        return null;
                    }
                }
            }
        }
        c4996e = new C4996e(this, abstractC4825e);
        Object obj42 = c4996e.f41312l0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4996e.f41314n0;
        AbstractC6848g abstractC6848g3 = null;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C6410O c6410o, Je.a aVar, Object obj, C6417f c6417f, Charset charset, AbstractC4825e abstractC4825e) {
        C4998g c4998g;
        Object obj2;
        int i10;
        if (abstractC4825e instanceof C4998g) {
            c4998g = (C4998g) abstractC4825e;
            int i11 = c4998g.f41319i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4998g.f41319i0 = i11 - Integer.MIN_VALUE;
                obj2 = c4998g.f41317Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4998g.f41319i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c6410o = c4998g.f41316Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    if (!(obj instanceof x)) {
                        i.f41324a.c("Response body is already transformed. Skipping ContentNegotiation for " + c6410o + '.');
                        return null;
                    }
                    if (this.f41323b.contains(aVar.f9097a)) {
                        i.f41324a.c("Response body type " + aVar.f9097a + " is in ignored types. Skipping ContentNegotiation for " + c6410o + '.');
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : this.f41322a) {
                        if (((C4993b) obj3).f41302c.a(c6417f)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C4993b) it.next()).f41300a);
                    }
                    if (!(!arrayList2.isEmpty())) {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        i.f41324a.c("None of the registered converters match response with Content-Type=" + c6417f + ". Skipping ContentNegotiation for " + c6410o + '.');
                        return null;
                    }
                    c4998g.f41316Y = c6410o;
                    c4998g.f41319i0 = 1;
                    obj2 = P4.a.I(arrayList2, (x) obj, aVar, charset, c4998g);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                if (!(obj2 instanceof x)) {
                    i.f41324a.c("Response body was converted to " + C.f37623a.b(obj2.getClass()) + " for " + c6410o + '.');
                }
                return obj2;
            }
        }
        c4998g = new C4998g(this, abstractC4825e);
        obj2 = c4998g.f41317Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4998g.f41319i0;
        if (i10 == 0) {
        }
        if (!(obj2 instanceof x)) {
        }
        return obj2;
    }
}

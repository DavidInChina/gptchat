package qe;

import Ng.C1059e0;
import Ng.Q;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import me.C4628a;
import nf.AbstractC4825e;
import te.AbstractC5759c;
import te.C5760d;
import xe.AbstractC6435x;
import xe.C6417f;
import ze.AbstractC6848g;

/* renamed from: qe.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5320l {

    /* renamed from: e  reason: collision with root package name */
    public static final C4628a f44112e = new C4628a(8, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final Fe.a f44113f = new Fe.a("ClientLogging");

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5314f f44114a;

    /* renamed from: b  reason: collision with root package name */
    public final int f44115b;

    /* renamed from: c  reason: collision with root package name */
    public final List f44116c;

    /* renamed from: d  reason: collision with root package name */
    public final List f44117d;

    public C5320l(AbstractC5314f abstractC5314f, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.f44114a = abstractC5314f;
        this.f44115b = i10;
        this.f44116c = arrayList;
        this.f44117d = arrayList2;
    }

    public static final Object a(C5320l c5320l, C5760d c5760d, AbstractC4825e abstractC4825e) {
        Charset charset;
        Object obj;
        String str;
        Object obj2;
        String str2;
        c5320l.getClass();
        Object obj3 = c5760d.f46128d;
        AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.http.content.OutgoingContent", obj3);
        AbstractC6848g abstractC6848g = (AbstractC6848g) obj3;
        C5312d c5312d = new C5312d(c5320l.f44114a);
        c5760d.f46130f.e(AbstractC5321m.f44118a, c5312d);
        StringBuilder sb2 = new StringBuilder();
        int i10 = c5320l.f44115b;
        if (AbstractC4194d.m(i10)) {
            sb2.append("REQUEST: " + N.c(c5760d.f46125a));
            sb2.append('\n');
            sb2.append("METHOD: " + c5760d.f46126b);
            sb2.append('\n');
        }
        if (AbstractC4194d.l(i10)) {
            sb2.append("COMMON HEADERS\n");
            Set a5 = c5760d.f46127c.a();
            List list = c5320l.f44117d;
            AbstractC3557B.a2(sb2, a5, list);
            sb2.append("CONTENT HEADERS");
            sb2.append('\n');
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    wf.k kVar = ((q) obj).f44132b;
                    List list2 = AbstractC6435x.f49956a;
                    if (((Boolean) kVar.invoke(SIPHeaderNames.CONTENT_LENGTH)).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            q qVar = (q) obj;
            if (qVar != null) {
                str = qVar.f44131a;
            } else {
                str = null;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    wf.k kVar2 = ((q) obj2).f44132b;
                    List list3 = AbstractC6435x.f49956a;
                    if (((Boolean) kVar2.invoke(SIPHeaderNames.CONTENT_TYPE)).booleanValue()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            q qVar2 = (q) obj2;
            if (qVar2 != null) {
                str2 = qVar2.f44131a;
            } else {
                str2 = null;
            }
            Long a10 = abstractC6848g.a();
            if (a10 != null) {
                long longValue = a10.longValue();
                List list4 = AbstractC6435x.f49956a;
                if (str == null) {
                    str = String.valueOf(longValue);
                }
                AbstractC3557B.Z1(sb2, SIPHeaderNames.CONTENT_LENGTH, str);
            }
            C6417f b10 = abstractC6848g.b();
            if (b10 != null) {
                List list5 = AbstractC6435x.f49956a;
                if (str2 == null) {
                    str2 = b10.toString();
                }
                AbstractC3557B.Z1(sb2, SIPHeaderNames.CONTENT_TYPE, str2);
            }
            AbstractC3557B.a2(sb2, abstractC6848g.c().a(), list);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        if (sb3.length() > 0) {
            String obj4 = Lg.n.U2(sb3).toString();
            StringBuilder sb4 = c5312d.f44084b;
            sb4.append(obj4);
            sb4.append('\n');
        }
        if (sb3.length() == 0 || !AbstractC4194d.j(i10)) {
            c5312d.a();
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("BODY Content-Type: " + abstractC6848g.b());
        sb5.append('\n');
        C6417f b11 = abstractC6848g.b();
        if (b11 == null || (charset = AbstractC4344b.S(b11)) == null) {
            charset = Lg.a.f11131a;
        }
        t b12 = r.f.b();
        Ad.l.O0(C1059e0.f12936Y, Q.f12905b, null, new C5317i(b12, charset, sb5, null), 2).V(new Oc.c(c5312d, 11, sb5));
        return r.f.Q(abstractC6848g, b12, abstractC4825e);
    }

    public static final void b(C5320l c5320l, StringBuilder sb2, AbstractC5759c abstractC5759c, Throwable th2) {
        if (AbstractC4194d.m(c5320l.f44115b)) {
            sb2.append("RESPONSE " + abstractC5759c.O() + " failed with exception: " + th2);
        }
    }
}

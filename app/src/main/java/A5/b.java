package A5;

import N.C1040y;
import Wh.AbstractC1659d;
import Wh.B;
import Wh.D;
import Wh.w;
import Wh.y;
import Wh.z;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.TrafficStats;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import jf.C3963m;
import jh.H1;
import jh.L1;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import s5.AbstractC5577b;
import s5.C5576a;
import u5.C5843c;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5577b f660Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f661Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1659d f662h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f663i0;

    /* renamed from: j0  reason: collision with root package name */
    public final M5.a f664j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C3963m f665k0 = R4.b.D1(new X0.b(17, this));

    public b(AbstractC5577b abstractC5577b, AbstractC5091c abstractC5091c, w wVar, String str, M5.a aVar) {
        AbstractC3557B.c0("requestFactory", abstractC5577b);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        AbstractC3557B.c0("sdkVersion", str);
        this.f660Y = abstractC5577b;
        this.f661Z = abstractC5091c;
        this.f662h0 = wVar;
        this.f663i0 = str;
        this.f664j0 = aVar;
    }

    public final t a(C5576a c5576a) {
        Wh.u uVar;
        Object obj;
        String str;
        EnumC5090b enumC5090b;
        Iterator it = c5576a.f45402d.entrySet().iterator();
        while (true) {
            uVar = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Lg.n.f2((String) ((Map.Entry) obj).getKey(), "DD-API-KEY")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            str = (String) entry.getValue();
        } else {
            str = null;
        }
        if (str != null) {
            if (str.length() != 0) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt == '\t' || (' ' <= charAt && charAt < '\u007f')) {
                    }
                }
            }
            return new t(false, 0);
        }
        String str2 = c5576a.f45404f;
        if (str2 != null) {
            Pattern pattern = Wh.u.f21259c;
            uVar = L1.p(str2);
        }
        y yVar = new y();
        yVar.g(c5576a.f45401c);
        int i11 = B.f21116a;
        byte[] bArr = c5576a.f45403e;
        yVar.e("POST", H1.k(0, bArr.length, uVar, bArr));
        Iterator it2 = c5576a.f45402d.entrySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            enumC5090b = EnumC5090b.f42739Z;
            if (!hasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            Locale locale = Locale.US;
            if (AbstractC3557B.K(AbstractC6463a.j("US", locale, str3, locale, "this as java.lang.String).toLowerCase(locale)"), "user-agent")) {
                P4.a.m0(this.f661Z, 4, enumC5090b, a.f654Z, null, false, 56);
            } else {
                yVar.a(str3, str4);
            }
        }
        yVar.a(SIPHeaderNames.USER_AGENT, (String) this.f665k0.getValue());
        z b10 = yVar.b();
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        D f6 = ((w) this.f662h0).b(b10).f();
        f6.close();
        int i12 = f6.f21133i0;
        if (i12 != 202) {
            if (i12 != 403) {
                if (i12 != 408) {
                    if (i12 != 413) {
                        if (i12 != 429) {
                            if (i12 != 500 && i12 != 507) {
                                if (i12 != 400) {
                                    if (i12 != 401) {
                                        switch (i12) {
                                            case 502:
                                            case 503:
                                            case 504:
                                                break;
                                            default:
                                                P4.a.l0(this.f661Z, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C1040y(i12, c5576a, 1), null, 56);
                                                return new t(false, i12);
                                        }
                                    } else {
                                        return new t(false, i12);
                                    }
                                } else {
                                    return new t(false, i12);
                                }
                            }
                            return new t(true, i12);
                        }
                        return new t(true, i12);
                    }
                    return new t(false, i12);
                }
                return new t(true, i12);
            }
            return new t(false, i12);
        }
        return new t(false, i12);
    }

    @Override // A5.e
    public final t i(C5271a c5271a, List list, byte[] bArr) {
        t tVar;
        String str;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42738Y;
        AbstractC3557B.c0("context", c5271a);
        AbstractC3557B.c0("batch", list);
        try {
            C5576a a5 = this.f660Y.a(c5271a, list);
            try {
                tVar = a(a5);
            } catch (Throwable th2) {
                P4.a.m0(this.f661Z, 5, enumC5090b2, a.f656i0, th2, false, 48);
                tVar = o.f689c;
            }
            int length = a5.f45403e.length;
            String str2 = a5.f45400b;
            AbstractC3557B.c0("context", str2);
            AbstractC5091c abstractC5091c = this.f661Z;
            AbstractC3557B.c0("logger", abstractC5091c);
            String str3 = a5.f45399a;
            if (str3 == null) {
                str = "Batch [" + length + " bytes] (" + str2 + Separators.RPAREN;
            } else {
                StringBuilder sb2 = new StringBuilder("Batch ");
                sb2.append(str3);
                sb2.append(" [");
                sb2.append(length);
                sb2.append(" bytes] (");
                str = R.a.t(sb2, str2, Separators.RPAREN);
            }
            if (tVar instanceof o) {
                P4.a.m0(abstractC5091c, 4, enumC5090b2, new C5843c(str, 5), null, false, 56);
            } else if (tVar instanceof n) {
                P4.a.m0(abstractC5091c, 5, enumC5090b2, new C5843c(str, 6), null, false, 56);
            } else if (tVar instanceof k) {
                P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C5843c(str, 8), null, 56);
            } else if (tVar instanceof l) {
                P4.a.l0(abstractC5091c, 4, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C5843c(str, 9), null, 56);
            } else if (tVar instanceof m) {
                P4.a.m0(abstractC5091c, 5, enumC5090b2, new C5843c(str, 10), null, false, 56);
            } else if (tVar instanceof r) {
                P4.a.m0(abstractC5091c, 5, enumC5090b2, new C5843c(str, 11), null, false, 56);
            } else if (tVar instanceof p) {
                P4.a.m0(abstractC5091c, 5, enumC5090b2, new C5843c(str, 12), null, false, 56);
            } else if (tVar instanceof q) {
                P4.a.m0(abstractC5091c, 3, enumC5090b2, new C5843c(str, 13), null, false, 56);
            }
            return tVar;
        } catch (Exception e10) {
            P4.a.l0(this.f661Z, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), a.f655h0, e10, 48);
            return p.f690c;
        }
    }
}

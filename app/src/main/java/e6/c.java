package e6;

import C6.g;
import Lg.n;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.z;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import bi.f;
import g6.d;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaStreamTrack;
import o6.C4945y;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.C5089a;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import r6.AbstractC5369a;
import r6.C5370b;
import u5.C5843c;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: k  reason: collision with root package name */
    public final P5.c f28979k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, P5.c] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, P5.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(List list, S5.c cVar) {
        super(null, r2, r3, "rum", cVar, C2805a.f28975Y);
        ?? obj = new Object();
        ?? obj2 = new Object();
        AbstractC3557B.c0("firstPartyHosts", list);
        int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
        for (Object obj3 : list) {
            String str = (String) obj3;
            linkedHashMap.put(obj3, R4.b.X1(g.f2720Y, g.f2723i0));
        }
        this.f28979k = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r5.equals("POST") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r5.equals("GET") == false) goto L37;
     */
    @Override // g6.d, Wh.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D a(f fVar) {
        r5.d dVar;
        String str;
        AbstractC5091c abstractC5091c;
        int i10 = 1;
        AbstractC5092d n10 = this.f31300j.n();
        AbstractC5368c abstractC5368c = null;
        if (n10 instanceof r5.d) {
            dVar = (r5.d) n10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            abstractC5368c = dVar.h("rum");
        }
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (abstractC5368c != null) {
            z zVar = fVar.f26028e;
            String str2 = zVar.f21336a.f21257h;
            AbstractC5091c l10 = dVar.l();
            Locale locale = Locale.US;
            AbstractC3557B.b0("US", locale);
            String str3 = zVar.f21337b;
            String upperCase = str3.toUpperCase(locale);
            AbstractC3557B.b0("this as java.lang.String).toUpperCase(locale)", upperCase);
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals(TokenNames.OPTIONS)) {
                        i10 = 8;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 70454:
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        i10 = 4;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        i10 = 3;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 2461856:
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        i10 = 6;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        i10 = 7;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        i10 = 9;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        i10 = 5;
                        break;
                    }
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
                default:
                    P4.a.l0(l10, 4, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), new C5843c(str3, 27), null, 56);
                    i10 = 2;
                    break;
            }
            i6.b.a(dVar).s(A7.b.a1(zVar), i10, str2, w.f37484Y);
        } else {
            String str4 = this.f31291a;
            if (str4 == null) {
                str = "Default SDK instance";
            } else {
                str = "SDK instance with name=".concat(str4);
            }
            if (dVar == null || (abstractC5091c = dVar.l()) == null) {
                AbstractC5091c.f42742a.getClass();
                abstractC5091c = C5089a.f42737b;
            }
            P4.a.m0(abstractC5091c, 3, enumC5090b, new C5843c(str, 26), null, false, 56);
        }
        return super.a(fVar);
    }

    @Override // g6.d
    public final boolean b() {
        r5.d dVar;
        AbstractC5092d n10 = this.f31300j.n();
        AbstractC5368c abstractC5368c = null;
        if (n10 instanceof r5.d) {
            dVar = (r5.d) n10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            abstractC5368c = dVar.h("rum");
        }
        if (abstractC5368c == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Map] */
    @Override // g6.d
    public final void d(u5.g gVar, z zVar, ff.c cVar, D d10, Throwable th2) {
        Throwable th3;
        boolean z10;
        int i10;
        w wVar;
        P5.c cVar2;
        Long l10;
        F f6;
        Long l11;
        int i11;
        AbstractC3557B.c0("request", zVar);
        super.d(gVar, zVar, cVar, d10, th2);
        if (gVar.h("rum") != null) {
            w wVar2 = w.f37484Y;
            P5.c cVar3 = this.f28979k;
            if (d10 != null) {
                if (cVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String a12 = A7.b.a1(zVar);
                String h10 = D.h(d10, SIPHeaderNames.CONTENT_TYPE);
                if (h10 == null) {
                    i10 = 5;
                } else {
                    String R22 = n.R2(h10, '/');
                    Locale locale = Locale.US;
                    String j6 = AbstractC6463a.j("US", locale, R22, locale, "this as java.lang.String).toLowerCase(locale)");
                    String lowerCase = n.R2(n.N2('/', h10, h10), ';').toLowerCase(locale);
                    AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", lowerCase);
                    if (AbstractC3557B.K(j6, "image")) {
                        i11 = 7;
                    } else if (!AbstractC3557B.K(j6, MediaStreamTrack.VIDEO_TRACK_KIND) && !AbstractC3557B.K(j6, MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        if (AbstractC3557B.K(j6, "font")) {
                            i11 = 9;
                        } else if (AbstractC3557B.K(j6, ParameterNames.TEXT) && AbstractC3557B.K(lowerCase, "css")) {
                            i11 = 10;
                        } else if (AbstractC3557B.K(j6, ParameterNames.TEXT) && AbstractC3557B.K(lowerCase, "javascript")) {
                            i11 = 8;
                        } else {
                            i11 = 5;
                        }
                    } else {
                        i11 = 11;
                    }
                    i10 = i11;
                }
                if (z10 && cVar != null) {
                    wVar = AbstractC4268D.a1(new C3959i("_dd.trace_id", cVar.c().b()), new C3959i("_dd.span_id", cVar.c().a()), new C3959i("_dd.rule_psr", ((S5.c) this.f31295e).a()));
                } else {
                    wVar = wVar2;
                }
                i6.f a5 = i6.b.a(gVar);
                Integer valueOf = Integer.valueOf(d10.f21133i0);
                AbstractC5091c l12 = gVar.l();
                EnumC5090b enumC5090b = EnumC5090b.f42739Z;
                try {
                    f6 = d10.f21136l0;
                } catch (IOException e10) {
                    e = e10;
                    cVar2 = cVar3;
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    cVar2 = cVar3;
                } catch (IllegalStateException e12) {
                    e = e12;
                    cVar2 = cVar3;
                }
                if (f6 == null) {
                    cVar2 = cVar3;
                } else {
                    cVar2 = cVar3;
                    try {
                        long j10 = ((E) f6).f21145Z;
                        if (j10 <= 0) {
                            l11 = null;
                        } else {
                            l11 = Long.valueOf(j10);
                        }
                        if (l11 == null) {
                            long j11 = d10.j().f21145Z;
                            if (j11 > 0) {
                                l10 = Long.valueOf(j11);
                            }
                        } else {
                            l10 = l11;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        P4.a.m0(l12, 5, enumC5090b, b.f28976Y, e, false, 48);
                        l10 = null;
                        cVar2.getClass();
                        a5.j(a12, valueOf, l10, i10, AbstractC4268D.e1(wVar, wVar2));
                        return;
                    } catch (IllegalArgumentException e14) {
                        e = e14;
                        P4.a.l0(l12, 5, AbstractC4344b.G0(enumC5090b, EnumC5090b.f42740h0), b.f28978h0, e, 48);
                        l10 = null;
                        cVar2.getClass();
                        a5.j(a12, valueOf, l10, i10, AbstractC4268D.e1(wVar, wVar2));
                        return;
                    } catch (IllegalStateException e15) {
                        e = e15;
                        P4.a.m0(l12, 5, enumC5090b, b.f28977Z, e, false, 48);
                        l10 = null;
                        cVar2.getClass();
                        a5.j(a12, valueOf, l10, i10, AbstractC4268D.e1(wVar, wVar2));
                        return;
                    }
                    cVar2.getClass();
                    a5.j(a12, valueOf, l10, i10, AbstractC4268D.e1(wVar, wVar2));
                    return;
                }
                l10 = null;
                cVar2.getClass();
                a5.j(a12, valueOf, l10, i10, AbstractC4268D.e1(wVar, wVar2));
                return;
            }
            if (th2 == null) {
                th3 = new IllegalStateException("The request ended with no response nor any exception.");
            } else {
                th3 = th2;
            }
            String a13 = A7.b.a1(zVar);
            String str = zVar.f21336a.f21257h;
            i6.f a10 = i6.b.a(gVar);
            String format = String.format(Locale.US, "OkHttp request error %s %s", Arrays.copyOf(new Object[]{zVar.f21337b, str}, 2));
            cVar3.getClass();
            a10.i(a13, format, th3);
        }
    }

    @Override // g6.d
    public final void e(u5.g gVar) {
        AbstractC5369a abstractC5369a;
        AbstractC3557B.c0("sdkCore", gVar);
        super.e(gVar);
        i6.f a5 = i6.b.a(gVar);
        if (a5 instanceof AbstractC5369a) {
            abstractC5369a = (AbstractC5369a) a5;
        } else {
            abstractC5369a = null;
        }
        if (abstractC5369a != null) {
            ((C5370b) abstractC5369a).d(new C4945y(4, "", null, null, null, null, false, 448));
        }
    }
}

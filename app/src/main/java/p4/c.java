package p4;

import H0.C0672c0;
import Lg.m;
import Lg.n;
import Wh.C1658c;
import Wh.q;
import Wh.y;
import Wh.z;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Bitmap;
import bi.AbstractC2228c;
import id.AbstractC3557B;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jf.AbstractC3957g;
import jh.H1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final z f42720a;

    /* renamed from: b  reason: collision with root package name */
    public final b f42721b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f42722c;

    /* renamed from: d  reason: collision with root package name */
    public final String f42723d;

    /* renamed from: e  reason: collision with root package name */
    public final Date f42724e;

    /* renamed from: f  reason: collision with root package name */
    public final String f42725f;

    /* renamed from: g  reason: collision with root package name */
    public final Date f42726g;

    /* renamed from: h  reason: collision with root package name */
    public final long f42727h;

    /* renamed from: i  reason: collision with root package name */
    public final long f42728i;

    /* renamed from: j  reason: collision with root package name */
    public final String f42729j;

    /* renamed from: k  reason: collision with root package name */
    public final int f42730k;

    public c(z zVar, b bVar) {
        int i10;
        this.f42720a = zVar;
        this.f42721b = bVar;
        this.f42730k = -1;
        if (bVar != null) {
            this.f42727h = bVar.f42716c;
            this.f42728i = bVar.f42717d;
            q qVar = bVar.f42719f;
            int size = qVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String y10 = qVar.y(i11);
                if (n.f2(y10, SIPHeaderNames.DATE)) {
                    String r10 = qVar.r(SIPHeaderNames.DATE);
                    Date date = null;
                    if (r10 != null) {
                        C0672c0 c0672c0 = AbstractC2228c.f26021a;
                        if (r10.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date parse = ((DateFormat) AbstractC2228c.f26021a.get()).parse(r10, parsePosition);
                            if (parsePosition.getIndex() == r10.length()) {
                                date = parse;
                            } else {
                                String[] strArr = AbstractC2228c.f26022b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= length) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = AbstractC2228c.f26023c;
                                            DateFormat dateFormat = dateFormatArr[i12];
                                            if (dateFormat == null) {
                                                dateFormat = new SimpleDateFormat(AbstractC2228c.f26022b[i12], Locale.US);
                                                dateFormat.setTimeZone(Xh.b.f22000e);
                                                dateFormatArr[i12] = dateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date parse2 = dateFormat.parse(r10, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = parse2;
                                                break;
                                            }
                                            i12++;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    this.f42722c = date;
                    this.f42723d = qVar.T(i11);
                } else if (n.f2(y10, SIPHeaderNames.EXPIRES)) {
                    this.f42726g = qVar.s(SIPHeaderNames.EXPIRES);
                } else if (n.f2(y10, "Last-Modified")) {
                    this.f42724e = qVar.s("Last-Modified");
                    this.f42725f = qVar.T(i11);
                } else if (n.f2(y10, "ETag")) {
                    this.f42729j = qVar.T(i11);
                } else if (n.f2(y10, "Age")) {
                    String T = qVar.T(i11);
                    Bitmap.Config[] configArr = u4.e.f46388a;
                    Long X12 = m.X1(T);
                    if (X12 != null) {
                        long longValue = X12.longValue();
                        if (longValue > 2147483647L) {
                            i10 = Integer.MAX_VALUE;
                        } else if (longValue < 0) {
                            i10 = 0;
                        } else {
                            i10 = (int) longValue;
                        }
                    } else {
                        i10 = -1;
                    }
                    this.f42730k = i10;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r8 > 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d a() {
        long j6;
        String str;
        String str2;
        long j10;
        long j11;
        z zVar;
        long j12;
        String str3;
        int i10;
        String str4;
        z zVar2 = this.f42720a;
        b bVar = this.f42721b;
        if (bVar == null) {
            return new d(zVar2, null);
        }
        if (zVar2.f21336a.f21258i && !bVar.f42718e) {
            return new d(zVar2, null);
        }
        AbstractC3957g abstractC3957g = bVar.f42714a;
        C1658c c1658c = (C1658c) abstractC3957g.getValue();
        if (!zVar2.a().f21173b && !((C1658c) abstractC3957g.getValue()).f21173b && !AbstractC3557B.K(bVar.f42719f.r("Vary"), Separators.STAR)) {
            C1658c a5 = zVar2.a();
            if (!a5.f21172a) {
                q qVar = zVar2.f21338c;
                if (qVar.r("If-Modified-Since") == null && qVar.r("If-None-Match") == null) {
                    long j13 = this.f42728i;
                    Date date = this.f42722c;
                    if (date != null) {
                        j6 = Math.max(0L, j13 - date.getTime());
                    } else {
                        j6 = 0;
                    }
                    int i11 = this.f42730k;
                    if (i11 != -1) {
                        str2 = "If-Modified-Since";
                        str = "If-None-Match";
                        j6 = Math.max(j6, TimeUnit.SECONDS.toMillis(i11));
                    } else {
                        str2 = "If-Modified-Since";
                        str = "If-None-Match";
                    }
                    long j14 = this.f42727h;
                    long longValue = j6 + (j13 - j14) + (((Number) u4.m.f46411a.mo122invoke()).longValue() - j13);
                    int i12 = ((C1658c) abstractC3957g.getValue()).f21174c;
                    Date date2 = this.f42724e;
                    if (i12 != -1) {
                        j10 = TimeUnit.SECONDS.toMillis(i12);
                    } else {
                        Date date3 = this.f42726g;
                        if (date3 != null) {
                            if (date != null) {
                                j13 = date.getTime();
                            }
                            j10 = date3.getTime() - j13;
                        } else {
                            if (date2 != null) {
                                List list = zVar2.f21336a.f21255f;
                                if (list == null) {
                                    str4 = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    H1.v(sb2, list);
                                    str4 = sb2.toString();
                                }
                                if (str4 == null) {
                                    if (date != null) {
                                        j14 = date.getTime();
                                    }
                                    long time = j14 - date2.getTime();
                                    if (time > 0) {
                                        j10 = time / 10;
                                    }
                                }
                            }
                            j10 = 0;
                        }
                    }
                    int i13 = a5.f21174c;
                    if (i13 != -1) {
                        j10 = Math.min(j10, TimeUnit.SECONDS.toMillis(i13));
                    }
                    int i14 = a5.f21180i;
                    if (i14 != -1) {
                        j11 = TimeUnit.SECONDS.toMillis(i14);
                    } else {
                        j11 = 0;
                    }
                    if (!c1658c.f21178g && (i10 = a5.f21179h) != -1) {
                        zVar = zVar2;
                        j12 = TimeUnit.SECONDS.toMillis(i10);
                    } else {
                        zVar = zVar2;
                        j12 = 0;
                    }
                    if (!c1658c.f21172a && longValue + j11 < j10 + j12) {
                        return new d(null, bVar);
                    }
                    String str5 = this.f42729j;
                    if (str5 != null) {
                        str3 = str;
                    } else {
                        if (date2 != null) {
                            str5 = this.f42725f;
                            AbstractC3557B.Z(str5);
                        } else if (date != null) {
                            str5 = this.f42723d;
                            AbstractC3557B.Z(str5);
                        } else {
                            return new d(zVar, null);
                        }
                        str3 = str2;
                    }
                    y b10 = zVar.b();
                    b10.a(str3, str5);
                    return new d(b10.b(), bVar);
                }
            }
            return new d(zVar2, null);
        }
        return new d(zVar2, null);
    }
}

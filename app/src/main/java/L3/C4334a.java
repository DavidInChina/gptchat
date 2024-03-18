package l3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.statsig.androidsdk.StatsigLoggerKt;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r2.b;
import s2.AbstractC5535e;
import s2.p;
import s2.u;
import w8.e;
import x8.N;

/* renamed from: l3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4334a implements AbstractC3170m {

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f37740i0 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f37741j0 = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: Y  reason: collision with root package name */
    public final StringBuilder f37742Y = new StringBuilder();

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f37743Z = new ArrayList();

    /* renamed from: h0  reason: collision with root package name */
    public final u f37744h0 = new u();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(Spanned spanned, String str) {
        char c10;
        int i10;
        char c11;
        int i11;
        float f6;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = '\uffff';
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            default:
                c10 = '\uffff';
                break;
        }
        if (c10 != 0 && c10 != 1 && c10 != 2) {
            if (c10 != 3 && c10 != 4 && c10 != 5) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = '\uffff';
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = '\uffff';
                break;
            default:
                c11 = '\uffff';
                break;
        }
        if (c11 != 0 && c11 != 1 && c11 != 2) {
            if (c11 != 3 && c11 != 4 && c11 != 5) {
                i11 = 1;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 2;
        }
        float f10 = 0.92f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    f6 = 0.92f;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f6 = 0.5f;
            }
        } else {
            f6 = 0.08f;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
            } else {
                f10 = 0.5f;
            }
        } else {
            f10 = 0.08f;
        }
        return new b(spanned, null, null, null, f10, 0, i11, f6, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long c(Matcher matcher, int i10) {
        long j6;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j6 = Long.parseLong(group) * 3600000;
        } else {
            j6 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * StatsigLoggerKt.FLUSH_TIMER_MS) + j6;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        ArrayList<C3158a> arrayList;
        AbstractC5535e abstractC5535e2;
        String h10;
        String str;
        AbstractC5535e abstractC5535e3;
        C4334a c4334a = this;
        AbstractC5535e abstractC5535e4 = abstractC5535e;
        String str2 = "SubripParser";
        u uVar = c4334a.f37744h0;
        uVar.D(i10 + i11, bArr);
        uVar.F(i10);
        Charset B10 = uVar.B();
        if (B10 == null) {
            B10 = e.f48221c;
        }
        long j6 = c3169l.f31188a;
        if (j6 != -9223372036854775807L && c3169l.f31189b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String h11 = uVar.h(B10);
            if (h11 == null) {
                break;
            } else if (h11.length() != 0) {
                try {
                    Integer.parseInt(h11);
                    h10 = uVar.h(B10);
                } catch (NumberFormatException unused) {
                    abstractC5535e2 = abstractC5535e4;
                    p.g(str2, "Skipping invalid index: ".concat(h11));
                }
                if (h10 == null) {
                    p.g(str2, "Unexpected end");
                    break;
                }
                Matcher matcher = f37740i0.matcher(h10);
                if (matcher.matches()) {
                    long c10 = c(matcher, 1);
                    long c11 = c(matcher, 6);
                    StringBuilder sb2 = c4334a.f37742Y;
                    sb2.setLength(0);
                    ArrayList arrayList2 = c4334a.f37743Z;
                    arrayList2.clear();
                    for (String h12 = uVar.h(B10); !TextUtils.isEmpty(h12); h12 = uVar.h(B10)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = h12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f37741j0.matcher(trim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String str3 = str2;
                            String group = matcher2.group();
                            arrayList2.add(group);
                            Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i12;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i12 += length;
                            matcher2 = matcher3;
                            c11 = c11;
                            str2 = str3;
                        }
                        sb2.append(sb3.toString());
                        c11 = c11;
                        str2 = str2;
                    }
                    String str4 = str2;
                    long j10 = c11;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i13++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j6 != -9223372036854775807L && c10 < j6) {
                        if (arrayList != null) {
                            arrayList.add(new C3158a(c10, j10 - c10, N.u0(a(fromHtml, str))));
                        }
                        abstractC5535e3 = abstractC5535e;
                    } else {
                        abstractC5535e3 = abstractC5535e;
                        abstractC5535e3.accept(new C3158a(c10, j10 - c10, N.u0(a(fromHtml, str))));
                    }
                    abstractC5535e4 = abstractC5535e3;
                    str2 = str4;
                    c4334a = this;
                } else {
                    abstractC5535e2 = abstractC5535e4;
                    p.g(str2, "Skipping invalid timing: ".concat(h10));
                    abstractC5535e4 = abstractC5535e2;
                    c4334a = this;
                }
            }
        }
        AbstractC5535e abstractC5535e5 = abstractC5535e4;
        if (arrayList != null) {
            for (C3158a c3158a : arrayList) {
                abstractC5535e5.accept(c3158a);
            }
        }
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }
}

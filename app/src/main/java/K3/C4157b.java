package k3;

import E9.f;
import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC4344b;
import s2.AbstractC5530A;
import s2.AbstractC5535e;
import s2.p;
import s2.u;

/* renamed from: k3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4157b implements AbstractC3170m {

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f36966l0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f36967Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4156a f36968Z;

    /* renamed from: i0  reason: collision with root package name */
    public LinkedHashMap f36970i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f36971j0 = -3.4028235E38f;

    /* renamed from: k0  reason: collision with root package name */
    public float f36972k0 = -3.4028235E38f;

    /* renamed from: h0  reason: collision with root package name */
    public final u f36969h0 = new u();

    public C4157b(List list) {
        if (list != null && !list.isEmpty()) {
            this.f36967Y = true;
            String m10 = AbstractC5530A.m((byte[]) list.get(0));
            Gi.e.l(m10.startsWith("Format:"));
            C4156a b10 = C4156a.b(m10);
            b10.getClass();
            this.f36968Z = b10;
            c(new u((byte[]) list.get(1)), w8.e.f48221c);
            return;
        }
        this.f36967Y = false;
        this.f36968Z = null;
    }

    public static int a(long j6, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j6) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j6) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j6));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long d(String str) {
        Matcher matcher = f36966l0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = AbstractC5530A.f45131a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(u uVar, Charset charset) {
        e eVar;
        int i10;
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        while (true) {
            String h10 = uVar.h(charset);
            if (h10 != null) {
                int i11 = 0;
                char c10 = '[';
                if ("[Script Info]".equalsIgnoreCase(h10)) {
                    while (true) {
                        String h11 = uVar.h(charset);
                        if (h11 == null && (uVar.a() == 0 || uVar.c(charset) != '[')) {
                            String[] split = h11.split(":");
                            if (split.length != 2) {
                                String k12 = AbstractC4344b.k1(split[0].trim());
                                k12.getClass();
                                if (!k12.equals("playresx")) {
                                    if (k12.equals("playresy")) {
                                        try {
                                            this.f36972k0 = Float.parseFloat(split[1].trim());
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    String h112 = uVar.h(charset);
                                    if (h112 == null) {
                                        break;
                                    }
                                    String[] split2 = h112.split(":");
                                    if (split2.length != 2) {
                                    }
                                } else {
                                    this.f36971j0 = Float.parseFloat(split2[1].trim());
                                }
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(h10)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        C4158c c4158c = null;
                        while (true) {
                            String h12 = uVar.h(charset);
                            if (h12 != null && (uVar.a() == 0 || uVar.c(charset) != c10)) {
                                int i12 = -1;
                                if (h12.startsWith("Format:")) {
                                    String[] split3 = TextUtils.split(h12.substring(7), Separators.COMMA);
                                    int i13 = -1;
                                    int i14 = -1;
                                    int i15 = -1;
                                    int i16 = -1;
                                    int i17 = -1;
                                    int i18 = -1;
                                    int i19 = -1;
                                    int i20 = -1;
                                    int i21 = -1;
                                    int i22 = -1;
                                    for (int i23 = i11; i23 < split3.length; i23++) {
                                        String k13 = AbstractC4344b.k1(split3[i23].trim());
                                        k13.getClass();
                                        k13.hashCode();
                                        char c11 = '\uffff';
                                        switch (k13.hashCode()) {
                                            case -1178781136:
                                                if (k13.equals("italic")) {
                                                    c11 = 0;
                                                    break;
                                                }
                                                break;
                                            case -1026963764:
                                                if (k13.equals("underline")) {
                                                    c11 = 1;
                                                    break;
                                                }
                                                break;
                                            case -192095652:
                                                if (k13.equals("strikeout")) {
                                                    c11 = 2;
                                                    break;
                                                }
                                                break;
                                            case -70925746:
                                                if (k13.equals("primarycolour")) {
                                                    c11 = 3;
                                                    break;
                                                }
                                                break;
                                            case 3029637:
                                                if (k13.equals("bold")) {
                                                    c11 = 4;
                                                    break;
                                                }
                                                break;
                                            case 3373707:
                                                if (k13.equals("name")) {
                                                    c11 = 5;
                                                    break;
                                                }
                                                break;
                                            case 366554320:
                                                if (k13.equals("fontsize")) {
                                                    c11 = 6;
                                                    break;
                                                }
                                                break;
                                            case 767321349:
                                                if (k13.equals("borderstyle")) {
                                                    c11 = 7;
                                                    break;
                                                }
                                                break;
                                            case 1767875043:
                                                if (k13.equals("alignment")) {
                                                    c11 = '\b';
                                                    break;
                                                }
                                                break;
                                            case 1988365454:
                                                if (k13.equals("outlinecolour")) {
                                                    c11 = '\t';
                                                    break;
                                                }
                                                break;
                                        }
                                        switch (c11) {
                                            case 0:
                                                i19 = i23;
                                                break;
                                            case 1:
                                                i20 = i23;
                                                break;
                                            case 2:
                                                i21 = i23;
                                                break;
                                            case 3:
                                                i15 = i23;
                                                break;
                                            case 4:
                                                i18 = i23;
                                                break;
                                            case 5:
                                                i13 = i23;
                                                break;
                                            case 6:
                                                i17 = i23;
                                                break;
                                            case 7:
                                                i22 = i23;
                                                break;
                                            case '\b':
                                                i14 = i23;
                                                break;
                                            case '\t':
                                                i16 = i23;
                                                break;
                                        }
                                    }
                                    if (i13 != -1) {
                                        c4158c = new C4158c(i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, split3.length);
                                    }
                                } else {
                                    if (h12.startsWith("Style:")) {
                                        if (c4158c == null) {
                                            p.g("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(h12));
                                        } else {
                                            Gi.e.l(h12.startsWith("Style:"));
                                            String[] split4 = TextUtils.split(h12.substring(6), Separators.COMMA);
                                            int length = split4.length;
                                            int i24 = c4158c.f36983k;
                                            if (length != i24) {
                                                int length2 = split4.length;
                                                int i25 = AbstractC5530A.f45131a;
                                                Locale locale = Locale.US;
                                                StringBuilder A10 = f.A("Skipping malformed 'Style:' line (expected ", i24, " values, found ", length2, "): '");
                                                A10.append(h12);
                                                A10.append(Separators.QUOTE);
                                                p.g("SsaStyle", A10.toString());
                                            } else {
                                                try {
                                                    String trim = split4[c4158c.f36973a].trim();
                                                    int i26 = c4158c.f36974b;
                                                    if (i26 != -1) {
                                                        i10 = e.a(split4[i26].trim());
                                                    } else {
                                                        i10 = -1;
                                                    }
                                                    int i27 = c4158c.f36975c;
                                                    if (i27 != -1) {
                                                        num = e.c(split4[i27].trim());
                                                    } else {
                                                        num = null;
                                                    }
                                                    int i28 = c4158c.f36976d;
                                                    if (i28 != -1) {
                                                        num2 = e.c(split4[i28].trim());
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    int i29 = c4158c.f36977e;
                                                    float f6 = -3.4028235E38f;
                                                    if (i29 != -1) {
                                                        String trim2 = split4[i29].trim();
                                                        try {
                                                            f6 = Float.parseFloat(trim2);
                                                        } catch (NumberFormatException e10) {
                                                            p.h("SsaStyle", "Failed to parse font size: '" + trim2 + Separators.QUOTE, e10);
                                                        }
                                                    }
                                                    float f10 = f6;
                                                    int i30 = c4158c.f36978f;
                                                    if (i30 != -1 && e.b(split4[i30].trim())) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    int i31 = c4158c.f36979g;
                                                    if (i31 != -1 && e.b(split4[i31].trim())) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    int i32 = c4158c.f36980h;
                                                    if (i32 != -1 && e.b(split4[i32].trim())) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    int i33 = c4158c.f36981i;
                                                    if (i33 != -1 && e.b(split4[i33].trim())) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    int i34 = c4158c.f36982j;
                                                    if (i34 != -1) {
                                                        String trim3 = split4[i34].trim();
                                                        try {
                                                            int parseInt = Integer.parseInt(trim3.trim());
                                                            if (parseInt == 1 || parseInt == 3) {
                                                                i12 = parseInt;
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                        p.g("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                                    }
                                                    eVar = new e(trim, i10, num, num2, f10, z10, z11, z12, z13, i12);
                                                } catch (RuntimeException e11) {
                                                    p.h("SsaStyle", "Skipping malformed 'Style:' line: '" + h12 + Separators.QUOTE, e11);
                                                }
                                                if (eVar != null) {
                                                    linkedHashMap.put(eVar.f36988a, eVar);
                                                }
                                            }
                                            eVar = null;
                                            if (eVar != null) {
                                            }
                                        }
                                    }
                                    i11 = 0;
                                    c10 = '[';
                                }
                            }
                        }
                    }
                    this.f36970i0 = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(h10)) {
                    p.f("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(h10)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        C4156a c4156a;
        ArrayList<C3158a> arrayList;
        Charset charset;
        u uVar;
        C4156a c4156a2;
        e eVar;
        int i12;
        float f6;
        int i13;
        Layout.Alignment alignment;
        int i14;
        PointF pointF;
        float f10;
        float f11;
        float f12;
        int i15;
        int i16;
        Layout.Alignment alignment2;
        float f13;
        int i17;
        int i18;
        float f14;
        int i19;
        int i20;
        Integer num;
        int i21;
        int i22;
        C4157b c4157b = this;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        u uVar2 = c4157b.f36969h0;
        uVar2.D(i10 + i11, bArr);
        uVar2.F(i10);
        Charset B10 = uVar2.B();
        if (B10 == null) {
            B10 = w8.e.f48221c;
        }
        boolean z10 = c4157b.f36967Y;
        if (!z10) {
            c4157b.c(uVar2, B10);
        }
        if (z10) {
            c4156a = c4157b.f36968Z;
        } else {
            c4156a = null;
        }
        while (true) {
            String h10 = uVar2.h(B10);
            if (h10 != null) {
                if (h10.startsWith("Format:")) {
                    c4156a = C4156a.b(h10);
                } else {
                    if (h10.startsWith("Dialogue:")) {
                        if (c4156a == null) {
                            p.g("SsaParser", "Skipping dialogue line before complete format: ".concat(h10));
                        } else {
                            Gi.e.l(h10.startsWith("Dialogue:"));
                            String substring = h10.substring(9);
                            int i23 = c4156a.f36965e;
                            String[] split = substring.split(Separators.COMMA, i23);
                            if (split.length != i23) {
                                p.g("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(h10));
                            } else {
                                u uVar3 = uVar2;
                                long d10 = d(split[c4156a.f36961a]);
                                if (d10 == -9223372036854775807L) {
                                    p.g("SsaParser", "Skipping invalid timing: ".concat(h10));
                                } else {
                                    long d11 = d(split[c4156a.f36962b]);
                                    if (d11 == -9223372036854775807L) {
                                        p.g("SsaParser", "Skipping invalid timing: ".concat(h10));
                                    } else {
                                        LinkedHashMap linkedHashMap = c4157b.f36970i0;
                                        charset = B10;
                                        if (linkedHashMap != null && (i22 = c4156a.f36963c) != -1) {
                                            eVar = (e) linkedHashMap.get(split[i22].trim());
                                        } else {
                                            eVar = null;
                                        }
                                        String str = split[c4156a.f36964d];
                                        Matcher matcher = d.f36984a.matcher(str);
                                        int i24 = -1;
                                        PointF pointF2 = null;
                                        while (matcher.find()) {
                                            C4156a c4156a3 = c4156a;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a5 = d.a(group);
                                                if (a5 != null) {
                                                    pointF2 = a5;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = d.f36987d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i21 = e.a(group2);
                                                } else {
                                                    i21 = -1;
                                                }
                                                if (i21 != -1) {
                                                    i24 = i21;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            c4156a = c4156a3;
                                        }
                                        c4156a2 = c4156a;
                                        String replace = d.f36984a.matcher(str).replaceAll("").replace("\\N", Separators.RETURN).replace("\\n", Separators.RETURN).replace("\\h", "\u00a0");
                                        float f15 = c4157b.f36971j0;
                                        float f16 = c4157b.f36972k0;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (eVar != null) {
                                            Integer num2 = eVar.f36990c;
                                            if (num2 != null) {
                                                uVar = uVar3;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                uVar = uVar3;
                                            }
                                            if (eVar.f36997j == 3 && (num = eVar.f36991d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f17 = eVar.f36992e;
                                            if (f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                                                f13 = f17 / f16;
                                                i17 = 1;
                                            } else {
                                                f13 = -3.4028235E38f;
                                                i17 = Integer.MIN_VALUE;
                                            }
                                            boolean z11 = eVar.f36994g;
                                            boolean z12 = eVar.f36993f;
                                            if (z12 && z11) {
                                                i18 = i17;
                                                f14 = f13;
                                                i20 = 0;
                                                i19 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i18 = i17;
                                                f14 = f13;
                                                i20 = 0;
                                                i19 = 33;
                                                if (z12) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z11) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (eVar.f36995h) {
                                                spannableString.setSpan(new UnderlineSpan(), i20, spannableString.length(), i19);
                                            }
                                            if (eVar.f36996i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i20, spannableString.length(), i19);
                                            }
                                            i12 = i24;
                                            f6 = f14;
                                            i13 = i18;
                                        } else {
                                            uVar = uVar3;
                                            i12 = i24;
                                            f6 = -3.4028235E38f;
                                            i13 = Integer.MIN_VALUE;
                                        }
                                        int i25 = -1;
                                        if (i12 != -1) {
                                            i25 = i12;
                                        } else if (eVar != null) {
                                            i25 = eVar.f36989b;
                                        }
                                        switch (i25) {
                                            case 0:
                                            default:
                                                android.gov.nist.core.a.v("Unknown alignment: ", i25, "SsaParser");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                                alignment = alignment2;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment2 = Layout.Alignment.ALIGN_CENTER;
                                                alignment = alignment2;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment = alignment2;
                                                break;
                                        }
                                        int i26 = Integer.MIN_VALUE;
                                        switch (i25) {
                                            case 0:
                                            default:
                                                android.gov.nist.core.a.v("Unknown alignment: ", i25, "SsaParser");
                                            case -1:
                                                i14 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i14 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i14 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i14 = 2;
                                                break;
                                        }
                                        switch (i25) {
                                            case 0:
                                            default:
                                                android.gov.nist.core.a.v("Unknown alignment: ", i25, "SsaParser");
                                            case -1:
                                                pointF = pointF2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                pointF = pointF2;
                                                i26 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                pointF = pointF2;
                                                i26 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                pointF = pointF2;
                                                i26 = 0;
                                                break;
                                        }
                                        if (pointF != null && f16 != -3.4028235E38f && f15 != -3.4028235E38f) {
                                            f11 = pointF.y / f16;
                                            f10 = pointF.x / f15;
                                        } else {
                                            float f18 = 0.95f;
                                            if (i14 != 0) {
                                                i16 = 1;
                                                if (i14 != 1) {
                                                    i15 = 2;
                                                    if (i14 != 2) {
                                                        f12 = -3.4028235E38f;
                                                    } else {
                                                        f12 = 0.95f;
                                                    }
                                                } else {
                                                    i15 = 2;
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                i16 = 1;
                                                i15 = 2;
                                                f12 = 0.05f;
                                            }
                                            if (i26 != 0) {
                                                if (i26 != i16) {
                                                    if (i26 != i15) {
                                                        f18 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f18 = 0.5f;
                                                }
                                            } else {
                                                f18 = 0.05f;
                                            }
                                            f11 = f18;
                                            f10 = f12;
                                        }
                                        r2.b bVar = new r2.b(spannableString, alignment, null, null, f11, 0, i26, f10, i14, i13, f6, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int a10 = a(d11, arrayList3, arrayList2);
                                        for (int a11 = a(d10, arrayList3, arrayList2); a11 < a10; a11++) {
                                            ((List) arrayList2.get(a11)).add(bVar);
                                        }
                                        c4157b = this;
                                        B10 = charset;
                                        c4156a = c4156a2;
                                        uVar2 = uVar;
                                    }
                                }
                                charset = B10;
                                c4156a2 = c4156a;
                                uVar = uVar3;
                                c4157b = this;
                                B10 = charset;
                                c4156a = c4156a2;
                                uVar2 = uVar;
                            }
                        }
                    }
                    charset = B10;
                    c4156a2 = c4156a;
                    uVar = uVar2;
                    c4157b = this;
                    B10 = charset;
                    c4156a = c4156a2;
                    uVar2 = uVar;
                }
            } else {
                long j6 = c3169l.f31188a;
                if (j6 != -9223372036854775807L && c3169l.f31189b) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                for (int i27 = 0; i27 < arrayList2.size(); i27++) {
                    List list = (List) arrayList2.get(i27);
                    if (!list.isEmpty() || i27 == 0) {
                        if (i27 != arrayList2.size() - 1) {
                            long longValue = ((Long) arrayList3.get(i27)).longValue();
                            long longValue2 = ((Long) arrayList3.get(i27 + 1)).longValue() - ((Long) arrayList3.get(i27)).longValue();
                            if (j6 != -9223372036854775807L && longValue < j6) {
                                if (arrayList != null) {
                                    arrayList.add(new C3158a(longValue, longValue2, list));
                                }
                            } else {
                                abstractC5535e.accept(new C3158a(longValue, longValue2, list));
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (arrayList != null) {
                    for (C3158a c3158a : arrayList) {
                        abstractC5535e.accept(c3158a);
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }
}

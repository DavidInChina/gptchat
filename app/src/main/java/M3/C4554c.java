package m3;

import a1.C1915c;
import android.gov.nist.core.Separators;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import nf.AbstractC4828h;
import r2.C5357a;
import s2.AbstractC5530A;
import s2.p;

/* renamed from: m3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4554c {

    /* renamed from: a  reason: collision with root package name */
    public final String f38881a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38882b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f38883c;

    /* renamed from: d  reason: collision with root package name */
    public final long f38884d;

    /* renamed from: e  reason: collision with root package name */
    public final long f38885e;

    /* renamed from: f  reason: collision with root package name */
    public final C4558g f38886f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f38887g;

    /* renamed from: h  reason: collision with root package name */
    public final String f38888h;

    /* renamed from: i  reason: collision with root package name */
    public final String f38889i;

    /* renamed from: j  reason: collision with root package name */
    public final C4554c f38890j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f38891k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f38892l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f38893m;

    public C4554c(String str, String str2, long j6, long j10, C4558g c4558g, String[] strArr, String str3, String str4, C4554c c4554c) {
        boolean z10;
        this.f38881a = str;
        this.f38882b = str2;
        this.f38889i = str4;
        this.f38886f = c4558g;
        this.f38887g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38883c = z10;
        this.f38884d = j6;
        this.f38885e = j10;
        str3.getClass();
        this.f38888h = str3;
        this.f38890j = c4554c;
        this.f38891k = new HashMap();
        this.f38892l = new HashMap();
    }

    public static C4554c a(String str) {
        return new C4554c(null, str.replaceAll(Separators.NEWLINE, Separators.RETURN).replaceAll(" *\n *", Separators.RETURN).replaceAll(Separators.RETURN, Separators.SP).replaceAll("[ \t\\x0B\f\r]+", Separators.SP), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C5357a c5357a = new C5357a();
            c5357a.f44320a = new SpannableStringBuilder();
            treeMap.put(str, c5357a);
        }
        CharSequence charSequence = ((C5357a) treeMap.get(str)).f44320a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C4554c b(int i10) {
        ArrayList arrayList = this.f38893m;
        if (arrayList != null) {
            return (C4554c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f38893m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f38881a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f38889i != null)) {
            long j6 = this.f38884d;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
            long j10 = this.f38885e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f38893m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f38893m.size(); i10++) {
            C4554c c4554c = (C4554c) this.f38893m.get(i10);
            if (!z10 && !equals) {
                z11 = false;
            } else {
                z11 = true;
            }
            c4554c.d(treeSet, z11);
        }
    }

    public final boolean f(long j6) {
        long j10 = this.f38884d;
        int i10 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f38885e;
        if ((i10 == 0 && j11 == -9223372036854775807L) || ((j10 <= j6 && j11 == -9223372036854775807L) || ((j10 == -9223372036854775807L && j6 < j11) || (j10 <= j6 && j6 < j11)))) {
            return true;
        }
        return false;
    }

    public final void g(long j6, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f38888h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j6) && "div".equals(this.f38881a) && (str2 = this.f38889i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j6, str, arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r3v23, types: [J2.g, java.lang.Object] */
    public final void h(long j6, Map map, Map map2, String str, TreeMap treeMap) {
        String str2;
        int i10;
        int i11;
        int i12;
        C4554c c4554c;
        int i13;
        C4558g i02;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (!f(j6)) {
            return;
        }
        String str3 = this.f38888h;
        if ("".equals(str3)) {
            str2 = str;
        } else {
            str2 = str3;
        }
        for (Map.Entry entry : this.f38892l.entrySet()) {
            String str4 = (String) entry.getKey();
            HashMap hashMap = this.f38891k;
            if (hashMap.containsKey(str4)) {
                i10 = ((Integer) hashMap.get(str4)).intValue();
            } else {
                i10 = 0;
            }
            int intValue = ((Integer) entry.getValue()).intValue();
            if (i10 != intValue) {
                C5357a c5357a = (C5357a) treeMap.get(str4);
                c5357a.getClass();
                C4557f c4557f = (C4557f) map2.get(str2);
                c4557f.getClass();
                C4558g i03 = AbstractC4828h.i0(this.f38886f, this.f38887g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c5357a.f44320a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    c5357a.f44320a = spannableStringBuilder;
                }
                if (i03 != null) {
                    int i21 = i03.f38923h;
                    int i22 = 1;
                    if (i21 == -1 && i03.f38924i == -1) {
                        i11 = -1;
                    } else {
                        if (i21 == 1) {
                            i19 = 1;
                        } else {
                            i19 = 0;
                        }
                        if (i03.f38924i == 1) {
                            i20 = 2;
                        } else {
                            i20 = 0;
                        }
                        i11 = i19 | i20;
                    }
                    if (i11 != -1) {
                        int i23 = i03.f38923h;
                        if (i23 == -1) {
                            if (i03.f38924i == -1) {
                                i16 = -1;
                                i22 = 1;
                                StyleSpan styleSpan = new StyleSpan(i16);
                                i12 = 33;
                                spannableStringBuilder.setSpan(styleSpan, i10, intValue, 33);
                            } else {
                                i22 = 1;
                            }
                        }
                        if (i23 == i22) {
                            i17 = i22;
                        } else {
                            i17 = 0;
                        }
                        if (i03.f38924i == i22) {
                            i18 = 2;
                        } else {
                            i18 = 0;
                        }
                        i16 = i17 | i18;
                        StyleSpan styleSpan2 = new StyleSpan(i16);
                        i12 = 33;
                        spannableStringBuilder.setSpan(styleSpan2, i10, intValue, 33);
                    } else {
                        i12 = 33;
                    }
                    if (i03.f38921f == i22) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, intValue, i12);
                    }
                    if (i03.f38922g == i22) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, intValue, i12);
                    }
                    if (i03.f38918c) {
                        if (i03.f38918c) {
                            AbstractC4828h.p(spannableStringBuilder, new ForegroundColorSpan(i03.f38917b), i10, intValue);
                        } else {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                    }
                    if (i03.f38920e) {
                        if (i03.f38920e) {
                            AbstractC4828h.p(spannableStringBuilder, new BackgroundColorSpan(i03.f38919d), i10, intValue);
                        } else {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                    }
                    if (i03.f38916a != null) {
                        AbstractC4828h.p(spannableStringBuilder, new TypefaceSpan(i03.f38916a), i10, intValue);
                    }
                    C4553b c4553b = i03.f38933r;
                    if (c4553b != null) {
                        int i24 = c4553b.f38878a;
                        if (i24 == -1) {
                            int i25 = c4557f.f38915j;
                            if (i25 != 2 && i25 != 1) {
                                i15 = 1;
                            } else {
                                i15 = 3;
                            }
                            i24 = i15;
                            i14 = 1;
                        } else {
                            i14 = c4553b.f38879b;
                        }
                        int i26 = c4553b.f38880c;
                        if (i26 == -2) {
                            i26 = 1;
                        }
                        ?? obj = new Object();
                        obj.f8749a = i24;
                        obj.f8750b = i14;
                        obj.f8751c = i26;
                        AbstractC4828h.p(spannableStringBuilder, obj, i10, intValue);
                    }
                    int i27 = i03.f38928m;
                    if (i27 != 2) {
                        if (i27 == 3 || i27 == 4) {
                            spannableStringBuilder.setSpan(new Object(), i10, intValue, 33);
                        }
                    } else {
                        C4554c c4554c2 = this.f38890j;
                        while (true) {
                            if (c4554c2 != null) {
                                C4558g i04 = AbstractC4828h.i0(c4554c2.f38886f, c4554c2.f38887g, map);
                                if (i04 != null && i04.f38928m == 1) {
                                    break;
                                }
                                c4554c2 = c4554c2.f38890j;
                            } else {
                                c4554c2 = null;
                                break;
                            }
                        }
                        if (c4554c2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(c4554c2);
                            while (true) {
                                if (!arrayDeque.isEmpty()) {
                                    C4554c c4554c3 = (C4554c) arrayDeque.pop();
                                    C4558g i05 = AbstractC4828h.i0(c4554c3.f38886f, c4554c3.f38887g, map);
                                    if (i05 != null && i05.f38928m == 3) {
                                        c4554c = c4554c3;
                                        break;
                                    }
                                    for (int c10 = c4554c3.c() - 1; c10 >= 0; c10--) {
                                        arrayDeque.push(c4554c3.b(c10));
                                    }
                                } else {
                                    c4554c = null;
                                    break;
                                }
                            }
                            if (c4554c != null) {
                                if (c4554c.c() == 1 && c4554c.b(0).f38882b != null) {
                                    String str5 = c4554c.b(0).f38882b;
                                    int i28 = AbstractC5530A.f45131a;
                                    C4558g i06 = AbstractC4828h.i0(c4554c.f38886f, c4554c.f38887g, map);
                                    if (i06 != null) {
                                        i13 = i06.f38929n;
                                    } else {
                                        i13 = -1;
                                    }
                                    if (i13 == -1 && (i02 = AbstractC4828h.i0(c4554c2.f38886f, c4554c2.f38887g, map)) != null) {
                                        i13 = i02.f38929n;
                                    }
                                    spannableStringBuilder.setSpan(new r2.d(str5, i13), i10, intValue, 33);
                                } else {
                                    p.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                        }
                    }
                    if (i03.f38932q == 1) {
                        AbstractC4828h.p(spannableStringBuilder, new C1915c(26), i10, intValue);
                    }
                    int i29 = i03.f38925j;
                    if (i29 != 1) {
                        if (i29 != 2) {
                            if (i29 == 3) {
                                AbstractC4828h.p(spannableStringBuilder, new RelativeSizeSpan(i03.f38926k / 100.0f), i10, intValue);
                            }
                        } else {
                            AbstractC4828h.p(spannableStringBuilder, new RelativeSizeSpan(i03.f38926k), i10, intValue);
                        }
                    } else {
                        AbstractC4828h.p(spannableStringBuilder, new AbsoluteSizeSpan((int) i03.f38926k, true), i10, intValue);
                    }
                    if ("p".equals(this.f38881a)) {
                        float f6 = i03.f38934s;
                        if (f6 != Float.MAX_VALUE) {
                            c5357a.f44336q = (f6 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = i03.f38930o;
                        if (alignment != null) {
                            c5357a.f44322c = alignment;
                        }
                        Layout.Alignment alignment2 = i03.f38931p;
                        if (alignment2 != null) {
                            c5357a.f44323d = alignment2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        for (int i30 = 0; i30 < c(); i30++) {
            b(i30).h(j6, map, map2, str2, treeMap);
        }
    }

    public final void i(long j6, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f38891k;
        hashMap.clear();
        HashMap hashMap2 = this.f38892l;
        hashMap2.clear();
        String str3 = this.f38881a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f38888h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f38883c && z10) {
            SpannableStringBuilder e10 = e(str2, treeMap);
            String str5 = this.f38882b;
            str5.getClass();
            e10.append((CharSequence) str5);
        } else if ("br".equals(str3) && z10) {
            e(str2, treeMap).append('\n');
        } else if (f(j6)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((C5357a) entry.getValue()).f44320a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i10 = 0; i10 < c(); i10++) {
                C4554c b10 = b(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b10.i(j6, z11, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str2, treeMap);
                int length = e11.length() - 1;
                while (length >= 0 && e11.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((C5357a) entry2.getValue()).f44320a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

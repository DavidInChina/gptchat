package o3;

import a1.C1915c;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nf.AbstractC4828h;
import s2.AbstractC5530A;
import s2.p;
import s2.u;

/* renamed from: o3.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4912h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f40569a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f40570b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map f40571c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f40572d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f40571c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f40572d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0264 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(SpannableStringBuilder spannableStringBuilder, C4909e c4909e, String str, List list, List list2) {
        char c10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15 = c4909e.f40553b;
        int length = spannableStringBuilder.length();
        String str2 = c4909e.f40552a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i16 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c10 = 5;
                                    }
                                    c10 = '\uffff';
                                } else {
                                    if (str2.equals("u")) {
                                        c10 = 4;
                                    }
                                    c10 = '\uffff';
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c10 = 2;
                                }
                                c10 = '\uffff';
                            }
                        } else {
                            if (str2.equals("b")) {
                                c10 = 1;
                            }
                            c10 = '\uffff';
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c10 = 7;
                        }
                        c10 = '\uffff';
                    }
                } else {
                    if (str2.equals("lang")) {
                        c10 = 6;
                    }
                    c10 = '\uffff';
                }
            } else {
                if (str2.equals("i")) {
                    c10 = 3;
                }
                c10 = '\uffff';
            }
        } else {
            if (str2.equals("")) {
                c10 = 0;
            }
            c10 = '\uffff';
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i15, length, 33);
                break;
            case 2:
                for (String str3 : c4909e.f40555d) {
                    Map map = f40571c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i15, length, 33);
                    } else {
                        Map map2 = f40572d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i15, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, c4909e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C4908d.f40549c);
                int i17 = c4909e.f40553b;
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList.size()) {
                    if ("rt".equals(((C4908d) arrayList.get(i18)).f40550a.f40552a)) {
                        C4908d c4908d = (C4908d) arrayList.get(i18);
                        int c12 = c(list2, str, c4908d.f40550a);
                        if (c12 == i16) {
                            if (c11 != i16) {
                                c12 = c11;
                            } else {
                                c12 = 1;
                            }
                        }
                        int i20 = c4908d.f40550a.f40553b - i19;
                        int i21 = c4908d.f40551b - i19;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i20, i21);
                        spannableStringBuilder.delete(i20, i21);
                        spannableStringBuilder.setSpan(new r2.d(subSequence.toString(), c12), i17, i20, 33);
                        i19 = subSequence.length() + i19;
                        i17 = i20;
                    }
                    i18++;
                    i16 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, c4909e);
        for (int i22 = 0; i22 < b10.size(); i22++) {
            C4906b c4906b = ((C4910f) b10.get(i22)).f40557Z;
            if (c4906b != null) {
                int i23 = c4906b.f40540l;
                if (i23 != -1 || c4906b.f40541m != -1) {
                    if (i23 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c4906b.f40541m == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!(z10 | z11)) {
                        int i24 = c4906b.f40540l;
                        if (i24 == -1 && c4906b.f40541m == -1) {
                            i12 = -1;
                            i10 = 1;
                        } else {
                            i10 = 1;
                            if (i24 == 1) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            if (c4906b.f40541m == 1) {
                                i14 = 2;
                            } else {
                                i14 = 0;
                            }
                            i12 = i13 | i14;
                        }
                        AbstractC4828h.p(spannableStringBuilder, new StyleSpan(i12), i15, length);
                        if (c4906b.f40538j == i10) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                        }
                        if (c4906b.f40539k == i10) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, 33);
                        }
                        if (c4906b.f40535g) {
                            if (c4906b.f40535g) {
                                AbstractC4828h.p(spannableStringBuilder, new ForegroundColorSpan(c4906b.f40534f), i15, length);
                            } else {
                                throw new IllegalStateException("Font color not defined");
                            }
                        }
                        if (c4906b.f40537i) {
                            if (c4906b.f40537i) {
                                AbstractC4828h.p(spannableStringBuilder, new BackgroundColorSpan(c4906b.f40536h), i15, length);
                            } else {
                                throw new IllegalStateException("Background color not defined.");
                            }
                        }
                        if (c4906b.f40533e != null) {
                            AbstractC4828h.p(spannableStringBuilder, new TypefaceSpan(c4906b.f40533e), i15, length);
                        }
                        i11 = c4906b.f40542n;
                        if (i11 == 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    AbstractC4828h.p(spannableStringBuilder, new RelativeSizeSpan(c4906b.f40543o / 100.0f), i15, length);
                                }
                            } else {
                                AbstractC4828h.p(spannableStringBuilder, new RelativeSizeSpan(c4906b.f40543o), i15, length);
                            }
                        } else {
                            AbstractC4828h.p(spannableStringBuilder, new AbsoluteSizeSpan((int) c4906b.f40543o, true), i15, length);
                        }
                        if (!c4906b.f40545q) {
                            spannableStringBuilder.setSpan(new C1915c(26), i15, length, 33);
                        }
                    }
                }
                i10 = 1;
                if (c4906b.f40538j == i10) {
                }
                if (c4906b.f40539k == i10) {
                }
                if (c4906b.f40535g) {
                }
                if (c4906b.f40537i) {
                }
                if (c4906b.f40533e != null) {
                }
                i11 = c4906b.f40542n;
                if (i11 == 1) {
                }
                if (!c4906b.f40545q) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, C4909e c4909e) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C4906b c4906b = (C4906b) list.get(i11);
            String str2 = c4909e.f40552a;
            if (c4906b.f40529a.isEmpty() && c4906b.f40530b.isEmpty() && c4906b.f40531c.isEmpty() && c4906b.f40532d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a5 = C4906b.a(c4906b.f40532d, C4906b.a(c4906b.f40530b, C4906b.a(c4906b.f40529a, 0, 1073741824, str), 2, str2), 4, c4909e.f40554c);
                if (a5 != -1) {
                    if (c4909e.f40555d.containsAll(c4906b.f40531c)) {
                        i10 = a5 + (c4906b.f40531c.size() * 4);
                    }
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new C4910f(i10, c4906b));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, C4909e c4909e) {
        ArrayList b10 = b(list, str, c4909e);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((C4910f) b10.get(i10)).f40557Z.f40544p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static C4907c d(String str, Matcher matcher, u uVar, ArrayList arrayList) {
        C4911g c4911g = new C4911g();
        try {
            String group = matcher.group(1);
            group.getClass();
            c4911g.f40558a = AbstractC4913i.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c4911g.f40559b = AbstractC4913i.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, c4911g);
            StringBuilder sb2 = new StringBuilder();
            String h10 = uVar.h(w8.e.f48221c);
            while (!TextUtils.isEmpty(h10)) {
                if (sb2.length() > 0) {
                    sb2.append(Separators.RETURN);
                }
                sb2.append(h10.trim());
                h10 = uVar.h(w8.e.f48221c);
            }
            c4911g.f40560c = f(str, sb2.toString(), arrayList);
            return new C4907c(c4911g.a().a(), c4911g.f40558a, c4911g.f40559b);
        } catch (NumberFormatException unused) {
            p.g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r7.equals("start") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, C4911g c4911g) {
        int i10;
        int i11;
        Matcher matcher = f40570b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            int i12 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, c4911g);
                } else {
                    char c10 = 5;
                    char c11 = '\uffff';
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                if (group2.equals("center")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                i10 = 2;
                                break;
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                                i10 = 4;
                                break;
                            case 4:
                                i10 = 5;
                                break;
                            case 5:
                                i10 = 1;
                                break;
                            default:
                                p.g("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i10 = 2;
                                break;
                        }
                        c4911g.f40561d = i10;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c10 = '\uffff';
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 5:
                                    i12 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i12 = 1;
                                    break;
                                case 2:
                                case 4:
                                    break;
                                default:
                                    p.g("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i12 = Integer.MIN_VALUE;
                                    break;
                            }
                            c4911g.f40566i = i12;
                            group2 = group2.substring(0, indexOf);
                        }
                        c4911g.f40565h = AbstractC4913i.a(group2);
                    } else if ("size".equals(group)) {
                        c4911g.f40567j = AbstractC4913i.a(group2);
                    } else if ("vertical".equals(group)) {
                        if (!group2.equals("lr")) {
                            if (!group2.equals("rl")) {
                                p.g("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                                i11 = Integer.MIN_VALUE;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                        c4911g.f40568k = i11;
                    } else {
                        p.g("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                p.g("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (r11.equals("i") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString f(String str, String str2, List list) {
        String str3;
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            str3 = "";
            if (i11 < str2.length()) {
                char charAt = str2.charAt(i11);
                char c11 = 2;
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i11++;
                    } else {
                        int i12 = i11 + 1;
                        if (i12 < str2.length()) {
                            if (str2.charAt(i12) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int indexOf = str2.indexOf(62, i12);
                            if (indexOf == -1) {
                                i12 = str2.length();
                            } else {
                                i12 = indexOf + 1;
                            }
                            int i13 = i12 - 2;
                            if (str2.charAt(i13) == '/') {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                            int i14 = i11 + i10;
                            if (!z11) {
                                i13 = i12 - 1;
                            }
                            String substring = str2.substring(i14, i13);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                Gi.e.l(!trim.isEmpty());
                                int i15 = AbstractC5530A.f45131a;
                                String str4 = trim.split("[ \\.]", 2)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 105:
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = '\uffff';
                                        break;
                                    default:
                                        c11 = '\uffff';
                                        break;
                                }
                                switch (c11) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (z10) {
                                            while (!arrayDeque.isEmpty()) {
                                                C4909e c4909e = (C4909e) arrayDeque.pop();
                                                a(spannableStringBuilder, c4909e, str, arrayList, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new C4908d(c4909e, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (c4909e.f40552a.equals(str4)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z11) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            Gi.e.l(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(Separators.SP);
                                            if (indexOf2 == -1) {
                                                c10 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c10 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c10];
                                            HashSet hashSet = new HashSet();
                                            for (int i16 = 1; i16 < split.length; i16++) {
                                                hashSet.add(split[i16]);
                                            }
                                            arrayDeque.push(new C4909e(str5, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        i11 = i12;
                    }
                } else {
                    i11++;
                    int indexOf3 = str2.indexOf(59, i11);
                    int indexOf4 = str2.indexOf(32, i11);
                    char c12 = '\uffff';
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i11, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c12) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                p.g("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) Separators.SP);
                        }
                        i11 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(spannableStringBuilder, (C4909e) arrayDeque.pop(), str, arrayList, list);
        }
        a(spannableStringBuilder, new C4909e(str3, 0, str3, Collections.emptySet()), str, Collections.emptyList(), list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static void g(String str, C4911g c4911g) {
        int indexOf = str.indexOf(44);
        char c10 = '\uffff';
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    p.g("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            c4911g.f40564g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith(Separators.PERCENT)) {
            c4911g.f40562e = AbstractC4913i.a(str);
            c4911g.f40563f = 0;
            return;
        }
        c4911g.f40562e = Integer.parseInt(str);
        c4911g.f40563f = 1;
    }
}

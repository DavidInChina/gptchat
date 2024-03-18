package m3;

import D1.C0373t;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.Layout;
import android.text.TextUtils;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3164g;
import g3.C3169l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s2.AbstractC5530A;
import s2.AbstractC5534d;
import s2.AbstractC5535e;
import s2.p;
import x8.S;
import x8.T;
import x8.q0;
import x8.t0;
import x8.x0;

/* renamed from: m3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4556e implements AbstractC3170m {

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f38897Z = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f38898h0 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f38899i0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f38900j0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f38901k0 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f38902l0 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f38903m0 = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: n0  reason: collision with root package name */
    public static final C4555d f38904n0 = new C4555d(30.0f, 1, 1);

    /* renamed from: Y  reason: collision with root package name */
    public final XmlPullParserFactory f38905Y;

    public C4556e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f38905Y = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static C4558g a(C4558g c4558g) {
        if (c4558g == null) {
            return new C4558g();
        }
        return c4558g;
    }

    public static boolean c(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment d(String str) {
        String k12 = AbstractC4344b.k1(str);
        k12.getClass();
        char c10 = '\uffff';
        switch (k12.hashCode()) {
            case -1364013995:
                if (k12.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (k12.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (k12.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (k12.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (k12.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f38903m0.matcher(attributeValue);
        if (!matcher.matches()) {
            p.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            Gi.e.k("Invalid cell resolution " + parseInt + Separators.SP + parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            p.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void h(String str, C4558g c4558g) {
        Matcher matcher;
        int i10 = AbstractC5530A.f45131a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f38899i0;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            p.g("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(android.gov.nist.core.a.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, Separators.DOT));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c10 = '\uffff';
            switch (group.hashCode()) {
                case 37:
                    if (group.equals(Separators.PERCENT)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c4558g.f38925j = 3;
                    break;
                case 1:
                    c4558g.f38925j = 2;
                    break;
                case 2:
                    c4558g.f38925j = 1;
                    break;
                default:
                    throw new Exception(android.gov.nist.core.a.A("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            c4558g.f38926k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(android.gov.nist.core.a.A("Invalid expression for fontSize: '", str, "'."));
    }

    public static C4555d i(XmlPullParser xmlPullParser) {
        int i10;
        float f6;
        int i11;
        String[] split;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i12 = AbstractC5530A.f45131a;
            if (attributeValue2.split(Separators.SP, -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.k("frameRateMultiplier doesn't have 2 parts", z10);
            f6 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f6 = 1.0f;
        }
        C4555d c4555d = f38904n0;
        int i13 = c4555d.f38895b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i13 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        } else {
            i11 = c4555d.f38896c;
        }
        return new C4555d(i10 * f6, i13, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(XmlPullParser xmlPullParser, HashMap hashMap, int i10, C0373t c0373t, HashMap hashMap2, HashMap hashMap3) {
        String K10;
        C4557f c4557f;
        float parseFloat;
        float f6;
        float parseFloat2;
        float f10;
        int i11;
        String K11;
        int i12;
        char c10;
        String[] strArr;
        do {
            xmlPullParser.next();
            if (AbstractC4828h.W(xmlPullParser, "style")) {
                String K12 = AbstractC4828h.K(xmlPullParser, "style");
                C4558g l10 = l(xmlPullParser, new C4558g());
                if (K12 != null) {
                    String trim = K12.trim();
                    if (trim.isEmpty()) {
                        strArr = new String[0];
                    } else {
                        int i13 = AbstractC5530A.f45131a;
                        strArr = trim.split("\\s+", -1);
                    }
                    for (String str : strArr) {
                        l10.a((C4558g) hashMap.get(str));
                    }
                }
                String str2 = l10.f38927l;
                if (str2 != null) {
                    hashMap.put(str2, l10);
                }
            } else if (AbstractC4828h.W(xmlPullParser, "region")) {
                String K13 = AbstractC4828h.K(xmlPullParser, ParameterNames.ID);
                if (K13 != null) {
                    String K14 = AbstractC4828h.K(xmlPullParser, "origin");
                    if (K14 != null) {
                        Pattern pattern = f38901k0;
                        Matcher matcher = pattern.matcher(K14);
                        Pattern pattern2 = f38902l0;
                        Matcher matcher2 = pattern2.matcher(K14);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                float parseFloat3 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                parseFloat = Float.parseFloat(group2) / 100.0f;
                                f6 = parseFloat3;
                            } catch (NumberFormatException unused) {
                                p.g("TtmlParser", "Ignoring region with malformed origin: ".concat(K14));
                            }
                        } else if (matcher2.matches()) {
                            if (c0373t == null) {
                                p.g("TtmlParser", "Ignoring region with missing tts:extent: ".concat(K14));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    f6 = parseInt / c0373t.f3302a;
                                    parseFloat = Integer.parseInt(group4) / c0373t.f3303b;
                                } catch (NumberFormatException unused2) {
                                    p.g("TtmlParser", "Ignoring region with malformed origin: ".concat(K14));
                                }
                            }
                        } else {
                            p.g("TtmlParser", "Ignoring region with unsupported origin: ".concat(K14));
                        }
                        String K15 = AbstractC4828h.K(xmlPullParser, "extent");
                        if (K15 != null) {
                            Matcher matcher3 = pattern.matcher(K15);
                            Matcher matcher4 = pattern2.matcher(K15);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    float parseFloat4 = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat2 = Float.parseFloat(group6) / 100.0f;
                                    f10 = parseFloat4;
                                } catch (NumberFormatException unused3) {
                                    p.g("TtmlParser", "Ignoring region with malformed extent: ".concat(K14));
                                }
                            } else if (matcher4.matches()) {
                                if (c0373t == null) {
                                    p.g("TtmlParser", "Ignoring region with missing tts:extent: ".concat(K14));
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt2 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        f10 = parseInt2 / c0373t.f3302a;
                                        parseFloat2 = Integer.parseInt(group8) / c0373t.f3303b;
                                    } catch (NumberFormatException unused4) {
                                        p.g("TtmlParser", "Ignoring region with malformed extent: ".concat(K14));
                                    }
                                }
                            } else {
                                p.g("TtmlParser", "Ignoring region with unsupported extent: ".concat(K14));
                            }
                            String K16 = AbstractC4828h.K(xmlPullParser, "displayAlign");
                            if (K16 != null) {
                                String k12 = AbstractC4344b.k1(K16);
                                k12.getClass();
                                if (!k12.equals("center")) {
                                    if (k12.equals("after")) {
                                        parseFloat += parseFloat2;
                                        i11 = 2;
                                    }
                                } else {
                                    parseFloat = (parseFloat2 / 2.0f) + parseFloat;
                                    i11 = 1;
                                }
                                float f11 = 1.0f / i10;
                                K11 = AbstractC4828h.K(xmlPullParser, "writingMode");
                                if (K11 != null) {
                                    String k13 = AbstractC4344b.k1(K11);
                                    k13.getClass();
                                    switch (k13.hashCode()) {
                                        case 3694:
                                            if (k13.equals("tb")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 3553396:
                                            if (k13.equals("tblr")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 3553576:
                                            if (k13.equals("tbrl")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        default:
                                            c10 = '\uffff';
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                        case 1:
                                            i12 = 2;
                                            break;
                                        case 2:
                                            i12 = 1;
                                            break;
                                    }
                                    c4557f = new C4557f(K13, f6, parseFloat, 0, i11, f10, parseFloat2, 1, f11, i12);
                                    if (c4557f != null) {
                                        hashMap2.put(c4557f.f38906a, c4557f);
                                    }
                                }
                                i12 = Integer.MIN_VALUE;
                                c4557f = new C4557f(K13, f6, parseFloat, 0, i11, f10, parseFloat2, 1, f11, i12);
                                if (c4557f != null) {
                                }
                            }
                            i11 = 0;
                            float f112 = 1.0f / i10;
                            K11 = AbstractC4828h.K(xmlPullParser, "writingMode");
                            if (K11 != null) {
                            }
                            i12 = Integer.MIN_VALUE;
                            c4557f = new C4557f(K13, f6, parseFloat, 0, i11, f10, parseFloat2, 1, f112, i12);
                            if (c4557f != null) {
                            }
                        } else {
                            p.g("TtmlParser", "Ignoring region without an extent");
                        }
                    } else {
                        p.g("TtmlParser", "Ignoring region without an origin");
                    }
                }
                c4557f = null;
                if (c4557f != null) {
                }
            } else if (AbstractC4828h.W(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (AbstractC4828h.W(xmlPullParser, "image") && (K10 = AbstractC4828h.K(xmlPullParser, ParameterNames.ID)) != null) {
                        hashMap3.put(K10, xmlPullParser.nextText());
                    }
                } while (!AbstractC4828h.V(xmlPullParser, "metadata"));
            }
        } while (!AbstractC4828h.V(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4554c k(XmlPullParser xmlPullParser, C4554c c4554c, HashMap hashMap, C4555d c4555d) {
        long j6;
        long j10;
        char c10;
        String[] strArr;
        int attributeCount = xmlPullParser.getAttributeCount();
        C4558g l10 = l(xmlPullParser, null);
        String[] strArr2 = null;
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                default:
                    c10 = '\uffff';
                    break;
            }
            switch (c10) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j13 = m(attributeValue, c4555d);
                    break;
                case 2:
                    j12 = m(attributeValue, c4555d);
                    break;
                case 3:
                    j11 = m(attributeValue, c4555d);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        strArr = new String[0];
                    } else {
                        int i11 = AbstractC5530A.f45131a;
                        strArr = trim.split("\\s+", -1);
                    }
                    if (strArr.length > 0) {
                        strArr2 = strArr;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith(Separators.POUND)) {
                        str = attributeValue.substring(1);
                    }
            }
        }
        if (c4554c != null) {
            long j14 = c4554c.f38884d;
            j6 = -9223372036854775807L;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (j12 == j6) {
            if (j13 != j6) {
                j10 = j11 + j13;
            } else if (c4554c != null) {
                long j15 = c4554c.f38885e;
                if (j15 != j6) {
                    j10 = j15;
                }
            }
            return new C4554c(xmlPullParser.getName(), null, j11, j10, l10, strArr2, str2, str, c4554c);
        }
        j10 = j12;
        return new C4554c(xmlPullParser.getName(), null, j11, j10, l10, strArr2, str2, str, c4554c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r6.equals(android.gov.nist.javax.sip.header.ParameterNames.ID) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4558g l(XmlPullParser xmlPullParser, C4558g c4558g) {
        S s10;
        Object obj;
        char c10;
        int i10;
        t0 f12;
        Object obj2;
        int i11;
        T t10;
        Object obj3;
        int hashCode;
        int i12;
        C4553b c4553b;
        int attributeCount = xmlPullParser.getAttributeCount();
        C4558g c4558g2 = c4558g;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            String attributeName = xmlPullParser.getAttributeName(i13);
            attributeName.getClass();
            char c11 = 5;
            int i14 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c11 = 0;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c11 = 1;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c11 = 2;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c11 = 3;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c11 = 4;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 3355:
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c11 = 6;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c11 = 7;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c11 = 11;
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = '\uffff';
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c11 = 14;
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
                    c4558g2 = a(c4558g2);
                    c4558g2.f38924i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c4558g2 = a(c4558g2);
                    c4558g2.f38916a = attributeValue;
                    break;
                case 2:
                    c4558g2 = a(c4558g2);
                    c4558g2.f38930o = d(attributeValue);
                    break;
                case 3:
                    String k12 = AbstractC4344b.k1(attributeValue);
                    k12.getClass();
                    k12.hashCode();
                    char c12 = '\uffff';
                    switch (k12.hashCode()) {
                        case -1461280213:
                            if (k12.equals("nounderline")) {
                                c12 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (k12.equals("underline")) {
                                c12 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (k12.equals("nolinethrough")) {
                                c12 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (k12.equals("linethrough")) {
                                c12 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c12) {
                        case 0:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38922g = 0;
                            continue;
                        case 1:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38922g = 1;
                            continue;
                        case 2:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38921f = 0;
                            continue;
                        case 3:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38921f = 1;
                            continue;
                    }
                case 4:
                    c4558g2 = a(c4558g2);
                    c4558g2.f38923h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c4558g2 = a(c4558g2);
                        c4558g2.f38927l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String k13 = AbstractC4344b.k1(attributeValue);
                    k13.getClass();
                    k13.hashCode();
                    char c13 = '\uffff';
                    switch (k13.hashCode()) {
                        case -618561360:
                            if (k13.equals("baseContainer")) {
                                c13 = 0;
                                break;
                            }
                            break;
                        case -410956671:
                            if (k13.equals("container")) {
                                c13 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (k13.equals("delimiter")) {
                                c13 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (k13.equals("textContainer")) {
                                c13 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (k13.equals("base")) {
                                c13 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (k13.equals(ParameterNames.TEXT)) {
                                c13 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c13) {
                        case 0:
                        case 4:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38928m = 2;
                            continue;
                        case 1:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38928m = 1;
                            continue;
                        case 2:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38928m = 4;
                            continue;
                        case 3:
                        case 5:
                            c4558g2 = a(c4558g2);
                            c4558g2.f38928m = 3;
                            continue;
                    }
                case 7:
                    c4558g2 = a(c4558g2);
                    try {
                        c4558g2.f38917b = AbstractC5534d.a(attributeValue, false);
                        c4558g2.f38918c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC4194d.C("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\b':
                    C4558g a5 = a(c4558g2);
                    Matcher matcher = f38900j0.matcher(attributeValue);
                    float f6 = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        AbstractC4194d.C("Invalid value for shear: ", attributeValue, "TtmlParser");
                    } else {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f6 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e10) {
                            p.h("TtmlParser", "Failed to parse shear: " + attributeValue, e10);
                        }
                    }
                    a5.f38934s = f6;
                    c4558g2 = a5;
                    break;
                case '\t':
                    String k14 = AbstractC4344b.k1(attributeValue);
                    k14.getClass();
                    if (!k14.equals("all")) {
                        if (!k14.equals("none")) {
                            break;
                        } else {
                            c4558g2 = a(c4558g2);
                            c4558g2.f38932q = 0;
                            break;
                        }
                    } else {
                        c4558g2 = a(c4558g2);
                        c4558g2.f38932q = 1;
                        break;
                    }
                case '\n':
                    try {
                        c4558g2 = a(c4558g2);
                        h(attributeValue, c4558g2);
                        break;
                    } catch (C3164g unused2) {
                        AbstractC4194d.C("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 11:
                    c4558g2 = a(c4558g2);
                    Pattern pattern = C4553b.f38873d;
                    C4553b c4553b2 = null;
                    if (attributeValue != null) {
                        String k15 = AbstractC4344b.k1(attributeValue.trim());
                        if (!k15.isEmpty()) {
                            String[] split = TextUtils.split(k15, C4553b.f38873d);
                            int length = split.length;
                            if (length != 0) {
                                if (length != 1) {
                                    s10 = S.U(split.length, (Object[]) split.clone());
                                } else {
                                    s10 = new x0(split[0]);
                                }
                            } else {
                                s10 = q0.f49601o0;
                            }
                            T t11 = new T(A7.b.f1(C4553b.f38877h, s10));
                            if (!t11.hasNext()) {
                                obj = "outside";
                            } else {
                                obj = t11.next();
                            }
                            String str = (String) obj;
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        c10 = 0;
                                        if (c10 == 0) {
                                            if (c10 != 1) {
                                                i10 = 1;
                                            } else {
                                                i10 = -2;
                                            }
                                        } else {
                                            i10 = 2;
                                        }
                                        f12 = A7.b.f1(C4553b.f38874e, s10);
                                        if (f12.isEmpty()) {
                                            String str2 = (String) new T(f12).next();
                                            int hashCode3 = str2.hashCode();
                                            if (hashCode3 != 3005871) {
                                                if (hashCode3 == 3387192 && str2.equals("none")) {
                                                    i14 = 0;
                                                }
                                            } else {
                                                str2.equals("auto");
                                            }
                                            c4553b = new C4553b(i14, 0, i10);
                                        } else {
                                            t0 f13 = A7.b.f1(C4553b.f38876g, s10);
                                            t0 f14 = A7.b.f1(C4553b.f38875f, s10);
                                            if (f13.isEmpty() && f14.isEmpty()) {
                                                c4553b = new C4553b(-1, 0, i10);
                                            } else {
                                                T t12 = new T(f13);
                                                if (!t12.hasNext()) {
                                                    obj2 = "filled";
                                                } else {
                                                    obj2 = t12.next();
                                                }
                                                String str3 = (String) obj2;
                                                int hashCode4 = str3.hashCode();
                                                if (hashCode4 != -1274499742) {
                                                    if (hashCode4 == 3417674 && str3.equals("open")) {
                                                        i11 = 2;
                                                        t10 = new T(f14);
                                                        if (t10.hasNext()) {
                                                            obj3 = "circle";
                                                        } else {
                                                            obj3 = t10.next();
                                                        }
                                                        String str4 = (String) obj3;
                                                        hashCode = str4.hashCode();
                                                        if (hashCode == -1360216880) {
                                                            if (hashCode != -905816648) {
                                                                if (hashCode == 99657 && str4.equals("dot")) {
                                                                    i14 = 0;
                                                                }
                                                            } else if (str4.equals("sesame")) {
                                                                i14 = 1;
                                                            }
                                                        } else if (str4.equals("circle")) {
                                                            i14 = 2;
                                                        }
                                                        if (i14 == 0) {
                                                            if (i14 != 1) {
                                                                i12 = 1;
                                                            } else {
                                                                i12 = 3;
                                                            }
                                                        } else {
                                                            i12 = 2;
                                                        }
                                                        c4553b = new C4553b(i12, i11, i10);
                                                    }
                                                } else {
                                                    str3.equals("filled");
                                                }
                                                i11 = 1;
                                                t10 = new T(f14);
                                                if (t10.hasNext()) {
                                                }
                                                String str42 = (String) obj3;
                                                hashCode = str42.hashCode();
                                                if (hashCode == -1360216880) {
                                                }
                                                if (i14 == 0) {
                                                }
                                                c4553b = new C4553b(i12, i11, i10);
                                            }
                                        }
                                        c4553b2 = c4553b;
                                    }
                                    c10 = '\uffff';
                                    if (c10 == 0) {
                                    }
                                    f12 = A7.b.f1(C4553b.f38874e, s10);
                                    if (f12.isEmpty()) {
                                    }
                                    c4553b2 = c4553b;
                                } else {
                                    if (str.equals("outside")) {
                                        c10 = 1;
                                        if (c10 == 0) {
                                        }
                                        f12 = A7.b.f1(C4553b.f38874e, s10);
                                        if (f12.isEmpty()) {
                                        }
                                        c4553b2 = c4553b;
                                    }
                                    c10 = '\uffff';
                                    if (c10 == 0) {
                                    }
                                    f12 = A7.b.f1(C4553b.f38874e, s10);
                                    if (f12.isEmpty()) {
                                    }
                                    c4553b2 = c4553b;
                                }
                            } else {
                                if (str.equals("before")) {
                                    c10 = 2;
                                    if (c10 == 0) {
                                    }
                                    f12 = A7.b.f1(C4553b.f38874e, s10);
                                    if (f12.isEmpty()) {
                                    }
                                    c4553b2 = c4553b;
                                }
                                c10 = '\uffff';
                                if (c10 == 0) {
                                }
                                f12 = A7.b.f1(C4553b.f38874e, s10);
                                if (f12.isEmpty()) {
                                }
                                c4553b2 = c4553b;
                            }
                        }
                    }
                    c4558g2.f38933r = c4553b2;
                    break;
                case '\f':
                    String k16 = AbstractC4344b.k1(attributeValue);
                    k16.getClass();
                    if (!k16.equals("before")) {
                        if (!k16.equals("after")) {
                            break;
                        } else {
                            c4558g2 = a(c4558g2);
                            c4558g2.f38929n = 2;
                            break;
                        }
                    } else {
                        c4558g2 = a(c4558g2);
                        c4558g2.f38929n = 1;
                        break;
                    }
                case '\r':
                    c4558g2 = a(c4558g2);
                    try {
                        c4558g2.f38919d = AbstractC5534d.a(attributeValue, false);
                        c4558g2.f38920e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC4194d.C("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 14:
                    c4558g2 = a(c4558g2);
                    c4558g2.f38931p = d(attributeValue);
                    break;
            }
        }
        return c4558g2;
    }

    public static long m(String str, C4555d c4555d) {
        double d10;
        double d11;
        String group;
        String group2;
        String group3;
        double d12;
        double d13;
        String group4;
        Matcher matcher = f38897Z.matcher(str);
        if (matcher.matches()) {
            matcher.group(1).getClass();
            matcher.group(2).getClass();
            matcher.group(3).getClass();
            double parseLong = (Long.parseLong(group) * 3600) + (Long.parseLong(group2) * 60) + Long.parseLong(group3);
            String group5 = matcher.group(4);
            double d14 = 0.0d;
            if (group5 != null) {
                d12 = Double.parseDouble(group5);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong + d12;
            String group6 = matcher.group(5);
            if (group6 != null) {
                d13 = ((float) Long.parseLong(group6)) / c4555d.f38894a;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(group4) / c4555d.f38895b) / c4555d.f38894a;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f38898h0.matcher(str);
        if (matcher2.matches()) {
            String group7 = matcher2.group(1);
            group7.getClass();
            double parseDouble = Double.parseDouble(group7);
            String group8 = matcher2.group(2);
            group8.getClass();
            group8.hashCode();
            char c10 = '\uffff';
            switch (group8.hashCode()) {
                case 102:
                    if (group8.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group8.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group8.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group8.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group8.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = c4555d.f38894a;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d11 = 3600.0d;
                    parseDouble *= d11;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d11 = 60.0d;
                    parseDouble *= d11;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d10 = c4555d.f38896c;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        throw new Exception(R.a.r("Malformed time expression: ", str));
    }

    public static C0373t n(XmlPullParser xmlPullParser) {
        String K10 = AbstractC4828h.K(xmlPullParser, "extent");
        if (K10 == null) {
            return null;
        }
        Matcher matcher = f38902l0.matcher(K10);
        if (!matcher.matches()) {
            p.g("TtmlParser", "Ignoring non-pixel tts extent: ".concat(K10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0373t(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            p.g("TtmlParser", "Ignoring malformed tts extent: ".concat(K10));
            return null;
        }
    }

    @Override // g3.AbstractC3170m
    public final AbstractC3162e e(byte[] bArr, int i10, int i11) {
        C4555d c4555d;
        try {
            XmlPullParser newPullParser = this.f38905Y.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C4557f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0373t c0373t = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C4555d c4555d2 = f38904n0;
            int i12 = 15;
            C4559h c4559h = null;
            int i13 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C4554c c4554c = (C4554c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c4555d2 = i(newPullParser);
                            i12 = g(newPullParser);
                            c0373t = n(newPullParser);
                        }
                        C0373t c0373t2 = c0373t;
                        C4555d c4555d3 = c4555d2;
                        int i14 = i12;
                        if (!c(name)) {
                            p.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i13++;
                            c4555d2 = c4555d3;
                        } else {
                            if ("head".equals(name)) {
                                c4555d = c4555d3;
                                j(newPullParser, hashMap, i14, c0373t2, hashMap2, hashMap3);
                            } else {
                                c4555d = c4555d3;
                                try {
                                    C4554c k10 = k(newPullParser, c4554c, hashMap2, c4555d);
                                    arrayDeque.push(k10);
                                    if (c4554c != null) {
                                        if (c4554c.f38893m == null) {
                                            c4554c.f38893m = new ArrayList();
                                        }
                                        c4554c.f38893m.add(k10);
                                    }
                                } catch (C3164g e10) {
                                    p.h("TtmlParser", "Suppressing parser error", e10);
                                    i13++;
                                }
                            }
                            c4555d2 = c4555d;
                        }
                        c0373t = c0373t2;
                        i12 = i14;
                    } else if (eventType == 4) {
                        c4554c.getClass();
                        C4554c a5 = C4554c.a(newPullParser.getText());
                        if (c4554c.f38893m == null) {
                            c4554c.f38893m = new ArrayList();
                        }
                        c4554c.f38893m.add(a5);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C4554c c4554c2 = (C4554c) arrayDeque.peek();
                            c4554c2.getClass();
                            c4559h = new C4559h(c4554c2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            c4559h.getClass();
            return c4559h;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        R4.b.g2(e(bArr, i10, i11), c3169l, abstractC5535e);
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }
}

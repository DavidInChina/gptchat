package s2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaStreamTrack;
import m.C4528h;
import q1.AbstractC5260f;
import y8.AbstractC6546a;
import y8.AbstractC6547b;

/* renamed from: s2.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5530A {

    /* renamed from: a  reason: collision with root package name */
    public static final int f45131a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f45132b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f45133c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f45134d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f45135e;

    /* renamed from: i  reason: collision with root package name */
    public static HashMap f45139i;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f45136f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f45137g = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f45138h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f45140j = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", ParameterNames.ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f45141k = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f45142l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f45143m = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, RCHTTPStatusCodes.SUCCESS, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f45131a = i10;
        String str = Build.DEVICE;
        f45132b = str;
        String str2 = Build.MANUFACTURER;
        f45133c = str2;
        String str3 = Build.MODEL;
        f45134d = str3;
        f45135e = str + ", " + str3 + ", " + str2 + ", " + i10;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    public static boolean A(Context context) {
        int i10 = f45131a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = f45134d;
                if (AbstractC4344b.f0(str, "moto g(20)") || AbstractC4344b.f0(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean B(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long C(long j6) {
        if (j6 != -9223372036854775807L && j6 != Long.MIN_VALUE) {
            return j6 * 1000;
        }
        return j6;
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String k12 = AbstractC4344b.k1(str);
        int i10 = 0;
        String str2 = k12.split("-", 2)[0];
        if (f45139i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f45140j;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            f45139i = hashMap;
        }
        String str4 = (String) f45139i.get(str2);
        if (str4 != null) {
            StringBuilder p10 = android.gov.nist.core.a.p(str4);
            p10.append(k12.substring(str2.length()));
            k12 = p10.toString();
            str2 = str4;
        }
        if (!AuthorizationHeaderIms.NO.equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return k12;
        }
        while (true) {
            String[] strArr2 = f45141k;
            if (i10 < strArr2.length) {
                if (k12.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + k12.substring(strArr2[i10].length());
                }
                i10 += 2;
            } else {
                return k12;
            }
        }
    }

    public static Object[] E(int i10, Object[] objArr) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static void F(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long G(int i10, long j6) {
        return I(j6, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static void H(long[] jArr, long j6) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i10 = (j6 > 1000000L ? 1 : (j6 == 1000000L ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j6 % 1000000 == 0) {
            long p10 = AbstractC5260f.p(j6, 1000000L, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = AbstractC5260f.p(jArr[i11], p10, roundingMode);
                i11++;
            }
        } else if (i10 < 0 && 1000000 % j6 == 0) {
            long p11 = AbstractC5260f.p(1000000L, j6, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = AbstractC5260f.M(jArr[i11], p11);
                i11++;
            }
        } else {
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j10 = jArr[i12];
                if (j10 != 0) {
                    int i13 = (j6 > j10 ? 1 : (j6 == j10 ? 0 : -1));
                    if (i13 >= 0 && j6 % j10 == 0) {
                        jArr[i12] = AbstractC5260f.p(1000000L, AbstractC5260f.p(j6, j10, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i13 < 0 && j10 % j6 == 0) {
                        jArr[i12] = AbstractC5260f.M(1000000L, AbstractC5260f.p(j10, j6, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i12] = J(j10, 1000000L, j6, roundingMode);
                    }
                }
            }
        }
    }

    public static long I(long j6, long j10, long j11, RoundingMode roundingMode) {
        if (j6 == 0 || j10 == 0) {
            return 0L;
        }
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 >= 0 && j11 % j10 == 0) {
            return AbstractC5260f.p(j6, AbstractC5260f.p(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j10 % j11 == 0) {
            return AbstractC5260f.M(j6, AbstractC5260f.p(j10, j11, RoundingMode.UNNECESSARY));
        }
        int i11 = (j11 > j6 ? 1 : (j11 == j6 ? 0 : -1));
        if (i11 >= 0 && j11 % j6 == 0) {
            return AbstractC5260f.p(j10, AbstractC5260f.p(j11, j6, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 < 0 && j6 % j11 == 0) {
            return AbstractC5260f.M(j10, AbstractC5260f.p(j6, j11, RoundingMode.UNNECESSARY));
        }
        return J(j6, j10, j11, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long J(long j6, long j10, long j11, RoundingMode roundingMode) {
        double d10;
        boolean z10;
        long j12;
        int i10;
        long M10 = AbstractC5260f.M(j6, j10);
        if (M10 != Long.MAX_VALUE && M10 != Long.MIN_VALUE) {
            return AbstractC5260f.p(M10, j11, roundingMode);
        }
        long s10 = AbstractC5260f.s(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long p10 = AbstractC5260f.p(j10, s10, roundingMode2);
        long p11 = AbstractC5260f.p(j11, s10, roundingMode2);
        long s11 = AbstractC5260f.s(Math.abs(j6), Math.abs(p11));
        long p12 = AbstractC5260f.p(j6, s11, roundingMode2);
        long p13 = AbstractC5260f.p(p11, s11, roundingMode2);
        long M11 = AbstractC5260f.M(p12, p10);
        if (M11 != Long.MAX_VALUE && M11 != Long.MIN_VALUE) {
            return AbstractC5260f.p(M11, p13, roundingMode);
        }
        double d11 = p12 * (p10 / p13);
        if (d11 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d11 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i11 = AbstractC6547b.f50835a;
        if (Math.getExponent(d11) <= 1023) {
            boolean z11 = true;
            switch (AbstractC6546a.f50834a[roundingMode.ordinal()]) {
                case 1:
                    if (!AbstractC6547b.a(d11)) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    d10 = d11;
                    break;
                case 2:
                    if (d11 < 0.0d && !AbstractC6547b.a(d11)) {
                        j12 = ((long) d11) - 1;
                        d10 = j12;
                        break;
                    }
                    d10 = d11;
                    break;
                case 3:
                    if (d11 > 0.0d && !AbstractC6547b.a(d11)) {
                        j12 = ((long) d11) + 1;
                        d10 = j12;
                        break;
                    }
                    d10 = d11;
                    break;
                case 4:
                    d10 = d11;
                    break;
                case 5:
                    if (!AbstractC6547b.a(d11)) {
                        long j13 = (long) d11;
                        if (d11 > 0.0d) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        d10 = j13 + i10;
                        break;
                    }
                    d10 = d11;
                    break;
                case 6:
                    d10 = Math.rint(d11);
                    break;
                case 7:
                    d10 = Math.rint(d11);
                    if (Math.abs(d11 - d10) == 0.5d) {
                        d10 = Math.copySign(0.5d, d11) + d11;
                        break;
                    }
                    break;
                case 8:
                    d10 = Math.rint(d11);
                    break;
                default:
                    throw new AssertionError();
            }
            if ((-9.223372036854776E18d) - d10 < 1.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d10 >= 9.223372036854776E18d) {
                z11 = false;
            }
            if (z10 & z11) {
                return (long) d10;
            }
            String valueOf = String.valueOf(roundingMode);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 83);
            sb2.append("rounded value is out of range for input ");
            sb2.append(d11);
            sb2.append(" and rounding mode ");
            sb2.append(valueOf);
            throw new ArithmeticException(sb2.toString());
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static String[] K(String str) {
        return str.split(Separators.SLASH, -1);
    }

    public static long L(long j6) {
        if (j6 != -9223372036854775807L && j6 != Long.MIN_VALUE) {
            return j6 / 1000;
        }
        return j6;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j6, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i10 = binarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j6) {
                break;
            }
            binarySearch = i10;
        }
        if (z10) {
            return binarySearch;
        }
        return i10;
    }

    public static int c(C4528h c4528h, long j6) {
        int i10 = c4528h.f38769Y - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (c4528h.m(i12) < j6) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < c4528h.f38769Y && c4528h.m(i13) == j6) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i12 = binarySearch - 1;
                if (i12 < 0 || iArr[i12] != i10) {
                    break;
                }
                binarySearch = i12;
            }
            if (z10) {
                i11 = binarySearch;
            } else {
                i11 = i12;
            }
        }
        if (z11) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static int e(long[] jArr, long j6, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j6) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i10);
        }
        return i10;
    }

    public static int f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f6, float f10, float f11) {
        return Math.max(f10, Math.min(f6, f11));
    }

    public static int i(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long j(long j6, long j10, long j11) {
        return Math.max(j10, Math.min(j6, j11));
    }

    public static int k(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f45142l[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        Gi.e.o(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String m(byte[] bArr) {
        return new String(bArr, w8.e.f48221c);
    }

    public static int n(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 != 30) {
            if (i10 != 805306368) {
                switch (i10) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i10) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }
            return 31;
        }
        return 34;
    }

    public static AudioFormat o(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int p(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f45131a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    public static int q(int i10) {
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int r(String str) {
        String[] split;
        int length;
        boolean z10;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z10) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long s(float f6, long j6) {
        if (f6 == 1.0f) {
            return j6;
        }
        return Math.round(j6 * f6);
    }

    public static int t(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    if (i10 != 32) {
                        return 0;
                    }
                    return 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int u(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 != 536870912) {
                            if (i10 != 805306368) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                        return i11 * 3;
                    }
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 * 2;
    }

    public static String[] v() {
        String[] strArr;
        String str;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f45131a;
        if (i10 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(Separators.COMMA, -1);
        } else {
            Locale locale = configuration.locale;
            if (i10 >= 21) {
                str = locale.toLanguageTag();
            } else {
                str = locale.toString();
            }
            strArr = new String[]{str};
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = D(strArr[i11]);
        }
        return strArr;
    }

    public static String w(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            p.d("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String x(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return ParameterNames.TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return AbstractC4194d.v("custom (", i10, Separators.RPAREN);
                }
                return Separators.QUESTION;
        }
    }

    public static int y(Uri uri, String str) {
        int i10;
        char c10 = '\uffff';
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && AbstractC4344b.f0("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String k12 = AbstractC4344b.k1(lastPathSegment.substring(lastIndexOf + 1));
                k12.getClass();
                switch (k12.hashCode()) {
                    case 104579:
                        if (k12.equals("ism")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (k12.equals("mpd")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (k12.equals("isml")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (k12.equals("m3u8")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 2:
                        i10 = 1;
                        break;
                    case 1:
                        i10 = 0;
                        break;
                    case 3:
                        i10 = 2;
                        break;
                    default:
                        i10 = 4;
                        break;
                }
                if (i10 != 4) {
                    return i10;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = f45138h.matcher(path);
            if (!matcher.matches()) {
                return 4;
            }
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (group.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static boolean z(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 536870912 && i10 != 1342177280 && i10 != 805306368 && i10 != 1610612736 && i10 != 4) {
            return false;
        }
        return true;
    }
}

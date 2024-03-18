package C2;

import a1.C1915c;
import android.gov.nist.core.Separators;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.WebrtcBuildVersion;
import p2.C5059l;
import p2.C5065s;
import p2.N;
import p2.Y;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f2635a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f2636b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static int f2637c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC5530A.f45131a < 26 && AbstractC5530A.f45132b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f2547a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new t(0, new Y(23)));
        }
        int i10 = AbstractC5530A.f45131a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f2547a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new t(0, new Y(24)));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f2547a)) {
            arrayList.add((m) arrayList.remove(0));
        }
    }

    public static String b(C5065s c5065s) {
        Pair d10;
        if ("audio/eac3-joc".equals(c5065s.f42319q0)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c5065s.f42319q0) && (d10 = d(c5065s)) != null) {
            int intValue = ((Integer) d10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0375 A[Catch: NumberFormatException -> 0x0385, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0385, blocks: (B:212:0x032e, B:214:0x0340, B:226:0x035e, B:236:0x0375), top: B:490:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(C5065s c5065s) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Integer num;
        int i20;
        int i21;
        int i22;
        int i23;
        Integer num2;
        Integer num3;
        String str = c5065s.f42316n0;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(c5065s.f42319q0);
        int i24 = 2;
        String str2 = c5065s.f42316n0;
        if (equals) {
            if (split.length < 3) {
                AbstractC4194d.C("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            } else {
                Matcher matcher = f2635a.matcher(split[1]);
                if (!matcher.matches()) {
                    AbstractC4194d.C("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                } else {
                    String group = matcher.group(1);
                    if (group != null) {
                        group.hashCode();
                        char c11 = '\uffff';
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c11 = 6;
                                    break;
                                }
                                break;
                            case 1543:
                                if (group.equals(WebrtcBuildVersion.webrtc_commit)) {
                                    c11 = 7;
                                    break;
                                }
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c11 = '\b';
                                    break;
                                }
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c11 = '\t';
                                    break;
                                }
                                break;
                        }
                        switch (c11) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            AbstractC4194d.C("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
                        } else {
                            String str3 = split[2];
                            if (str3 != null) {
                                str3.hashCode();
                                char c12 = '\uffff';
                                switch (str3.hashCode()) {
                                    case 1537:
                                        if (str3.equals("01")) {
                                            c12 = 0;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str3.equals("02")) {
                                            c12 = 1;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str3.equals("03")) {
                                            c12 = 2;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str3.equals("04")) {
                                            c12 = 3;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str3.equals("05")) {
                                            c12 = 4;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str3.equals("06")) {
                                            c12 = 5;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str3.equals(WebrtcBuildVersion.webrtc_commit)) {
                                            c12 = 6;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str3.equals("08")) {
                                            c12 = 7;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str3.equals("09")) {
                                            c12 = '\b';
                                            break;
                                        }
                                        break;
                                    case 1567:
                                        if (str3.equals("10")) {
                                            c12 = '\t';
                                            break;
                                        }
                                        break;
                                    case 1568:
                                        if (str3.equals("11")) {
                                            c12 = '\n';
                                            break;
                                        }
                                        break;
                                    case 1569:
                                        if (str3.equals("12")) {
                                            c12 = 11;
                                            break;
                                        }
                                        break;
                                    case 1570:
                                        if (str3.equals("13")) {
                                            c12 = '\f';
                                            break;
                                        }
                                        break;
                                }
                                switch (c12) {
                                    case 0:
                                        num3 = 1;
                                        break;
                                    case 1:
                                        num3 = 2;
                                        break;
                                    case 2:
                                        num3 = 4;
                                        break;
                                    case 3:
                                        num3 = 8;
                                        break;
                                    case 4:
                                        num3 = 16;
                                        break;
                                    case 5:
                                        num3 = 32;
                                        break;
                                    case 6:
                                        num3 = 64;
                                        break;
                                    case 7:
                                        num3 = 128;
                                        break;
                                    case '\b':
                                        num3 = 256;
                                        break;
                                    case '\t':
                                        num3 = 512;
                                        break;
                                    case '\n':
                                        num3 = 1024;
                                        break;
                                    case 11:
                                        num3 = 2048;
                                        break;
                                    case '\f':
                                        num3 = 4096;
                                        break;
                                }
                                if (num3 != null) {
                                    AbstractC4194d.C("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                                } else {
                                    return new Pair(num2, num3);
                                }
                            }
                            num3 = null;
                            if (num3 != null) {
                            }
                        }
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                }
            }
            return null;
        }
        String str4 = split[0];
        str4.getClass();
        str4.hashCode();
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c10 = 2;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c10 = 4;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    c10 = 6;
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
                if (split.length < 4) {
                    AbstractC4194d.C("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int parseInt = Integer.parseInt(split[1]);
                        int parseInt2 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt3 = Integer.parseInt(split[3]);
                        if (parseInt != 0) {
                            android.gov.nist.core.a.v("Unknown AV1 profile: ", parseInt, "MediaCodecUtil");
                        } else if (parseInt3 != 8 && parseInt3 != 10) {
                            android.gov.nist.core.a.v("Unknown AV1 bit depth: ", parseInt3, "MediaCodecUtil");
                        } else {
                            if (parseInt3 == 8) {
                                i10 = 1;
                            } else {
                                C5059l c5059l = c5065s.f42296C0;
                                if (c5059l != null && (c5059l.f42107i0 != null || (i13 = c5059l.f42106h0) == 7 || i13 == 6)) {
                                    i10 = 4096;
                                } else {
                                    i10 = 2;
                                }
                            }
                            switch (parseInt2) {
                                case 0:
                                    i12 = -1;
                                    i11 = 1;
                                    break;
                                case 1:
                                    i11 = 2;
                                    i12 = -1;
                                    break;
                                case 2:
                                    i12 = -1;
                                    i11 = 4;
                                    break;
                                case 3:
                                    i11 = 8;
                                    i12 = -1;
                                    break;
                                case 4:
                                    i11 = 16;
                                    i12 = -1;
                                    break;
                                case 5:
                                    i11 = 32;
                                    i12 = -1;
                                    break;
                                case 6:
                                    i11 = 64;
                                    i12 = -1;
                                    break;
                                case 7:
                                    i11 = 128;
                                    i12 = -1;
                                    break;
                                case 8:
                                    i11 = 256;
                                    i12 = -1;
                                    break;
                                case 9:
                                    i11 = 512;
                                    i12 = -1;
                                    break;
                                case 10:
                                    i11 = 1024;
                                    i12 = -1;
                                    break;
                                case 11:
                                    i12 = -1;
                                    i11 = 2048;
                                    break;
                                case 12:
                                    i12 = -1;
                                    i11 = 4096;
                                    break;
                                case 13:
                                    i11 = 8192;
                                    i12 = -1;
                                    break;
                                case 14:
                                    i11 = 16384;
                                    i12 = -1;
                                    break;
                                case 15:
                                    i11 = 32768;
                                    i12 = -1;
                                    break;
                                case 16:
                                    i11 = 65536;
                                    i12 = -1;
                                    break;
                                case 17:
                                    i11 = 131072;
                                    i12 = -1;
                                    break;
                                case 18:
                                    i11 = 262144;
                                    i12 = -1;
                                    break;
                                case 19:
                                    i11 = 524288;
                                    i12 = -1;
                                    break;
                                case 20:
                                    i11 = 1048576;
                                    i12 = -1;
                                    break;
                                case 21:
                                    i11 = 2097152;
                                    i12 = -1;
                                    break;
                                case 22:
                                    i11 = 4194304;
                                    i12 = -1;
                                    break;
                                case 23:
                                    i11 = 8388608;
                                    i12 = -1;
                                    break;
                                default:
                                    i12 = -1;
                                    i11 = -1;
                                    break;
                            }
                            if (i11 == i12) {
                                android.gov.nist.core.a.v("Unknown AV1 level: ", parseInt2, "MediaCodecUtil");
                            } else {
                                return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                            }
                        }
                    } catch (NumberFormatException unused) {
                        AbstractC4194d.C("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case 1:
            case 2:
                if (split.length < 2) {
                    AbstractC4194d.C("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if (split[1].length() == 6) {
                            i15 = Integer.parseInt(split[1].substring(0, 2), 16);
                            i14 = Integer.parseInt(split[1].substring(4), 16);
                        } else if (split.length >= 3) {
                            i15 = Integer.parseInt(split[1]);
                            i14 = Integer.parseInt(split[2]);
                        } else {
                            s2.p.g("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                        }
                        if (i15 != 66) {
                            if (i15 != 77) {
                                if (i15 != 88) {
                                    if (i15 != 100) {
                                        if (i15 != 110) {
                                            if (i15 != 122) {
                                                if (i15 != 244) {
                                                    i16 = -1;
                                                } else {
                                                    i16 = 64;
                                                }
                                            } else {
                                                i16 = 32;
                                            }
                                        } else {
                                            i16 = 16;
                                        }
                                    } else {
                                        i16 = 8;
                                    }
                                } else {
                                    i16 = 4;
                                }
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        if (i16 == -1) {
                            android.gov.nist.core.a.v("Unknown AVC profile: ", i15, "MediaCodecUtil");
                        } else {
                            switch (i14) {
                                case 10:
                                    i17 = 1;
                                    i18 = -1;
                                    break;
                                case 11:
                                    i17 = 4;
                                    i18 = -1;
                                    break;
                                case 12:
                                    i18 = -1;
                                    i17 = 8;
                                    break;
                                case 13:
                                    i17 = 16;
                                    i18 = -1;
                                    break;
                                default:
                                    switch (i14) {
                                        case 20:
                                            i17 = 32;
                                            i18 = -1;
                                            break;
                                        case 21:
                                            i17 = 64;
                                            i18 = -1;
                                            break;
                                        case 22:
                                            i17 = 128;
                                            i18 = -1;
                                            break;
                                        default:
                                            switch (i14) {
                                                case 30:
                                                    i17 = 256;
                                                    i18 = -1;
                                                    break;
                                                case 31:
                                                    i17 = 512;
                                                    i18 = -1;
                                                    break;
                                                case 32:
                                                    i17 = 1024;
                                                    i18 = -1;
                                                    break;
                                                default:
                                                    switch (i14) {
                                                        case 40:
                                                            i18 = -1;
                                                            i17 = 2048;
                                                            break;
                                                        case 41:
                                                            i18 = -1;
                                                            i17 = 4096;
                                                            break;
                                                        case 42:
                                                            i17 = 8192;
                                                            i18 = -1;
                                                            break;
                                                        default:
                                                            switch (i14) {
                                                                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                                                    i17 = 16384;
                                                                    i18 = -1;
                                                                    break;
                                                                case 51:
                                                                    i17 = 32768;
                                                                    i18 = -1;
                                                                    break;
                                                                case 52:
                                                                    i17 = 65536;
                                                                    i18 = -1;
                                                                    break;
                                                                default:
                                                                    i18 = -1;
                                                                    i17 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i17 == i18) {
                                android.gov.nist.core.a.v("Unknown AVC level: ", i14, "MediaCodecUtil");
                            } else {
                                return new Pair(Integer.valueOf(i16), Integer.valueOf(i17));
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        AbstractC4194d.C("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case 3:
            case 4:
                if (split.length < 4) {
                    AbstractC4194d.C("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    Matcher matcher2 = f2635a.matcher(split[1]);
                    if (!matcher2.matches()) {
                        AbstractC4194d.C("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    } else {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i19 = 1;
                        } else if ("2".equals(group2)) {
                            C5059l c5059l2 = c5065s.f42296C0;
                            if (c5059l2 != null && c5059l2.f42106h0 == 6) {
                                i19 = 4096;
                            } else {
                                i19 = 2;
                            }
                        } else {
                            AbstractC4194d.C("Unknown HEVC profile string: ", group2, "MediaCodecUtil");
                        }
                        String str5 = split[3];
                        if (str5 != null) {
                            str5.hashCode();
                            char c13 = '\uffff';
                            switch (str5.hashCode()) {
                                case 70821:
                                    if (str5.equals("H30")) {
                                        c13 = 0;
                                        break;
                                    }
                                    break;
                                case 70914:
                                    if (str5.equals("H60")) {
                                        c13 = 1;
                                        break;
                                    }
                                    break;
                                case 70917:
                                    if (str5.equals("H63")) {
                                        c13 = 2;
                                        break;
                                    }
                                    break;
                                case 71007:
                                    if (str5.equals("H90")) {
                                        c13 = 3;
                                        break;
                                    }
                                    break;
                                case 71010:
                                    if (str5.equals("H93")) {
                                        c13 = 4;
                                        break;
                                    }
                                    break;
                                case 74665:
                                    if (str5.equals("L30")) {
                                        c13 = 5;
                                        break;
                                    }
                                    break;
                                case 74758:
                                    if (str5.equals("L60")) {
                                        c13 = 6;
                                        break;
                                    }
                                    break;
                                case 74761:
                                    if (str5.equals("L63")) {
                                        c13 = 7;
                                        break;
                                    }
                                    break;
                                case 74851:
                                    if (str5.equals("L90")) {
                                        c13 = '\b';
                                        break;
                                    }
                                    break;
                                case 74854:
                                    if (str5.equals("L93")) {
                                        c13 = '\t';
                                        break;
                                    }
                                    break;
                                case 2193639:
                                    if (str5.equals("H120")) {
                                        c13 = '\n';
                                        break;
                                    }
                                    break;
                                case 2193642:
                                    if (str5.equals("H123")) {
                                        c13 = 11;
                                        break;
                                    }
                                    break;
                                case 2193732:
                                    if (str5.equals("H150")) {
                                        c13 = '\f';
                                        break;
                                    }
                                    break;
                                case 2193735:
                                    if (str5.equals("H153")) {
                                        c13 = '\r';
                                        break;
                                    }
                                    break;
                                case 2193738:
                                    if (str5.equals("H156")) {
                                        c13 = 14;
                                        break;
                                    }
                                    break;
                                case 2193825:
                                    if (str5.equals("H180")) {
                                        c13 = 15;
                                        break;
                                    }
                                    break;
                                case 2193828:
                                    if (str5.equals("H183")) {
                                        c13 = 16;
                                        break;
                                    }
                                    break;
                                case 2193831:
                                    if (str5.equals("H186")) {
                                        c13 = 17;
                                        break;
                                    }
                                    break;
                                case 2312803:
                                    if (str5.equals("L120")) {
                                        c13 = 18;
                                        break;
                                    }
                                    break;
                                case 2312806:
                                    if (str5.equals("L123")) {
                                        c13 = 19;
                                        break;
                                    }
                                    break;
                                case 2312896:
                                    if (str5.equals("L150")) {
                                        c13 = 20;
                                        break;
                                    }
                                    break;
                                case 2312899:
                                    if (str5.equals("L153")) {
                                        c13 = 21;
                                        break;
                                    }
                                    break;
                                case 2312902:
                                    if (str5.equals("L156")) {
                                        c13 = 22;
                                        break;
                                    }
                                    break;
                                case 2312989:
                                    if (str5.equals("L180")) {
                                        c13 = 23;
                                        break;
                                    }
                                    break;
                                case 2312992:
                                    if (str5.equals("L183")) {
                                        c13 = 24;
                                        break;
                                    }
                                    break;
                                case 2312995:
                                    if (str5.equals("L186")) {
                                        c13 = 25;
                                        break;
                                    }
                                    break;
                            }
                            switch (c13) {
                                case 0:
                                    num = 2;
                                    break;
                                case 1:
                                    num = 8;
                                    break;
                                case 2:
                                    num = 32;
                                    break;
                                case 3:
                                    num = 128;
                                    break;
                                case 4:
                                    num = 512;
                                    break;
                                case 5:
                                    num = 1;
                                    break;
                                case 6:
                                    num = 4;
                                    break;
                                case 7:
                                    num = 16;
                                    break;
                                case '\b':
                                    num = 64;
                                    break;
                                case '\t':
                                    num = 256;
                                    break;
                                case '\n':
                                    num = 2048;
                                    break;
                                case 11:
                                    num = 8192;
                                    break;
                                case '\f':
                                    num = 32768;
                                    break;
                                case '\r':
                                    num = 131072;
                                    break;
                                case 14:
                                    num = 524288;
                                    break;
                                case 15:
                                    num = 2097152;
                                    break;
                                case 16:
                                    num = 8388608;
                                    break;
                                case 17:
                                    num = 33554432;
                                    break;
                                case 18:
                                    num = 1024;
                                    break;
                                case 19:
                                    num = 4096;
                                    break;
                                case 20:
                                    num = 16384;
                                    break;
                                case 21:
                                    num = 65536;
                                    break;
                                case 22:
                                    num = 262144;
                                    break;
                                case 23:
                                    num = 1048576;
                                    break;
                                case 24:
                                    num = 4194304;
                                    break;
                                case 25:
                                    num = 16777216;
                                    break;
                            }
                            if (num != null) {
                                AbstractC4194d.C("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                            } else {
                                return new Pair(Integer.valueOf(i19), num);
                            }
                        }
                        num = null;
                        if (num != null) {
                        }
                    }
                }
                return null;
            case 5:
                if (split.length != 3) {
                    AbstractC4194d.C("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(N.c(Integer.parseInt(split[1], 16)))) {
                            int parseInt4 = Integer.parseInt(split[2]);
                            int i25 = 17;
                            if (parseInt4 != 17) {
                                i25 = 20;
                                if (parseInt4 != 20) {
                                    i25 = 23;
                                    if (parseInt4 != 23) {
                                        i25 = 29;
                                        if (parseInt4 != 29) {
                                            i25 = 39;
                                            if (parseInt4 != 39) {
                                                i25 = 42;
                                                if (parseInt4 != 42) {
                                                    switch (parseInt4) {
                                                        case 1:
                                                            i24 = 1;
                                                            i20 = -1;
                                                            break;
                                                        case 2:
                                                            i20 = -1;
                                                            break;
                                                        case 3:
                                                            i24 = 3;
                                                            i20 = -1;
                                                            break;
                                                        case 4:
                                                            i24 = 4;
                                                            i20 = -1;
                                                            break;
                                                        case 5:
                                                            i20 = -1;
                                                            i24 = 5;
                                                            break;
                                                        case 6:
                                                            i20 = -1;
                                                            i24 = 6;
                                                            break;
                                                        default:
                                                            i20 = -1;
                                                            i24 = -1;
                                                            break;
                                                    }
                                                    if (i24 != i20) {
                                                        return new Pair(Integer.valueOf(i24), 0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i24 = i25;
                            i20 = -1;
                            if (i24 != i20) {
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        AbstractC4194d.C("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case 6:
                if (split.length < 3) {
                    AbstractC4194d.C("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2]);
                        if (parseInt5 != 0) {
                            if (parseInt5 != 1) {
                                if (parseInt5 != 2) {
                                    if (parseInt5 != 3) {
                                        i21 = -1;
                                    } else {
                                        i21 = 8;
                                    }
                                } else {
                                    i21 = 4;
                                }
                            } else {
                                i21 = 2;
                            }
                        } else {
                            i21 = 1;
                        }
                        if (i21 == -1) {
                            android.gov.nist.core.a.v("Unknown VP9 profile: ", parseInt5, "MediaCodecUtil");
                        } else {
                            if (parseInt6 != 10) {
                                if (parseInt6 != 11) {
                                    if (parseInt6 != 20) {
                                        if (parseInt6 != 21) {
                                            if (parseInt6 != 30) {
                                                if (parseInt6 != 31) {
                                                    if (parseInt6 != 40) {
                                                        if (parseInt6 != 41) {
                                                            if (parseInt6 != 50) {
                                                                if (parseInt6 != 51) {
                                                                    switch (parseInt6) {
                                                                        case 60:
                                                                            i23 = -1;
                                                                            i22 = 2048;
                                                                            break;
                                                                        case 61:
                                                                            i23 = -1;
                                                                            i22 = 4096;
                                                                            break;
                                                                        case 62:
                                                                            i22 = 8192;
                                                                            break;
                                                                        default:
                                                                            i23 = -1;
                                                                            i22 = -1;
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i22 = 512;
                                                                }
                                                            } else {
                                                                i22 = 256;
                                                            }
                                                        } else {
                                                            i22 = 128;
                                                        }
                                                    } else {
                                                        i22 = 64;
                                                    }
                                                } else {
                                                    i22 = 32;
                                                }
                                            } else {
                                                i22 = 16;
                                            }
                                        } else {
                                            i23 = -1;
                                            i22 = 8;
                                        }
                                        if (i22 != i23) {
                                            android.gov.nist.core.a.v("Unknown VP9 level: ", parseInt6, "MediaCodecUtil");
                                        } else {
                                            return new Pair(Integer.valueOf(i21), Integer.valueOf(i22));
                                        }
                                    } else {
                                        i22 = 4;
                                    }
                                } else {
                                    i22 = 2;
                                }
                            } else {
                                i22 = 1;
                            }
                            i23 = -1;
                            if (i22 != i23) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        AbstractC4194d.C("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [m.h, java.lang.Object] */
    public static synchronized List e(String str, boolean z10, boolean z11) {
        C1915c c1915c;
        int i10;
        synchronized (y.class) {
            try {
                u uVar = new u(str, z10, z11);
                HashMap hashMap = f2636b;
                List list = (List) hashMap.get(uVar);
                if (list != null) {
                    return list;
                }
                int i11 = AbstractC5530A.f45131a;
                if (i11 >= 21) {
                    ?? obj = new Object();
                    if (!z10 && !z11) {
                        i10 = 0;
                        obj.f38769Y = i10;
                        c1915c = obj;
                    }
                    i10 = 1;
                    obj.f38769Y = i10;
                    c1915c = obj;
                } else {
                    c1915c = new C1915c();
                }
                ArrayList f6 = f(uVar, c1915c);
                if (z10 && f6.isEmpty() && 21 <= i11 && i11 <= 23) {
                    f6 = f(uVar, new C1915c());
                    if (!f6.isEmpty()) {
                        s2.p.g("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f6.get(0)).f2547a);
                    }
                }
                a(str, f6);
                x8.N V10 = x8.N.V(f6);
                hashMap.put(uVar, V10);
                return V10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(u uVar, w wVar) {
        boolean z10;
        int i10;
        String c10;
        String str;
        String str2;
        Exception e10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean c11;
        boolean d10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str3;
        boolean z15;
        boolean isHardwareAccelerated;
        boolean isAlias;
        u uVar2 = uVar;
        w wVar2 = wVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = uVar2.f2632a;
            int e11 = wVar.e();
            boolean f6 = wVar.f();
            int i11 = 0;
            while (i11 < e11) {
                MediaCodecInfo a5 = wVar2.a(i11);
                int i12 = AbstractC5530A.f45131a;
                if (i12 >= 29) {
                    isAlias = a5.isAlias();
                }
                String name = a5.getName();
                if (g(a5, name, f6, str4) && (c10 = c(a5, name, str4)) != null) {
                    try {
                        capabilitiesForType = a5.getCapabilitiesForType(c10);
                        c11 = wVar2.c("tunneled-playback", c10, capabilitiesForType);
                        d10 = wVar2.d("tunneled-playback", capabilitiesForType);
                        z11 = uVar2.f2634c;
                    } catch (Exception e12) {
                        e10 = e12;
                        str = c10;
                        str2 = name;
                        i10 = i11;
                        z10 = f6;
                    }
                    if ((z11 || !d10) && (!z11 || c11)) {
                        boolean c12 = wVar2.c("secure-playback", c10, capabilitiesForType);
                        boolean d11 = wVar2.d("secure-playback", capabilitiesForType);
                        boolean z16 = uVar2.f2633b;
                        if ((z16 || !d11) && (!z16 || c12)) {
                            if (i12 >= 29) {
                                isHardwareAccelerated = a5.isHardwareAccelerated();
                                z12 = isHardwareAccelerated;
                                z13 = true;
                            } else {
                                z13 = true;
                                z12 = !h(a5, str4);
                            }
                            boolean h10 = h(a5, str4);
                            if (i12 >= 29) {
                                z14 = a5.isVendor();
                            } else {
                                String k12 = AbstractC4344b.k1(a5.getName());
                                if (!k12.startsWith("omx.google.") && !k12.startsWith("c2.android.") && !k12.startsWith("c2.google.")) {
                                    z15 = z13;
                                } else {
                                    z15 = false;
                                }
                                z14 = z15;
                            }
                            if ((f6 && z16 == c12) || (!f6 && !z16)) {
                                str = c10;
                                str3 = name;
                                i10 = i11;
                                z10 = f6;
                                try {
                                    arrayList.add(m.h(name, str4, c10, capabilitiesForType, z12, h10, z14, false));
                                } catch (Exception e13) {
                                    e10 = e13;
                                    str2 = str3;
                                    if (AbstractC5530A.f45131a > 23 && !arrayList.isEmpty()) {
                                        s2.p.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        i11 = i10 + 1;
                                        uVar2 = uVar;
                                        wVar2 = wVar;
                                        f6 = z10;
                                    } else {
                                        s2.p.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + Separators.RPAREN);
                                        throw e10;
                                    }
                                }
                                i11 = i10 + 1;
                                uVar2 = uVar;
                                wVar2 = wVar;
                                f6 = z10;
                            } else {
                                str = c10;
                                str3 = name;
                                i10 = i11;
                                z10 = f6;
                                if (!z10 && c12) {
                                    StringBuilder sb2 = new StringBuilder();
                                    try {
                                        sb2.append(str3);
                                        sb2.append(".secure");
                                        str2 = str3;
                                    } catch (Exception e14) {
                                        e10 = e14;
                                        str2 = str3;
                                    }
                                    try {
                                        arrayList.add(m.h(sb2.toString(), str4, str, capabilitiesForType, z12, h10, z14, true));
                                        return arrayList;
                                    } catch (Exception e15) {
                                        e10 = e15;
                                        if (AbstractC5530A.f45131a > 23) {
                                        }
                                        s2.p.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + Separators.RPAREN);
                                        throw e10;
                                    }
                                }
                                i11 = i10 + 1;
                                uVar2 = uVar;
                                wVar2 = wVar;
                                f6 = z10;
                            }
                        }
                    }
                }
                i10 = i11;
                z10 = f6;
                i11 = i10 + 1;
                uVar2 = uVar;
                wVar2 = wVar;
                f6 = z10;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new Exception("Failed to query underlying media codecs", e16);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = AbstractC5530A.f45131a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = AbstractC5530A.f45132b;
            if ("a70".equals(str3) || ("Xiaomi".equals(AbstractC5530A.f45133c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = AbstractC5530A.f45132b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = AbstractC5530A.f45132b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC5530A.f45133c))) {
            String str6 = AbstractC5530A.f45132b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC5530A.f45133c)) {
            String str7 = AbstractC5530A.f45132b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && AbstractC5530A.f45132b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (AbstractC5530A.f45131a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str))) {
            return true;
        } else {
            String k12 = AbstractC4344b.k1(mediaCodecInfo.getName());
            if (k12.startsWith("arc.")) {
                return false;
            }
            if (k12.startsWith("omx.google.") || k12.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((k12.startsWith("omx.sec.") && k12.contains(".sw.")) || k12.equals("omx.qcom.video.decoder.hevcswvdec") || k12.startsWith("c2.android.") || k12.startsWith("c2.google.")) {
                return true;
            }
            if (!k12.startsWith("omx.") && !k12.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }

    public static int i() {
        m mVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f2637c == -1) {
            int i12 = 0;
            List e10 = e("video/avc", false, false);
            if (e10.isEmpty()) {
                mVar = null;
            } else {
                mVar = (m) e10.get(0);
            }
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2550d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                continue;
                            case 64:
                                i11 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i11 = 414720;
                                continue;
                            case 512:
                                i11 = 921600;
                                continue;
                            case 1024:
                                i11 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                continue;
                            case 8192:
                                i11 = 2228224;
                                continue;
                            case 16384:
                                i11 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i11 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                continue;
                            default:
                                i11 = -1;
                                continue;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (AbstractC5530A.f45131a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f2637c = i12;
        }
        return f2637c;
    }
}

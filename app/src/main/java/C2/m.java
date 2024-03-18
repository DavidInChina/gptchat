package C2;

import android.gov.nist.core.Separators;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import livekit.org.webrtc.MediaStreamTrack;
import p2.C5065s;
import p2.N;
import s2.AbstractC5530A;
import y2.C6521h;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f2547a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2548b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2549c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2550d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2551e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2552f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2553g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2554h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f2547a = str;
        this.f2548b = str2;
        this.f2549c = str3;
        this.f2550d = codecCapabilities;
        this.f2553g = z10;
        this.f2551e = z11;
        this.f2552f = z12;
        this.f2554h = MediaStreamTrack.VIDEO_TRACK_KIND.equals(N.e(str2));
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC5530A.f(i10, widthAlignment) * widthAlignment, AbstractC5530A.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ("Nexus 10".equals(r1) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        int i10;
        if (codecCapabilities != null && (i10 = AbstractC5530A.f45131a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i10 <= 22) {
                String str4 = AbstractC5530A.f45134d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z14 = true;
            if (codecCapabilities != null && AbstractC5530A.f45131a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            if (z13 && (codecCapabilities == null || AbstractC5530A.f45131a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
                z15 = false;
            } else {
                z15 = true;
            }
            return new m(str, str2, str3, codecCapabilities, z10, z14, z15);
        }
        z14 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z13) {
        }
        z15 = true;
        return new m(str, str2, str3, codecCapabilities, z10, z14, z15);
    }

    public final C6521h b(C5065s c5065s, C5065s c5065s2) {
        int i10;
        int i11;
        if (!AbstractC5530A.a(c5065s.f42319q0, c5065s2.f42319q0)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f2554h) {
            if (c5065s.f42327y0 != c5065s2.f42327y0) {
                i10 |= 1024;
            }
            if (!this.f2551e && (c5065s.f42324v0 != c5065s2.f42324v0 || c5065s.f42325w0 != c5065s2.f42325w0)) {
                i10 |= 512;
            }
            if (!AbstractC5530A.a(c5065s.f42296C0, c5065s2.f42296C0)) {
                i10 |= 2048;
            }
            if (AbstractC5530A.f45134d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f2547a) && !c5065s.d(c5065s2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                if (c5065s.d(c5065s2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new C6521h(this.f2547a, c5065s, c5065s2, i11, 0);
            }
        } else {
            if (c5065s.f42297D0 != c5065s2.f42297D0) {
                i10 |= 4096;
            }
            if (c5065s.f42298E0 != c5065s2.f42298E0) {
                i10 |= 8192;
            }
            if (c5065s.f42299F0 != c5065s2.f42299F0) {
                i10 |= 16384;
            }
            String str = this.f2548b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d10 = y.d(c5065s);
                Pair d11 = y.d(c5065s2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C6521h(this.f2547a, c5065s, c5065s2, 3, 0);
                    }
                }
            }
            if (!c5065s.d(c5065s2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C6521h(this.f2547a, c5065s, c5065s2, 1, 0);
            }
        }
        return new C6521h(this.f2547a, c5065s, c5065s2, 0, i10);
    }

    public final boolean c(C5065s c5065s, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d10 = y.d(c5065s);
        if (d10 == null) {
            return true;
        }
        int intValue = ((Integer) d10.first).intValue();
        int intValue2 = ((Integer) d10.second).intValue();
        boolean equals = "video/dolby-vision".equals(c5065s.f42319q0);
        int i11 = 8;
        String str = this.f2548b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f2554h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2550d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC5530A.f45131a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i10 = 0;
            }
            if (i10 >= 180000000) {
                i11 = 1024;
            } else if (i10 >= 120000000) {
                i11 = 512;
            } else if (i10 >= 60000000) {
                i11 = 256;
            } else if (i10 >= 30000000) {
                i11 = 128;
            } else if (i10 >= 18000000) {
                i11 = 64;
            } else if (i10 >= 12000000) {
                i11 = 32;
            } else if (i10 >= 7200000) {
                i11 = 16;
            } else if (i10 < 3600000) {
                if (i10 >= 1800000) {
                    i11 = 4;
                } else if (i10 >= 800000) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i11;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = AbstractC5530A.f45132b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c5065s.f42316n0 + ", " + this.f2549c);
        return false;
    }

    public final boolean d(C5065s c5065s) {
        boolean z10;
        int i10;
        int i11;
        String str = c5065s.f42319q0;
        String str2 = this.f2548b;
        boolean z11 = true;
        if (!str2.equals(str) && !str2.equals(y.b(c5065s))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !c(c5065s, true)) {
            return false;
        }
        if (this.f2554h) {
            int i12 = c5065s.f42324v0;
            if (i12 > 0 && (i11 = c5065s.f42325w0) > 0) {
                if (AbstractC5530A.f45131a >= 21) {
                    return f(i12, i11, c5065s.f42326x0);
                }
                if (i12 * i11 > y.i()) {
                    z11 = false;
                }
                if (!z11) {
                    g("legacyFrameSize, " + i12 + "x" + i11);
                }
            }
            return z11;
        }
        int i13 = AbstractC5530A.f45131a;
        if (i13 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2550d;
        int i14 = c5065s.f42298E0;
        if (i14 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                    g("sampleRate.support, " + i14);
                }
            }
            return false;
        }
        int i15 = c5065s.f42297D0;
        if (i15 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i10 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i10 = 16;
                    } else {
                        i10 = 30;
                    }
                    s2.p.g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f2547a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount >= i15) {
                    return true;
                }
                g("channelCount.support, " + i15);
            }
        }
        return false;
    }

    public final boolean e(C5065s c5065s) {
        if (this.f2554h) {
            return this.f2551e;
        }
        Pair d10 = y.d(c5065s);
        if (d10 != null && ((Integer) d10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2550d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC5530A.f45131a >= 29) {
            int a5 = l.a(videoCapabilities, this.f2548b, i10, i11, d10);
            if (a5 == 2) {
                return true;
            }
            if (a5 == 1) {
                StringBuilder A10 = E9.f.A("sizeAndRate.cover, ", i10, "x", i11, Separators.AT);
                A10.append(d10);
                g(A10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f2547a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC5530A.f45132b)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder A11 = E9.f.A("sizeAndRate.rotated, ", i10, "x", i11, Separators.AT);
                    A11.append(d10);
                    StringBuilder t10 = android.gov.nist.core.a.t("AssumedSupport [", A11.toString(), "] [", str, ", ");
                    t10.append(this.f2548b);
                    t10.append("] [");
                    t10.append(AbstractC5530A.f45135e);
                    t10.append("]");
                    s2.p.b("MediaCodecInfo", t10.toString());
                }
            }
            StringBuilder A12 = E9.f.A("sizeAndRate.support, ", i10, "x", i11, Separators.AT);
            A12.append(d10);
            g(A12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder s10 = android.gov.nist.core.a.s("NoSupport [", str, "] [");
        s10.append(this.f2547a);
        s10.append(", ");
        s10.append(this.f2548b);
        s10.append("] [");
        s10.append(AbstractC5530A.f45135e);
        s10.append("]");
        s2.p.b("MediaCodecInfo", s10.toString());
    }

    public final String toString() {
        return this.f2547a;
    }
}

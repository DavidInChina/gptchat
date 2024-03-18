package J2;

import A2.RunnableC0067k;
import E2.Y;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.statsig.androidsdk.StatsigLoggerKt;
import h.C3276b;
import io.sentry.C3636c1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import jh.H1;
import livekit.org.webrtc.MediaStreamTrack;
import m.RunnableC4517N;
import p2.C5059l;
import p2.C5065s;
import p2.p0;
import p2.r0;
import q1.AbstractC5260f;
import s2.AbstractC5530A;
import x8.H;
import x8.L;
import x8.N;
import x8.k0;
import y.AbstractC6463a;
import y2.C6501D;
import y2.C6520g;
import y2.C6521h;
import y2.SurfaceHolder$CallbackC6500C;
import y2.j0;

/* loaded from: classes.dex */
public final class j extends C2.q implements y {

    /* renamed from: u2  reason: collision with root package name */
    public static final int[] f8755u2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: v2  reason: collision with root package name */
    public static boolean f8756v2;

    /* renamed from: w2  reason: collision with root package name */
    public static boolean f8757w2;

    /* renamed from: L1  reason: collision with root package name */
    public final Context f8758L1;

    /* renamed from: M1  reason: collision with root package name */
    public final s f8759M1;
    public final b N1;

    /* renamed from: O1  reason: collision with root package name */
    public final w f8760O1;

    /* renamed from: S1  reason: collision with root package name */
    public g f8764S1;

    /* renamed from: U1  reason: collision with root package name */
    public boolean f8765U1;

    /* renamed from: V1  reason: collision with root package name */
    public boolean f8766V1;

    /* renamed from: W1  reason: collision with root package name */
    public Surface f8767W1;

    /* renamed from: X1  reason: collision with root package name */
    public l f8768X1;

    /* renamed from: Y1  reason: collision with root package name */
    public boolean f8769Y1;

    /* renamed from: b2  reason: collision with root package name */
    public long f8772b2;

    /* renamed from: d2  reason: collision with root package name */
    public long f8774d2;

    /* renamed from: e2  reason: collision with root package name */
    public int f8775e2;

    /* renamed from: f2  reason: collision with root package name */
    public int f8776f2;

    /* renamed from: g2  reason: collision with root package name */
    public int f8777g2;

    /* renamed from: h2  reason: collision with root package name */
    public long f8778h2;

    /* renamed from: i2  reason: collision with root package name */
    public long f8779i2;

    /* renamed from: j2  reason: collision with root package name */
    public long f8780j2;

    /* renamed from: k2  reason: collision with root package name */
    public int f8781k2;

    /* renamed from: l2  reason: collision with root package name */
    public long f8782l2;

    /* renamed from: n2  reason: collision with root package name */
    public r0 f8784n2;

    /* renamed from: o2  reason: collision with root package name */
    public boolean f8785o2;

    /* renamed from: p2  reason: collision with root package name */
    public boolean f8786p2;

    /* renamed from: q2  reason: collision with root package name */
    public boolean f8787q2;

    /* renamed from: s2  reason: collision with root package name */
    public h f8789s2;

    /* renamed from: t2  reason: collision with root package name */
    public C6501D f8790t2;

    /* renamed from: P1  reason: collision with root package name */
    public final long f8761P1 = 5000;

    /* renamed from: Q1  reason: collision with root package name */
    public final int f8762Q1 = 50;

    /* renamed from: R1  reason: collision with root package name */
    public final boolean f8763R1 = "NVIDIA".equals(AbstractC5530A.f45133c);

    /* renamed from: c2  reason: collision with root package name */
    public long f8773c2 = -9223372036854775807L;

    /* renamed from: Z1  reason: collision with root package name */
    public int f8770Z1 = 1;

    /* renamed from: m2  reason: collision with root package name */
    public r0 f8783m2 = r0.f42253j0;

    /* renamed from: r2  reason: collision with root package name */
    public int f8788r2 = 0;

    /* renamed from: a2  reason: collision with root package name */
    public int f8771a2 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [J2.i, java.lang.Object] */
    public j(Context context, H1 h12, Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        super(2, h12, 30.0f);
        ?? obj = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f8758L1 = applicationContext;
        this.f8759M1 = new s(applicationContext);
        this.f8760O1 = new w(handler, surfaceHolder$CallbackC6500C);
        this.N1 = new b(context, obj, this);
    }

    public static boolean t0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            try {
                if (!f8756v2) {
                    f8757w2 = u0();
                    f8756v2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f8757w2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0844, code lost:
        if (r0.equals("PGN528") == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u0() {
        boolean z10;
        boolean z11;
        int i10 = AbstractC5530A.f45131a;
        char c10 = 7;
        if (i10 <= 28) {
            String str = AbstractC5530A.f45132b;
            str.getClass();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        z11 = false;
                        break;
                    }
                    z11 = true;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                default:
                    z11 = true;
                    break;
            }
            switch (z11) {
                case false:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(AbstractC5530A.f45132b)) {
            return true;
        }
        String str2 = AbstractC5530A.f45134d;
        str2.getClass();
        switch (str2.hashCode()) {
            case -349662828:
                if (str2.equals("AFTJMST12")) {
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case -321033677:
                if (str2.equals("AFTKMST12")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 2006354:
                if (str2.equals("AFTA")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 2006367:
                if (str2.equals("AFTN")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 2006371:
                if (str2.equals("AFTR")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1785421873:
                if (str2.equals("AFTEU011")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1785421876:
                if (str2.equals("AFTEU014")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1798172390:
                if (str2.equals("AFTSO001")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 2119412532:
                if (str2.equals("AFTEUFF014")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            default:
                z10 = true;
                break;
        }
        switch (z10) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = AbstractC5530A.f45132b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (str3.equals("GIONEE_SWW1609")) {
                                c10 = 0;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c10 = 1;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c10 = 2;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c10 = 3;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c10 = 4;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c10 = 5;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c10 = 6;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1936688988:
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c10 = 11;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c10 = 14;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c10 = 15;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c10 = 16;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c10 = 17;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c10 = 18;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c10 = 19;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c10 = 20;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c10 = 21;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c10 = 22;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c10 = 23;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c10 = 24;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c10 = 25;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c10 = 26;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c10 = 27;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c10 = 28;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c10 = 29;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c10 = 30;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c10 = 31;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c10 = ' ';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c10 = '!';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c10 = '\"';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c10 = '#';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c10 = '$';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c10 = '%';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c10 = '&';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c10 = '\'';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c10 = '(';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c10 = ')';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c10 = '*';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c10 = '+';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case TokenTypes.PRIVACY /* 2126 */:
                            if (str3.equals("C1")) {
                                c10 = ',';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c10 = '-';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c10 = '.';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c10 = '/';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c10 = '0';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c10 = '1';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c10 = '2';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c10 = '3';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c10 = '4';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c10 = '5';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c10 = '6';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c10 = '7';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c10 = '8';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c10 = '9';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c10 = ':';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c10 = ';';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c10 = '<';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c10 = '=';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c10 = '>';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c10 = '?';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c10 = '@';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c10 = 'A';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c10 = 'B';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c10 = 'C';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c10 = 'D';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c10 = 'E';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c10 = 'F';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c10 = 'G';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c10 = 'H';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c10 = 'I';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c10 = 'J';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c10 = 'K';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c10 = 'L';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c10 = 'M';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c10 = 'N';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c10 = 'O';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c10 = 'P';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c10 = 'Q';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c10 = 'R';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c10 = 'S';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c10 = 'T';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c10 = 'U';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c10 = 'V';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c10 = 'W';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c10 = 'X';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c10 = 'Y';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c10 = 'Z';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c10 = '[';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c10 = '\\';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c10 = ']';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c10 = '^';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c10 = '_';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c10 = '`';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c10 = 'a';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c10 = 'b';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c10 = 'c';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c10 = 'd';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c10 = 'e';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c10 = 'f';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c10 = 'g';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c10 = 'h';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c10 = 'i';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c10 = 'j';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c10 = 'k';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c10 = 'l';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c10 = 'm';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c10 = 'n';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c10 = 'o';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c10 = 'p';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c10 = 'q';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c10 = 'r';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c10 = 's';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c10 = 't';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c10 = 'u';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c10 = 'v';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c10 = 'w';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c10 = 'x';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c10 = 'y';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c10 = 'z';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c10 = '{';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c10 = '|';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c10 = '}';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c10 = '~';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c10 = '\u007f';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c10 = '\u0080';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c10 = '\u0081';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c10 = '\u0082';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c10 = '\u0083';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c10 = '\u0084';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c10 = '\u0085';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c10 = '\u0086';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c10 = '\u0087';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c10 = '\u0088';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c10 = '\u0089';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c10 = '\u008a';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c10 = '\u008b';
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case r9.y.f44626f /* 48 */:
                        case '1':
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case '~':
                        case '\u007f':
                        case '\u0080':
                        case '\u0081':
                        case '\u0082':
                        case '\u0083':
                        case '\u0084':
                        case '\u0085':
                        case '\u0086':
                        case '\u0087':
                        case '\u0088':
                        case '\u0089':
                        case '\u008a':
                        case '\u008b':
                            break;
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                            break;
                    }
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r3.equals("video/hevc") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v0(C5065s c5065s, C2.m mVar) {
        int i10;
        int intValue;
        int i11 = c5065s.f42324v0;
        if (i11 == -1 || (i10 = c5065s.f42325w0) == -1) {
            return -1;
        }
        String str = c5065s.f42319q0;
        str.getClass();
        char c10 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair d10 = C2.y.d(c5065s);
            if (d10 == null || ((intValue = ((Integer) d10.first).intValue()) != 512 && intValue != 1 && intValue != 2)) {
                str = "video/hevc";
            } else {
                str = "video/avc";
            }
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case -1662541442:
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 4;
                    break;
                }
                c10 = '\uffff';
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
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
            case 1:
            case 3:
            case 5:
                return ((i11 * i10) * 3) / 4;
            case 2:
                return Math.max(2097152, ((i11 * i10) * 3) / 4);
            case 4:
                String str2 = AbstractC5530A.f45134d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(AbstractC5530A.f45133c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mVar.f2552f)))) {
                    return -1;
                }
                return ((AbstractC5530A.f(i10, 16) * AbstractC5530A.f(i11, 16)) * 768) / 4;
            case 6:
                return ((i11 * i10) * 3) / 8;
            default:
                return -1;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [x8.K, x8.H] */
    public static List w0(Context context, C2.s sVar, C5065s c5065s, boolean z10, boolean z11) {
        List list;
        List list2;
        String str = c5065s.f42319q0;
        if (str == null) {
            L l10 = N.f49523Z;
            return k0.f49573j0;
        }
        if (AbstractC5530A.f45131a >= 26 && "video/dolby-vision".equals(str) && !f.a(context)) {
            String b10 = C2.y.b(c5065s);
            if (b10 == null) {
                L l11 = N.f49523Z;
                list2 = k0.f49573j0;
            } else {
                ((C2.r) sVar).getClass();
                list2 = C2.y.e(b10, z10, z11);
            }
            if (!list2.isEmpty()) {
                return list2;
            }
        }
        Pattern pattern = C2.y.f2635a;
        ((C2.r) sVar).getClass();
        List e10 = C2.y.e(c5065s.f42319q0, z10, z11);
        String b11 = C2.y.b(c5065s);
        if (b11 == null) {
            L l12 = N.f49523Z;
            list = k0.f49573j0;
        } else {
            list = C2.y.e(b11, z10, z11);
        }
        L l13 = N.f49523Z;
        ?? h10 = new H();
        h10.f0(e10);
        h10.f0(list);
        return h10.i0();
    }

    public static int x0(C5065s c5065s, C2.m mVar) {
        int i10 = c5065s.f42320r0;
        if (i10 != -1) {
            List list = c5065s.f42321s0;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return i10 + i11;
        }
        return v0(c5065s, mVar);
    }

    public final void A0() {
        Surface surface = this.f8767W1;
        if (surface != null && this.f8771a2 != 3) {
            this.f8771a2 = 3;
            w wVar = this.f8760O1;
            Handler handler = wVar.f8836a;
            if (handler != null) {
                handler.post(new u(wVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f8769Y1 = true;
        }
    }

    public final void B0(r0 r0Var) {
        if (!r0Var.equals(r0.f42253j0) && !r0Var.equals(this.f8784n2)) {
            this.f8784n2 = r0Var;
            this.f8760O1.b(r0Var);
        }
    }

    @Override // C2.q
    public final C6521h C(C2.m mVar, C5065s c5065s, C5065s c5065s2) {
        int i10;
        C6521h b10 = mVar.b(c5065s, c5065s2);
        g gVar = this.f8764S1;
        gVar.getClass();
        int i11 = c5065s2.f42324v0;
        int i12 = gVar.f8749a;
        int i13 = b10.f50607e;
        if (i11 > i12 || c5065s2.f42325w0 > gVar.f8750b) {
            i13 |= 256;
        }
        if (x0(c5065s2, mVar) > gVar.f8751c) {
            i13 |= 64;
        }
        int i14 = i13;
        if (i14 != 0) {
            i10 = 0;
        } else {
            i10 = b10.f50606d;
        }
        return new C6521h(mVar.f2547a, c5065s, c5065s2, i10, i14);
    }

    public final void C0() {
        Surface surface = this.f8767W1;
        l lVar = this.f8768X1;
        if (surface == lVar) {
            this.f8767W1 = null;
        }
        if (lVar != null) {
            lVar.release();
            this.f8768X1 = null;
        }
    }

    @Override // C2.q
    public final C2.k D(IllegalStateException illegalStateException, C2.m mVar) {
        Surface surface = this.f8767W1;
        C2.k kVar = new C2.k(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return kVar;
    }

    public final void D0(C2.j jVar, int i10) {
        AbstractC5260f.g("releaseOutputBuffer");
        jVar.releaseOutputBuffer(i10, true);
        AbstractC5260f.q();
        this.f2578G1.f50593e++;
        this.f8776f2 = 0;
        this.f50569l0.getClass();
        this.f8779i2 = AbstractC5530A.C(SystemClock.elapsedRealtime());
        B0(this.f8783m2);
        A0();
    }

    public final void E0(C2.j jVar, int i10, long j6) {
        AbstractC5260f.g("releaseOutputBuffer");
        jVar.b(i10, j6);
        AbstractC5260f.q();
        this.f2578G1.f50593e++;
        this.f8776f2 = 0;
        this.f50569l0.getClass();
        this.f8779i2 = AbstractC5530A.C(SystemClock.elapsedRealtime());
        B0(this.f8783m2);
        A0();
    }

    public final boolean F0(long j6, long j10) {
        boolean z10;
        if (this.f8773c2 != -9223372036854775807L) {
            return false;
        }
        if (this.f50570m0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f8771a2;
        if (i10 != 0) {
            if (i10 == 1) {
                return true;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f50569l0.getClass();
                    long C10 = AbstractC5530A.C(SystemClock.elapsedRealtime()) - this.f8779i2;
                    if (!z10 || j10 >= -30000 || C10 <= 100000) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalStateException();
            } else if (j6 < this.f2580H1.f2561b) {
                return false;
            } else {
                return true;
            }
        }
        return z10;
    }

    public final boolean G0(C2.m mVar) {
        if (AbstractC5530A.f45131a >= 23 && !this.f8787q2 && !t0(mVar.f2547a) && (!mVar.f2552f || l.a(this.f8758L1))) {
            return true;
        }
        return false;
    }

    public final void H0(C2.j jVar, int i10) {
        AbstractC5260f.g("skipVideoBuffer");
        jVar.releaseOutputBuffer(i10, false);
        AbstractC5260f.q();
        this.f2578G1.f50594f++;
    }

    public final void I0(int i10, int i11) {
        C6520g c6520g = this.f2578G1;
        c6520g.f50596h += i10;
        int i12 = i10 + i11;
        c6520g.f50595g += i12;
        this.f8775e2 += i12;
        int i13 = this.f8776f2 + i12;
        this.f8776f2 = i13;
        c6520g.f50597i = Math.max(i13, c6520g.f50597i);
        int i14 = this.f8762Q1;
        if (i14 > 0 && this.f8775e2 >= i14) {
            z0();
        }
    }

    public final void J0(long j6) {
        C6520g c6520g = this.f2578G1;
        c6520g.f50599k += j6;
        c6520g.f50600l++;
        this.f8780j2 += j6;
        this.f8781k2++;
    }

    @Override // C2.q
    public final boolean L() {
        if (this.f8787q2 && AbstractC5530A.f45131a < 23) {
            return true;
        }
        return false;
    }

    @Override // C2.q
    public final float M(float f6, C5065s[] c5065sArr) {
        float f10 = -1.0f;
        for (C5065s c5065s : c5065sArr) {
            float f11 = c5065s.f42326x0;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f6;
    }

    @Override // C2.q
    public final ArrayList N(C2.s sVar, C5065s c5065s, boolean z10) {
        List w02 = w0(this.f8758L1, sVar, c5065s, z10, this.f8787q2);
        Pattern pattern = C2.y.f2635a;
        ArrayList arrayList = new ArrayList(w02);
        Collections.sort(arrayList, new C2.t(0, new C3276b(12, c5065s)));
        return arrayList;
    }

    @Override // C2.q
    public final C2.h O(C2.m mVar, C5065s c5065s, MediaCrypto mediaCrypto, float f6) {
        boolean z10;
        int i10;
        C5059l c5059l;
        g gVar;
        int i11;
        boolean z11;
        Pair d10;
        boolean z12;
        int i12;
        int i13;
        Point point;
        int i14;
        int i15;
        int i16;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z13;
        int i17;
        char c10;
        boolean z14;
        int v02;
        l lVar = this.f8768X1;
        boolean z15 = mVar.f2552f;
        if (lVar != null && lVar.f8798Y != z15) {
            C0();
        }
        C5065s[] c5065sArr = this.f50572o0;
        c5065sArr.getClass();
        int x02 = x0(c5065s, mVar);
        int length = c5065sArr.length;
        int i18 = c5065s.f42324v0;
        float f10 = c5065s.f42326x0;
        C5059l c5059l2 = c5065s.f42296C0;
        int i19 = c5065s.f42325w0;
        if (length == 1) {
            if (x02 != -1 && (v02 = v0(c5065s, mVar)) != -1) {
                x02 = Math.min((int) (x02 * 1.5f), v02);
            }
            gVar = new g(i18, i19, x02);
            z10 = z15;
            c5059l = c5059l2;
            i10 = i19;
        } else {
            int length2 = c5065sArr.length;
            int i20 = i18;
            int i21 = i19;
            int i22 = 0;
            boolean z16 = false;
            while (i22 < length2) {
                C5065s c5065s2 = c5065sArr[i22];
                C5065s[] c5065sArr2 = c5065sArr;
                if (c5059l2 != null && c5065s2.f42296C0 == null) {
                    p2.r b10 = c5065s2.b();
                    b10.f42249w = c5059l2;
                    c5065s2 = new C5065s(b10);
                }
                if (mVar.b(c5065s, c5065s2).f50606d != 0) {
                    int i23 = c5065s2.f42325w0;
                    i17 = length2;
                    int i24 = c5065s2.f42324v0;
                    z13 = z15;
                    c10 = '\uffff';
                    if (i24 != -1 && i23 != -1) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    z16 |= z14;
                    i20 = Math.max(i20, i24);
                    i21 = Math.max(i21, i23);
                    x02 = Math.max(x02, x0(c5065s2, mVar));
                } else {
                    z13 = z15;
                    i17 = length2;
                    c10 = '\uffff';
                }
                i22++;
                c5065sArr = c5065sArr2;
                length2 = i17;
                z15 = z13;
            }
            z10 = z15;
            if (z16) {
                s2.p.g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i20 + "x" + i21);
                if (i19 > i18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i12 = i19;
                } else {
                    i12 = i18;
                }
                if (z12) {
                    i13 = i18;
                } else {
                    i13 = i19;
                }
                c5059l = c5059l2;
                float f11 = i13 / i12;
                int[] iArr = f8755u2;
                i10 = i19;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = iArr[i25];
                    int[] iArr2 = iArr;
                    int i27 = (int) (i26 * f11);
                    if (i26 <= i12 || i27 <= i13) {
                        break;
                    }
                    float f12 = f11;
                    int i28 = i12;
                    if (AbstractC5530A.f45131a >= 21) {
                        if (z12) {
                            i16 = i27;
                        } else {
                            i16 = i26;
                        }
                        if (!z12) {
                            i26 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2550d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i14 = i13;
                            point = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i14 = i13;
                            point = new Point(AbstractC5530A.f(i16, widthAlignment) * widthAlignment, AbstractC5530A.f(i26, heightAlignment) * heightAlignment);
                        }
                        if (point != null && mVar.f(point.x, point.y, f10)) {
                            break;
                        }
                        i25++;
                        iArr = iArr2;
                        f11 = f12;
                        i12 = i28;
                        i13 = i14;
                    } else {
                        i14 = i13;
                        try {
                            int f13 = AbstractC5530A.f(i26, 16) * 16;
                            int f14 = AbstractC5530A.f(i27, 16) * 16;
                            if (f13 * f14 <= C2.y.i()) {
                                if (z12) {
                                    i15 = f14;
                                } else {
                                    i15 = f13;
                                }
                                if (!z12) {
                                    f13 = f14;
                                }
                                point = new Point(i15, f13);
                            } else {
                                i25++;
                                iArr = iArr2;
                                f11 = f12;
                                i12 = i28;
                                i13 = i14;
                            }
                        } catch (C2.v unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i20 = Math.max(i20, point.x);
                    i21 = Math.max(i21, point.y);
                    p2.r b11 = c5065s.b();
                    b11.f42242p = i20;
                    b11.f42243q = i21;
                    x02 = Math.max(x02, v0(new C5065s(b11), mVar));
                    s2.p.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i20 + "x" + i21);
                }
            } else {
                c5059l = c5059l2;
                i10 = i19;
            }
            gVar = new g(i20, i21, x02);
        }
        this.f8764S1 = gVar;
        if (this.f8787q2) {
            i11 = this.f8788r2;
        } else {
            i11 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f2549c);
        mediaFormat.setInteger("width", i18);
        mediaFormat.setInteger("height", i10);
        r9.y.X0(mediaFormat, c5065s.f42321s0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        r9.y.L0(mediaFormat, "rotation-degrees", c5065s.f42327y0);
        if (c5059l != null) {
            C5059l c5059l3 = c5059l;
            r9.y.L0(mediaFormat, "color-transfer", c5059l3.f42106h0);
            r9.y.L0(mediaFormat, "color-standard", c5059l3.f42104Y);
            r9.y.L0(mediaFormat, "color-range", c5059l3.f42105Z);
            byte[] bArr = c5059l3.f42107i0;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c5065s.f42319q0) && (d10 = C2.y.d(c5065s)) != null) {
            r9.y.L0(mediaFormat, "profile", ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", gVar.f8749a);
        mediaFormat.setInteger("max-height", gVar.f8750b);
        r9.y.L0(mediaFormat, "max-input-size", gVar.f8751c);
        if (AbstractC5530A.f45131a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (this.f8763R1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i11 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i11);
        }
        if (this.f8767W1 == null) {
            if (G0(mVar)) {
                if (this.f8768X1 == null) {
                    this.f8768X1 = l.c(this.f8758L1, z10);
                }
                this.f8767W1 = this.f8768X1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new C2.h(mVar, mediaFormat, c5065s, this.f8767W1, mediaCrypto);
    }

    @Override // C2.q
    public final void P(x2.h hVar) {
        if (!this.f8766V1) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f48644m0;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s10 = byteBuffer.getShort();
            short s11 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    C2.j jVar = this.f2591Q0;
                    jVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    jVar.setParameters(bundle);
                }
            }
        }
    }

    @Override // C2.q
    public final void U(Exception exc) {
        s2.p.d("MediaCodecVideoRenderer", "Video codec error", exc);
        w wVar = this.f8760O1;
        Handler handler = wVar.f8836a;
        if (handler != null) {
            handler.post(new RunnableC4517N(wVar, 15, exc));
        }
    }

    @Override // C2.q
    public final void V(String str, long j6, long j10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        w wVar = this.f8760O1;
        Handler handler = wVar.f8836a;
        if (handler != null) {
            handler.post(new RunnableC0067k(wVar, str, j6, j10, 1));
        }
        this.f8765U1 = t0(str);
        C2.m mVar = this.f2598X0;
        mVar.getClass();
        boolean z10 = false;
        if (AbstractC5530A.f45131a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f2548b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2550d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8766V1 = z10;
        if (AbstractC5530A.f45131a >= 23 && this.f8787q2) {
            C2.j jVar = this.f2591Q0;
            jVar.getClass();
            this.f8789s2 = new h(this, jVar);
        }
    }

    @Override // C2.q
    public final void W(String str) {
        w wVar = this.f8760O1;
        Handler handler = wVar.f8836a;
        if (handler != null) {
            handler.post(new RunnableC4517N(wVar, 16, str));
        }
    }

    @Override // C2.q
    public final C6521h X(C3636c1 c3636c1) {
        C6521h X10 = super.X(c3636c1);
        C5065s c5065s = (C5065s) c3636c1.f34286h0;
        c5065s.getClass();
        w wVar = this.f8760O1;
        Handler handler = wVar.f8836a;
        if (handler != null) {
            handler.post(new Q1.n(wVar, c5065s, X10, 11));
        }
        return X10;
    }

    @Override // C2.q
    public final void Y(C5065s c5065s, MediaFormat mediaFormat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        C2.j jVar = this.f2591Q0;
        if (jVar != null) {
            jVar.e(this.f8770Z1);
        }
        if (this.f8787q2) {
            i10 = c5065s.f42324v0;
            i11 = c5065s.f42325w0;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i12 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i12 = mediaFormat.getInteger("width");
            }
            if (z10) {
                i13 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i13 = mediaFormat.getInteger("height");
            }
            int i14 = i12;
            i11 = i13;
            i10 = i14;
        }
        float f6 = c5065s.f42328z0;
        int i15 = AbstractC5530A.f45131a;
        int i16 = c5065s.f42327y0;
        if (i15 >= 21) {
            if (i16 != 90 && i16 != 270) {
                i16 = 0;
            } else {
                f6 = 1.0f / f6;
                i16 = 0;
                int i17 = i11;
                i11 = i10;
                i10 = i17;
            }
        }
        this.f8783m2 = new r0(f6, i10, i11, i16);
        s sVar = this.f8759M1;
        sVar.f8814f = c5065s.f42326x0;
        d dVar = sVar.f8809a;
        dVar.f8744a.c();
        dVar.f8745b.c();
        dVar.f8746c = false;
        dVar.f8747d = -9223372036854775807L;
        dVar.f8748e = 0;
        sVar.d();
    }

    @Override // C2.q
    public final void a0(long j6) {
        super.a0(j6);
        if (!this.f8787q2) {
            this.f8777g2--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.Surface] */
    @Override // y2.AbstractC6519f, y2.e0
    public final void b(int i10, Object obj) {
        l lVar;
        Handler handler;
        l lVar2;
        long j6;
        s sVar = this.f8759M1;
        b bVar = this.N1;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    s2.v vVar = (s2.v) obj;
                                    bVar.getClass();
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            bVar.f8735c = (List) obj;
                            this.f8785o2 = true;
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        if (sVar.f8818j != intValue) {
                            sVar.f8818j = intValue;
                            sVar.e(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f8770Z1 = intValue2;
                    C2.j jVar = this.f2591Q0;
                    if (jVar != null) {
                        jVar.e(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.f8788r2 != intValue3) {
                    this.f8788r2 = intValue3;
                    if (this.f8787q2) {
                        h0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            this.f8790t2 = (C6501D) obj;
            bVar.getClass();
            return;
        }
        if (obj instanceof Surface) {
            lVar = (Surface) obj;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            l lVar3 = this.f8768X1;
            if (lVar3 != null) {
                lVar = lVar3;
            } else {
                C2.m mVar = this.f2598X0;
                if (mVar != null && G0(mVar)) {
                    lVar = l.c(this.f8758L1, mVar.f2552f);
                    this.f8768X1 = lVar;
                }
            }
        }
        Surface surface = this.f8767W1;
        w wVar = this.f8760O1;
        if (surface != lVar) {
            this.f8767W1 = lVar;
            sVar.getClass();
            int i11 = AbstractC5530A.f45131a;
            if (i11 >= 17 && m.a(lVar)) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (sVar.f8813e != lVar2) {
                sVar.b();
                sVar.f8813e = lVar2;
                sVar.e(true);
            }
            this.f8769Y1 = false;
            int i12 = this.f50570m0;
            C2.j jVar2 = this.f2591Q0;
            if (jVar2 != null) {
                bVar.getClass();
                if (i11 >= 23 && lVar != null && !this.f8765U1) {
                    jVar2.g(lVar);
                } else {
                    h0();
                    S();
                }
            }
            if (lVar != null && lVar != this.f8768X1) {
                r0 r0Var = this.f8784n2;
                if (r0Var != null) {
                    wVar.b(r0Var);
                }
                y0(1);
                if (i12 == 2) {
                    long j10 = this.f8761P1;
                    if (j10 > 0) {
                        this.f50569l0.getClass();
                        j6 = SystemClock.elapsedRealtime() + j10;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    this.f8773c2 = j6;
                }
                bVar.getClass();
                return;
            }
            this.f8784n2 = null;
            y0(1);
            bVar.getClass();
        } else if (lVar != null && lVar != this.f8768X1) {
            r0 r0Var2 = this.f8784n2;
            if (r0Var2 != null) {
                wVar.b(r0Var2);
            }
            Surface surface2 = this.f8767W1;
            if (surface2 != null && this.f8769Y1 && (handler = wVar.f8836a) != null) {
                handler.post(new u(wVar, surface2, SystemClock.elapsedRealtime()));
            }
        }
    }

    @Override // C2.q
    public final void b0() {
        y0(2);
        this.N1.getClass();
    }

    @Override // C2.q
    public final void c0(x2.h hVar) {
        boolean z10 = this.f8787q2;
        if (!z10) {
            this.f8777g2++;
        }
        if (AbstractC5530A.f45131a < 23 && z10) {
            long j6 = hVar.f48643l0;
            s0(j6);
            B0(this.f8783m2);
            this.f2578G1.f50593e++;
            A0();
            a0(j6);
        }
    }

    @Override // C2.q
    public final void d0(C5065s c5065s) {
        int i10;
        boolean z10 = this.f8785o2;
        b bVar = this.N1;
        if (z10 && !this.f8786p2) {
            bVar.getClass();
            try {
                bVar.getClass();
                Gi.e.n(!false);
                Gi.e.o(bVar.f8735c);
                try {
                    Context context = bVar.f8733a;
                    a aVar = bVar.f8734b;
                    int i11 = 16;
                    if (Integer.bitCount(16) != 1) {
                        i11 = Integer.highestOneBit(15) << 1;
                    }
                    long[] jArr = new long[i11];
                    AbstractC5530A.A(context);
                    r0 r0Var = r0.f42253j0;
                    AbstractC5530A.l(null);
                    C5059l c5059l = c5065s.f42296C0;
                    if (c5059l == null || ((i10 = c5059l.f42106h0) != 7 && i10 != 6)) {
                        c5059l = C5059l.f42096m0;
                    }
                    if (c5059l.f42106h0 == 7) {
                    }
                    L l10 = N.f49523Z;
                    k0 k0Var = k0.f49573j0;
                    aVar.a();
                    throw null;
                } catch (p0 e10) {
                    throw new Exception(e10);
                }
            } catch (z e11) {
                throw e(7000, c5065s, e11, false);
            }
        }
        bVar.getClass();
        this.f8786p2 = true;
    }

    @Override // C2.q
    public final boolean f0(long j6, long j10, C2.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, C5065s c5065s) {
        boolean z12;
        boolean z13;
        long j12;
        jVar.getClass();
        if (this.f8772b2 == -9223372036854775807L) {
            this.f8772b2 = j6;
        }
        int i13 = (j11 > this.f8778h2 ? 1 : (j11 == this.f8778h2 ? 0 : -1));
        s sVar = this.f8759M1;
        if (i13 != 0) {
            sVar.c(j11);
            this.f8778h2 = j11;
        }
        long j13 = j11 - this.f2580H1.f2562c;
        if (z10 && !z11) {
            H0(jVar, i10);
            return true;
        }
        if (this.f50570m0 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f6 = this.f2589O0;
        this.f50569l0.getClass();
        long j14 = (long) ((j11 - j6) / f6);
        if (z12) {
            j14 -= AbstractC5530A.C(SystemClock.elapsedRealtime()) - j10;
        }
        if (this.f8767W1 == this.f8768X1) {
            if (j14 >= -30000) {
                return false;
            }
            H0(jVar, i10);
            J0(j14);
            return true;
        } else if (F0(j6, j14)) {
            this.f50569l0.getClass();
            long nanoTime = System.nanoTime();
            C6501D c6501d = this.f8790t2;
            if (c6501d != null) {
                c6501d.d(j13, nanoTime);
            }
            if (AbstractC5530A.f45131a >= 21) {
                E0(jVar, i10, nanoTime);
            } else {
                D0(jVar, i10);
            }
            J0(j14);
            return true;
        } else {
            if (z12 && j6 != this.f8772b2) {
                this.f50569l0.getClass();
                long nanoTime2 = System.nanoTime();
                long a5 = sVar.a((j14 * 1000) + nanoTime2);
                long j15 = (a5 - nanoTime2) / 1000;
                if (this.f8773c2 != -9223372036854775807L) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (j15 < -500000 && !z11) {
                    Y y10 = this.f50571n0;
                    y10.getClass();
                    j12 = j13;
                    int o10 = y10.o(j6 - this.f50573p0);
                    if (o10 != 0) {
                        if (z13) {
                            C6520g c6520g = this.f2578G1;
                            c6520g.f50592d += o10;
                            c6520g.f50594f += this.f8777g2;
                        } else {
                            this.f2578G1.f50598j++;
                            I0(o10, this.f8777g2);
                        }
                        if (J()) {
                            S();
                        }
                        return false;
                    }
                } else {
                    j12 = j13;
                }
                if (j15 < -30000 && !z11) {
                    if (z13) {
                        H0(jVar, i10);
                    } else {
                        AbstractC5260f.g("dropVideoBuffer");
                        jVar.releaseOutputBuffer(i10, false);
                        AbstractC5260f.q();
                        I0(0, 1);
                    }
                    J0(j15);
                    return true;
                } else if (AbstractC5530A.f45131a >= 21) {
                    if (j15 < 50000) {
                        if (a5 == this.f8782l2) {
                            H0(jVar, i10);
                        } else {
                            C6501D c6501d2 = this.f8790t2;
                            if (c6501d2 != null) {
                                c6501d2.d(j12, a5);
                            }
                            E0(jVar, i10, a5);
                        }
                        J0(j15);
                        this.f8782l2 = a5;
                        return true;
                    }
                } else {
                    long j16 = j12;
                    if (j15 < 30000) {
                        if (j15 > 11000) {
                            try {
                                Thread.sleep((j15 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        C6501D c6501d3 = this.f8790t2;
                        if (c6501d3 != null) {
                            c6501d3.d(j16, a5);
                        }
                        D0(jVar, i10);
                        J0(j15);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // y2.AbstractC6519f
    public final void g() {
        if (this.f8771a2 == 0) {
            this.f8771a2 = 1;
        }
    }

    @Override // y2.AbstractC6519f
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // C2.q
    public final void j0() {
        super.j0();
        this.f8777g2 = 0;
    }

    @Override // y2.AbstractC6519f
    public final boolean k() {
        return this.f2570C1;
    }

    @Override // C2.q, y2.AbstractC6519f
    public final boolean l() {
        l lVar;
        if (super.l() && (this.f8771a2 == 3 || (((lVar = this.f8768X1) != null && this.f8767W1 == lVar) || this.f2591Q0 == null || this.f8787q2))) {
            this.f8773c2 = -9223372036854775807L;
            return true;
        } else if (this.f8773c2 == -9223372036854775807L) {
            return false;
        } else {
            this.f50569l0.getClass();
            if (SystemClock.elapsedRealtime() < this.f8773c2) {
                return true;
            }
            this.f8773c2 = -9223372036854775807L;
            return false;
        }
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void m() {
        w wVar = this.f8760O1;
        this.f8784n2 = null;
        y0(0);
        this.f8769Y1 = false;
        this.f8789s2 = null;
        try {
            super.m();
            C6520g c6520g = this.f2578G1;
            wVar.getClass();
            synchronized (c6520g) {
            }
            Handler handler = wVar.f8836a;
            if (handler != null) {
                handler.post(new v(wVar, c6520g, 1));
            }
            wVar.b(r0.f42253j0);
        } catch (Throwable th2) {
            wVar.a(this.f2578G1);
            wVar.b(r0.f42253j0);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [y2.g, java.lang.Object] */
    @Override // y2.AbstractC6519f
    public final void n(boolean z10, boolean z11) {
        boolean z12;
        this.f2578G1 = new Object();
        j0 j0Var = this.f50566i0;
        j0Var.getClass();
        boolean z13 = j0Var.f50644b;
        if (z13 && this.f8788r2 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        Gi.e.n(z12);
        if (this.f8787q2 != z13) {
            this.f8787q2 = z13;
            h0();
        }
        C6520g c6520g = this.f2578G1;
        w wVar = this.f8760O1;
        Handler handler = wVar.f8836a;
        if (handler != null) {
            handler.post(new v(wVar, c6520g, 0));
        }
        this.f8771a2 = z11 ? 1 : 0;
    }

    @Override // C2.q
    public final boolean n0(C2.m mVar) {
        if (this.f8767W1 == null && !G0(mVar)) {
            return false;
        }
        return true;
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void o(long j6, boolean z10) {
        super.o(j6, z10);
        this.N1.getClass();
        y0(1);
        s sVar = this.f8759M1;
        sVar.f8821m = 0L;
        sVar.f8824p = -1L;
        sVar.f8822n = -1L;
        long j10 = -9223372036854775807L;
        this.f8778h2 = -9223372036854775807L;
        this.f8772b2 = -9223372036854775807L;
        this.f8776f2 = 0;
        if (z10) {
            long j11 = this.f8761P1;
            if (j11 > 0) {
                this.f50569l0.getClass();
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f8773c2 = j10;
            return;
        }
        this.f8773c2 = -9223372036854775807L;
    }

    @Override // y2.AbstractC6519f
    public final void p() {
        this.N1.getClass();
    }

    @Override // C2.q
    public final int p0(C2.s sVar, C5065s c5065s) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!MediaStreamTrack.VIDEO_TRACK_KIND.equals(p2.N.e(c5065s.f42319q0))) {
            return AbstractC6463a.a(0, 0, 0, 0);
        }
        if (c5065s.f42322t0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.f8758L1;
        List w02 = w0(context, sVar, c5065s, z10, false);
        if (z10 && w02.isEmpty()) {
            w02 = w0(context, sVar, c5065s, false, false);
        }
        if (w02.isEmpty()) {
            return AbstractC6463a.a(1, 0, 0, 0);
        }
        int i15 = c5065s.f42306M0;
        if (i15 != 0 && i15 != 2) {
            return AbstractC6463a.a(2, 0, 0, 0);
        }
        C2.m mVar = (C2.m) w02.get(0);
        boolean d10 = mVar.d(c5065s);
        if (!d10) {
            for (int i16 = 1; i16 < w02.size(); i16++) {
                C2.m mVar2 = (C2.m) w02.get(i16);
                if (mVar2.d(c5065s)) {
                    z11 = false;
                    d10 = true;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (d10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (mVar.e(c5065s)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (mVar.f2553g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (AbstractC5530A.f45131a >= 26 && "video/dolby-vision".equals(c5065s.f42319q0) && !f.a(context)) {
            i13 = 256;
        }
        if (d10) {
            List w03 = w0(context, sVar, c5065s, z10, true);
            if (!w03.isEmpty()) {
                Pattern pattern = C2.y.f2635a;
                ArrayList arrayList = new ArrayList(w03);
                Collections.sort(arrayList, new C2.t(0, new C3276b(12, c5065s)));
                C2.m mVar3 = (C2.m) arrayList.get(0);
                if (mVar3.d(c5065s) && mVar3.e(c5065s)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override // y2.AbstractC6519f
    public final void q() {
        try {
            E();
            h0();
            B2.k kVar = this.f2585K0;
            if (kVar != null) {
                kVar.c(null);
            }
            this.f2585K0 = null;
        } finally {
            this.f8786p2 = false;
            if (this.f8768X1 != null) {
                C0();
            }
        }
    }

    @Override // y2.AbstractC6519f
    public final void r() {
        this.f8775e2 = 0;
        this.f50569l0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f8774d2 = elapsedRealtime;
        this.f8779i2 = AbstractC5530A.C(elapsedRealtime);
        this.f8780j2 = 0L;
        this.f8781k2 = 0;
        s sVar = this.f8759M1;
        sVar.f8812d = true;
        sVar.f8821m = 0L;
        sVar.f8824p = -1L;
        sVar.f8822n = -1L;
        o oVar = sVar.f8810b;
        if (oVar != null) {
            r rVar = sVar.f8811c;
            rVar.getClass();
            rVar.f8806Z.sendEmptyMessage(1);
            oVar.a(new C3276b(14, sVar));
        }
        sVar.e(false);
    }

    @Override // y2.AbstractC6519f
    public final void s() {
        this.f8773c2 = -9223372036854775807L;
        z0();
        int i10 = this.f8781k2;
        if (i10 != 0) {
            long j6 = this.f8780j2;
            w wVar = this.f8760O1;
            Handler handler = wVar.f8836a;
            if (handler != null) {
                handler.post(new t(wVar, j6, i10));
            }
            this.f8780j2 = 0L;
            this.f8781k2 = 0;
        }
        s sVar = this.f8759M1;
        sVar.f8812d = false;
        o oVar = sVar.f8810b;
        if (oVar != null) {
            oVar.b();
            r rVar = sVar.f8811c;
            rVar.getClass();
            rVar.f8806Z.sendEmptyMessage(2);
        }
        sVar.b();
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void v(long j6, long j10) {
        super.v(j6, j10);
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void y(float f6, float f10) {
        super.y(f6, f10);
        s sVar = this.f8759M1;
        sVar.f8817i = f6;
        sVar.f8821m = 0L;
        sVar.f8824p = -1L;
        sVar.f8822n = -1L;
        sVar.e(false);
    }

    public final void y0(int i10) {
        C2.j jVar;
        this.f8771a2 = Math.min(this.f8771a2, i10);
        if (AbstractC5530A.f45131a >= 23 && this.f8787q2 && (jVar = this.f2591Q0) != null) {
            this.f8789s2 = new h(this, jVar);
        }
    }

    public final void z0() {
        if (this.f8775e2 > 0) {
            this.f50569l0.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f8774d2;
            int i10 = this.f8775e2;
            w wVar = this.f8760O1;
            Handler handler = wVar.f8836a;
            if (handler != null) {
                handler.post(new t(wVar, i10, j6));
            }
            this.f8775e2 = 0;
            this.f8774d2 = elapsedRealtime;
        }
    }
}

package c3;

import I2.i;
import L2.AbstractC0881b;
import L2.B;
import L2.C0880a;
import L2.C0883d;
import L2.F;
import L2.G;
import L2.H;
import L2.k;
import L2.q;
import L2.r;
import L2.s;
import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k6.AbstractC4194d;
import livekit.org.webrtc.MediaStreamTrack;
import m.C4528h;
import p2.AbstractC5058k;
import p2.C5059l;
import p2.C5062o;
import p2.C5063p;
import p2.C5065s;
import p2.N;
import p2.O;
import s2.AbstractC5530A;
import s2.p;
import s2.t;
import s2.u;
import t2.g;

/* renamed from: c3.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2284d implements q {

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f26176c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f26177d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(w8.e.f48221c);

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f26178e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0  reason: collision with root package name */
    public static final byte[] f26179f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0  reason: collision with root package name */
    public static final UUID f26180g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0  reason: collision with root package name */
    public static final Map f26181h0;

    /* renamed from: C  reason: collision with root package name */
    public C4528h f26184C;

    /* renamed from: D  reason: collision with root package name */
    public C4528h f26185D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f26186E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f26187F;

    /* renamed from: G  reason: collision with root package name */
    public int f26188G;

    /* renamed from: H  reason: collision with root package name */
    public long f26189H;

    /* renamed from: I  reason: collision with root package name */
    public long f26190I;

    /* renamed from: J  reason: collision with root package name */
    public int f26191J;

    /* renamed from: K  reason: collision with root package name */
    public int f26192K;

    /* renamed from: M  reason: collision with root package name */
    public int f26194M;

    /* renamed from: N  reason: collision with root package name */
    public int f26195N;

    /* renamed from: O  reason: collision with root package name */
    public int f26196O;
    public int P;
    public boolean Q;

    /* renamed from: R  reason: collision with root package name */
    public long f26197R;
    public int S;
    public int T;

    /* renamed from: U  reason: collision with root package name */
    public int f26198U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f26199V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f26200W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f26201X;

    /* renamed from: Y  reason: collision with root package name */
    public int f26202Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte f26203Z;

    /* renamed from: a  reason: collision with root package name */
    public final C2282b f26204a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f26205a0;

    /* renamed from: b0  reason: collision with root package name */
    public s f26207b0;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f26220o;

    /* renamed from: p  reason: collision with root package name */
    public long f26221p;

    /* renamed from: u  reason: collision with root package name */
    public C2283c f26226u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f26227v;

    /* renamed from: w  reason: collision with root package name */
    public int f26228w;

    /* renamed from: x  reason: collision with root package name */
    public long f26229x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f26230y;

    /* renamed from: q  reason: collision with root package name */
    public long f26222q = -1;

    /* renamed from: r  reason: collision with root package name */
    public long f26223r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f26224s = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public long f26225t = -9223372036854775807L;

    /* renamed from: z  reason: collision with root package name */
    public long f26231z = -1;

    /* renamed from: A  reason: collision with root package name */
    public long f26182A = -1;

    /* renamed from: B  reason: collision with root package name */
    public long f26183B = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26209d = true;

    /* renamed from: b  reason: collision with root package name */
    public final C2285e f26206b = new C2285e();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f26208c = new SparseArray();

    /* renamed from: g  reason: collision with root package name */
    public final u f26212g = new u(4);

    /* renamed from: h  reason: collision with root package name */
    public final u f26213h = new u(ByteBuffer.allocate(4).putInt(-1).array());

    /* renamed from: i  reason: collision with root package name */
    public final u f26214i = new u(4);

    /* renamed from: e  reason: collision with root package name */
    public final u f26210e = new u(g.f45670a);

    /* renamed from: f  reason: collision with root package name */
    public final u f26211f = new u(4);

    /* renamed from: j  reason: collision with root package name */
    public final u f26215j = new u();

    /* renamed from: k  reason: collision with root package name */
    public final u f26216k = new u();

    /* renamed from: l  reason: collision with root package name */
    public final u f26217l = new u(8);

    /* renamed from: m  reason: collision with root package name */
    public final u f26218m = new u();

    /* renamed from: n  reason: collision with root package name */
    public final u f26219n = new u();

    /* renamed from: L  reason: collision with root package name */
    public int[] f26193L = new int[1];

    static {
        int i10 = AbstractC5530A.f45131a;
        HashMap hashMap = new HashMap();
        AbstractC4194d.x(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC4194d.x(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f26181h0 = Collections.unmodifiableMap(hashMap);
    }

    public C2284d() {
        C2282b c2282b = new C2282b();
        this.f26204a = c2282b;
        c2282b.f26124d = new J0.a(this);
    }

    public static byte[] i(long j6, long j10, String str) {
        boolean z10;
        if (j6 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        int i10 = (int) (j6 / 3600000000L);
        long j11 = j6 - (i10 * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (i11 * 60000000);
        int i12 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10)));
        int i13 = AbstractC5530A.f45131a;
        return format.getBytes(w8.e.f48221c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:451:0x0b44, code lost:
        if (r10.o() == r15.getLeastSignificantBits()) goto L452;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0dc1  */
    /* JADX WARN: Type inference failed for: r0v39, types: [c3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r2v215 */
    /* JADX WARN: Type inference failed for: r2v217 */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        r rVar2;
        boolean z10;
        String str6;
        i iVar2;
        C2284d c2284d;
        boolean z11;
        int i10;
        double d10;
        int b10;
        int a5;
        boolean z12;
        String str7;
        String str8;
        char c10;
        String str9;
        C2284d c2284d2;
        C2283c c2283c;
        String str10;
        String str11;
        char c11;
        String str12;
        String str13;
        int i11;
        List list;
        int i12;
        int i13;
        p2.r rVar3;
        int i14;
        String str14;
        int i15;
        int i16;
        float f6;
        C5059l c5059l;
        int i17;
        int i18;
        byte[] bArr;
        int i19;
        C0880a a10;
        List list2;
        ArrayList arrayList;
        RuntimeException runtimeException;
        String str15;
        Pair pair;
        int i20;
        List u02;
        List list3;
        String str16;
        int i21;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        B b11;
        int i22;
        C2284d c2284d3 = this;
        String str23 = "A_PCM/INT/LIT";
        String str24 = "S_TEXT/ASS";
        String str25 = "V_MPEGH/ISO/HEVC";
        String str26 = "S_TEXT/WEBVTT";
        String str27 = "A_EAC3";
        String str28 = "A_FLAC";
        c2284d3.f26187F = false;
        boolean z13 = true;
        while (z13 && !c2284d3.f26187F) {
            C2282b c2282b = c2284d3.f26204a;
            Gi.e.o(c2282b.f26124d);
            while (true) {
                ArrayDeque arrayDeque = c2282b.f26122b;
                C2281a c2281a = (C2281a) arrayDeque.peek();
                str = str24;
                if (c2281a != null) {
                    str4 = str27;
                    if (rVar.o() >= c2281a.f26120b) {
                        J0.a aVar = c2282b.f26124d;
                        int i23 = ((C2281a) arrayDeque.pop()).f26119a;
                        C2284d c2284d4 = (C2284d) aVar.f8729Y;
                        Gi.e.o(c2284d4.f26207b0);
                        SparseArray sparseArray = c2284d4.f26208c;
                        if (i23 != 160) {
                            if (i23 != 174) {
                                if (i23 != 19899) {
                                    if (i23 != 25152) {
                                        if (i23 != 28032) {
                                            if (i23 != 357149030) {
                                                if (i23 != 374648427) {
                                                    if (i23 != 475249515) {
                                                        str3 = str23;
                                                        str2 = str25;
                                                        str6 = str28;
                                                        str5 = str26;
                                                    } else {
                                                        if (!c2284d4.f26227v) {
                                                            s sVar = c2284d4.f26207b0;
                                                            C4528h c4528h = c2284d4.f26184C;
                                                            C4528h c4528h2 = c2284d4.f26185D;
                                                            if (c2284d4.f26222q == -1 || c2284d4.f26225t == -9223372036854775807L || c4528h == null || (i22 = c4528h.f38769Y) == 0 || c4528h2 == null || c4528h2.f38769Y != i22) {
                                                                str3 = str23;
                                                                str2 = str25;
                                                                str21 = str28;
                                                                str22 = str26;
                                                                b11 = new L2.u(c2284d4.f26225t);
                                                            } else {
                                                                int[] iArr = new int[i22];
                                                                long[] jArr = new long[i22];
                                                                long[] jArr2 = new long[i22];
                                                                long[] jArr3 = new long[i22];
                                                                str3 = str23;
                                                                int i24 = 0;
                                                                while (i24 < i22) {
                                                                    jArr3[i24] = c4528h.m(i24);
                                                                    jArr[i24] = c4528h2.m(i24) + c2284d4.f26222q;
                                                                    i24++;
                                                                    str25 = str25;
                                                                    str28 = str28;
                                                                }
                                                                str2 = str25;
                                                                str21 = str28;
                                                                int i25 = 0;
                                                                while (true) {
                                                                    int i26 = i22 - 1;
                                                                    if (i25 < i26) {
                                                                        int i27 = i25 + 1;
                                                                        iArr[i25] = (int) (jArr[i27] - jArr[i25]);
                                                                        jArr2[i25] = jArr3[i27] - jArr3[i25];
                                                                        i25 = i27;
                                                                    } else {
                                                                        str22 = str26;
                                                                        iArr[i26] = (int) ((c2284d4.f26222q + c2284d4.f26221p) - jArr[i26]);
                                                                        long j6 = c2284d4.f26225t - jArr3[i26];
                                                                        jArr2[i26] = j6;
                                                                        if (j6 <= 0) {
                                                                            p.g("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j6);
                                                                            iArr = Arrays.copyOf(iArr, i26);
                                                                            jArr = Arrays.copyOf(jArr, i26);
                                                                            jArr2 = Arrays.copyOf(jArr2, i26);
                                                                            jArr3 = Arrays.copyOf(jArr3, i26);
                                                                        }
                                                                        b11 = new k(iArr, jArr, jArr2, jArr3);
                                                                    }
                                                                }
                                                            }
                                                            sVar.b(b11);
                                                            c2284d4.f26227v = true;
                                                        } else {
                                                            str3 = str23;
                                                            str2 = str25;
                                                            str21 = str28;
                                                            str22 = str26;
                                                        }
                                                        c2284d4.f26184C = null;
                                                        c2284d4.f26185D = null;
                                                    }
                                                } else {
                                                    str3 = str23;
                                                    str2 = str25;
                                                    str21 = str28;
                                                    str22 = str26;
                                                    if (sparseArray.size() != 0) {
                                                        c2284d4.f26207b0.d();
                                                    } else {
                                                        throw O.a("No valid tracks were found", null);
                                                    }
                                                }
                                            } else {
                                                str3 = str23;
                                                str2 = str25;
                                                str21 = str28;
                                                str22 = str26;
                                                if (c2284d4.f26223r == -9223372036854775807L) {
                                                    c2284d4.f26223r = 1000000L;
                                                }
                                                long j10 = c2284d4.f26224s;
                                                if (j10 != -9223372036854775807L) {
                                                    c2284d4.f26225t = c2284d4.l(j10);
                                                }
                                            }
                                        } else {
                                            str3 = str23;
                                            str2 = str25;
                                            str21 = str28;
                                            str22 = str26;
                                            c2284d4.e(i23);
                                            C2283c c2283c2 = c2284d4.f26226u;
                                            if (c2283c2.f26157h && c2283c2.f26158i != null) {
                                                throw O.a("Combining encryption and compression is not supported", null);
                                            }
                                        }
                                    } else {
                                        str3 = str23;
                                        str2 = str25;
                                        str21 = str28;
                                        str22 = str26;
                                        c2284d4.e(i23);
                                        C2283c c2283c3 = c2284d4.f26226u;
                                        if (c2283c3.f26157h) {
                                            F f10 = c2283c3.f26159j;
                                            if (f10 != null) {
                                                c2283c3.f26161l = new C5063p(null, true, new C5062o(AbstractC5058k.f42084a, null, "video/webm", f10.f10530b));
                                            } else {
                                                throw O.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                            }
                                        }
                                    }
                                } else {
                                    str3 = str23;
                                    str2 = str25;
                                    str21 = str28;
                                    str22 = str26;
                                    int i28 = c2284d4.f26228w;
                                    if (i28 != -1) {
                                        long j11 = c2284d4.f26229x;
                                        if (j11 != -1) {
                                            if (i28 == 475249515) {
                                                c2284d4.f26231z = j11;
                                            }
                                        }
                                    }
                                    throw O.a("Mandatory element SeekID or SeekPosition not found", null);
                                }
                                str5 = str22;
                                str6 = str21;
                            } else {
                                str3 = str23;
                                str2 = str25;
                                String str29 = str28;
                                String str30 = str26;
                                C2283c c2283c4 = c2284d4.f26226u;
                                Gi.e.o(c2283c4);
                                String str31 = c2283c4.f26151b;
                                if (str31 != null) {
                                    switch (str31.hashCode()) {
                                        case -2095576542:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_MPEG4/ISO/AP")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -2095575984:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_MPEG4/ISO/SP")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1985379776:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_MS/ACM")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1784763192:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_TRUEHD")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1730367663:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_VORBIS")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1482641358:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_MPEG/L2")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1482641357:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_MPEG/L3")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -1373388978:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_MS/VFW/FOURCC")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -933872740:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("S_DVBSUB")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -538363189:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_MPEG4/ISO/ASP")) {
                                                c10 = '\t';
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -538363109:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_MPEG4/ISO/AVC")) {
                                                c10 = '\n';
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -425012669:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("S_VOBSUB")) {
                                                c10 = 11;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case -356037306:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_DTS/LOSSLESS")) {
                                                c10 = '\f';
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 62923557:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_AAC")) {
                                                c10 = '\r';
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 62923603:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_AC3")) {
                                                c10 = 14;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 62927045:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_DTS")) {
                                                c10 = 15;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 82318131:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_AV1")) {
                                                c10 = 16;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 82338133:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_VP8")) {
                                                c10 = 17;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 82338134:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_VP9")) {
                                                c10 = 18;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 99146302:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("S_HDMV/PGS")) {
                                                c10 = 19;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 444813526:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("V_THEORA")) {
                                                c10 = 20;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 542569478:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_DTS/EXPRESS")) {
                                                c10 = 21;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 635596514:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_PCM/FLOAT/IEEE")) {
                                                c10 = 22;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 725948237:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals("A_PCM/INT/BIG")) {
                                                c10 = 23;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 725957860:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals(str3)) {
                                                c10 = 24;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 738597099:
                                            str8 = str4;
                                            str7 = str30;
                                            if (!str31.equals(str)) {
                                                str = str;
                                                c10 = '\uffff';
                                                break;
                                            } else {
                                                str = str;
                                                c10 = 25;
                                                break;
                                            }
                                        case 855502857:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals(str2)) {
                                                c10 = 26;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 1045209816:
                                            str8 = str4;
                                            if (str31.equals(str30)) {
                                                str7 = str30;
                                                c10 = 27;
                                                break;
                                            }
                                            str7 = str30;
                                            c10 = '\uffff';
                                            break;
                                        case 1422270023:
                                            str8 = str4;
                                            if (str31.equals("S_TEXT/UTF8")) {
                                                str7 = str30;
                                                c10 = 28;
                                                break;
                                            }
                                            str7 = str30;
                                            c10 = '\uffff';
                                            break;
                                        case 1809237540:
                                            str8 = str4;
                                            if (str31.equals("V_MPEG2")) {
                                                str7 = str30;
                                                c10 = 29;
                                                break;
                                            }
                                            str7 = str30;
                                            c10 = '\uffff';
                                            break;
                                        case 1950749482:
                                            str8 = str4;
                                            if (str31.equals(str8)) {
                                                str7 = str30;
                                                c10 = 30;
                                                break;
                                            }
                                            str7 = str30;
                                            c10 = '\uffff';
                                            break;
                                        case 1950789798:
                                            str8 = str4;
                                            str7 = str30;
                                            if (str31.equals(str29)) {
                                                c10 = 31;
                                                break;
                                            }
                                            c10 = '\uffff';
                                            break;
                                        case 1951062397:
                                            if (str31.equals("A_OPUS")) {
                                                str8 = str4;
                                                str7 = str30;
                                                c10 = ' ';
                                                break;
                                            }
                                        default:
                                            str8 = str4;
                                            str7 = str30;
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
                                            s sVar2 = c2284d4.f26207b0;
                                            ?? r02 = c2283c4;
                                            int i29 = r02.f26152c;
                                            switch (str31.hashCode()) {
                                                case -2095576542:
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_MPEG4/ISO/AP")) {
                                                        c11 = 0;
                                                        break;
                                                    }
                                                    c11 = '\uffff';
                                                    break;
                                                case -2095575984:
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_MPEG4/ISO/SP")) {
                                                        c11 = 1;
                                                        break;
                                                    }
                                                    c11 = '\uffff';
                                                    break;
                                                case -1985379776:
                                                    str10 = str;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    str9 = str29;
                                                    str5 = str7;
                                                    if (str31.equals("A_MS/ACM")) {
                                                        c11 = 2;
                                                        break;
                                                    }
                                                    c11 = '\uffff';
                                                    break;
                                                case -1784763192:
                                                    str10 = str;
                                                    str11 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    str5 = str7;
                                                    if (str31.equals("A_TRUEHD")) {
                                                        str12 = str17;
                                                        c11 = 3;
                                                        break;
                                                    }
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -1730367663:
                                                    str11 = str3;
                                                    str9 = str29;
                                                    str10 = str;
                                                    str5 = str7;
                                                    str12 = str2;
                                                    if (str31.equals("A_VORBIS")) {
                                                        c11 = 4;
                                                        break;
                                                    }
                                                    c11 = '\uffff';
                                                    break;
                                                case -1482641358:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_MPEG/L2")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 5;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -1482641357:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_MPEG/L3")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 6;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -1373388978:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_MS/VFW/FOURCC")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 7;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -933872740:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("S_DVBSUB")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = '\b';
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -538363189:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_MPEG4/ISO/ASP")) {
                                                        c11 = '\t';
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -538363109:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_MPEG4/ISO/AVC")) {
                                                        c11 = '\n';
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -425012669:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("S_VOBSUB")) {
                                                        c11 = 11;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case -356037306:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_DTS/LOSSLESS")) {
                                                        c11 = '\f';
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 62923557:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_AAC")) {
                                                        c11 = '\r';
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 62923603:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_AC3")) {
                                                        c11 = 14;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 62927045:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_DTS")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 15;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 82318131:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_AV1")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        c11 = 16;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 82338133:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_VP8")) {
                                                        c11 = 17;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 82338134:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_VP9")) {
                                                        c11 = 18;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 99146302:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("S_HDMV/PGS")) {
                                                        c11 = 19;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 444813526:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("V_THEORA")) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 20;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 542569478:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_DTS/EXPRESS")) {
                                                        c11 = 21;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 635596514:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_PCM/FLOAT/IEEE")) {
                                                        c11 = 22;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 725948237:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals("A_PCM/INT/BIG")) {
                                                        c11 = 23;
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 725957860:
                                                    str18 = str;
                                                    str19 = str7;
                                                    str20 = str3;
                                                    str17 = str2;
                                                    str9 = str29;
                                                    if (str31.equals(str20)) {
                                                        str10 = str18;
                                                        str11 = str20;
                                                        str5 = str19;
                                                        str12 = str17;
                                                        c11 = 24;
                                                        break;
                                                    }
                                                    str10 = str18;
                                                    str11 = str20;
                                                    str5 = str19;
                                                    str12 = str17;
                                                    c11 = '\uffff';
                                                    break;
                                                case 738597099:
                                                    String str32 = str;
                                                    str9 = str29;
                                                    boolean equals = str31.equals(str32);
                                                    str10 = str32;
                                                    str5 = str7;
                                                    str12 = str2;
                                                    str11 = str3;
                                                    if (equals) {
                                                        c11 = 25;
                                                        break;
                                                    }
                                                    c11 = '\uffff';
                                                    break;
                                                case 855502857:
                                                    str9 = str29;
                                                    str5 = str7;
                                                    if (!str31.equals(str2)) {
                                                        str12 = str2;
                                                        str10 = str;
                                                        str11 = str3;
                                                        c11 = '\uffff';
                                                        break;
                                                    } else {
                                                        str12 = str2;
                                                        str10 = str;
                                                        str11 = str3;
                                                        c11 = 26;
                                                        break;
                                                    }
                                                case 1045209816:
                                                    String str33 = str7;
                                                    str9 = str29;
                                                    str5 = str33;
                                                    str10 = str;
                                                    str11 = str3;
                                                    if (str31.equals(str33)) {
                                                        str12 = str2;
                                                        c11 = 27;
                                                        break;
                                                    }
                                                    str12 = str2;
                                                    c11 = '\uffff';
                                                    break;
                                                case 1422270023:
                                                    str9 = str29;
                                                    if (str31.equals("S_TEXT/UTF8")) {
                                                        str10 = str;
                                                        str5 = str7;
                                                        str11 = str3;
                                                        str12 = str2;
                                                        c11 = 28;
                                                        break;
                                                    }
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    c11 = '\uffff';
                                                    break;
                                                case 1809237540:
                                                    str9 = str29;
                                                    if (str31.equals("V_MPEG2")) {
                                                        str10 = str;
                                                        str5 = str7;
                                                        str11 = str3;
                                                        str12 = str2;
                                                        c11 = 29;
                                                        break;
                                                    }
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    c11 = '\uffff';
                                                    break;
                                                case 1950749482:
                                                    str9 = str29;
                                                    if (str31.equals(str8)) {
                                                        str10 = str;
                                                        str5 = str7;
                                                        str11 = str3;
                                                        str12 = str2;
                                                        c11 = 30;
                                                        break;
                                                    }
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    c11 = '\uffff';
                                                    break;
                                                case 1950789798:
                                                    str9 = str29;
                                                    if (str31.equals(str9)) {
                                                        c11 = 31;
                                                        str10 = str;
                                                        str5 = str7;
                                                        str11 = str3;
                                                        str12 = str2;
                                                        break;
                                                    }
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    c11 = '\uffff';
                                                    break;
                                                case 1951062397:
                                                    if (str31.equals("A_OPUS")) {
                                                        str10 = str;
                                                        str5 = str7;
                                                        str11 = str3;
                                                        str12 = str2;
                                                        str9 = str29;
                                                        c11 = ' ';
                                                        break;
                                                    }
                                                default:
                                                    str10 = str;
                                                    str5 = str7;
                                                    str11 = str3;
                                                    str12 = str2;
                                                    str9 = str29;
                                                    c11 = '\uffff';
                                                    break;
                                            }
                                            String str34 = "audio/raw";
                                            switch (c11) {
                                                case 0:
                                                case 1:
                                                case '\t':
                                                    str3 = str11;
                                                    byte[] bArr2 = r02.f26160k;
                                                    if (bArr2 == null) {
                                                        list2 = null;
                                                    } else {
                                                        list2 = Collections.singletonList(bArr2);
                                                    }
                                                    str34 = "video/mp4v-es";
                                                    list = list2;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null && (a10 = C0880a.a(new u(r02.f26142O))) != null) {
                                                        str13 = a10.f10549c;
                                                        str34 = "video/dolby-vision";
                                                    }
                                                    boolean z14 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int i30 = (z14 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        rVar3.f42250x = r02.P;
                                                        rVar3.f42251y = r02.f26143R;
                                                        rVar3.f42252z = i11;
                                                        str = str10;
                                                        i14 = 1;
                                                    } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(N.e(str34))) {
                                                        if (r02.f26167r == 0) {
                                                            int i31 = r02.f26165p;
                                                            i15 = -1;
                                                            if (i31 == -1) {
                                                                i31 = r02.f26162m;
                                                            }
                                                            r02.f26165p = i31;
                                                            int i32 = r02.f26166q;
                                                            if (i32 == -1) {
                                                                i32 = r02.f26163n;
                                                            }
                                                            r02.f26166q = i32;
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                        if (r02.f26165p != i15 && (i19 = r02.f26166q) != i15) {
                                                            f6 = (r02.f26163n * i16) / (r02.f26162m * i19);
                                                        } else {
                                                            f6 = -1.0f;
                                                        }
                                                        if (r02.f26174y) {
                                                            if (r02.f26132E != -1.0f && r02.f26133F != -1.0f && r02.f26134G != -1.0f && r02.f26135H != -1.0f && r02.f26136I != -1.0f && r02.f26137J != -1.0f && r02.f26138K != -1.0f && r02.f26139L != -1.0f && r02.f26140M != -1.0f && r02.f26141N != -1.0f) {
                                                                byte[] bArr3 = new byte[25];
                                                                ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                                order.put((byte) 0);
                                                                order.putShort((short) ((r02.f26132E * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26133F * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26134G * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26135H * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26136I * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26137J * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26138K * 50000.0f) + 0.5f));
                                                                order.putShort((short) ((r02.f26139L * 50000.0f) + 0.5f));
                                                                order.putShort((short) (r02.f26140M + 0.5f));
                                                                order.putShort((short) (r02.f26141N + 0.5f));
                                                                order.putShort((short) r02.f26130C);
                                                                order.putShort((short) r02.f26131D);
                                                                bArr = bArr3;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i33 = r02.f26175z;
                                                            int i34 = r02.f26129B;
                                                            int i35 = r02.f26128A;
                                                            str = str10;
                                                            int i36 = r02.f26164o;
                                                            c5059l = new C5059l(i33, i34, i35, i36, i36, bArr);
                                                        } else {
                                                            str = str10;
                                                            c5059l = null;
                                                        }
                                                        String str35 = r02.f26150a;
                                                        if (str35 != null) {
                                                            Map map = f26181h0;
                                                            if (map.containsKey(str35)) {
                                                                i17 = ((Integer) map.get(r02.f26150a)).intValue();
                                                                if (r02.f26168s == 0 && Float.compare(r02.f26169t, 0.0f) == 0 && Float.compare(r02.f26170u, 0.0f) == 0) {
                                                                    if (Float.compare(r02.f26171v, 0.0f) != 0) {
                                                                        i18 = 0;
                                                                    } else if (Float.compare(r02.f26171v, 90.0f) == 0) {
                                                                        i18 = 90;
                                                                    } else if (Float.compare(r02.f26171v, -180.0f) != 0 && Float.compare(r02.f26171v, 180.0f) != 0) {
                                                                        if (Float.compare(r02.f26171v, -90.0f) == 0) {
                                                                            i18 = 270;
                                                                        }
                                                                    } else {
                                                                        i18 = 180;
                                                                    }
                                                                    rVar3.f42242p = r02.f26162m;
                                                                    rVar3.f42243q = r02.f26163n;
                                                                    rVar3.f42246t = f6;
                                                                    rVar3.f42245s = i18;
                                                                    rVar3.f42247u = r02.f26172w;
                                                                    rVar3.f42248v = r02.f26173x;
                                                                    rVar3.f42249w = c5059l;
                                                                    i14 = 2;
                                                                }
                                                                i18 = i17;
                                                                rVar3.f42242p = r02.f26162m;
                                                                rVar3.f42243q = r02.f26163n;
                                                                rVar3.f42246t = f6;
                                                                rVar3.f42245s = i18;
                                                                rVar3.f42247u = r02.f26172w;
                                                                rVar3.f42248v = r02.f26173x;
                                                                rVar3.f42249w = c5059l;
                                                                i14 = 2;
                                                            }
                                                        }
                                                        i17 = -1;
                                                        if (r02.f26168s == 0) {
                                                            if (Float.compare(r02.f26171v, 0.0f) != 0) {
                                                            }
                                                            rVar3.f42242p = r02.f26162m;
                                                            rVar3.f42243q = r02.f26163n;
                                                            rVar3.f42246t = f6;
                                                            rVar3.f42245s = i18;
                                                            rVar3.f42247u = r02.f26172w;
                                                            rVar3.f42248v = r02.f26173x;
                                                            rVar3.f42249w = c5059l;
                                                            i14 = 2;
                                                        }
                                                        i18 = i17;
                                                        rVar3.f42242p = r02.f26162m;
                                                        rVar3.f42243q = r02.f26163n;
                                                        rVar3.f42246t = f6;
                                                        rVar3.f42245s = i18;
                                                        rVar3.f42247u = r02.f26172w;
                                                        rVar3.f42248v = r02.f26173x;
                                                        rVar3.f42249w = c5059l;
                                                        i14 = 2;
                                                    } else {
                                                        str = str10;
                                                        if (!"application/x-subrip".equals(str34) && !"text/x-ssa".equals(str34) && !"text/vtt".equals(str34) && !"application/vobsub".equals(str34) && !"application/pgs".equals(str34) && !"application/dvbsubs".equals(str34)) {
                                                            throw O.a("Unexpected MIME type.", null);
                                                        }
                                                        i14 = 3;
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null && !f26181h0.containsKey(str14)) {
                                                        rVar3.f42228b = r02.f26150a;
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11 = rVar3.a();
                                                    G f11 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11;
                                                    f11.b(a11);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 2:
                                                    str3 = str11;
                                                    u uVar = new u(r02.a(r02.f26151b));
                                                    try {
                                                        int n10 = uVar.n();
                                                        if (n10 != 1) {
                                                            if (n10 == 65534) {
                                                                uVar.F(24);
                                                                long o10 = uVar.o();
                                                                UUID uuid = f26180g0;
                                                                if (o10 == uuid.getMostSignificantBits()) {
                                                                    break;
                                                                }
                                                            }
                                                            p.g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                            str34 = "audio/x-unknown";
                                                            i12 = -1;
                                                            list = null;
                                                            i11 = -1;
                                                            str13 = null;
                                                            if (r02.f26142O != null) {
                                                                str13 = a10.f10549c;
                                                                str34 = "video/dolby-vision";
                                                                break;
                                                            }
                                                            boolean z142 = r02.f26146W;
                                                            if (r02.f26145V) {
                                                            }
                                                            int i302 = (z142 ? 1 : 0) | i13;
                                                            rVar3 = new p2.r();
                                                            str2 = str12;
                                                            str4 = str8;
                                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                            }
                                                            str14 = r02.f26150a;
                                                            if (str14 != null) {
                                                                rVar3.f42228b = r02.f26150a;
                                                                break;
                                                            }
                                                            rVar3.f42227a = Integer.toString(i29);
                                                            rVar3.f42237k = str34;
                                                            rVar3.f42238l = i12;
                                                            rVar3.f42229c = r02.f26147X;
                                                            rVar3.f42230d = i302;
                                                            rVar3.f42239m = list;
                                                            rVar3.f42234h = str13;
                                                            rVar3.f42240n = r02.f26161l;
                                                            C5065s a112 = rVar3.a();
                                                            G f112 = sVar2.f(r02.f26152c, i14);
                                                            r02.f26148Y = f112;
                                                            f112.b(a112);
                                                            sparseArray.put(r02.f26152c, r02);
                                                            c2284d2 = c2284d4;
                                                            c2283c = null;
                                                            break;
                                                        }
                                                        i11 = AbstractC5530A.t(r02.Q);
                                                        if (i11 == 0) {
                                                            p.g("MatroskaExtractor", "Unsupported PCM bit depth: " + r02.Q + ". Setting mimeType to audio/x-unknown");
                                                            str34 = "audio/x-unknown";
                                                            i12 = -1;
                                                            list = null;
                                                            i11 = -1;
                                                            str13 = null;
                                                            if (r02.f26142O != null) {
                                                            }
                                                            boolean z1422 = r02.f26146W;
                                                            if (r02.f26145V) {
                                                            }
                                                            int i3022 = (z1422 ? 1 : 0) | i13;
                                                            rVar3 = new p2.r();
                                                            str2 = str12;
                                                            str4 = str8;
                                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                            }
                                                            str14 = r02.f26150a;
                                                            if (str14 != null) {
                                                            }
                                                            rVar3.f42227a = Integer.toString(i29);
                                                            rVar3.f42237k = str34;
                                                            rVar3.f42238l = i12;
                                                            rVar3.f42229c = r02.f26147X;
                                                            rVar3.f42230d = i3022;
                                                            rVar3.f42239m = list;
                                                            rVar3.f42234h = str13;
                                                            rVar3.f42240n = r02.f26161l;
                                                            C5065s a1122 = rVar3.a();
                                                            G f1122 = sVar2.f(r02.f26152c, i14);
                                                            r02.f26148Y = f1122;
                                                            f1122.b(a1122);
                                                            sparseArray.put(r02.f26152c, r02);
                                                            c2284d2 = c2284d4;
                                                            c2283c = null;
                                                        }
                                                        i12 = -1;
                                                        list = null;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z14222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i30222 = (z14222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i30222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a11222 = rVar3.a();
                                                        G f11222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f11222;
                                                        f11222.b(a11222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                                        throw O.a("Error parsing MS/ACM codec private", null);
                                                    }
                                                    break;
                                                case 3:
                                                    str3 = str11;
                                                    r02.f26144U = new H();
                                                    str34 = "audio/true-hd";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222 = (z142222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222 = rVar3.a();
                                                    G f112222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222;
                                                    f112222.b(a112222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 4:
                                                    str3 = str11;
                                                    byte[] a12 = r02.a(r02.f26151b);
                                                    try {
                                                        try {
                                                            if (a12[0] == 2) {
                                                                int i37 = 0;
                                                                int i38 = 1;
                                                                while (true) {
                                                                    int i39 = a12[i38] & 255;
                                                                    if (i39 == 255) {
                                                                        i37 += 255;
                                                                        i38++;
                                                                    } else {
                                                                        int i40 = i38 + 1;
                                                                        int i41 = i37 + i39;
                                                                        int i42 = 0;
                                                                        while (true) {
                                                                            int i43 = a12[i40] & 255;
                                                                            if (i43 == 255) {
                                                                                i42 += 255;
                                                                                i40++;
                                                                            } else {
                                                                                int i44 = i40 + 1;
                                                                                int i45 = i42 + i43;
                                                                                if (a12[i44] == 1) {
                                                                                    byte[] bArr4 = new byte[i41];
                                                                                    System.arraycopy(a12, i44, bArr4, 0, i41);
                                                                                    int i46 = i44 + i41;
                                                                                    if (a12[i46] == 3) {
                                                                                        int i47 = i46 + i45;
                                                                                        if (a12[i47] == 5) {
                                                                                            byte[] bArr5 = new byte[a12.length - i47];
                                                                                            System.arraycopy(a12, i47, bArr5, 0, a12.length - i47);
                                                                                            arrayList = new ArrayList(2);
                                                                                            arrayList.add(bArr4);
                                                                                            arrayList.add(bArr5);
                                                                                            str34 = "audio/vorbis";
                                                                                            i12 = 8192;
                                                                                            list = arrayList;
                                                                                            i11 = -1;
                                                                                            str13 = null;
                                                                                            if (r02.f26142O != null) {
                                                                                            }
                                                                                            boolean z1422222 = r02.f26146W;
                                                                                            if (r02.f26145V) {
                                                                                            }
                                                                                            int i3022222 = (z1422222 ? 1 : 0) | i13;
                                                                                            rVar3 = new p2.r();
                                                                                            str2 = str12;
                                                                                            str4 = str8;
                                                                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                                                            }
                                                                                            str14 = r02.f26150a;
                                                                                            if (str14 != null) {
                                                                                            }
                                                                                            rVar3.f42227a = Integer.toString(i29);
                                                                                            rVar3.f42237k = str34;
                                                                                            rVar3.f42238l = i12;
                                                                                            rVar3.f42229c = r02.f26147X;
                                                                                            rVar3.f42230d = i3022222;
                                                                                            rVar3.f42239m = list;
                                                                                            rVar3.f42234h = str13;
                                                                                            rVar3.f42240n = r02.f26161l;
                                                                                            C5065s a1122222 = rVar3.a();
                                                                                            G f1122222 = sVar2.f(r02.f26152c, i14);
                                                                                            r02.f26148Y = f1122222;
                                                                                            f1122222.b(a1122222);
                                                                                            sparseArray.put(r02.f26152c, r02);
                                                                                            c2284d2 = c2284d4;
                                                                                            c2283c = null;
                                                                                            break;
                                                                                        } else {
                                                                                            throw O.a("Error parsing vorbis codec private", null);
                                                                                        }
                                                                                    } else {
                                                                                        throw O.a("Error parsing vorbis codec private", null);
                                                                                    }
                                                                                } else {
                                                                                    throw O.a("Error parsing vorbis codec private", null);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                throw O.a("Error parsing vorbis codec private", null);
                                                            }
                                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            throw O.a("Error parsing vorbis codec private", r02);
                                                        }
                                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                                        r02 = 0;
                                                    }
                                                    break;
                                                case 5:
                                                    str3 = str11;
                                                    str34 = "audio/mpeg-L2";
                                                    i12 = 4096;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222 = (z14222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222 = rVar3.a();
                                                    G f11222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222;
                                                    f11222222.b(a11222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 6:
                                                    str3 = str11;
                                                    str34 = "audio/mpeg";
                                                    i12 = 4096;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222 = (z142222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222 = rVar3.a();
                                                    G f112222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222;
                                                    f112222222.b(a112222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 7:
                                                    str3 = str11;
                                                    u uVar2 = new u(r02.a(r02.f26151b));
                                                    try {
                                                        uVar2.G(16);
                                                        long l10 = uVar2.l();
                                                        if (l10 == 1482049860) {
                                                            runtimeException = null;
                                                            try {
                                                                pair = new Pair("video/divx", null);
                                                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                                                throw O.a("Error parsing FourCC private data", runtimeException);
                                                            }
                                                        } else if (l10 == 859189832) {
                                                            pair = new Pair("video/3gpp", null);
                                                        } else if (l10 == 826496599) {
                                                            int i48 = uVar2.f45194b + 20;
                                                            byte[] bArr6 = uVar2.f45193a;
                                                            while (i48 < bArr6.length - 4) {
                                                                if (bArr6[i48] == 0) {
                                                                    i20 = 1;
                                                                    if (bArr6[i48 + 1] == 0 && bArr6[i48 + 2] == 1) {
                                                                        if (bArr6[i48 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i48, bArr6.length)));
                                                                        }
                                                                    } else {
                                                                        i48 += i20;
                                                                    }
                                                                }
                                                                i20 = 1;
                                                                i48 += i20;
                                                            }
                                                            try {
                                                                throw O.a("Failed to find FourCC VC1 initialization data", null);
                                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                runtimeException = null;
                                                                throw O.a("Error parsing FourCC private data", runtimeException);
                                                            }
                                                        } else {
                                                            p.g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                            str15 = null;
                                                            pair = new Pair("video/x-unknown", null);
                                                            str34 = (String) pair.first;
                                                            str13 = str15;
                                                            list = (List) pair.second;
                                                            i12 = -1;
                                                            i11 = -1;
                                                            if (r02.f26142O != null) {
                                                            }
                                                            boolean z1422222222 = r02.f26146W;
                                                            if (r02.f26145V) {
                                                            }
                                                            int i3022222222 = (z1422222222 ? 1 : 0) | i13;
                                                            rVar3 = new p2.r();
                                                            str2 = str12;
                                                            str4 = str8;
                                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                            }
                                                            str14 = r02.f26150a;
                                                            if (str14 != null) {
                                                            }
                                                            rVar3.f42227a = Integer.toString(i29);
                                                            rVar3.f42237k = str34;
                                                            rVar3.f42238l = i12;
                                                            rVar3.f42229c = r02.f26147X;
                                                            rVar3.f42230d = i3022222222;
                                                            rVar3.f42239m = list;
                                                            rVar3.f42234h = str13;
                                                            rVar3.f42240n = r02.f26161l;
                                                            C5065s a1122222222 = rVar3.a();
                                                            G f1122222222 = sVar2.f(r02.f26152c, i14);
                                                            r02.f26148Y = f1122222222;
                                                            f1122222222.b(a1122222222);
                                                            sparseArray.put(r02.f26152c, r02);
                                                            c2284d2 = c2284d4;
                                                            c2283c = null;
                                                            break;
                                                        }
                                                        str15 = null;
                                                        str34 = (String) pair.first;
                                                        str13 = str15;
                                                        list = (List) pair.second;
                                                        i12 = -1;
                                                        i11 = -1;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z14222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i30222222222 = (z14222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i30222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a11222222222 = rVar3.a();
                                                        G f11222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f11222222222;
                                                        f11222222222.b(a11222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused6) {
                                                        runtimeException = null;
                                                    }
                                                    break;
                                                case '\b':
                                                    str3 = str11;
                                                    byte[] bArr7 = new byte[4];
                                                    System.arraycopy(r02.a(r02.f26151b), 0, bArr7, 0, 4);
                                                    u02 = x8.N.u0(bArr7);
                                                    str34 = "application/dvbsubs";
                                                    list = u02;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222 = (z142222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222 = rVar3.a();
                                                    G f112222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222;
                                                    f112222222222.b(a112222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case '\n':
                                                    str3 = str11;
                                                    C0883d a13 = C0883d.a(new u(r02.a(r02.f26151b)));
                                                    r02.f26149Z = a13.f10577b;
                                                    str34 = "video/avc";
                                                    list3 = a13.f10576a;
                                                    str16 = a13.f10586k;
                                                    str13 = str16;
                                                    list = list3;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222 = (z1422222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222 = rVar3.a();
                                                    G f1122222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222;
                                                    f1122222222222.b(a1122222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 11:
                                                    str3 = str11;
                                                    u02 = x8.N.u0(r02.a(r02.f26151b));
                                                    str34 = "application/vobsub";
                                                    list = u02;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222 = (z14222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222 = rVar3.a();
                                                    G f11222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222;
                                                    f11222222222222.b(a11222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case '\f':
                                                    str3 = str11;
                                                    str34 = "audio/vnd.dts.hd";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222 = (z142222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222 = rVar3.a();
                                                    G f112222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222;
                                                    f112222222222222.b(a112222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case '\r':
                                                    str3 = str11;
                                                    List singletonList = Collections.singletonList(r02.a(r02.f26151b));
                                                    C0880a f12 = AbstractC0881b.f(new t(r02.f26160k, 0), false);
                                                    r02.f26143R = f12.f10547a;
                                                    r02.P = f12.f10548b;
                                                    str34 = "audio/mp4a-latm";
                                                    list = singletonList;
                                                    str13 = f12.f10549c;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222 = (z1422222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222 = rVar3.a();
                                                    G f1122222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222;
                                                    f1122222222222222.b(a1122222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 14:
                                                    str3 = str11;
                                                    str34 = "audio/ac3";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222 = (z14222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222 = rVar3.a();
                                                    G f11222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222;
                                                    f11222222222222222.b(a11222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 15:
                                                case 21:
                                                    str3 = str11;
                                                    str34 = "audio/vnd.dts";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222222 = (z142222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222222 = rVar3.a();
                                                    G f112222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222222;
                                                    f112222222222222222.b(a112222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 16:
                                                    str3 = str11;
                                                    str34 = "video/av01";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222222 = (z1422222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222222 = rVar3.a();
                                                    G f1122222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222222;
                                                    f1122222222222222222.b(a1122222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 17:
                                                    str3 = str11;
                                                    str34 = "video/x-vnd.on2.vp8";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222222 = (z14222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222222 = rVar3.a();
                                                    G f11222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222222;
                                                    f11222222222222222222.b(a11222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 18:
                                                    str3 = str11;
                                                    str34 = "video/x-vnd.on2.vp9";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222222222 = (z142222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222222222 = rVar3.a();
                                                    G f112222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222222222;
                                                    f112222222222222222222.b(a112222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 19:
                                                    str3 = str11;
                                                    str34 = "application/pgs";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222222222 = (z1422222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222222222 = rVar3.a();
                                                    G f1122222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222222222;
                                                    f1122222222222222222222.b(a1122222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 20:
                                                    str3 = str11;
                                                    str34 = "video/x-unknown";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222222222 = (z14222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222222222 = rVar3.a();
                                                    G f11222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222222222;
                                                    f11222222222222222222222.b(a11222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 22:
                                                    str3 = str11;
                                                    if (r02.Q == 32) {
                                                        i12 = -1;
                                                        list = null;
                                                        i11 = 4;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z142222222222222222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i302222222222222222222222 = (z142222222222222222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i302222222222222222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a112222222222222222222222 = rVar3.a();
                                                        G f112222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f112222222222222222222222;
                                                        f112222222222222222222222.b(a112222222222222222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                        break;
                                                    } else {
                                                        p.g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r02.Q + ". Setting mimeType to audio/x-unknown");
                                                        str34 = "audio/x-unknown";
                                                        i12 = -1;
                                                        list = null;
                                                        i11 = -1;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z1422222222222222222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i3022222222222222222222222 = (z1422222222222222222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i3022222222222222222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a1122222222222222222222222 = rVar3.a();
                                                        G f1122222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f1122222222222222222222222;
                                                        f1122222222222222222222222.b(a1122222222222222222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                    }
                                                    break;
                                                case 23:
                                                    str3 = str11;
                                                    int i49 = r02.Q;
                                                    if (i49 == 8) {
                                                        i12 = -1;
                                                        list = null;
                                                        i11 = 3;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z14222222222222222222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i30222222222222222222222222 = (z14222222222222222222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i30222222222222222222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a11222222222222222222222222 = rVar3.a();
                                                        G f11222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f11222222222222222222222222;
                                                        f11222222222222222222222222.b(a11222222222222222222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                        break;
                                                    } else {
                                                        if (i49 == 16) {
                                                            i21 = 268435456;
                                                        } else if (i49 == 24) {
                                                            i21 = 1342177280;
                                                        } else if (i49 == 32) {
                                                            i21 = 1610612736;
                                                        } else {
                                                            p.g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r02.Q + ". Setting mimeType to audio/x-unknown");
                                                            str34 = "audio/x-unknown";
                                                            i12 = -1;
                                                            list = null;
                                                            i11 = -1;
                                                            str13 = null;
                                                            if (r02.f26142O != null) {
                                                            }
                                                            boolean z142222222222222222222222222 = r02.f26146W;
                                                            if (r02.f26145V) {
                                                            }
                                                            int i302222222222222222222222222 = (z142222222222222222222222222 ? 1 : 0) | i13;
                                                            rVar3 = new p2.r();
                                                            str2 = str12;
                                                            str4 = str8;
                                                            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                            }
                                                            str14 = r02.f26150a;
                                                            if (str14 != null) {
                                                            }
                                                            rVar3.f42227a = Integer.toString(i29);
                                                            rVar3.f42237k = str34;
                                                            rVar3.f42238l = i12;
                                                            rVar3.f42229c = r02.f26147X;
                                                            rVar3.f42230d = i302222222222222222222222222;
                                                            rVar3.f42239m = list;
                                                            rVar3.f42234h = str13;
                                                            rVar3.f42240n = r02.f26161l;
                                                            C5065s a112222222222222222222222222 = rVar3.a();
                                                            G f112222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                            r02.f26148Y = f112222222222222222222222222;
                                                            f112222222222222222222222222.b(a112222222222222222222222222);
                                                            sparseArray.put(r02.f26152c, r02);
                                                            c2284d2 = c2284d4;
                                                            c2283c = null;
                                                        }
                                                        i11 = i21;
                                                        i12 = -1;
                                                        list = null;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z1422222222222222222222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i3022222222222222222222222222 = (z1422222222222222222222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i3022222222222222222222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a1122222222222222222222222222 = rVar3.a();
                                                        G f1122222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f1122222222222222222222222222;
                                                        f1122222222222222222222222222.b(a1122222222222222222222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                    }
                                                    break;
                                                case 24:
                                                    str3 = str11;
                                                    i21 = AbstractC5530A.t(r02.Q);
                                                    if (i21 == 0) {
                                                        p.g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r02.Q + ". Setting mimeType to audio/x-unknown");
                                                        str34 = "audio/x-unknown";
                                                        i12 = -1;
                                                        list = null;
                                                        i11 = -1;
                                                        str13 = null;
                                                        if (r02.f26142O != null) {
                                                        }
                                                        boolean z14222222222222222222222222222 = r02.f26146W;
                                                        if (r02.f26145V) {
                                                        }
                                                        int i30222222222222222222222222222 = (z14222222222222222222222222222 ? 1 : 0) | i13;
                                                        rVar3 = new p2.r();
                                                        str2 = str12;
                                                        str4 = str8;
                                                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                        }
                                                        str14 = r02.f26150a;
                                                        if (str14 != null) {
                                                        }
                                                        rVar3.f42227a = Integer.toString(i29);
                                                        rVar3.f42237k = str34;
                                                        rVar3.f42238l = i12;
                                                        rVar3.f42229c = r02.f26147X;
                                                        rVar3.f42230d = i30222222222222222222222222222;
                                                        rVar3.f42239m = list;
                                                        rVar3.f42234h = str13;
                                                        rVar3.f42240n = r02.f26161l;
                                                        C5065s a11222222222222222222222222222 = rVar3.a();
                                                        G f11222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                        r02.f26148Y = f11222222222222222222222222222;
                                                        f11222222222222222222222222222.b(a11222222222222222222222222222);
                                                        sparseArray.put(r02.f26152c, r02);
                                                        c2284d2 = c2284d4;
                                                        c2283c = null;
                                                        break;
                                                    }
                                                    i11 = i21;
                                                    i12 = -1;
                                                    list = null;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222222222222222222 = (z142222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222222222222222222 = rVar3.a();
                                                    G f112222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222222222222222222;
                                                    f112222222222222222222222222222.b(a112222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 25:
                                                    str3 = str11;
                                                    u02 = x8.N.v0(f26177d0, r02.a(r02.f26151b));
                                                    str34 = "text/x-ssa";
                                                    list = u02;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222222222222222222 = (z1422222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222222222222222222 = rVar3.a();
                                                    G f1122222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222222222222222222;
                                                    f1122222222222222222222222222222.b(a1122222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 26:
                                                    str3 = str11;
                                                    C0883d b12 = C0883d.b(new u(r02.a(r02.f26151b)));
                                                    r02.f26149Z = b12.f10577b;
                                                    str34 = "video/hevc";
                                                    list3 = b12.f10576a;
                                                    str16 = b12.f10586k;
                                                    str13 = str16;
                                                    list = list3;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222222222222222222 = (z14222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222222222222222222 = rVar3.a();
                                                    G f11222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222222222222222222;
                                                    f11222222222222222222222222222222.b(a11222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 27:
                                                    str3 = str11;
                                                    str34 = "text/vtt";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222222222222222222222 = (z142222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222222222222222222222 = rVar3.a();
                                                    G f112222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222222222222222222222;
                                                    f112222222222222222222222222222222.b(a112222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 28:
                                                    str3 = str11;
                                                    str34 = "application/x-subrip";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222222222222222222222 = (z1422222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222222222222222222222 = rVar3.a();
                                                    G f1122222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222222222222222222222;
                                                    f1122222222222222222222222222222222.b(a1122222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 29:
                                                    str3 = str11;
                                                    str34 = "video/mpeg2";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222222222222222222222 = (z14222222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222222222222222222222 = rVar3.a();
                                                    G f11222222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222222222222222222222;
                                                    f11222222222222222222222222222222222.b(a11222222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 30:
                                                    str3 = str11;
                                                    str34 = "audio/eac3";
                                                    i12 = -1;
                                                    list = null;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z142222222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i302222222222222222222222222222222222 = (z142222222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i302222222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a112222222222222222222222222222222222 = rVar3.a();
                                                    G f112222222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f112222222222222222222222222222222222;
                                                    f112222222222222222222222222222222222.b(a112222222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case 31:
                                                    str3 = str11;
                                                    u02 = Collections.singletonList(r02.a(r02.f26151b));
                                                    str34 = "audio/flac";
                                                    list = u02;
                                                    i12 = -1;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z1422222222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i3022222222222222222222222222222222222 = (z1422222222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i3022222222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a1122222222222222222222222222222222222 = rVar3.a();
                                                    G f1122222222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f1122222222222222222222222222222222222;
                                                    f1122222222222222222222222222222222222.b(a1122222222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                case ' ':
                                                    arrayList = new ArrayList(3);
                                                    arrayList.add(r02.a(r02.f26151b));
                                                    ByteBuffer allocate = ByteBuffer.allocate(8);
                                                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                    str3 = str11;
                                                    arrayList.add(allocate.order(byteOrder).putLong(r02.S).array());
                                                    arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r02.T).array());
                                                    str34 = "audio/opus";
                                                    i12 = 5760;
                                                    list = arrayList;
                                                    i11 = -1;
                                                    str13 = null;
                                                    if (r02.f26142O != null) {
                                                    }
                                                    boolean z14222222222222222222222222222222222222 = r02.f26146W;
                                                    if (r02.f26145V) {
                                                    }
                                                    int i30222222222222222222222222222222222222 = (z14222222222222222222222222222222222222 ? 1 : 0) | i13;
                                                    rVar3 = new p2.r();
                                                    str2 = str12;
                                                    str4 = str8;
                                                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(N.e(str34))) {
                                                    }
                                                    str14 = r02.f26150a;
                                                    if (str14 != null) {
                                                    }
                                                    rVar3.f42227a = Integer.toString(i29);
                                                    rVar3.f42237k = str34;
                                                    rVar3.f42238l = i12;
                                                    rVar3.f42229c = r02.f26147X;
                                                    rVar3.f42230d = i30222222222222222222222222222222222222;
                                                    rVar3.f42239m = list;
                                                    rVar3.f42234h = str13;
                                                    rVar3.f42240n = r02.f26161l;
                                                    C5065s a11222222222222222222222222222222222222 = rVar3.a();
                                                    G f11222222222222222222222222222222222222 = sVar2.f(r02.f26152c, i14);
                                                    r02.f26148Y = f11222222222222222222222222222222222222;
                                                    f11222222222222222222222222222222222222.b(a11222222222222222222222222222222222222);
                                                    sparseArray.put(r02.f26152c, r02);
                                                    c2284d2 = c2284d4;
                                                    c2283c = null;
                                                    break;
                                                default:
                                                    throw O.a("Unrecognized codec identifier.", null);
                                            }
                                        default:
                                            str5 = str7;
                                            str9 = str29;
                                            c2284d2 = c2284d4;
                                            c2283c = null;
                                            str4 = str8;
                                            break;
                                    }
                                    c2284d2.f26226u = c2283c;
                                    str6 = str9;
                                } else {
                                    throw O.a("CodecId is missing in TrackEntry element", null);
                                }
                            }
                        } else {
                            str3 = str23;
                            str2 = str25;
                            str6 = str28;
                            str5 = str26;
                            if (c2284d4.f26188G == 2) {
                                C2283c c2283c5 = (C2283c) sparseArray.get(c2284d4.f26194M);
                                c2283c5.f26148Y.getClass();
                                if (c2284d4.f26197R > 0 && "A_OPUS".equals(c2283c5.f26151b)) {
                                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c2284d4.f26197R).array();
                                    u uVar3 = c2284d4.f26219n;
                                    uVar3.getClass();
                                    uVar3.D(array.length, array);
                                }
                                int i50 = 0;
                                for (int i51 = 0; i51 < c2284d4.f26192K; i51++) {
                                    i50 += c2284d4.f26193L[i51];
                                }
                                for (int i52 = 0; i52 < c2284d4.f26192K; i52++) {
                                    long j12 = c2284d4.f26189H + ((c2283c5.f26154e * i52) / 1000);
                                    int i53 = c2284d4.f26196O;
                                    if (i52 == 0 && !c2284d4.Q) {
                                        i53 |= 1;
                                    }
                                    int i54 = c2284d4.f26193L[i52];
                                    i50 -= i54;
                                    c2284d4.f(c2283c5, j12, i53, i54, i50);
                                }
                                z10 = false;
                                z12 = true;
                                c2284d4.f26188G = 0;
                                rVar2 = rVar;
                                z13 = z12;
                            }
                        }
                        z10 = false;
                        z12 = true;
                        rVar2 = rVar;
                        z13 = z12;
                    } else {
                        str3 = str23;
                    }
                } else {
                    str3 = str23;
                    str4 = str27;
                }
                str2 = str25;
                str6 = str28;
                str5 = str26;
                boolean z15 = false;
                if (c2282b.f26125e == 0) {
                    rVar2 = rVar;
                    int i55 = 4;
                    long c12 = c2282b.f26123c.c(rVar2, true, false, 4);
                    if (c12 == -2) {
                        rVar.k();
                        while (true) {
                            byte[] bArr8 = c2282b.f26121a;
                            int i56 = z15 ? 1 : 0;
                            int i57 = z15 ? 1 : 0;
                            rVar2.n(bArr8, i56, i55);
                            ?? r22 = z15 ? 1 : 0;
                            ?? r23 = z15 ? 1 : 0;
                            b10 = C2285e.b(bArr8[r22]);
                            if (b10 != -1 && b10 <= i55) {
                                a5 = (int) C2285e.a(bArr8, z15, b10);
                                ((C2284d) c2282b.f26124d.f8729Y).getClass();
                                if (a5 == 357149030 || a5 == 524531317 || a5 == 475249515 || a5 == 374648427) {
                                }
                            }
                            rVar2.l(1);
                            z15 = false;
                            i55 = 4;
                        }
                        rVar2.l(b10);
                        c12 = a5;
                    }
                    z11 = true;
                    if (c12 == -1) {
                        z10 = false;
                        z13 = false;
                    } else {
                        c2282b.f26126f = (int) c12;
                        c2282b.f26125e = 1;
                    }
                } else {
                    rVar2 = rVar;
                    z11 = true;
                }
                if (c2282b.f26125e == z11) {
                    c2282b.f26127g = c2282b.f26123c.c(rVar2, false, z11, 8);
                    c2282b.f26125e = 2;
                }
                J0.a aVar2 = c2282b.f26124d;
                int i58 = c2282b.f26126f;
                ((C2284d) aVar2.f8729Y).getClass();
                switch (i58) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i10 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i10 = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i10 = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i10 = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i10 = 5;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        long j13 = c2282b.f26127g;
                                        if (j13 != 4 && j13 != 8) {
                                            throw O.a("Invalid float size: " + c2282b.f26127g, null);
                                        }
                                        J0.a aVar3 = c2282b.f26124d;
                                        int i59 = c2282b.f26126f;
                                        int i60 = (int) j13;
                                        long a14 = c2282b.a(rVar2, i60);
                                        if (i60 == 4) {
                                            d10 = Float.intBitsToFloat((int) a14);
                                        } else {
                                            d10 = Double.longBitsToDouble(a14);
                                        }
                                        aVar3.M(i59, d10);
                                        z10 = false;
                                        c2282b.f26125e = 0;
                                    } else {
                                        throw O.a("Invalid element type " + i10, null);
                                    }
                                } else {
                                    c2282b.f26124d.D(c2282b.f26126f, (int) c2282b.f26127g, rVar2);
                                    z10 = false;
                                    c2282b.f26125e = 0;
                                }
                            } else {
                                z10 = false;
                                long j14 = c2282b.f26127g;
                                if (j14 <= 2147483647L) {
                                    c2282b.f26124d.S(c2282b.f26126f, C2282b.b(rVar2, (int) j14));
                                    c2282b.f26125e = 0;
                                } else {
                                    throw O.a("String element size: " + c2282b.f26127g, null);
                                }
                            }
                        } else {
                            long j15 = c2282b.f26127g;
                            if (j15 <= 8) {
                                c2282b.f26124d.N(c2282b.f26126f, c2282b.a(rVar2, (int) j15));
                                z10 = false;
                                c2282b.f26125e = 0;
                            } else {
                                throw O.a("Invalid integer size: " + c2282b.f26127g, null);
                            }
                        }
                    } else {
                        long o11 = rVar.o();
                        arrayDeque.push(new C2281a(c2282b.f26126f, o11 + c2282b.f26127g));
                        c2282b.f26124d.R(o11, c2282b.f26126f, c2282b.f26127g);
                        z10 = false;
                        c2282b.f26125e = 0;
                    }
                    z13 = true;
                } else {
                    rVar2.l((int) c2282b.f26127g);
                    c2282b.f26125e = 0;
                    str26 = str5;
                    str27 = str4;
                    str23 = str3;
                    str25 = str2;
                    str28 = str6;
                    str24 = str;
                }
            }
            if (z13) {
                long o12 = rVar.o();
                c2284d = this;
                if (c2284d.f26230y) {
                    c2284d.f26182A = o12;
                    iVar.f7995b = c2284d.f26231z;
                    c2284d.f26230y = z10;
                    return 1;
                }
                iVar2 = iVar;
                if (c2284d.f26227v) {
                    long j16 = c2284d.f26182A;
                    if (j16 != -1) {
                        iVar2.f7995b = j16;
                        c2284d.f26182A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                c2284d = this;
                iVar2 = iVar;
            }
            str26 = str5;
            str27 = str4;
            str23 = str3;
            str25 = str2;
            str28 = str6;
            c2284d3 = c2284d;
            str24 = str;
        }
        C2284d c2284d5 = c2284d3;
        if (!z13) {
            for (int i61 = 0; i61 < c2284d5.f26208c.size(); i61++) {
                C2283c c2283c6 = (C2283c) c2284d5.f26208c.valueAt(i61);
                c2283c6.f26148Y.getClass();
                H h10 = c2283c6.f26144U;
                if (h10 != null) {
                    h10.a(c2283c6.f26148Y, c2283c6.f26159j);
                }
            }
            return -1;
        }
        return 0;
    }

    public final void c(int i10) {
        if (this.f26184C != null && this.f26185D != null) {
            return;
        }
        throw O.a("Element " + i10 + " must be in a Cues", null);
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f26207b0 = sVar;
    }

    public final void e(int i10) {
        if (this.f26226u != null) {
            return;
        }
        throw O.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(C2283c c2283c, long j6, int i10, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr;
        H h10 = c2283c.f26144U;
        if (h10 != null) {
            h10.b(c2283c.f26148Y, j6, i10, i11, i12, c2283c.f26159j);
        } else {
            if ("S_TEXT/UTF8".equals(c2283c.f26151b) || "S_TEXT/ASS".equals(c2283c.f26151b) || "S_TEXT/WEBVTT".equals(c2283c.f26151b)) {
                if (this.f26192K > 1) {
                    p.g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.f26190I;
                    if (j10 == -9223372036854775807L) {
                        p.g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c2283c.f26151b;
                        u uVar = this.f26216k;
                        byte[] bArr2 = uVar.f45193a;
                        str.getClass();
                        int hashCode = str.hashCode();
                        char c10 = '\uffff';
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    c10 = 2;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                c10 = 1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            c10 = 0;
                        }
                        if (c10 != 0) {
                            if (c10 != 1) {
                                if (c10 == 2) {
                                    bArr = i(j10, 1000L, "%02d:%02d:%02d,%03d");
                                    i14 = 19;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                bArr = i(j10, 1000L, "%02d:%02d:%02d.%03d");
                                i14 = 25;
                            }
                        } else {
                            bArr = i(j10, 10000L, "%01d:%02d:%02d:%02d");
                            i14 = 21;
                        }
                        System.arraycopy(bArr, 0, bArr2, i14, bArr.length);
                        int i15 = uVar.f45194b;
                        while (true) {
                            if (i15 >= uVar.f45195c) {
                                break;
                            } else if (uVar.f45193a[i15] == 0) {
                                uVar.E(i15);
                                break;
                            } else {
                                i15++;
                            }
                        }
                        c2283c.f26148Y.a(uVar.f45195c, uVar);
                        i13 = i11 + uVar.f45195c;
                        if ((i10 & 268435456) != 0) {
                            int i16 = this.f26192K;
                            u uVar2 = this.f26219n;
                            if (i16 > 1) {
                                uVar2.C(0);
                            } else {
                                int i17 = uVar2.f45195c;
                                c2283c.f26148Y.d(i17, 2, uVar2);
                                i13 += i17;
                            }
                        }
                        c2283c.f26148Y.e(j6, i10, i13, i12, c2283c.f26159j);
                    }
                }
            }
            i13 = i11;
            if ((i10 & 268435456) != 0) {
            }
            c2283c.f26148Y.e(j6, i10, i13, i12, c2283c.f26159j);
        }
        this.f26187F = true;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        long u10;
        int i10;
        C4528h c4528h = new C4528h(5);
        long h10 = rVar.h();
        int i11 = (h10 > (-1L) ? 1 : (h10 == (-1L) ? 0 : -1));
        long j6 = 1024;
        if (i11 != 0 && h10 <= 1024) {
            j6 = h10;
        }
        int i12 = (int) j6;
        rVar.n(((u) c4528h.f38770Z).f45193a, 0, 4);
        c4528h.f38769Y = 4;
        for (long v10 = ((u) c4528h.f38770Z).v(); v10 != 440786851; v10 = ((v10 << 8) & (-256)) | (((u) c4528h.f38770Z).f45193a[0] & 255)) {
            int i13 = c4528h.f38769Y + 1;
            c4528h.f38769Y = i13;
            if (i13 == i12) {
                return false;
            }
            rVar.n(((u) c4528h.f38770Z).f45193a, 0, 1);
        }
        long u11 = c4528h.u(rVar);
        long j10 = c4528h.f38769Y;
        if (u11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j10 + u11 >= h10) {
            return false;
        }
        while (true) {
            int i14 = (c4528h.f38769Y > (j10 + u11) ? 1 : (c4528h.f38769Y == (j10 + u11) ? 0 : -1));
            if (i14 < 0) {
                if (c4528h.u(rVar) == Long.MIN_VALUE || (c4528h.u(rVar)) < 0 || u10 > 2147483647L) {
                    return false;
                }
                if (i10 != 0) {
                    int i15 = (int) u10;
                    rVar.e(i15);
                    c4528h.f38769Y += i15;
                }
            } else if (i14 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f26183B = -9223372036854775807L;
        this.f26188G = 0;
        C2282b c2282b = this.f26204a;
        c2282b.f26125e = 0;
        c2282b.f26122b.clear();
        C2285e c2285e = c2282b.f26123c;
        c2285e.f26234b = 0;
        c2285e.f26235c = 0;
        C2285e c2285e2 = this.f26206b;
        c2285e2.f26234b = 0;
        c2285e2.f26235c = 0;
        k();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f26208c;
            if (i10 < sparseArray.size()) {
                H h10 = ((C2283c) sparseArray.valueAt(i10)).f26144U;
                if (h10 != null) {
                    h10.f10534b = false;
                    h10.f10535c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(r rVar, int i10) {
        u uVar = this.f26212g;
        if (uVar.f45195c >= i10) {
            return;
        }
        byte[] bArr = uVar.f45193a;
        if (bArr.length < i10) {
            uVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = uVar.f45193a;
        int i11 = uVar.f45195c;
        rVar.readFully(bArr2, i11, i10 - i11);
        uVar.E(i10);
    }

    public final void k() {
        this.S = 0;
        this.T = 0;
        this.f26198U = 0;
        this.f26199V = false;
        this.f26200W = false;
        this.f26201X = false;
        this.f26202Y = 0;
        this.f26203Z = (byte) 0;
        this.f26205a0 = false;
        this.f26215j.C(0);
    }

    public final long l(long j6) {
        long j10 = this.f26223r;
        if (j10 != -9223372036854775807L) {
            int i10 = AbstractC5530A.f45131a;
            return AbstractC5530A.I(j6, j10, 1000L, RoundingMode.FLOOR);
        }
        throw O.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(r rVar, C2283c c2283c, int i10, boolean z10) {
        int i11;
        int i12;
        boolean z11;
        int i13;
        if ("S_TEXT/UTF8".equals(c2283c.f26151b)) {
            n(rVar, f26176c0, i10);
            int i14 = this.T;
            k();
            return i14;
        } else if ("S_TEXT/ASS".equals(c2283c.f26151b)) {
            n(rVar, f26178e0, i10);
            int i15 = this.T;
            k();
            return i15;
        } else if ("S_TEXT/WEBVTT".equals(c2283c.f26151b)) {
            n(rVar, f26179f0, i10);
            int i16 = this.T;
            k();
            return i16;
        } else {
            G g10 = c2283c.f26148Y;
            boolean z12 = this.f26199V;
            boolean z13 = true;
            u uVar = this.f26215j;
            if (!z12) {
                boolean z14 = c2283c.f26157h;
                u uVar2 = this.f26212g;
                if (z14) {
                    this.f26196O &= -1073741825;
                    int i17 = 128;
                    if (!this.f26200W) {
                        rVar.readFully(uVar2.f45193a, 0, 1);
                        this.S++;
                        byte b10 = uVar2.f45193a[0];
                        if ((b10 & 128) != 128) {
                            this.f26203Z = b10;
                            this.f26200W = true;
                        } else {
                            throw O.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b11 = this.f26203Z;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f26196O |= 1073741824;
                        if (!this.f26205a0) {
                            u uVar3 = this.f26217l;
                            rVar.readFully(uVar3.f45193a, 0, 8);
                            this.S += 8;
                            this.f26205a0 = true;
                            byte[] bArr = uVar2.f45193a;
                            if (!z11) {
                                i17 = 0;
                            }
                            bArr[0] = (byte) (i17 | 8);
                            uVar2.F(0);
                            g10.d(1, 1, uVar2);
                            this.T++;
                            uVar3.F(0);
                            g10.d(8, 1, uVar3);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.f26201X) {
                                rVar.readFully(uVar2.f45193a, 0, 1);
                                this.S++;
                                uVar2.F(0);
                                this.f26202Y = uVar2.u();
                                this.f26201X = true;
                            }
                            int i18 = this.f26202Y * 4;
                            uVar2.C(i18);
                            rVar.readFully(uVar2.f45193a, 0, i18);
                            this.S += i18;
                            short s10 = (short) ((this.f26202Y / 2) + 1);
                            int i19 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f26220o;
                            if (byteBuffer == null || byteBuffer.capacity() < i19) {
                                this.f26220o = ByteBuffer.allocate(i19);
                            }
                            this.f26220o.position(0);
                            this.f26220o.putShort(s10);
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                i13 = this.f26202Y;
                                if (i20 >= i13) {
                                    break;
                                }
                                int x10 = uVar2.x();
                                if (i20 % 2 == 0) {
                                    this.f26220o.putShort((short) (x10 - i21));
                                } else {
                                    this.f26220o.putInt(x10 - i21);
                                }
                                i20++;
                                i21 = x10;
                            }
                            int i22 = (i10 - this.S) - i21;
                            if (i13 % 2 == 1) {
                                this.f26220o.putInt(i22);
                            } else {
                                this.f26220o.putShort((short) i22);
                                this.f26220o.putInt(0);
                            }
                            byte[] array = this.f26220o.array();
                            u uVar4 = this.f26218m;
                            uVar4.D(i19, array);
                            g10.d(i19, 1, uVar4);
                            this.T += i19;
                        }
                    }
                } else {
                    byte[] bArr2 = c2283c.f26158i;
                    if (bArr2 != null) {
                        uVar.D(bArr2.length, bArr2);
                    }
                }
                if (!"A_OPUS".equals(c2283c.f26151b) ? c2283c.f26155f > 0 : z10) {
                    this.f26196O |= 268435456;
                    this.f26219n.C(0);
                    int i23 = (uVar.f45195c + i10) - this.S;
                    uVar2.C(4);
                    byte[] bArr3 = uVar2.f45193a;
                    bArr3[0] = (byte) ((i23 >> 24) & 255);
                    bArr3[1] = (byte) ((i23 >> 16) & 255);
                    bArr3[2] = (byte) ((i23 >> 8) & 255);
                    bArr3[3] = (byte) (i23 & 255);
                    g10.d(4, 2, uVar2);
                    this.T += 4;
                }
                this.f26199V = true;
            }
            int i24 = i10 + uVar.f45195c;
            if (!"V_MPEG4/ISO/AVC".equals(c2283c.f26151b) && !"V_MPEGH/ISO/HEVC".equals(c2283c.f26151b)) {
                if (c2283c.f26144U != null) {
                    if (uVar.f45195c != 0) {
                        z13 = false;
                    }
                    Gi.e.n(z13);
                    c2283c.f26144U.c(rVar);
                }
                while (true) {
                    int i25 = this.S;
                    if (i25 >= i24) {
                        break;
                    }
                    int i26 = i24 - i25;
                    int a5 = uVar.a();
                    if (a5 > 0) {
                        i12 = Math.min(i26, a5);
                        g10.a(i12, uVar);
                    } else {
                        i12 = g10.c(rVar, i26, false);
                    }
                    this.S += i12;
                    this.T += i12;
                }
            } else {
                u uVar5 = this.f26211f;
                byte[] bArr4 = uVar5.f45193a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i27 = c2283c.f26149Z;
                int i28 = 4 - i27;
                while (this.S < i24) {
                    int i29 = this.f26198U;
                    if (i29 == 0) {
                        int min = Math.min(i27, uVar.a());
                        rVar.readFully(bArr4, i28 + min, i27 - min);
                        if (min > 0) {
                            uVar.e(bArr4, i28, min);
                        }
                        this.S += i27;
                        uVar5.F(0);
                        this.f26198U = uVar5.x();
                        u uVar6 = this.f26210e;
                        uVar6.F(0);
                        g10.a(4, uVar6);
                        this.T += 4;
                    } else {
                        int a10 = uVar.a();
                        if (a10 > 0) {
                            i11 = Math.min(i29, a10);
                            g10.a(i11, uVar);
                        } else {
                            i11 = g10.c(rVar, i29, false);
                        }
                        this.S += i11;
                        this.T += i11;
                        this.f26198U -= i11;
                    }
                }
            }
            if ("A_VORBIS".equals(c2283c.f26151b)) {
                u uVar7 = this.f26213h;
                uVar7.F(0);
                g10.a(4, uVar7);
                this.T += 4;
            }
            int i30 = this.T;
            k();
            return i30;
        }
    }

    public final void n(r rVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        u uVar = this.f26216k;
        byte[] bArr2 = uVar.f45193a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            uVar.getClass();
            uVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        rVar.readFully(uVar.f45193a, bArr.length, i10);
        uVar.F(0);
        uVar.E(length);
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}

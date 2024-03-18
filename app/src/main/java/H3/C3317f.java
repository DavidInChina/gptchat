package h3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.y;
import s2.p;
import s2.t;
import s2.u;

/* renamed from: h3.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3317f extends AbstractC3320i {

    /* renamed from: g  reason: collision with root package name */
    public final u f31849g = new u();

    /* renamed from: h  reason: collision with root package name */
    public final t f31850h = new t();

    /* renamed from: i  reason: collision with root package name */
    public int f31851i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f31852j;

    /* renamed from: k  reason: collision with root package name */
    public final C3316e[] f31853k;

    /* renamed from: l  reason: collision with root package name */
    public C3316e f31854l;

    /* renamed from: m  reason: collision with root package name */
    public List f31855m;

    /* renamed from: n  reason: collision with root package name */
    public List f31856n;

    /* renamed from: o  reason: collision with root package name */
    public t f31857o;

    /* renamed from: p  reason: collision with root package name */
    public int f31858p;

    public C3317f(int i10, List list) {
        this.f31852j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f31853k = new C3316e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f31853k[i11] = new C3316e();
        }
        this.f31854l = this.f31853k[0];
    }

    @Override // h3.AbstractC3320i
    public final C4.c e() {
        List list = this.f31855m;
        this.f31856n = list;
        list.getClass();
        return new C4.c(list);
    }

    @Override // h3.AbstractC3320i
    public final void f(C3318g c3318g) {
        boolean z10;
        ByteBuffer byteBuffer = c3318g.f48641j0;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        u uVar = this.f31849g;
        uVar.D(limit, array);
        while (uVar.a() >= 3) {
            int u10 = uVar.u();
            int i10 = u10 & 3;
            boolean z11 = false;
            if ((u10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte u11 = (byte) uVar.u();
            byte u12 = (byte) uVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (u11 & 192) >> 6;
                        int i12 = this.f31851i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            p.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f31851i + " current=" + i11);
                        }
                        this.f31851i = i11;
                        int i13 = u11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        t tVar = new t(i11, i13);
                        this.f31857o = tVar;
                        byte[] bArr = tVar.f45186b;
                        int i14 = tVar.f45189e;
                        tVar.f45189e = i14 + 1;
                        bArr[i14] = u12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        Gi.e.l(z11);
                        t tVar2 = this.f31857o;
                        if (tVar2 == null) {
                            p.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = tVar2.f45186b;
                            int i15 = tVar2.f45189e;
                            bArr2[i15] = u11;
                            tVar2.f45189e = i15 + 2;
                            bArr2[i15 + 1] = u12;
                        }
                    }
                    t tVar3 = this.f31857o;
                    if (tVar3.f45189e == (tVar3.f45188d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // h3.AbstractC3320i, x2.e
    public final void flush() {
        super.flush();
        this.f31855m = null;
        this.f31856n = null;
        this.f31858p = 0;
        this.f31854l = this.f31853k[0];
        k();
        this.f31857o = null;
    }

    @Override // h3.AbstractC3320i
    public final boolean h() {
        if (this.f31855m != this.f31856n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        int i10;
        char c10;
        String str;
        boolean z10;
        int i11;
        int i12;
        String str2;
        C3316e c3316e;
        t tVar = this.f31857o;
        if (tVar == null) {
            return;
        }
        int i13 = 2;
        String str3 = "Cea708Decoder";
        if (tVar.f45189e != (tVar.f45188d * 2) - 1) {
            p.b(str3, "DtvCcPacket ended prematurely; size is " + ((this.f31857o.f45188d * 2) - 1) + ", but current index is " + this.f31857o.f45189e + " (sequence number " + this.f31857o.f45187c + ");");
        }
        t tVar2 = this.f31857o;
        byte[] bArr = tVar2.f45186b;
        int i14 = tVar2.f45189e;
        t tVar3 = this.f31850h;
        tVar3.n(i14, bArr);
        boolean z11 = false;
        while (true) {
            if (tVar3.b() > 0) {
                int i15 = 3;
                int i16 = tVar3.i(3);
                int i17 = tVar3.i(5);
                if (i16 == 7) {
                    tVar3.s(i13);
                    i16 = tVar3.i(6);
                    if (i16 < 7) {
                        android.gov.nist.core.a.v("Invalid extended service number: ", i16, str3);
                    }
                }
                if (i17 == 0) {
                    if (i16 != 0) {
                        p.g(str3, "serviceNumber is non-zero (" + i16 + ") when blockSize is 0");
                    }
                } else if (i16 != this.f31852j) {
                    tVar3.t(i17);
                } else {
                    int g10 = (i17 * 8) + tVar3.g();
                    while (tVar3.g() < g10) {
                        int i18 = tVar3.i(8);
                        if (i18 != 16) {
                            if (i18 <= 31) {
                                if (i18 != 0) {
                                    if (i18 != i15) {
                                        if (i18 != 8) {
                                            switch (i18) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.f31854l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i18 >= 17 && i18 <= 23) {
                                                        p.g(str3, "Currently unsupported COMMAND_EXT1 Command: " + i18);
                                                        tVar3.s(8);
                                                        break;
                                                    } else if (i18 >= 24 && i18 <= 31) {
                                                        p.g(str3, "Currently unsupported COMMAND_P16 Command: " + i18);
                                                        tVar3.s(16);
                                                        break;
                                                    } else {
                                                        android.gov.nist.core.a.v("Invalid C0 command: ", i18, str3);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f31854l.f31828b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f31855m = j();
                                    }
                                }
                                i12 = i13;
                                i11 = i15;
                                i10 = g10;
                            } else if (i18 <= 127) {
                                if (i18 == 127) {
                                    this.f31854l.a('\u266b');
                                } else {
                                    this.f31854l.a((char) (i18 & 255));
                                }
                                i12 = i13;
                                i11 = i15;
                                i10 = g10;
                                z11 = true;
                            } else {
                                if (i18 <= 159) {
                                    C3316e[] c3316eArr = this.f31853k;
                                    switch (i18) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            z10 = true;
                                            int i19 = i18 - 128;
                                            if (this.f31858p != i19) {
                                                this.f31858p = i19;
                                                this.f31854l = c3316eArr[i19];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            z10 = true;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (tVar3.h()) {
                                                    C3316e c3316e2 = c3316eArr[8 - i20];
                                                    c3316e2.f31827a.clear();
                                                    c3316e2.f31828b.clear();
                                                    c3316e2.f31842p = -1;
                                                    c3316e2.f31843q = -1;
                                                    c3316e2.f31844r = -1;
                                                    c3316e2.f31846t = -1;
                                                    c3316e2.f31848v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (tVar3.h()) {
                                                    c3316eArr[8 - i21].f31830d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (tVar3.h()) {
                                                    c3316eArr[8 - i22].f31830d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (tVar3.h()) {
                                                    c3316eArr[8 - i23].f31830d = !c3316e.f31830d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            for (int i24 = 1; i24 <= 8; i24++) {
                                                if (tVar3.h()) {
                                                    c3316eArr[8 - i24].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            tVar3.s(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            z10 = true;
                                            break;
                                        case 143:
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            k();
                                            z10 = true;
                                            break;
                                        case 144:
                                            str2 = str3;
                                            i10 = g10;
                                            if (!this.f31854l.f31829c) {
                                                tVar3.s(16);
                                                i11 = 3;
                                                z10 = true;
                                                break;
                                            } else {
                                                tVar3.i(4);
                                                tVar3.i(2);
                                                tVar3.i(2);
                                                boolean h10 = tVar3.h();
                                                boolean h11 = tVar3.h();
                                                i11 = 3;
                                                tVar3.i(3);
                                                tVar3.i(3);
                                                this.f31854l.e(h10, h11);
                                                z10 = true;
                                            }
                                        case 145:
                                            str2 = str3;
                                            i10 = g10;
                                            if (!this.f31854l.f31829c) {
                                                tVar3.s(24);
                                            } else {
                                                int c11 = C3316e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                int c12 = C3316e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                tVar3.s(2);
                                                C3316e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), 0);
                                                this.f31854l.f(c11, c12);
                                            }
                                            i11 = 3;
                                            z10 = true;
                                            break;
                                        case 146:
                                            str2 = str3;
                                            i10 = g10;
                                            if (!this.f31854l.f31829c) {
                                                tVar3.s(16);
                                            } else {
                                                tVar3.s(4);
                                                int i25 = tVar3.i(4);
                                                tVar3.s(2);
                                                tVar3.i(6);
                                                C3316e c3316e3 = this.f31854l;
                                                if (c3316e3.f31848v != i25) {
                                                    c3316e3.a('\n');
                                                }
                                                c3316e3.f31848v = i25;
                                            }
                                            i11 = 3;
                                            z10 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            android.gov.nist.core.a.v("Invalid C1 command: ", i18, str3);
                                            str2 = str3;
                                            i11 = i15;
                                            i10 = g10;
                                            z10 = true;
                                            break;
                                        case 151:
                                            str2 = str3;
                                            i10 = g10;
                                            if (!this.f31854l.f31829c) {
                                                tVar3.s(32);
                                            } else {
                                                int c13 = C3316e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), tVar3.i(2));
                                                tVar3.i(2);
                                                C3316e.c(tVar3.i(2), tVar3.i(2), tVar3.i(2), 0);
                                                tVar3.h();
                                                tVar3.h();
                                                tVar3.i(2);
                                                tVar3.i(2);
                                                int i26 = tVar3.i(2);
                                                tVar3.s(8);
                                                C3316e c3316e4 = this.f31854l;
                                                c3316e4.f31841o = c13;
                                                c3316e4.f31838l = i26;
                                            }
                                            i11 = 3;
                                            z10 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i27 = i18 - 152;
                                            C3316e c3316e5 = c3316eArr[i27];
                                            tVar3.s(i13);
                                            boolean h12 = tVar3.h();
                                            boolean h13 = tVar3.h();
                                            tVar3.h();
                                            int i28 = tVar3.i(i15);
                                            boolean h14 = tVar3.h();
                                            int i29 = tVar3.i(7);
                                            int i30 = tVar3.i(8);
                                            int i31 = tVar3.i(4);
                                            int i32 = tVar3.i(4);
                                            tVar3.s(i13);
                                            i10 = g10;
                                            tVar3.i(6);
                                            tVar3.s(i13);
                                            int i33 = tVar3.i(3);
                                            str2 = str3;
                                            int i34 = tVar3.i(3);
                                            c3316e5.f31829c = true;
                                            c3316e5.f31830d = h12;
                                            c3316e5.f31837k = h13;
                                            c3316e5.f31831e = i28;
                                            c3316e5.f31832f = h14;
                                            c3316e5.f31833g = i29;
                                            c3316e5.f31834h = i30;
                                            c3316e5.f31835i = i31;
                                            int i35 = i32 + 1;
                                            if (c3316e5.f31836j != i35) {
                                                c3316e5.f31836j = i35;
                                                while (true) {
                                                    ArrayList arrayList = c3316e5.f31827a;
                                                    if ((h13 && arrayList.size() >= c3316e5.f31836j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i33 != 0 && c3316e5.f31839m != i33) {
                                                c3316e5.f31839m = i33;
                                                int i36 = i33 - 1;
                                                int i37 = C3316e.f31819C[i36];
                                                boolean z12 = C3316e.f31818B[i36];
                                                int i38 = C3316e.f31826z[i36];
                                                int i39 = C3316e.f31817A[i36];
                                                int i40 = C3316e.f31825y[i36];
                                                c3316e5.f31841o = i37;
                                                c3316e5.f31838l = i40;
                                            }
                                            if (i34 != 0 && c3316e5.f31840n != i34) {
                                                c3316e5.f31840n = i34;
                                                int i41 = i34 - 1;
                                                int i42 = C3316e.f31821E[i41];
                                                int i43 = C3316e.f31820D[i41];
                                                c3316e5.e(false, false);
                                                c3316e5.f(C3316e.f31823w, C3316e.f31822F[i41]);
                                            }
                                            if (this.f31858p != i27) {
                                                this.f31858p = i27;
                                                this.f31854l = c3316eArr[i27];
                                            }
                                            i11 = 3;
                                            z10 = true;
                                            break;
                                    }
                                } else {
                                    str2 = str3;
                                    i11 = i15;
                                    i10 = g10;
                                    z10 = true;
                                    if (i18 <= 255) {
                                        this.f31854l.a((char) (i18 & 255));
                                    } else {
                                        str = str2;
                                        android.gov.nist.core.a.v("Invalid base command: ", i18, str);
                                        i12 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z10;
                                str = str2;
                                i12 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                            str = str3;
                            z10 = true;
                        } else {
                            i11 = i15;
                            i10 = g10;
                            str = str3;
                            z10 = true;
                            int i44 = tVar3.i(8);
                            if (i44 <= 31) {
                                c10 = 7;
                                if (i44 > 7) {
                                    if (i44 <= 15) {
                                        tVar3.s(8);
                                    } else if (i44 <= 23) {
                                        tVar3.s(16);
                                    } else if (i44 <= 31) {
                                        tVar3.s(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i44 <= 127) {
                                    if (i44 != 32) {
                                        if (i44 != 33) {
                                            if (i44 != 37) {
                                                if (i44 != 42) {
                                                    if (i44 != 44) {
                                                        if (i44 != 63) {
                                                            if (i44 != 57) {
                                                                if (i44 != 58) {
                                                                    if (i44 != 60) {
                                                                        if (i44 != 61) {
                                                                            switch (i44) {
                                                                                case y.f44626f /* 48 */:
                                                                                    this.f31854l.a('\u2588');
                                                                                    break;
                                                                                case 49:
                                                                                    this.f31854l.a('\u2018');
                                                                                    break;
                                                                                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                                                                    this.f31854l.a('\u2019');
                                                                                    break;
                                                                                case 51:
                                                                                    this.f31854l.a('\u201c');
                                                                                    break;
                                                                                case 52:
                                                                                    this.f31854l.a('\u201d');
                                                                                    break;
                                                                                case 53:
                                                                                    this.f31854l.a('\u2022');
                                                                                    break;
                                                                                default:
                                                                                    switch (i44) {
                                                                                        case 118:
                                                                                            this.f31854l.a('\u215b');
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f31854l.a('\u215c');
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f31854l.a('\u215d');
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f31854l.a('\u215e');
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f31854l.a('\u2502');
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f31854l.a('\u2510');
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f31854l.a('\u2514');
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f31854l.a('\u2500');
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f31854l.a('\u2518');
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f31854l.a('\u250c');
                                                                                            break;
                                                                                        default:
                                                                                            android.gov.nist.core.a.v("Invalid G2 character: ", i44, str);
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f31854l.a('\u2120');
                                                                        }
                                                                    } else {
                                                                        this.f31854l.a('\u0153');
                                                                    }
                                                                } else {
                                                                    this.f31854l.a('\u0161');
                                                                }
                                                            } else {
                                                                this.f31854l.a('\u2122');
                                                            }
                                                        } else {
                                                            this.f31854l.a('\u0178');
                                                        }
                                                    } else {
                                                        this.f31854l.a('\u0152');
                                                    }
                                                } else {
                                                    this.f31854l.a('\u0160');
                                                }
                                            } else {
                                                this.f31854l.a('\u2026');
                                            }
                                        } else {
                                            this.f31854l.a('\u00a0');
                                        }
                                    } else {
                                        this.f31854l.a(' ');
                                    }
                                    z11 = true;
                                } else if (i44 <= 159) {
                                    if (i44 <= 135) {
                                        tVar3.s(32);
                                    } else if (i44 <= 143) {
                                        tVar3.s(40);
                                    } else if (i44 <= 159) {
                                        i12 = 2;
                                        tVar3.s(2);
                                        tVar3.s(tVar3.i(6) * 8);
                                    }
                                } else {
                                    i12 = 2;
                                    if (i44 <= 255) {
                                        if (i44 == 160) {
                                            this.f31854l.a('\u33c4');
                                        } else {
                                            android.gov.nist.core.a.v("Invalid G3 character: ", i44, str);
                                            this.f31854l.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        android.gov.nist.core.a.v("Invalid extended command: ", i44, str);
                                    }
                                }
                            }
                            i12 = 2;
                        }
                        i15 = i11;
                        str3 = str;
                        g10 = i10;
                        i13 = i12;
                    }
                }
            }
        }
        if (z11) {
            this.f31855m = j();
        }
        this.f31857o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j() {
        C3315d c3315d;
        Layout.Alignment alignment;
        float f6;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < 8; i15++) {
            C3316e[] c3316eArr = this.f31853k;
            C3316e c3316e = c3316eArr[i15];
            if (c3316e.f31829c && (!c3316e.f31827a.isEmpty() || c3316e.f31828b.length() != 0)) {
                C3316e c3316e2 = c3316eArr[i15];
                if (!c3316e2.f31830d) {
                    continue;
                } else {
                    if (c3316e2.f31829c) {
                        ArrayList arrayList2 = c3316e2.f31827a;
                        if (!arrayList2.isEmpty() || c3316e2.f31828b.length() != 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i16));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) c3316e2.b());
                            int i17 = c3316e2.f31838l;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 != 2) {
                                        if (i17 != 3) {
                                            throw new IllegalArgumentException("Unexpected justification value: " + c3316e2.f31838l);
                                        }
                                    } else {
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                    }
                                } else {
                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                }
                                Layout.Alignment alignment2 = alignment;
                                if (!c3316e2.f31832f) {
                                    f10 = c3316e2.f31834h / 99.0f;
                                    f6 = c3316e2.f31833g / 99.0f;
                                } else {
                                    f10 = c3316e2.f31834h / 209.0f;
                                    f6 = c3316e2.f31833g / 74.0f;
                                }
                                float f11 = (f10 * 0.9f) + 0.05f;
                                float f12 = (f6 * 0.9f) + 0.05f;
                                int i18 = c3316e2.f31835i;
                                i10 = i18 / 3;
                                if (i10 != 0) {
                                    i11 = 0;
                                } else if (i10 == 1) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                i12 = i18 % 3;
                                if (i12 != 0) {
                                    i13 = 0;
                                } else if (i12 == 1) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                i14 = c3316e2.f31841o;
                                if (i14 == C3316e.f31824x) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c3315d = new C3315d(spannableStringBuilder, alignment2, f12, i11, f11, i13, z10, i14, c3316e2.f31831e);
                                if (c3315d != null) {
                                    arrayList.add(c3315d);
                                }
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            Layout.Alignment alignment22 = alignment;
                            if (!c3316e2.f31832f) {
                            }
                            float f112 = (f10 * 0.9f) + 0.05f;
                            float f122 = (f6 * 0.9f) + 0.05f;
                            int i182 = c3316e2.f31835i;
                            i10 = i182 / 3;
                            if (i10 != 0) {
                            }
                            i12 = i182 % 3;
                            if (i12 != 0) {
                            }
                            i14 = c3316e2.f31841o;
                            if (i14 == C3316e.f31824x) {
                            }
                            c3315d = new C3315d(spannableStringBuilder, alignment22, f122, i11, f112, i13, z10, i14, c3316e2.f31831e);
                            if (c3315d != null) {
                            }
                        }
                    }
                    c3315d = null;
                    if (c3315d != null) {
                    }
                }
            }
        }
        Collections.sort(arrayList, C3315d.f31814c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((C3315d) arrayList.get(i19)).f31815a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f31853k[i10].d();
        }
    }
}

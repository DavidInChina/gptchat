package L2;

import java.util.Collections;
import p2.C5065s;
import p2.M;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f10642a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10643b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10644c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10645d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10646e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10647f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10648g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10649h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10650i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10651j;

    /* renamed from: k  reason: collision with root package name */
    public final U3.c f10652k;

    /* renamed from: l  reason: collision with root package name */
    public final M f10653l;

    public v(int i10, byte[] bArr) {
        s2.t tVar = new s2.t(bArr, 0);
        tVar.p(i10 * 8);
        this.f10642a = tVar.i(16);
        this.f10643b = tVar.i(16);
        this.f10644c = tVar.i(24);
        this.f10645d = tVar.i(24);
        int i11 = tVar.i(20);
        this.f10646e = i11;
        this.f10647f = d(i11);
        this.f10648g = tVar.i(3) + 1;
        int i12 = tVar.i(5) + 1;
        this.f10649h = i12;
        this.f10650i = a(i12);
        int i13 = tVar.i(4);
        int i14 = tVar.i(32);
        int i15 = AbstractC5530A.f45131a;
        this.f10651j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f10652k = null;
        this.f10653l = null;
    }

    public static int a(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j6 = this.f10651j;
        if (j6 == 0) {
            return -9223372036854775807L;
        }
        return (j6 * 1000000) / this.f10646e;
    }

    public final C5065s c(byte[] bArr, M m10) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f10645d;
        if (i10 <= 0) {
            i10 = -1;
        }
        M m11 = this.f10653l;
        if (m11 != null) {
            m10 = m11.c(m10);
        }
        p2.r rVar = new p2.r();
        rVar.f42237k = "audio/flac";
        rVar.f42238l = i10;
        rVar.f42250x = this.f10648g;
        rVar.f42251y = this.f10646e;
        rVar.f42239m = Collections.singletonList(bArr);
        rVar.f42235i = m10;
        return new C5065s(rVar);
    }

    public v(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j6, U3.c cVar, M m10) {
        this.f10642a = i10;
        this.f10643b = i11;
        this.f10644c = i12;
        this.f10645d = i13;
        this.f10646e = i14;
        this.f10647f = d(i14);
        this.f10648g = i15;
        this.f10649h = i16;
        this.f10650i = a(i16);
        this.f10651j = j6;
        this.f10652k = cVar;
        this.f10653l = m10;
    }
}

package Nh;

/* loaded from: classes2.dex */
public final class a extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f13001d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13002e;

    /* renamed from: f  reason: collision with root package name */
    public final I5.h f13003f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13004g;

    /* renamed from: h  reason: collision with root package name */
    public int f13005h;

    /* renamed from: i  reason: collision with root package name */
    public final a f13006i;

    /* renamed from: j  reason: collision with root package name */
    public final a f13007j;

    public a(q qVar, boolean z10, I5.h hVar, a aVar) {
        super(589824, 1);
        int i10;
        this.f13001d = qVar;
        this.f13002e = z10;
        this.f13003f = hVar;
        int i11 = hVar.f8084c;
        if (i11 == 0) {
            i10 = -1;
        } else {
            i10 = i11 - 2;
        }
        this.f13004g = i10;
        this.f13006i = aVar;
        if (aVar != null) {
            aVar.f13007j = this;
        }
    }

    public static int A(a aVar, a aVar2, a aVar3, a aVar4) {
        int i10;
        if (aVar != null) {
            i10 = aVar.B("RuntimeVisibleAnnotations");
        } else {
            i10 = 0;
        }
        if (aVar2 != null) {
            i10 += aVar2.B("RuntimeInvisibleAnnotations");
        }
        if (aVar3 != null) {
            i10 += aVar3.B("RuntimeVisibleTypeAnnotations");
        }
        if (aVar4 != null) {
            return i10 + aVar4.B("RuntimeInvisibleTypeAnnotations");
        }
        return i10;
    }

    public static int C(String str, a[] aVarArr, int i10) {
        int i11 = (i10 * 2) + 7;
        for (int i12 = 0; i12 < i10; i12++) {
            a aVar = aVarArr[i12];
            i11 += aVar == null ? 0 : aVar.B(str) - 8;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a D(q qVar, int i10, I5.h hVar, String str, a aVar) {
        I5.h hVar2 = new I5.h();
        int i11 = i10 >>> 24;
        if (i11 != 0 && i11 != 1) {
            switch (i11) {
                case 16:
                case 17:
                case 18:
                case 23:
                    hVar2.f(i11, (i10 & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    hVar2.h(i11);
                    break;
                case 22:
                    break;
                default:
                    switch (i11) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            hVar2.j(i10);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            if (hVar != null) {
                hVar2.h(0);
            } else {
                byte[] bArr = hVar.f8083b;
                int i12 = hVar.f8084c;
                hVar2.i(bArr, i12, (bArr[i12] * 2) + 1);
            }
            hVar2.k(qVar.j(str));
            hVar2.k(0);
            return new a(qVar, true, hVar2, aVar);
        }
        hVar2.k(i10 >>> 16);
        if (hVar != null) {
        }
        hVar2.k(qVar.j(str));
        hVar2.k(0);
        return new a(qVar, true, hVar2, aVar);
    }

    public static a E(q qVar, String str, a aVar) {
        I5.h hVar = new I5.h();
        hVar.k(qVar.j(str));
        hVar.k(0);
        return new a(qVar, true, hVar, aVar);
    }

    public static void G(q qVar, a aVar, a aVar2, a aVar3, a aVar4, I5.h hVar) {
        if (aVar != null) {
            aVar.F(qVar.j("RuntimeVisibleAnnotations"), hVar);
        }
        if (aVar2 != null) {
            aVar2.F(qVar.j("RuntimeInvisibleAnnotations"), hVar);
        }
        if (aVar3 != null) {
            aVar3.F(qVar.j("RuntimeVisibleTypeAnnotations"), hVar);
        }
        if (aVar4 != null) {
            aVar4.F(qVar.j("RuntimeInvisibleTypeAnnotations"), hVar);
        }
    }

    public static void H(int i10, a[] aVarArr, int i11, I5.h hVar) {
        int i12 = (i11 * 2) + 1;
        for (int i13 = 0; i13 < i11; i13++) {
            a aVar = aVarArr[i13];
            i12 += aVar == null ? 0 : aVar.B(null) - 8;
        }
        hVar.k(i10);
        hVar.j(i12);
        hVar.h(i11);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 0;
            a aVar2 = null;
            for (a aVar3 = aVarArr[i14]; aVar3 != null; aVar3 = aVar3.f13006i) {
                aVar3.g();
                i15++;
                aVar2 = aVar3;
            }
            hVar.k(i15);
            while (aVar2 != null) {
                I5.h hVar2 = aVar2.f13003f;
                hVar.i(hVar2.f8083b, 0, hVar2.f8084c);
                aVar2 = aVar2.f13007j;
            }
        }
    }

    public final int B(String str) {
        if (str != null) {
            this.f13001d.j(str);
        }
        int i10 = 8;
        for (a aVar = this; aVar != null; aVar = aVar.f13006i) {
            i10 += aVar.f13003f.f8084c;
        }
        return i10;
    }

    public final void F(int i10, I5.h hVar) {
        int i11 = 2;
        int i12 = 0;
        a aVar = null;
        for (a aVar2 = this; aVar2 != null; aVar2 = aVar2.f13006i) {
            aVar2.g();
            i11 += aVar2.f13003f.f8084c;
            i12++;
            aVar = aVar2;
        }
        hVar.k(i10);
        hVar.j(i11);
        hVar.k(i12);
        while (aVar != null) {
            I5.h hVar2 = aVar.f13003f;
            hVar.i(hVar2.f8083b, 0, hVar2.f8084c);
            aVar = aVar.f13007j;
        }
    }

    @Override // io.sentry.vendor.b
    public final void b(String str, Object obj) {
        this.f13005h++;
        boolean z10 = this.f13002e;
        q qVar = this.f13001d;
        I5.h hVar = this.f13003f;
        if (z10) {
            hVar.k(qVar.j(str));
        }
        if (obj instanceof String) {
            hVar.f(115, qVar.j((String) obj));
        } else if (obj instanceof Byte) {
            hVar.f(66, qVar.e(3, ((Byte) obj).byteValue()).f13187a);
        } else if (obj instanceof Boolean) {
            hVar.f(90, qVar.e(3, ((Boolean) obj).booleanValue() ? 1 : 0).f13187a);
        } else if (obj instanceof Character) {
            hVar.f(67, qVar.e(3, ((Character) obj).charValue()).f13187a);
        } else if (obj instanceof Short) {
            hVar.f(83, qVar.e(3, ((Short) obj).shortValue()).f13187a);
        } else if (obj instanceof r) {
            hVar.f(99, qVar.j(((r) obj).h()));
        } else {
            int i10 = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                hVar.f(91, bArr.length);
                int length = bArr.length;
                while (i10 < length) {
                    hVar.f(66, qVar.e(3, bArr[i10]).f13187a);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                hVar.f(91, zArr.length);
                int length2 = zArr.length;
                while (i10 < length2) {
                    hVar.f(90, qVar.e(3, zArr[i10] ? 1 : 0).f13187a);
                    i10++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                hVar.f(91, sArr.length);
                int length3 = sArr.length;
                while (i10 < length3) {
                    hVar.f(83, qVar.e(3, sArr[i10]).f13187a);
                    i10++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                hVar.f(91, cArr.length);
                int length4 = cArr.length;
                while (i10 < length4) {
                    hVar.f(67, qVar.e(3, cArr[i10]).f13187a);
                    i10++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                hVar.f(91, iArr.length);
                int length5 = iArr.length;
                while (i10 < length5) {
                    hVar.f(73, qVar.e(3, iArr[i10]).f13187a);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                hVar.f(91, jArr.length);
                int length6 = jArr.length;
                while (i10 < length6) {
                    hVar.f(74, qVar.f(5, jArr[i10]).f13187a);
                    i10++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                hVar.f(91, fArr.length);
                int length7 = fArr.length;
                while (i10 < length7) {
                    float f6 = fArr[i10];
                    qVar.getClass();
                    hVar.f(70, qVar.e(4, Float.floatToRawIntBits(f6)).f13187a);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                hVar.f(91, dArr.length);
                int length8 = dArr.length;
                while (i10 < length8) {
                    double d10 = dArr[i10];
                    qVar.getClass();
                    hVar.f(68, qVar.f(6, Double.doubleToRawLongBits(d10)).f13187a);
                    i10++;
                }
            } else {
                p c10 = qVar.c(obj);
                hVar.f(".s.IFJDCS".charAt(c10.f13188b), c10.f13187a);
            }
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b c(String str, String str2) {
        this.f13005h++;
        boolean z10 = this.f13002e;
        q qVar = this.f13001d;
        I5.h hVar = this.f13003f;
        if (z10) {
            hVar.k(qVar.j(str));
        }
        hVar.f(64, qVar.j(str2));
        hVar.k(0);
        return new a(qVar, true, hVar, null);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b e(String str) {
        this.f13005h++;
        boolean z10 = this.f13002e;
        q qVar = this.f13001d;
        I5.h hVar = this.f13003f;
        if (z10) {
            hVar.k(qVar.j(str));
        }
        hVar.f(91, 0);
        return new a(qVar, false, hVar, null);
    }

    @Override // io.sentry.vendor.b
    public final void g() {
        int i10 = this.f13004g;
        if (i10 != -1) {
            byte[] bArr = this.f13003f.f8083b;
            int i11 = this.f13005h;
            bArr[i10] = (byte) (i11 >>> 8);
            bArr[i10 + 1] = (byte) i11;
        }
    }

    @Override // io.sentry.vendor.b
    public final void h(String str, String str2, String str3) {
        this.f13005h++;
        boolean z10 = this.f13002e;
        I5.h hVar = this.f13003f;
        q qVar = this.f13001d;
        if (z10) {
            hVar.k(qVar.j(str));
        }
        hVar.f(101, qVar.j(str2));
        hVar.k(qVar.j(str3));
    }
}

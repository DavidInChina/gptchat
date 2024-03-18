package ei;

import Wh.x;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ji.AbstractC4127b;
import ji.C4112A;
import ji.C4135j;
import ji.C4138m;
import kf.C4287l;
import kf.q;
import kf.r;
import l8.AbstractC4344b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class l implements Di.b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29510Y;

    public /* synthetic */ l(int i10) {
        this.f29510Y = i10;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f41490e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b10 = bArr2[i19][i20];
                    byte[] bArr4 = Xh.b.f21996a;
                    int i22 = b10 & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte b11 = bArr[i16 + i21];
                byte[] bArr5 = Xh.b.f21996a;
                i13 = i12 - (b11 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                } else if (bArr2[i19].length == i20) {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                } else {
                    z11 = z10;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC3557B.b0("UTF_8", charset);
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public static ArrayList c(List list) {
        AbstractC3557B.c0("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x) obj) != x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).f21330Y);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, ji.j, ji.K] */
    public static void d(long j6, C4135j c4135j, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj;
        int i17 = i10;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (((C4138m) arrayList.get(i18)).d() < i17) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C4138m c4138m = (C4138m) arrayList.get(i11);
            C4138m c4138m2 = (C4138m) arrayList.get(i12 - 1);
            int i19 = -1;
            if (i17 == c4138m.d()) {
                int i20 = i11 + 1;
                i13 = i20;
                i14 = ((Number) arrayList2.get(i11)).intValue();
                c4138m = (C4138m) arrayList.get(i20);
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c4138m.i(i17) != c4138m2.i(i17)) {
                int i21 = 1;
                for (int i22 = i13 + 1; i22 < i12; i22++) {
                    if (((C4138m) arrayList.get(i22 - 1)).i(i17) != ((C4138m) arrayList.get(i22)).i(i17)) {
                        i21++;
                    }
                }
                long j10 = 4;
                long j11 = (c4135j.f36721Z / j10) + j6 + 2 + (i21 * 2);
                c4135j.H0(i21);
                c4135j.H0(i14);
                for (int i23 = i13; i23 < i12; i23++) {
                    byte i24 = ((C4138m) arrayList.get(i23)).i(i17);
                    if (i23 == i13 || i24 != ((C4138m) arrayList.get(i23 - 1)).i(i17)) {
                        c4135j.H0(i24 & 255);
                    }
                }
                int i25 = i13;
                C4135j c4135j2 = new Object();
                while (i25 < i12) {
                    byte i26 = ((C4138m) arrayList.get(i25)).i(i17);
                    int i27 = i25 + 1;
                    int i28 = i27;
                    while (true) {
                        if (i28 < i12) {
                            if (i26 != ((C4138m) arrayList.get(i28)).i(i17)) {
                                i15 = i28;
                                break;
                            }
                            i28++;
                        } else {
                            i15 = i12;
                            break;
                        }
                    }
                    if (i27 == i15 && i17 + 1 == ((C4138m) arrayList.get(i25)).d()) {
                        c4135j.H0(((Number) arrayList2.get(i25)).intValue());
                        i16 = i15;
                        obj = c4135j2;
                    } else {
                        c4135j.H0(((int) ((c4135j2.f36721Z / j10) + j11)) * i19);
                        i16 = i15;
                        obj = c4135j2;
                        d(j11, c4135j2, i17 + 1, arrayList, i25, i15, arrayList2);
                    }
                    c4135j2 = obj;
                    i25 = i16;
                    i19 = -1;
                }
                c4135j.I0(c4135j2);
                return;
            }
            int min = Math.min(c4138m.d(), c4138m2.d());
            int i29 = 0;
            for (int i30 = i17; i30 < min && c4138m.i(i30) == c4138m2.i(i30); i30++) {
                i29++;
            }
            long j12 = 4;
            long j13 = (c4135j.f36721Z / j12) + j6 + 2 + i29 + 1;
            c4135j.H0(-i29);
            c4135j.H0(i14);
            int i31 = i29 + i17;
            while (i17 < i31) {
                c4135j.H0(c4138m.i(i17) & 255);
                i17++;
            }
            if (i13 + 1 == i12) {
                if (i31 == ((C4138m) arrayList.get(i13)).d()) {
                    c4135j.H0(((Number) arrayList2.get(i13)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ?? obj2 = new Object();
            c4135j.H0(((int) ((obj2.f36721Z / j12) + j13)) * (-1));
            d(j13, obj2, i31, arrayList, i13, i12, arrayList2);
            c4135j.I0(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ji.j] */
    public static byte[] e(List list) {
        AbstractC3557B.c0("protocols", list);
        ?? obj = new Object();
        Iterator it = c(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.w0(str.length());
            obj.S0(str);
        }
        return obj.O(obj.f36721Z);
    }

    public static C4138m f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (ki.b.a(str.charAt(i11 + 1)) + (ki.b.a(str.charAt(i11)) << 4));
            }
            return new C4138m(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static C4138m g(String str) {
        AbstractC3557B.c0("<this>", str);
        byte[] bytes = str.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        C4138m c4138m = new C4138m(bytes);
        c4138m.f36725h0 = str;
        return c4138m;
    }

    public static boolean h() {
        return AbstractC3557B.K("Dalvik", System.getProperty("java.vm.name"));
    }

    public static C4138m i(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("<this>", bArr);
        if (i11 == -1234567890) {
            i11 = bArr.length;
        }
        AbstractC4127b.b(bArr.length, i10, i11);
        return new C4138m(q.b3(bArr, i10, i11 + i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, ji.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4112A j(C4138m... c4138mArr) {
        if (c4138mArr.length == 0) {
            return new C4112A(new C4138m[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C4287l(c4138mArr, false));
        r.J1(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(-1);
        }
        int length = c4138mArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList2.set(AbstractC4344b.P(arrayList, c4138mArr[i11]), Integer.valueOf(i12));
            i11++;
            i12++;
        }
        if (((C4138m) arrayList.get(0)).d() > 0) {
            int i13 = 0;
            while (i13 < arrayList.size()) {
                C4138m c4138m = (C4138m) arrayList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    C4138m c4138m2 = (C4138m) arrayList.get(i15);
                    c4138m2.getClass();
                    AbstractC3557B.c0("prefix", c4138m);
                    if (c4138m2.m(0, c4138m, c4138m.d())) {
                        if (c4138m2.d() != c4138m.d()) {
                            if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                                arrayList.remove(i15);
                                arrayList2.remove(i15);
                            } else {
                                i15++;
                            }
                        } else {
                            throw new IllegalArgumentException(("duplicate option: " + c4138m2).toString());
                        }
                    }
                }
                i13 = i14;
            }
            ?? obj = new Object();
            d(0L, obj, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i16 = (int) (obj.f36721Z / 4);
            int[] iArr = new int[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                iArr[i17] = obj.readInt();
            }
            Object[] copyOf = Arrays.copyOf(c4138mArr, c4138mArr.length);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            return new C4112A((C4138m[]) copyOf, iArr);
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
    }

    @Override // Di.b
    public final Di.a b(int i10, int i11, CharSequence charSequence) {
        char charAt;
        int i12 = i10 + 4;
        if (i12 >= charSequence.length() || charSequence.charAt(i10 + 1) != 'w' || charSequence.charAt(i10 + 2) != 'w' || charSequence.charAt(i10 + 3) != '.') {
            return null;
        }
        if (i10 != i11 && ((charAt = charSequence.charAt(i10 - 1)) == '.' || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || (charAt >= '0' && charAt <= '9'))))) {
            i10 = -1;
        }
        if (i10 == -1) {
            return null;
        }
        int B02 = R4.b.B0(i12, charSequence);
        if (B02 != -1) {
            int i13 = B02;
            while (true) {
                i13--;
                if (i13 <= i12) {
                    break;
                } else if (charSequence.charAt(i13) == '.' && i13 > i12) {
                    break;
                }
            }
        }
        B02 = -1;
        if (B02 == -1) {
            return null;
        }
        return new Di.a(Ci.c.f3174h0, i10, B02 + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        this(0);
        this.f29510Y = i10;
        if (i10 == 22) {
            this(22);
        } else if (i10 != 23) {
            switch (i10) {
                case 1:
                    this(1);
                    return;
                case 2:
                    this(2);
                    return;
                case 3:
                    this(3);
                    return;
                case 4:
                    this(4);
                    return;
                case 5:
                    this(5);
                    return;
                case 6:
                    this(6);
                    return;
                case 7:
                    this(7);
                    return;
                case 8:
                    this(8);
                    return;
                case 9:
                    this(9);
                    return;
                case 10:
                    this(10);
                    return;
                default:
                    return;
            }
        } else {
            this(23);
        }
    }
}

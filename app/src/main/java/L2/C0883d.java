package L2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2.O;
import s2.AbstractC5533c;

/* renamed from: L2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0883d {

    /* renamed from: a  reason: collision with root package name */
    public final List f10576a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10577b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10578c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10579d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10580e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10581f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10582g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10583h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10584i;

    /* renamed from: j  reason: collision with root package name */
    public final float f10585j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10586k;

    public /* synthetic */ C0883d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f6, String str) {
        this.f10576a = list;
        this.f10577b = i10;
        this.f10578c = i11;
        this.f10579d = i12;
        this.f10580e = i13;
        this.f10581f = i14;
        this.f10582g = i15;
        this.f10583h = i16;
        this.f10584i = i17;
        this.f10585j = f6;
        this.f10586k = str;
    }

    public static C0883d a(s2.u uVar) {
        byte[] bArr;
        String str;
        float f6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        try {
            uVar.G(4);
            int u10 = (uVar.u() & 3) + 1;
            if (u10 != 3) {
                ArrayList arrayList = new ArrayList();
                int u11 = uVar.u() & 31;
                int i17 = 0;
                while (true) {
                    bArr = AbstractC5533c.f45147a;
                    if (i17 >= u11) {
                        break;
                    }
                    int z10 = uVar.z();
                    int i18 = uVar.f45194b;
                    uVar.G(z10);
                    byte[] bArr2 = uVar.f45193a;
                    byte[] bArr3 = new byte[z10 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i18, bArr3, 4, z10);
                    arrayList.add(bArr3);
                    i17++;
                }
                int u12 = uVar.u();
                for (int i19 = 0; i19 < u12; i19++) {
                    int z11 = uVar.z();
                    int i20 = uVar.f45194b;
                    uVar.G(z11);
                    byte[] bArr4 = uVar.f45193a;
                    byte[] bArr5 = new byte[z11 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i20, bArr5, 4, z11);
                    arrayList.add(bArr5);
                }
                if (u11 > 0) {
                    t2.f d10 = t2.g.d((byte[]) arrayList.get(0), u10, ((byte[]) arrayList.get(0)).length);
                    int i21 = d10.f45656e;
                    int i22 = d10.f45657f;
                    int i23 = d10.f45667p;
                    int i24 = d10.f45668q;
                    int i25 = d10.f45669r;
                    float f10 = d10.f45658g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(d10.f45652a), Integer.valueOf(d10.f45653b), Integer.valueOf(d10.f45654c));
                    i11 = i24;
                    i10 = i25;
                    f6 = f10;
                    i14 = d10.f45659h + 8;
                    i13 = d10.f45660i + 8;
                    i12 = i23;
                    i16 = i21;
                    i15 = i22;
                } else {
                    i16 = -1;
                    i15 = -1;
                    i14 = -1;
                    i13 = -1;
                    i12 = -1;
                    i11 = -1;
                    i10 = -1;
                    f6 = 1.0f;
                    str = null;
                }
                return new C0883d(arrayList, u10, i16, i15, i14, i13, i12, i11, i10, f6, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw O.a("Error parsing AVC config", e10);
        }
    }

    public static C0883d b(s2.u uVar) {
        List singletonList;
        int i10;
        int i11;
        try {
            uVar.G(21);
            int u10 = uVar.u() & 3;
            int u11 = uVar.u();
            int i12 = uVar.f45194b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < u11; i15++) {
                uVar.G(1);
                int z10 = uVar.z();
                for (int i16 = 0; i16 < z10; i16++) {
                    int z11 = uVar.z();
                    i14 += z11 + 4;
                    uVar.G(z11);
                }
            }
            uVar.F(i12);
            byte[] bArr = new byte[i14];
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f6 = 1.0f;
            String str = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < u11) {
                int u12 = uVar.u() & 63;
                int z12 = uVar.z();
                int i26 = i13;
                while (i26 < z12) {
                    int z13 = uVar.z();
                    int i27 = u11;
                    System.arraycopy(t2.g.f45670a, i13, bArr, i25, 4);
                    int i28 = i25 + 4;
                    System.arraycopy(uVar.f45193a, uVar.f45194b, bArr, i28, z13);
                    if (u12 == 33 && i26 == 0) {
                        t2.d c10 = t2.g.c(bArr, i28, i28 + z13);
                        int i29 = c10.f45644i;
                        i18 = c10.f45645j;
                        i19 = c10.f45640e + 8;
                        i20 = c10.f45641f + 8;
                        int i30 = c10.f45647l;
                        int i31 = c10.f45648m;
                        int i32 = c10.f45649n;
                        float f10 = c10.f45646k;
                        i11 = u12;
                        i10 = z12;
                        i17 = i29;
                        str = AbstractC5533c.a(c10.f45636a, c10.f45638c, c10.f45639d, c10.f45643h, c10.f45637b, c10.f45642g);
                        i22 = i31;
                        i21 = i30;
                        f6 = f10;
                        i23 = i32;
                    } else {
                        i11 = u12;
                        i10 = z12;
                    }
                    i25 = i28 + z13;
                    uVar.G(z13);
                    i26++;
                    u11 = i27;
                    u12 = i11;
                    z12 = i10;
                    i13 = 0;
                }
                i24++;
                i13 = 0;
            }
            if (i14 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C0883d(singletonList, u10 + 1, i17, i18, i19, i20, i21, i22, i23, f6, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw O.a("Error parsing HEVC config", e10);
        }
    }
}

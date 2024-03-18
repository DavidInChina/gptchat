package p2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import c1.AbstractC2279d;
import g3.C3158a;
import g3.C3159b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import s2.AbstractC5535e;
import x8.C6376u;
import y2.C6504G;
import y2.C6527n;
import z2.AbstractC6758c;
import z8.C6779a;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements AbstractC5056i, w2.i, s2.m, s2.n, AbstractC5535e, B2.p, C2.x, L2.n, w8.f {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41956Y;

    public /* synthetic */ Y(int i10) {
        this.f41956Y = i10;
    }

    @Override // L2.n
    public Constructor a() {
        int[] iArr = L2.o.f10630j0;
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(L2.q.class).getConstructor(Integer.TYPE);
    }

    @Override // s2.AbstractC5535e
    public void accept(Object obj) {
        ((E2.V) obj).f4246b.release();
    }

    @Override // w8.f
    public Object apply(Object obj) {
        switch (this.f41956Y) {
            case 0:
                return new z2.w((AbstractC5532b) obj);
            case 1:
                x8.F f6 = G2.c.f5855b;
                return Long.valueOf(((C3158a) obj).f31163b);
            case 2:
                x8.F f10 = G2.c.f5855b;
                return Long.valueOf(((C3158a) obj).f31164c);
            case 3:
                return (e3.p) obj;
            default:
                C6376u c6376u = C3159b.f31166h0;
                long j6 = ((C3158a) obj).f31163b;
                if (j6 == -9223372036854775807L) {
                    j6 = 0;
                }
                return Long.valueOf(j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    @Override // p2.AbstractC5056i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5057j b(Bundle bundle) {
        C5049b c5049b;
        H h10;
        x8.k0 k0Var;
        List list;
        CharSequence charSequence;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        Bitmap bitmap;
        int i10;
        float f6;
        String str;
        int i11;
        String str2;
        float f10;
        String str3;
        int i12;
        String str4;
        float f11;
        int i13;
        String str5;
        float f12;
        String str6;
        float f13;
        String str7;
        int i14;
        boolean z10;
        String str8;
        int i15;
        String str9;
        float f14;
        C5047B c5047b = null;
        boolean z11 = true;
        switch (this.f41956Y) {
            case 0:
                int i16 = bundle.getInt(Z.f41957Y, -1);
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                return (Z) c0.f42002l0.b(bundle);
                            }
                            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown RatingType: ", i16));
                        }
                        return (Z) a0.f41978l0.b(bundle);
                    }
                    return (Z) P.f41922j0.b(bundle);
                }
                return (Z) C5066t.f42331l0.b(bundle);
            case 1:
                String str10 = a0.f41976j0;
                if (bundle.getInt(Z.f41957Y, -1) != 2) {
                    z11 = false;
                }
                Gi.e.l(z11);
                int i17 = bundle.getInt(a0.f41976j0, 5);
                float f15 = bundle.getFloat(a0.f41977k0, -1.0f);
                if (f15 == -1.0f) {
                    return new a0(i17);
                }
                return new a0(i17, f15);
            case 2:
                String str11 = c0.f42000j0;
                if (bundle.getInt(Z.f41957Y, -1) != 3) {
                    z11 = false;
                }
                Gi.e.l(z11);
                if (bundle.getBoolean(c0.f42000j0, false)) {
                    return new c0(bundle.getBoolean(c0.f42001k0, false));
                }
                return new c0();
            case 4:
                int i18 = bundle.getInt(e0.f42017m0, 0);
                long j6 = bundle.getLong(e0.f42018n0, -9223372036854775807L);
                long j10 = bundle.getLong(e0.f42019o0, 0L);
                boolean z12 = bundle.getBoolean(e0.f42020p0, false);
                Bundle bundle2 = bundle.getBundle(e0.f42021q0);
                if (bundle2 != null) {
                    c5049b = (C5049b) C5049b.f41987r0.b(bundle2);
                } else {
                    c5049b = C5049b.f41981l0;
                }
                C5049b c5049b2 = c5049b;
                e0 e0Var = new e0();
                e0Var.k(null, null, i18, j6, j10, c5049b2, z12);
                return e0Var;
            case 5:
                Bundle bundle3 = bundle.getBundle(f0.f42044z0);
                if (bundle3 != null) {
                    h10 = (H) H.f41806s0.b(bundle3);
                } else {
                    h10 = H.f41799l0;
                }
                H h11 = h10;
                long j11 = bundle.getLong(f0.f42029A0, -9223372036854775807L);
                long j12 = bundle.getLong(f0.f42030B0, -9223372036854775807L);
                long j13 = bundle.getLong(f0.f42031C0, -9223372036854775807L);
                boolean z13 = bundle.getBoolean(f0.f42032D0, false);
                boolean z14 = bundle.getBoolean(f0.f42033E0, false);
                Bundle bundle4 = bundle.getBundle(f0.f42034F0);
                if (bundle4 != null) {
                    c5047b = (C5047B) C5047B.f41745q0.b(bundle4);
                }
                boolean z15 = bundle.getBoolean(f0.f42035G0, false);
                long j14 = bundle.getLong(f0.f42036H0, 0L);
                long j15 = bundle.getLong(f0.f42037I0, -9223372036854775807L);
                int i19 = bundle.getInt(f0.f42038J0, 0);
                int i20 = bundle.getInt(f0.f42039K0, 0);
                long j16 = bundle.getLong(f0.f42040L0, 0L);
                f0 f0Var = new f0();
                f0Var.c(f0.f42042x0, h11, null, j11, j12, j13, z13, z14, c5047b, j14, j15, i19, i20, j16);
                f0Var.f42056q0 = z15;
                return f0Var;
            case 6:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(h0.f42069k0);
                if (parcelableArrayList == null) {
                    x8.L l10 = x8.N.f49523Z;
                    k0Var = x8.k0.f49573j0;
                } else {
                    k0Var = AbstractC2279d.m(C5065s.f42293v1, parcelableArrayList);
                }
                return new h0(bundle.getString(h0.f42070l0, ""), (C5065s[]) k0Var.toArray(new C5065s[0]));
            case 7:
                Bundle bundle5 = bundle.getBundle(i0.f42077h0);
                bundle5.getClass();
                h0 h0Var = (h0) h0.f42071m0.b(bundle5);
                int[] intArray = bundle.getIntArray(i0.f42078i0);
                intArray.getClass();
                if (intArray.length == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new C6779a(0, intArray.length, intArray);
                }
                return new i0(h0Var, list);
            case 10:
                String str12 = n0.f42197k0;
                Y y10 = h0.f42071m0;
                Bundle bundle6 = bundle.getBundle(n0.f42197k0);
                bundle6.getClass();
                h0 h0Var2 = (h0) y10.b(bundle6);
                int[] intArray2 = bundle.getIntArray(n0.f42198l0);
                int[] iArr = new int[h0Var2.f42072Y];
                if (intArray2 == null) {
                    intArray2 = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(n0.f42199m0);
                boolean[] zArr = new boolean[h0Var2.f42072Y];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new n0(h0Var2, bundle.getBoolean(n0.f42200n0, false), intArray2, booleanArray);
            case 12:
                CharSequence charSequence2 = bundle.getCharSequence(r2.b.f44351w0);
                if (charSequence2 != null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = null;
                }
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(r2.b.f44352x0);
                if (alignment3 != null) {
                    alignment = alignment3;
                } else {
                    alignment = null;
                }
                Layout.Alignment alignment4 = (Layout.Alignment) bundle.getSerializable(r2.b.f44353y0);
                if (alignment4 != null) {
                    alignment2 = alignment4;
                } else {
                    alignment2 = null;
                }
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(r2.b.f44354z0);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    bitmap = null;
                }
                String str13 = r2.b.f44337A0;
                if (bundle.containsKey(str13)) {
                    String str14 = r2.b.f44338B0;
                    if (bundle.containsKey(str14)) {
                        f6 = bundle.getFloat(str13);
                        i10 = bundle.getInt(str14);
                        str = r2.b.f44339C0;
                        if (!bundle.containsKey(str)) {
                            i11 = bundle.getInt(str);
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                        str2 = r2.b.f44340D0;
                        if (!bundle.containsKey(str2)) {
                            f10 = bundle.getFloat(str2);
                        } else {
                            f10 = -3.4028235E38f;
                        }
                        str3 = r2.b.f44341E0;
                        if (!bundle.containsKey(str3)) {
                            i12 = bundle.getInt(str3);
                        } else {
                            i12 = Integer.MIN_VALUE;
                        }
                        str4 = r2.b.f44343G0;
                        if (bundle.containsKey(str4)) {
                            String str15 = r2.b.f44342F0;
                            if (bundle.containsKey(str15)) {
                                f11 = bundle.getFloat(str4);
                                i13 = bundle.getInt(str15);
                                str5 = r2.b.f44344H0;
                                if (bundle.containsKey(str5)) {
                                    f12 = bundle.getFloat(str5);
                                } else {
                                    f12 = -3.4028235E38f;
                                }
                                str6 = r2.b.f44345I0;
                                if (bundle.containsKey(str6)) {
                                    f13 = bundle.getFloat(str6);
                                } else {
                                    f13 = -3.4028235E38f;
                                }
                                str7 = r2.b.f44346J0;
                                if (bundle.containsKey(str7)) {
                                    i14 = bundle.getInt(str7);
                                } else {
                                    i14 = -16777216;
                                    z11 = false;
                                }
                                if (!bundle.getBoolean(r2.b.f44347K0, false)) {
                                    z10 = false;
                                } else {
                                    z10 = z11;
                                }
                                str8 = r2.b.f44348L0;
                                if (bundle.containsKey(str8)) {
                                    i15 = bundle.getInt(str8);
                                } else {
                                    i15 = Integer.MIN_VALUE;
                                }
                                str9 = r2.b.f44349M0;
                                if (bundle.containsKey(str9)) {
                                    f14 = bundle.getFloat(str9);
                                } else {
                                    f14 = 0.0f;
                                }
                                return new r2.b(charSequence, alignment, alignment2, bitmap, f6, i10, i11, f10, i12, i13, f11, f12, f13, z10, i14, i15, f14);
                            }
                        }
                        f11 = -3.4028235E38f;
                        i13 = Integer.MIN_VALUE;
                        str5 = r2.b.f44344H0;
                        if (bundle.containsKey(str5)) {
                        }
                        str6 = r2.b.f44345I0;
                        if (bundle.containsKey(str6)) {
                        }
                        str7 = r2.b.f44346J0;
                        if (bundle.containsKey(str7)) {
                        }
                        if (!bundle.getBoolean(r2.b.f44347K0, false)) {
                        }
                        str8 = r2.b.f44348L0;
                        if (bundle.containsKey(str8)) {
                        }
                        str9 = r2.b.f44349M0;
                        if (bundle.containsKey(str9)) {
                        }
                        return new r2.b(charSequence, alignment, alignment2, bitmap, f6, i10, i11, f10, i12, i13, f11, f12, f13, z10, i14, i15, f14);
                    }
                }
                f6 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
                str = r2.b.f44339C0;
                if (!bundle.containsKey(str)) {
                }
                str2 = r2.b.f44340D0;
                if (!bundle.containsKey(str2)) {
                }
                str3 = r2.b.f44341E0;
                if (!bundle.containsKey(str3)) {
                }
                str4 = r2.b.f44343G0;
                if (bundle.containsKey(str4)) {
                }
                f11 = -3.4028235E38f;
                i13 = Integer.MIN_VALUE;
                str5 = r2.b.f44344H0;
                if (bundle.containsKey(str5)) {
                }
                str6 = r2.b.f44345I0;
                if (bundle.containsKey(str6)) {
                }
                str7 = r2.b.f44346J0;
                if (bundle.containsKey(str7)) {
                }
                if (!bundle.getBoolean(r2.b.f44347K0, false)) {
                }
                str8 = r2.b.f44348L0;
                if (bundle.containsKey(str8)) {
                }
                str9 = r2.b.f44349M0;
                if (bundle.containsKey(str9)) {
                }
                return new r2.b(charSequence, alignment, alignment2, bitmap, f6, i10, i11, f10, i12, i13, f11, f12, f13, z10, i14, i15, f14);
            case 26:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(E2.i0.f4360j0);
                if (parcelableArrayList2 == null) {
                    return new E2.i0(new h0[0]);
                }
                return new E2.i0((h0[]) AbstractC2279d.m(h0.f42071m0, parcelableArrayList2).toArray(new h0[0]));
            default:
                int i21 = bundle.getInt(H2.j.f7284i0, -1);
                int[] intArray3 = bundle.getIntArray(H2.j.f7285j0);
                int i22 = bundle.getInt(H2.j.f7286k0, -1);
                if (i21 < 0 || i22 < 0) {
                    z11 = false;
                }
                Gi.e.l(z11);
                intArray3.getClass();
                return new H2.j(i21, i22, intArray3);
        }
    }

    @Override // s2.n
    public void d(Object obj, C5064q c5064q) {
        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
    }

    @Override // C2.x
    public int f(Object obj) {
        C2.m mVar = (C2.m) obj;
        switch (this.f41956Y) {
            case 23:
                Pattern pattern = C2.y.f2635a;
                String str = mVar.f2547a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (AbstractC5530A.f45131a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = C2.y.f2635a;
                return mVar.f2547a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // s2.m
    public void invoke(Object obj) {
        V v10 = (V) obj;
        switch (this.f41956Y) {
            case 16:
                int i10 = C6504G.f50341Z;
                v10.B(new C6527n(2, new androidx.datastore.preferences.protobuf.n0(1), 1003));
                return;
            default:
                v10.getClass();
                return;
        }
    }

    @Override // B2.p
    public void release() {
    }
}

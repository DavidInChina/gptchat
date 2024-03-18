package p2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import s2.AbstractC5530A;

/* renamed from: p2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5048a implements AbstractC5057j {

    /* renamed from: n0  reason: collision with root package name */
    public static final String f41959n0 = Integer.toString(0, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41960o0 = Integer.toString(1, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41961p0 = Integer.toString(2, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41962q0 = Integer.toString(3, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f41963r0 = Integer.toString(4, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f41964s0 = Integer.toString(5, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final String f41965t0 = Integer.toString(6, 36);

    /* renamed from: u0  reason: collision with root package name */
    public static final String f41966u0 = Integer.toString(7, 36);

    /* renamed from: v0  reason: collision with root package name */
    public static final A9.a f41967v0 = new A9.a(8);

    /* renamed from: Y  reason: collision with root package name */
    public final long f41968Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f41969Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f41970h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Uri[] f41971i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int[] f41972j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long[] f41973k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f41974l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f41975m0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5048a(long j6, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z10) {
        boolean z11;
        if (iArr.length == uriArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        this.f41968Y = j6;
        this.f41969Z = i10;
        this.f41970h0 = i11;
        this.f41972j0 = iArr;
        this.f41971i0 = uriArr;
        this.f41973k0 = jArr;
        this.f41974l0 = j10;
        this.f41975m0 = z10;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong(f41959n0, this.f41968Y);
        bundle.putInt(f41960o0, this.f41969Z);
        bundle.putInt(f41966u0, this.f41970h0);
        bundle.putParcelableArrayList(f41961p0, new ArrayList<>(Arrays.asList(this.f41971i0)));
        bundle.putIntArray(f41962q0, this.f41972j0);
        bundle.putLongArray(f41963r0, this.f41973k0);
        bundle.putLong(f41964s0, this.f41974l0);
        bundle.putBoolean(f41965t0, this.f41975m0);
        return bundle;
    }

    public final int b(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f41972j0;
            if (i12 >= iArr.length || this.f41975m0 || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5048a.class != obj.getClass()) {
            return false;
        }
        C5048a c5048a = (C5048a) obj;
        if (this.f41968Y == c5048a.f41968Y && this.f41969Z == c5048a.f41969Z && this.f41970h0 == c5048a.f41970h0 && Arrays.equals(this.f41971i0, c5048a.f41971i0) && Arrays.equals(this.f41972j0, c5048a.f41972j0) && Arrays.equals(this.f41973k0, c5048a.f41973k0) && this.f41974l0 == c5048a.f41974l0 && this.f41975m0 == c5048a.f41975m0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f41968Y;
        int hashCode = Arrays.hashCode(this.f41972j0);
        int hashCode2 = Arrays.hashCode(this.f41973k0);
        long j10 = this.f41974l0;
        return ((((hashCode2 + ((hashCode + (((((((this.f41969Z * 31) + this.f41970h0) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + Arrays.hashCode(this.f41971i0)) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f41975m0 ? 1 : 0);
    }
}

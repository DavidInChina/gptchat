package p2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import s2.AbstractC5530A;

/* renamed from: p2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5049b implements AbstractC5057j {

    /* renamed from: m0  reason: collision with root package name */
    public static final C5048a f41982m0;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f41988Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f41989Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f41990h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f41991i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f41992j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C5048a[] f41993k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final C5049b f41981l0 = new C5049b(null, new C5048a[0], 0, -9223372036854775807L, 0);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f41983n0 = Integer.toString(1, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41984o0 = Integer.toString(2, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41985p0 = Integer.toString(3, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41986q0 = Integer.toString(4, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final A9.a f41987r0 = new A9.a(7);

    static {
        C5048a c5048a = new C5048a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = c5048a.f41972j0;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c5048a.f41973k0;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f41982m0 = new C5048a(c5048a.f41968Y, 0, c5048a.f41970h0, copyOf, (Uri[]) Arrays.copyOf(c5048a.f41971i0, 0), copyOf2, c5048a.f41974l0, c5048a.f41975m0);
        int i10 = AbstractC5530A.f45131a;
    }

    public C5049b(Object obj, C5048a[] c5048aArr, long j6, long j10, int i10) {
        this.f41988Y = obj;
        this.f41990h0 = j6;
        this.f41991i0 = j10;
        this.f41989Z = c5048aArr.length + i10;
        this.f41993k0 = c5048aArr;
        this.f41992j0 = i10;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C5048a c5048a : this.f41993k0) {
            arrayList.add(c5048a.a());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f41983n0, arrayList);
        }
        long j6 = this.f41990h0;
        if (j6 != 0) {
            bundle.putLong(f41984o0, j6);
        }
        long j10 = this.f41991i0;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f41985p0, j10);
        }
        int i10 = this.f41992j0;
        if (i10 != 0) {
            bundle.putInt(f41986q0, i10);
        }
        return bundle;
    }

    public final C5048a b(int i10) {
        int i11 = this.f41992j0;
        if (i10 < i11) {
            return f41982m0;
        }
        return this.f41993k0[i10 - i11];
    }

    public final boolean c(int i10) {
        if (i10 == this.f41989Z - 1) {
            C5048a b10 = b(i10);
            if (b10.f41975m0 && b10.f41968Y == Long.MIN_VALUE && b10.f41969Z == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5049b.class != obj.getClass()) {
            return false;
        }
        C5049b c5049b = (C5049b) obj;
        if (AbstractC5530A.a(this.f41988Y, c5049b.f41988Y) && this.f41989Z == c5049b.f41989Z && this.f41990h0 == c5049b.f41990h0 && this.f41991i0 == c5049b.f41991i0 && this.f41992j0 == c5049b.f41992j0 && Arrays.equals(this.f41993k0, c5049b.f41993k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f41989Z * 31;
        Object obj = this.f41988Y;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return ((((((((i11 + i10) * 31) + ((int) this.f41990h0)) * 31) + ((int) this.f41991i0)) * 31) + this.f41992j0) * 31) + Arrays.hashCode(this.f41993k0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f41988Y);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f41990h0);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            C5048a[] c5048aArr = this.f41993k0;
            if (i10 < c5048aArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(c5048aArr[i10].f41968Y);
                sb2.append(", ads=[");
                for (int i11 = 0; i11 < c5048aArr[i10].f41972j0.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = c5048aArr[i10].f41972j0[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(c5048aArr[i10].f41973k0[i11]);
                    sb2.append(')');
                    if (i11 < c5048aArr[i10].f41972j0.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < c5048aArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}

package J7;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import id.AbstractC3557B;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import l8.AbstractC4344b;
import u7.C5848d;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class f extends AbstractC6355a {
    public static final Parcelable.Creator<f> CREATOR = new t(9);

    /* renamed from: Y  reason: collision with root package name */
    public final int f8874Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f8875Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f8876h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f8877i0;

    /* renamed from: j0  reason: collision with root package name */
    public final l f8878j0;

    /* renamed from: k0  reason: collision with root package name */
    public final f f8879k0;

    static {
        new C5848d(9, 0);
        Process.myUid();
        Process.myPid();
    }

    public f(int i10, String str, String str2, String str3, ArrayList arrayList, f fVar) {
        l lVar;
        m mVar;
        m mVar2;
        AbstractC3557B.c0("packageName", str);
        if (fVar != null && fVar.f8879k0 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f8874Y = i10;
        this.f8875Z = str;
        this.f8876h0 = str2;
        AbstractCollection abstractCollection = null;
        if (str3 == null) {
            if (fVar != null) {
                str3 = fVar.f8877i0;
            } else {
                str3 = null;
            }
        }
        this.f8877i0 = str3;
        AbstractCollection abstractCollection2 = arrayList;
        if (arrayList == null) {
            AbstractCollection abstractCollection3 = fVar != null ? fVar.f8878j0 : abstractCollection;
            abstractCollection2 = abstractCollection3;
            if (abstractCollection3 == null) {
                j jVar = l.f8888Z;
                AbstractCollection abstractCollection4 = m.f8889j0;
                AbstractC3557B.b0("of(...)", abstractCollection4);
                abstractCollection2 = abstractCollection4;
            }
        }
        j jVar2 = l.f8888Z;
        if (abstractCollection2 instanceof i) {
            lVar = (l) ((i) abstractCollection2);
            if (lVar.y()) {
                Object[] array = lVar.toArray(i.f8883Y);
                int length = array.length;
                if (length == 0) {
                    mVar2 = m.f8889j0;
                    lVar = mVar2;
                } else {
                    mVar = new m(length, array);
                    lVar = mVar;
                }
            }
        } else {
            Object[] array2 = abstractCollection2.toArray();
            int length2 = array2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (array2[i11] == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
                    sb2.append("at index ");
                    sb2.append(i11);
                    throw new NullPointerException(sb2.toString());
                }
            }
            if (length2 == 0) {
                mVar2 = m.f8889j0;
                lVar = mVar2;
            } else {
                mVar = new m(length2, array2);
                lVar = mVar;
            }
        }
        AbstractC3557B.b0("copyOf(...)", lVar);
        this.f8878j0 = lVar;
        this.f8879k0 = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f8874Y == fVar.f8874Y && AbstractC3557B.K(this.f8875Z, fVar.f8875Z) && AbstractC3557B.K(this.f8876h0, fVar.f8876h0) && AbstractC3557B.K(this.f8877i0, fVar.f8877i0) && AbstractC3557B.K(this.f8879k0, fVar.f8879k0) && AbstractC3557B.K(this.f8878j0, fVar.f8878j0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8874Y), this.f8875Z, this.f8876h0, this.f8877i0, this.f8879k0});
    }

    public final String toString() {
        int i10;
        String str = this.f8875Z;
        int length = str.length() + 18;
        String str2 = this.f8876h0;
        if (str2 != null) {
            i10 = str2.length();
        } else {
            i10 = 0;
        }
        StringBuilder sb2 = new StringBuilder(length + i10);
        sb2.append(this.f8874Y);
        sb2.append(Separators.SLASH);
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (Lg.n.I2(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f8877i0;
        if (str3 != null) {
            sb2.append(Separators.SLASH);
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("dest", parcel);
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f8874Y);
        AbstractC4344b.A1(parcel, 3, this.f8875Z);
        AbstractC4344b.A1(parcel, 4, this.f8876h0);
        AbstractC4344b.A1(parcel, 6, this.f8877i0);
        AbstractC4344b.z1(parcel, 7, this.f8879k0, i10);
        AbstractC4344b.C1(parcel, 8, this.f8878j0);
        AbstractC4344b.F1(parcel, D12);
    }
}

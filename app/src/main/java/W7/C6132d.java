package w7;

import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* renamed from: w7.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6132d extends AbstractC6355a {
    public static final Parcelable.Creator<C6132d> CREATOR = new t(4);

    /* renamed from: Y  reason: collision with root package name */
    public final C6139k f48116Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f48117Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f48118h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f48119i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f48120j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f48121k0;

    public C6132d(C6139k c6139k, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f48116Y = c6139k;
        this.f48117Z = z10;
        this.f48118h0 = z11;
        this.f48119i0 = iArr;
        this.f48120j0 = i10;
        this.f48121k0 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.z1(parcel, 1, this.f48116Y, i10);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f48117Z ? 1 : 0);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f48118h0 ? 1 : 0);
        int[] iArr = this.f48119i0;
        if (iArr != null) {
            int D13 = AbstractC4344b.D1(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC4344b.F1(parcel, D13);
        }
        AbstractC4344b.G1(parcel, 5, 4);
        parcel.writeInt(this.f48120j0);
        int[] iArr2 = this.f48121k0;
        if (iArr2 != null) {
            int D14 = AbstractC4344b.D1(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC4344b.F1(parcel, D14);
        }
        AbstractC4344b.F1(parcel, D12);
    }
}

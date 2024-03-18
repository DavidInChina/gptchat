package w7;

import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* renamed from: w7.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6139k extends AbstractC6355a {
    public static final Parcelable.Creator<C6139k> CREATOR = new t(2);

    /* renamed from: Y  reason: collision with root package name */
    public final int f48176Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f48177Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f48178h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f48179i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f48180j0;

    public C6139k(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f48176Y = i10;
        this.f48177Z = z10;
        this.f48178h0 = z11;
        this.f48179i0 = i11;
        this.f48180j0 = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f48176Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f48177Z ? 1 : 0);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f48178h0 ? 1 : 0);
        AbstractC4344b.G1(parcel, 4, 4);
        parcel.writeInt(this.f48179i0);
        AbstractC4344b.G1(parcel, 5, 4);
        parcel.writeInt(this.f48180j0);
        AbstractC4344b.F1(parcel, D12);
    }
}

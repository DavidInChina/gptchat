package w7;

import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* renamed from: w7.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6136h extends AbstractC6355a {
    public static final Parcelable.Creator<C6136h> CREATOR = new Y2.n(29);

    /* renamed from: Y  reason: collision with root package name */
    public final int f48164Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f48165Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f48166h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f48167i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f48168j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f48169k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f48170l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f48171m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f48172n0;

    public C6136h(int i10, int i11, int i12, long j6, long j10, String str, String str2, int i13, int i14) {
        this.f48164Y = i10;
        this.f48165Z = i11;
        this.f48166h0 = i12;
        this.f48167i0 = j6;
        this.f48168j0 = j10;
        this.f48169k0 = str;
        this.f48170l0 = str2;
        this.f48171m0 = i13;
        this.f48172n0 = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f48164Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f48165Z);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f48166h0);
        AbstractC4344b.G1(parcel, 4, 8);
        parcel.writeLong(this.f48167i0);
        AbstractC4344b.G1(parcel, 5, 8);
        parcel.writeLong(this.f48168j0);
        AbstractC4344b.A1(parcel, 6, this.f48169k0);
        AbstractC4344b.A1(parcel, 7, this.f48170l0);
        AbstractC4344b.G1(parcel, 8, 4);
        parcel.writeInt(this.f48171m0);
        AbstractC4344b.G1(parcel, 9, 4);
        parcel.writeInt(this.f48172n0);
        AbstractC4344b.F1(parcel, D12);
    }
}

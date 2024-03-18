package w3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new Y2.n(15);

    /* renamed from: Y  reason: collision with root package name */
    public int f47862Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47863Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f47864h0;

    /* renamed from: i0  reason: collision with root package name */
    public int[] f47865i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f47866j0;

    /* renamed from: k0  reason: collision with root package name */
    public int[] f47867k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f47868l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f47869m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f47870n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f47871o0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47862Y);
        parcel.writeInt(this.f47863Z);
        parcel.writeInt(this.f47864h0);
        if (this.f47864h0 > 0) {
            parcel.writeIntArray(this.f47865i0);
        }
        parcel.writeInt(this.f47866j0);
        if (this.f47866j0 > 0) {
            parcel.writeIntArray(this.f47867k0);
        }
        parcel.writeInt(this.f47869m0 ? 1 : 0);
        parcel.writeInt(this.f47870n0 ? 1 : 0);
        parcel.writeInt(this.f47871o0 ? 1 : 0);
        parcel.writeList(this.f47868l0);
    }
}

package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.t;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new t(19);

    /* renamed from: Y  reason: collision with root package name */
    public final int f27370Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f27371Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f27372h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f27373i0;

    public g(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f27371Z = readInt;
        this.f27372h0 = readInt2;
        this.f27373i0 = readInt3;
        this.f27370Y = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f27371Z == gVar.f27371Z && this.f27372h0 == gVar.f27372h0 && this.f27370Y == gVar.f27370Y && this.f27373i0 == gVar.f27373i0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27370Y), Integer.valueOf(this.f27371Z), Integer.valueOf(this.f27372h0), Integer.valueOf(this.f27373i0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27371Z);
        parcel.writeInt(this.f27372h0);
        parcel.writeInt(this.f27373i0);
        parcel.writeInt(this.f27370Y);
    }
}

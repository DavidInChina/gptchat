package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new w7.t(16);

    /* renamed from: Y  reason: collision with root package name */
    public final p f27124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final p f27125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final b f27126h0;

    /* renamed from: i0  reason: collision with root package name */
    public final p f27127i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f27128j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f27129k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f27130l0;

    public c(p pVar, p pVar2, b bVar, p pVar3, int i10) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f27124Y = pVar;
        this.f27125Z = pVar2;
        this.f27127i0 = pVar3;
        this.f27128j0 = i10;
        this.f27126h0 = bVar;
        if (pVar3 != null && pVar.f27187Y.compareTo(pVar3.f27187Y) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.f27187Y.compareTo(pVar2.f27187Y) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= w.d(null).getMaximum(7)) {
            this.f27130l0 = pVar.g(pVar2) + 1;
            this.f27129k0 = (pVar2.f27189h0 - pVar.f27189h0) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f27124Y.equals(cVar.f27124Y) && this.f27125Z.equals(cVar.f27125Z) && C1.b.a(this.f27127i0, cVar.f27127i0) && this.f27128j0 == cVar.f27128j0 && this.f27126h0.equals(cVar.f27126h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27124Y, this.f27125Z, this.f27127i0, Integer.valueOf(this.f27128j0), this.f27126h0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27124Y, 0);
        parcel.writeParcelable(this.f27125Z, 0);
        parcel.writeParcelable(this.f27127i0, 0);
        parcel.writeParcelable(this.f27126h0, 0);
        parcel.writeInt(this.f27128j0);
    }
}

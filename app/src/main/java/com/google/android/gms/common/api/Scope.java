package com.google.android.gms.common.api;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC6355a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new n(26);

    /* renamed from: Y  reason: collision with root package name */
    public final int f26800Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f26801Z;

    public Scope(int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f26800Y = i10;
            this.f26801Z = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f26801Z.equals(((Scope) obj).f26801Z);
    }

    public final int hashCode() {
        return this.f26801Z.hashCode();
    }

    public final String toString() {
        return this.f26801Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f26800Y);
        AbstractC4344b.A1(parcel, 2, this.f26801Z);
        AbstractC4344b.F1(parcel, D12);
    }
}

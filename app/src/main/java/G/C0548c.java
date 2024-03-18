package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import j.C3871a;

/* renamed from: G.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0548c implements Parcelable {
    public static final Parcelable.Creator<C0548c> CREATOR = new C3871a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final int f5487Y;

    public C0548c(int i10) {
        this.f5487Y = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0548c) && this.f5487Y == ((C0548c) obj).f5487Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5487Y;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("DefaultLazyKey(index="), this.f5487Y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5487Y);
    }
}

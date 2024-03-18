package t2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes2.dex */
public final class b implements L {
    public static final Parcelable.Creator<b> CREATOR = new C3871a(13);

    /* renamed from: Y  reason: collision with root package name */
    public final float f45631Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f45632Z;

    public b(float f6, float f10) {
        Gi.e.k("Invalid latitude or longitude", f6 >= -90.0f && f6 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f);
        this.f45631Y = f6;
        this.f45632Z = f10;
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p2.L
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f45631Y == bVar.f45631Y && this.f45632Z == bVar.f45632Z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f45632Z).hashCode() + ((Float.valueOf(this.f45631Y).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f45631Y + ", longitude=" + this.f45632Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f45631Y);
        parcel.writeFloat(this.f45632Z);
    }

    public b(Parcel parcel) {
        this.f45631Y = parcel.readFloat();
        this.f45632Z = parcel.readFloat();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}

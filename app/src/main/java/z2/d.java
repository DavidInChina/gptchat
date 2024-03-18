package Z2;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes.dex */
public final class d implements L {
    public static final Parcelable.Creator<d> CREATOR = new n(5);

    /* renamed from: Y  reason: collision with root package name */
    public final float f23147Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f23148Z;

    public d(int i10, float f6) {
        this.f23147Y = f6;
        this.f23148Z = i10;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f23147Y == dVar.f23147Y && this.f23148Z == dVar.f23148Z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f23147Y).hashCode() + 527) * 31) + this.f23148Z;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f23147Y + ", svcTemporalLayerCount=" + this.f23148Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f23147Y);
        parcel.writeInt(this.f23148Z);
    }

    public d(Parcel parcel) {
        this.f23147Y = parcel.readFloat();
        this.f23148Z = parcel.readInt();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}

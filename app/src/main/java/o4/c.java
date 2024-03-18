package o4;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<c> CREATOR = new n(17);

    /* renamed from: Y  reason: collision with root package name */
    public final String f40580Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Map f40581Z;

    public c(String str, Map map) {
        this.f40580Y = str;
        this.f40581Z = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (AbstractC3557B.K(this.f40580Y, cVar.f40580Y) && AbstractC3557B.K(this.f40581Z, cVar.f40581Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40581Z.hashCode() + (this.f40580Y.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f40580Y + ", extras=" + this.f40581Z + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40580Y);
        Map map = this.f40581Z;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}

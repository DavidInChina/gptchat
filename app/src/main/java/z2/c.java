package Z2;

import Gi.e;
import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes.dex */
public final class c implements L {
    public static final Parcelable.Creator<c> CREATOR = new n(3);

    /* renamed from: Y  reason: collision with root package name */
    public final List f23146Y;

    public c(ArrayList arrayList) {
        this.f23146Y = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j6 = ((b) arrayList.get(0)).f23144Z;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i10)).f23143Y < j6) {
                    z10 = true;
                    break;
                } else {
                    j6 = ((b) arrayList.get(i10)).f23144Z;
                    i10++;
                }
            }
        }
        e.l(!z10);
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
        if (obj != null && c.class == obj.getClass()) {
            return this.f23146Y.equals(((c) obj).f23146Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23146Y.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f23146Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f23146Y);
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}

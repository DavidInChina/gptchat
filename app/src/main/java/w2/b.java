package W2;

import E9.f;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import l8.AbstractC4344b;
import p2.C5065s;
import p2.J;
import p2.L;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public class b implements L {
    public static final Parcelable.Creator<b> CREATOR = new C3871a(18);

    /* renamed from: Y  reason: collision with root package name */
    public final String f20692Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f20693Z;

    public b(String str, String str2) {
        this.f20692Y = AbstractC4344b.n1(str);
        this.f20693Z = str2;
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // p2.L
    public final void d(J j6) {
        String str = this.f20692Y;
        str.getClass();
        char c10 = '\uffff';
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f20693Z;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            j6.f41823b = str2;
                            return;
                        }
                        return;
                    }
                    j6.f41825d = str2;
                    return;
                }
                j6.f41828g = str2;
                return;
            }
            j6.f41822a = str2;
            return;
        }
        j6.f41824c = str2;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20692Y.equals(bVar.f20692Y) && this.f20693Z.equals(bVar.f20693Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20693Z.hashCode() + f.v(this.f20692Y, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f20692Y + Separators.EQUALS + this.f20693Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20692Y);
        parcel.writeString(this.f20693Z);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f20692Y = readString;
        this.f20693Z = parcel.readString();
    }
}

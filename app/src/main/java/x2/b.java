package X2;

import Gi.e;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import p2.C5065s;
import p2.J;
import p2.L;
import s2.AbstractC5530A;
import s2.p;

/* loaded from: classes2.dex */
public final class b implements L {
    public static final Parcelable.Creator<b> CREATOR = new C3871a(19);

    /* renamed from: Y  reason: collision with root package name */
    public final int f21768Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f21769Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f21770h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f21771i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f21772j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f21773k0;

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        e.l(i11 == -1 || i11 > 0);
        this.f21768Y = i10;
        this.f21769Z = str;
        this.f21770h0 = str2;
        this.f21771i0 = str3;
        this.f21772j0 = z10;
        this.f21773k0 = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Map map) {
        int i10;
        boolean z10;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z11;
        List list5;
        int i11;
        List list6 = (List) map.get("icy-br");
        boolean z12 = true;
        int i12 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        p.g("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC4194d.C("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                        i10 = i11;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i13 = i12;
                        if (!z10) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z10 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z11 = ((String) list4.get(0)).equals("1");
            z10 = true;
        } else {
            z11 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i12 = parseInt;
                } else {
                    try {
                        p.g("IcyHeaders", "Invalid metadata interval: " + str5);
                        z12 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = parseInt;
                        AbstractC4194d.C("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i132 = i12;
                        if (!z10) {
                        }
                    }
                }
                z10 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1322 = i12;
        if (!z10) {
            return null;
        }
        return new b(i10, i1322, str, str2, str3, z11);
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // p2.L
    public final void d(J j6) {
        String str = this.f21770h0;
        if (str != null) {
            j6.f41819E = str;
        }
        String str2 = this.f21769Z;
        if (str2 != null) {
            j6.f41817C = str2;
        }
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
        if (this.f21768Y == bVar.f21768Y && AbstractC5530A.a(this.f21769Z, bVar.f21769Z) && AbstractC5530A.a(this.f21770h0, bVar.f21770h0) && AbstractC5530A.a(this.f21771i0, bVar.f21771i0) && this.f21772j0 == bVar.f21772j0 && this.f21773k0 == bVar.f21773k0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f21768Y) * 31;
        int i13 = 0;
        String str = this.f21769Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f21770h0;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f21771i0;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f21772j0 ? 1 : 0)) * 31) + this.f21773k0;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f21770h0 + "\", genre=\"" + this.f21769Z + "\", bitrate=" + this.f21768Y + ", metadataInterval=" + this.f21773k0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21768Y);
        parcel.writeString(this.f21769Z);
        parcel.writeString(this.f21770h0);
        parcel.writeString(this.f21771i0);
        int i11 = AbstractC5530A.f45131a;
        parcel.writeInt(this.f21772j0 ? 1 : 0);
        parcel.writeInt(this.f21773k0);
    }

    public b(Parcel parcel) {
        this.f21768Y = parcel.readInt();
        this.f21769Z = parcel.readString();
        this.f21770h0 = parcel.readString();
        this.f21771i0 = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f21772j0 = parcel.readInt() != 0;
        this.f21773k0 = parcel.readInt();
    }
}

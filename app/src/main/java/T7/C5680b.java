package t7;

import M3.H;
import android.app.PendingIntent;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import w7.t;
import x7.AbstractC6355a;

/* renamed from: t7.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5680b extends AbstractC6355a {

    /* renamed from: Y  reason: collision with root package name */
    public final int f45760Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f45761Z;

    /* renamed from: h0  reason: collision with root package name */
    public final PendingIntent f45762h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f45763i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final C5680b f45759j0 = new C5680b(0);
    public static final Parcelable.Creator<C5680b> CREATOR = new t(6);

    public C5680b(int i10) {
        this(1, i10, null, null);
    }

    public static String c(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return AbstractC4194d.v("UNKNOWN_ERROR_CODE(", i10, Separators.RPAREN);
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5680b)) {
            return false;
        }
        C5680b c5680b = (C5680b) obj;
        if (this.f45761Z == c5680b.f45761Z && H.P(this.f45762h0, c5680b.f45762h0) && H.P(this.f45763i0, c5680b.f45763i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45761Z), this.f45762h0, this.f45763i0});
    }

    public final String toString() {
        U3.l lVar = new U3.l(this);
        lVar.e("statusCode", c(this.f45761Z));
        lVar.e("resolution", this.f45762h0);
        lVar.e("message", this.f45763i0);
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f45760Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f45761Z);
        AbstractC4344b.z1(parcel, 3, this.f45762h0, i10);
        AbstractC4344b.A1(parcel, 4, this.f45763i0);
        AbstractC4344b.F1(parcel, D12);
    }

    public C5680b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f45760Y = i10;
        this.f45761Z = i11;
        this.f45762h0 = pendingIntent;
        this.f45763i0 = str;
    }

    public C5680b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}

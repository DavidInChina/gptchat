package com.google.android.gms.common.api;

import M3.H;
import U3.l;
import Y2.n;
import android.app.PendingIntent;
import android.gov.nist.core.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import l8.AbstractC4344b;
import t7.C5680b;
import u7.m;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class Status extends AbstractC6355a implements m, ReflectedParcelable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f26807Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f26808Z;

    /* renamed from: h0  reason: collision with root package name */
    public final PendingIntent f26809h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5680b f26810i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Status f26802j0 = new Status(0, null, null, null);

    /* renamed from: k0  reason: collision with root package name */
    public static final Status f26803k0 = new Status(14, null, null, null);

    /* renamed from: l0  reason: collision with root package name */
    public static final Status f26804l0 = new Status(8, null, null, null);

    /* renamed from: m0  reason: collision with root package name */
    public static final Status f26805m0 = new Status(15, null, null, null);

    /* renamed from: n0  reason: collision with root package name */
    public static final Status f26806n0 = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new n(27);

    public Status(int i10, String str, PendingIntent pendingIntent, C5680b c5680b) {
        this.f26807Y = i10;
        this.f26808Z = str;
        this.f26809h0 = pendingIntent;
        this.f26810i0 = c5680b;
    }

    @Override // u7.m
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f26807Y != status.f26807Y || !H.P(this.f26808Z, status.f26808Z) || !H.P(this.f26809h0, status.f26809h0) || !H.P(this.f26810i0, status.f26810i0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26807Y), this.f26808Z, this.f26809h0, this.f26810i0});
    }

    public final String toString() {
        l lVar = new l(this);
        String str = this.f26808Z;
        if (str == null) {
            int i10 = this.f26807Y;
            switch (i10) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = a.e("unknown status code: ", i10);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        lVar.e("statusCode", str);
        lVar.e("resolution", this.f26809h0);
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f26807Y);
        AbstractC4344b.A1(parcel, 2, this.f26808Z);
        AbstractC4344b.z1(parcel, 3, this.f26809h0, i10);
        AbstractC4344b.z1(parcel, 4, this.f26810i0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}

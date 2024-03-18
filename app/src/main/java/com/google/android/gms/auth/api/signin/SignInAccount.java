package com.google.android.gms.auth.api.signin;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractC6355a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new n(25);

    /* renamed from: Y  reason: collision with root package name */
    public final String f26787Y;

    /* renamed from: Z  reason: collision with root package name */
    public final GoogleSignInAccount f26788Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f26789h0;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f26788Z = googleSignInAccount;
        if (!TextUtils.isEmpty(str)) {
            this.f26787Y = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f26789h0 = str2;
                return;
            }
            throw new IllegalArgumentException("8.3 and 8.4 SDKs require non-null userId");
        }
        throw new IllegalArgumentException("8.3 and 8.4 SDKs require non-null email");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.A1(parcel, 4, this.f26787Y);
        AbstractC4344b.z1(parcel, 7, this.f26788Z, i10);
        AbstractC4344b.A1(parcel, 8, this.f26789h0);
        AbstractC4344b.F1(parcel, D12);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import A7.b;
import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC6355a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new n(22);

    /* renamed from: Y  reason: collision with root package name */
    public final String f26790Y;

    /* renamed from: Z  reason: collision with root package name */
    public final GoogleSignInOptions f26791Z;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        b.i0(str);
        this.f26790Y = str;
        this.f26791Z = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f26790Y.equals(signInConfiguration.f26790Y)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f26791Z;
            GoogleSignInOptions googleSignInOptions2 = this.f26791Z;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1 * 31;
        int i12 = 0;
        String str = this.f26790Y;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (i11 + i10) * 31;
        GoogleSignInOptions googleSignInOptions = this.f26791Z;
        if (googleSignInOptions != null) {
            i12 = googleSignInOptions.hashCode();
        }
        return i13 + i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.A1(parcel, 2, this.f26790Y);
        AbstractC4344b.z1(parcel, 5, this.f26791Z, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}

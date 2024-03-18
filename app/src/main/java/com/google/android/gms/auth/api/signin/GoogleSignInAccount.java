package com.google.android.gms.auth.api.signin;

import A7.b;
import Y2.n;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l8.AbstractC4344b;
import org.json.JSONArray;
import org.json.JSONObject;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC6355a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new n(23);

    /* renamed from: Y  reason: collision with root package name */
    public final int f26758Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f26759Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f26760h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f26761i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f26762j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Uri f26763k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f26764l0;

    /* renamed from: m0  reason: collision with root package name */
    public final long f26765m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f26766n0;

    /* renamed from: o0  reason: collision with root package name */
    public final List f26767o0;

    /* renamed from: p0  reason: collision with root package name */
    public final String f26768p0;

    /* renamed from: q0  reason: collision with root package name */
    public final String f26769q0;

    /* renamed from: r0  reason: collision with root package name */
    public final HashSet f26770r0 = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f26758Y = i10;
        this.f26759Z = str;
        this.f26760h0 = str2;
        this.f26761i0 = str3;
        this.f26762j0 = str4;
        this.f26763k0 = uri;
        this.f26764l0 = str5;
        this.f26765m0 = j6;
        this.f26766n0 = str6;
        this.f26767o0 = arrayList;
        this.f26768p0 = str7;
        this.f26769q0 = str8;
    }

    public static GoogleSignInAccount c(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString(ParameterNames.ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        b.i0(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.f26764l0 = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f26766n0.equals(this.f26766n0)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f26767o0);
            hashSet.addAll(googleSignInAccount.f26770r0);
            HashSet hashSet2 = new HashSet(this.f26767o0);
            hashSet2.addAll(this.f26770r0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.f26767o0);
        hashSet.addAll(this.f26770r0);
        return ((this.f26766n0.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f26758Y);
        AbstractC4344b.A1(parcel, 2, this.f26759Z);
        AbstractC4344b.A1(parcel, 3, this.f26760h0);
        AbstractC4344b.A1(parcel, 4, this.f26761i0);
        AbstractC4344b.A1(parcel, 5, this.f26762j0);
        AbstractC4344b.z1(parcel, 6, this.f26763k0, i10);
        AbstractC4344b.A1(parcel, 7, this.f26764l0);
        AbstractC4344b.G1(parcel, 8, 8);
        parcel.writeLong(this.f26765m0);
        AbstractC4344b.A1(parcel, 9, this.f26766n0);
        AbstractC4344b.C1(parcel, 10, this.f26767o0);
        AbstractC4344b.A1(parcel, 11, this.f26768p0);
        AbstractC4344b.A1(parcel, 12, this.f26769q0);
        AbstractC4344b.F1(parcel, D12);
    }
}

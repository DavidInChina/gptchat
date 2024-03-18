package com.google.android.gms.auth.api.signin;

import G0.C0588q;
import Y2.n;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l8.AbstractC4344b;
import org.json.JSONArray;
import org.json.JSONObject;
import s7.C5580a;
import u7.AbstractC5846b;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC6355a implements AbstractC5846b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: q0  reason: collision with root package name */
    public static final GoogleSignInOptions f26771q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final Scope f26772r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final Scope f26773s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final Scope f26774t0 = new Scope(1, "https://www.googleapis.com/auth/games");

    /* renamed from: u0  reason: collision with root package name */
    public static final C0588q f26775u0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f26776Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f26777Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Account f26778h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f26779i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f26780j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f26781k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f26782l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f26783m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f26784n0;

    /* renamed from: o0  reason: collision with root package name */
    public final String f26785o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Map f26786p0;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f26772r0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f26773s0 = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f26774t0)) {
            Scope scope4 = f26773s0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f26771q0 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f26774t0)) {
            Scope scope5 = f26773s0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new n(24);
        f26775u0 = new C0588q(5);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f26776Y = i10;
        this.f26777Z = arrayList;
        this.f26778h0 = account;
        this.f26779i0 = z10;
        this.f26780j0 = z11;
        this.f26781k0 = z12;
        this.f26782l0 = str;
        this.f26783m0 = str2;
        this.f26784n0 = new ArrayList(map.values());
        this.f26786p0 = map;
        this.f26785o0 = str3;
    }

    public static GoogleSignInOptions c(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, str3, str4, new HashMap(), null);
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5580a c5580a = (C5580a) it.next();
                hashMap.put(Integer.valueOf(c5580a.f45422Z), c5580a);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.equals(r5) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        String str = this.f26782l0;
        ArrayList arrayList = this.f26777Z;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f26777Z;
            String str2 = googleSignInOptions.f26782l0;
            Account account = googleSignInOptions.f26778h0;
            if (this.f26784n0.isEmpty() && googleSignInOptions.f26784n0.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f26778h0;
                if (account2 == null) {
                    if (account == null) {
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                    }
                } else if (!str.equals(str2)) {
                }
                if (this.f26781k0 == googleSignInOptions.f26781k0 && this.f26779i0 == googleSignInOptions.f26779i0 && this.f26780j0 == googleSignInOptions.f26780j0) {
                    if (TextUtils.equals(this.f26785o0, googleSignInOptions.f26785o0)) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f26777Z;
        int size = arrayList2.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((Scope) arrayList2.get(i13)).f26801Z);
        }
        Collections.sort(arrayList);
        Account account = this.f26778h0;
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            i10 = 0;
        } else {
            i10 = account.hashCode();
        }
        int i14 = hashCode + i10;
        String str = this.f26782l0;
        int i15 = i14 * 31;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = ((((((i15 + i11) * 31) + (this.f26781k0 ? 1 : 0)) * 31) + (this.f26779i0 ? 1 : 0)) * 31) + (this.f26780j0 ? 1 : 0);
        String str2 = this.f26785o0;
        int i17 = i16 * 31;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i17 + i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f26776Y);
        AbstractC4344b.C1(parcel, 2, new ArrayList(this.f26777Z));
        AbstractC4344b.z1(parcel, 3, this.f26778h0, i10);
        AbstractC4344b.G1(parcel, 4, 4);
        parcel.writeInt(this.f26779i0 ? 1 : 0);
        AbstractC4344b.G1(parcel, 5, 4);
        parcel.writeInt(this.f26780j0 ? 1 : 0);
        AbstractC4344b.G1(parcel, 6, 4);
        parcel.writeInt(this.f26781k0 ? 1 : 0);
        AbstractC4344b.A1(parcel, 7, this.f26782l0);
        AbstractC4344b.A1(parcel, 8, this.f26783m0);
        AbstractC4344b.C1(parcel, 9, this.f26784n0);
        AbstractC4344b.A1(parcel, 10, this.f26785o0);
        AbstractC4344b.F1(parcel, D12);
    }
}

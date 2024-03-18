package s7;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s7.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5581b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f45424c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static C5581b f45425d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f45426a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f45427b;

    public C5581b(Context context) {
        this.f45427b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C5581b a(Context context) {
        A7.b.k0(context);
        ReentrantLock reentrantLock = f45424c;
        reentrantLock.lock();
        try {
            if (f45425d == null) {
                f45425d = new C5581b(context.getApplicationContext());
            }
            C5581b c5581b = f45425d;
            reentrantLock.unlock();
            return c5581b;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String g(String str, String str2) {
        return android.gov.nist.core.a.j(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInAccount", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.c(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.c(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        A7.b.k0(googleSignInOptions);
        String str = googleSignInAccount.f26766n0;
        f("defaultGoogleSignInAccount", str);
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f26759Z;
            if (str2 != null) {
                jSONObject.put(ParameterNames.ID, str2);
            }
            String str3 = googleSignInAccount.f26760h0;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f26761i0;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f26762j0;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f26768p0;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f26769q0;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f26763k0;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f26764l0;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f26765m0);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f26767o0;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, r7.b.f44460Y);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f26801Z);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f26783m0;
            String str10 = googleSignInOptions.f26782l0;
            ArrayList arrayList = googleSignInOptions.f26777Z;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.f26775u0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f26801Z);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f26778h0;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f26779i0);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f26781k0);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f26780j0);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f45426a;
        reentrantLock.lock();
        try {
            return this.f45427b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f45426a;
        reentrantLock.lock();
        try {
            this.f45427b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}

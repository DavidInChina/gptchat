package s7;

import A2.I;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import w7.AbstractC6134f;
import w7.C6131c;

/* loaded from: classes.dex */
public final class e extends AbstractC6134f {

    /* renamed from: A  reason: collision with root package name */
    public final GoogleSignInOptions f45433A;

    /* JADX WARN: Type inference failed for: r8v4, types: [A2.I, java.lang.Object] */
    public e(Context context, Looper looper, C6131c c6131c, GoogleSignInOptions googleSignInOptions, u7.h hVar, u7.i iVar) {
        super(context, looper, 91, c6131c, hVar, iVar);
        I i10;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f398d = new HashSet();
            obj.f402h = new HashMap();
            obj.f398d = new HashSet(googleSignInOptions.f26777Z);
            obj.f395a = googleSignInOptions.f26780j0;
            obj.f396b = googleSignInOptions.f26781k0;
            obj.f397c = googleSignInOptions.f26779i0;
            obj.f399e = googleSignInOptions.f26782l0;
            obj.f400f = googleSignInOptions.f26778h0;
            obj.f401g = googleSignInOptions.f26783m0;
            obj.f402h = GoogleSignInOptions.f(googleSignInOptions.f26784n0);
            obj.f403i = googleSignInOptions.f26785o0;
            i10 = obj;
        } else {
            i10 = new I();
        }
        byte[] bArr = new byte[16];
        F7.b.f5065a.nextBytes(bArr);
        i10.f403i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = c6131c.f48109c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                Set set2 = (Set) i10.f398d;
                set2.add(scope);
                set2.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f45433A = i10.b();
    }

    @Override // u7.AbstractC5847c
    public final int f() {
        return 12451000;
    }

    @Override // w7.AbstractC6134f
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new F7.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}

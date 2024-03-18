package A2;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import q2.AbstractC5264d;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public boolean f395a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f396b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f397c;

    /* renamed from: d  reason: collision with root package name */
    public Object f398d;

    /* renamed from: e  reason: collision with root package name */
    public Object f399e;

    /* renamed from: f  reason: collision with root package name */
    public Object f400f;

    /* renamed from: g  reason: collision with root package name */
    public Object f401g;

    /* renamed from: h  reason: collision with root package name */
    public Object f402h;

    /* renamed from: i  reason: collision with root package name */
    public String f403i;

    public I() {
        this.f398d = new HashSet();
        this.f402h = new HashMap();
    }

    public final S a() {
        Gi.e.n(!this.f397c);
        this.f397c = true;
        if (((q2.e) this.f400f) == null) {
            this.f400f = new K(new AbstractC5264d[0]);
        }
        if (((A) this.f402h) == null) {
            this.f402h = new A((Context) this.f398d);
        }
        return new S(this);
    }

    public final GoogleSignInOptions b() {
        Set set = (Set) this.f398d;
        if (set.contains(GoogleSignInOptions.f26774t0)) {
            Scope scope = GoogleSignInOptions.f26773s0;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        if (this.f397c && (((Account) this.f400f) == null || !set.isEmpty())) {
            ((Set) this.f398d).add(GoogleSignInOptions.f26772r0);
        }
        return new GoogleSignInOptions(3, new ArrayList(set), (Account) this.f400f, this.f397c, this.f395a, this.f396b, (String) this.f399e, (String) this.f401g, (Map) this.f402h, this.f403i);
    }

    public I(Context context) {
        this.f398d = context;
        this.f399e = C0059c.f535c;
        this.f401g = H.f394a;
    }
}

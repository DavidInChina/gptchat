package s3;

import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import jf.C3963m;
import l2.C4333d;

/* renamed from: s3.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5562l implements AbstractC2086v, e0, AbstractC2077l, A3.f {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f45305Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC5540C f45306Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f45307h0;

    /* renamed from: i0  reason: collision with root package name */
    public EnumC2082q f45308i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U f45309j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f45310k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Bundle f45311l0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f45314o0;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.lifecycle.V f45316q0;

    /* renamed from: m0  reason: collision with root package name */
    public final C2088x f45312m0 = new C2088x(this);

    /* renamed from: n0  reason: collision with root package name */
    public final A3.e f45313n0 = new A3.e(this);

    /* renamed from: p0  reason: collision with root package name */
    public EnumC2082q f45315p0 = EnumC2082q.f25376Z;

    public C5562l(Context context, AbstractC5540C abstractC5540C, Bundle bundle, EnumC2082q enumC2082q, U u10, String str, Bundle bundle2) {
        this.f45305Y = context;
        this.f45306Z = abstractC5540C;
        this.f45307h0 = bundle;
        this.f45308i0 = enumC2082q;
        this.f45309j0 = u10;
        this.f45310k0 = str;
        this.f45311l0 = bundle2;
        C3963m D12 = R4.b.D1(new C5561k(this, 0));
        R4.b.D1(new C5561k(this, 1));
        this.f45316q0 = (androidx.lifecycle.V) D12.getValue();
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final b0 b() {
        return this.f45316q0;
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final C4333d c() {
        Context context;
        C4333d c4333d = new C4333d(0);
        Application application = null;
        Context context2 = this.f45305Y;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            c4333d.a(Z.f25347Y, application);
        }
        c4333d.a(androidx.lifecycle.S.f25325a, this);
        c4333d.a(androidx.lifecycle.S.f25326b, this);
        Bundle d10 = d();
        if (d10 != null) {
            c4333d.a(androidx.lifecycle.S.f25327c, d10);
        }
        return c4333d;
    }

    public final Bundle d() {
        Bundle bundle = this.f45307h0;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // androidx.lifecycle.e0
    public final d0 e() {
        if (this.f45314o0) {
            if (this.f45312m0.f25386f != EnumC2082q.f25375Y) {
                U u10 = this.f45309j0;
                if (u10 != null) {
                    String str = this.f45310k0;
                    AbstractC3557B.c0("backStackEntryId", str);
                    LinkedHashMap linkedHashMap = ((C5569t) u10).f45367d;
                    d0 d0Var = (d0) linkedHashMap.get(str);
                    if (d0Var == null) {
                        d0 d0Var2 = new d0();
                        linkedHashMap.put(str, d0Var2);
                        return d0Var2;
                    }
                    return d0Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj == null || !(obj instanceof C5562l)) {
            return false;
        }
        C5562l c5562l = (C5562l) obj;
        if (!AbstractC3557B.K(this.f45310k0, c5562l.f45310k0) || !AbstractC3557B.K(this.f45306Z, c5562l.f45306Z) || !AbstractC3557B.K(this.f45312m0, c5562l.f45312m0) || !AbstractC3557B.K(this.f45313n0.f645b, c5562l.f45313n0.f645b)) {
            return false;
        }
        Bundle bundle = this.f45307h0;
        Bundle bundle2 = c5562l.f45307h0;
        if (!AbstractC3557B.K(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj3 = bundle.get(str);
                    if (bundle2 != null) {
                        obj2 = bundle2.get(str);
                    } else {
                        obj2 = null;
                    }
                    if (!AbstractC3557B.K(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // A3.f
    public final A3.d f() {
        return this.f45313n0.f645b;
    }

    public final void g(EnumC2082q enumC2082q) {
        AbstractC3557B.c0("maxState", enumC2082q);
        this.f45315p0 = enumC2082q;
        i();
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final androidx.lifecycle.S h() {
        return this.f45312m0;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = this.f45306Z.hashCode() + (this.f45310k0.hashCode() * 31);
        Bundle bundle = this.f45307h0;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i11 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return this.f45313n0.f645b.hashCode() + ((this.f45312m0.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f45314o0) {
            A3.e eVar = this.f45313n0;
            eVar.a();
            this.f45314o0 = true;
            if (this.f45309j0 != null) {
                androidx.lifecycle.S.e(this);
            }
            eVar.b(this.f45311l0);
        }
        int ordinal = this.f45308i0.ordinal();
        int ordinal2 = this.f45315p0.ordinal();
        C2088x c2088x = this.f45312m0;
        if (ordinal < ordinal2) {
            c2088x.m(this.f45308i0);
        } else {
            c2088x.m(this.f45315p0);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5562l.class.getSimpleName());
        sb2.append(Separators.LPAREN + this.f45310k0 + ')');
        sb2.append(" destination=");
        sb2.append(this.f45306Z);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }
}

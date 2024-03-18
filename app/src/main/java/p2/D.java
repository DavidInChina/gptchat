package p2;

import android.net.Uri;
import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class D implements AbstractC5057j {

    /* renamed from: i0  reason: collision with root package name */
    public static final D f41769i0 = new D(new U3.u(11));

    /* renamed from: j0  reason: collision with root package name */
    public static final String f41770j0 = Integer.toString(0, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f41771k0 = Integer.toString(1, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f41772l0 = Integer.toString(2, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final A9.a f41773m0 = new A9.a(22);

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f41774Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f41775Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f41776h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public D(U3.u uVar) {
        this.f41774Y = (Uri) uVar.f17492Z;
        this.f41775Z = (String) uVar.f17493h0;
        this.f41776h0 = (Bundle) uVar.f17494i0;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Uri uri = this.f41774Y;
        if (uri != null) {
            bundle.putParcelable(f41770j0, uri);
        }
        String str = this.f41775Z;
        if (str != null) {
            bundle.putString(f41771k0, str);
        }
        Bundle bundle2 = this.f41776h0;
        if (bundle2 != null) {
            bundle.putBundle(f41772l0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (AbstractC5530A.a(this.f41774Y, d10.f41774Y) && AbstractC5530A.a(this.f41775Z, d10.f41775Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Uri uri = this.f41774Y;
        if (uri == null) {
            i10 = 0;
        } else {
            i10 = uri.hashCode();
        }
        int i12 = i10 * 31;
        String str = this.f41775Z;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }
}

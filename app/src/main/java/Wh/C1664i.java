package Wh;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Wh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1664i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21208a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f21209b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f21210c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21211d;

    public C1664i(C1665j c1665j) {
        AbstractC3557B.c0("connectionSpec", c1665j);
        this.f21208a = c1665j.f21215a;
        this.f21209b = c1665j.f21217c;
        this.f21210c = c1665j.f21218d;
        this.f21211d = c1665j.f21216b;
    }

    public final C1665j a() {
        return new C1665j(this.f21208a, this.f21211d, this.f21209b, this.f21210c);
    }

    public final void b(C1663h... c1663hArr) {
        AbstractC3557B.c0("cipherSuites", c1663hArr);
        if (this.f21208a) {
            ArrayList arrayList = new ArrayList(c1663hArr.length);
            for (C1663h c1663h : c1663hArr) {
                arrayList.add(c1663h.f21207a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void c(String... strArr) {
        boolean z10;
        AbstractC3557B.c0("cipherSuites", strArr);
        if (this.f21208a) {
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f21209b = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void d() {
        if (this.f21208a) {
            this.f21211d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public final void e(H... hArr) {
        if (this.f21208a) {
            ArrayList arrayList = new ArrayList(hArr.length);
            for (H h10 : hArr) {
                arrayList.add(h10.f21157Y);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            f((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void f(String... strArr) {
        boolean z10;
        AbstractC3557B.c0("tlsVersions", strArr);
        if (this.f21208a) {
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f21210c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public C1664i() {
        this.f21208a = true;
    }
}

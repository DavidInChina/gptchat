package io.sentry.clientreport;

import Ad.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f34300a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34301b;

    public b(String str, String str2) {
        this.f34300a = str;
        this.f34301b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.j0(this.f34300a, bVar.f34300a) && l.j0(this.f34301b, bVar.f34301b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34300a, this.f34301b});
    }
}

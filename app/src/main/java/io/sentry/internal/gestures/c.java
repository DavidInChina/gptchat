package io.sentry.internal.gestures;

import Ad.l;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f34387a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34388b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34389c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34390d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34391e;

    public c(View view, String str, String str2, String str3, String str4) {
        this.f34387a = new WeakReference(view);
        this.f34388b = str;
        this.f34389c = str2;
        this.f34390d = str3;
        this.f34391e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (l.j0(this.f34388b, cVar.f34388b) && l.j0(this.f34389c, cVar.f34389c) && l.j0(this.f34390d, cVar.f34390d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34387a, this.f34389c, this.f34390d});
    }
}

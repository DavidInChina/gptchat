package hh;

import android.app.Application;
import android.os.Build;
import java.util.ArrayList;
import ng.C4844k;

/* renamed from: hh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3439g implements AbstractC3440h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f32357a;

    /* renamed from: b  reason: collision with root package name */
    public final C3433a f32358b;

    /* renamed from: c  reason: collision with root package name */
    public final Application f32359c;

    public C3439g(Application application, C3443k c3443k) {
        this.f32359c = application;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26) {
            arrayList.add(new C4844k(c3443k));
        }
        wf.k b10 = b("androidx.fragment.app.Fragment", "leakcanary.internal.AndroidXFragmentDestroyWatcher", c3443k);
        if (b10 != null) {
            arrayList.add(b10);
        }
        wf.k b11 = b("android.support.v4.app.Fragment", "leakcanary.internal.AndroidSupportFragmentDestroyWatcher", c3443k);
        if (b11 != null) {
            arrayList.add(b11);
        }
        this.f32357a = arrayList;
        this.f32358b = new C3433a(this);
    }

    public static wf.k b(String str, String str2, C3443k c3443k) {
        try {
            Class.forName(str);
            Class.forName(str2);
            Object newInstance = Class.forName(str2).getDeclaredConstructor(C3443k.class).newInstance(c3443k);
            if (newInstance != null) {
                Ad.l.M(1, newInstance);
                return (wf.k) newInstance;
            }
            throw new ClassCastException("null cannot be cast to non-null type (android.app.Activity) -> kotlin.Unit");
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // hh.AbstractC3440h
    public final void a() {
        this.f32359c.registerActivityLifecycleCallbacks(this.f32358b);
    }
}

package v7;

import V1.AbstractComponentCallbacksC1480v;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
import w.C6049A;

/* loaded from: classes2.dex */
public final class J extends AbstractComponentCallbacksC1480v implements AbstractC5989g {

    /* renamed from: a1  reason: collision with root package name */
    public final Map f47286a1 = DesugarCollections.synchronizedMap(new C6049A());
    public int b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    public Bundle f47287c1;

    static {
        new WeakHashMap();
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void A() {
        this.f18267H0 = true;
        this.b1 = 5;
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void E() {
        this.f18267H0 = true;
        this.b1 = 3;
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void F(Bundle bundle) {
        for (Map.Entry entry : this.f47286a1.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void G() {
        this.f18267H0 = true;
        this.b1 = 2;
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void H() {
        this.f18267H0 = true;
        this.b1 = 4;
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void w(int i10, int i11, Intent intent) {
        super.w(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f47286a1.values()) {
            lifecycleCallback.b(i10, i11, intent);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void y(Bundle bundle) {
        Bundle bundle2;
        super.y(bundle);
        this.b1 = 1;
        this.f47287c1 = bundle;
        for (Map.Entry entry : this.f47286a1.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.c(bundle2);
        }
    }
}

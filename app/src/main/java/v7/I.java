package v7;

import android.app.Activity;
import android.app.Fragment;
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
public final class I extends Fragment implements AbstractC5989g {

    /* renamed from: Y  reason: collision with root package name */
    public final Map f47283Y = DesugarCollections.synchronizedMap(new C6049A());

    /* renamed from: Z  reason: collision with root package name */
    public int f47284Z = 0;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f47285h0;

    static {
        new WeakHashMap();
    }

    @Override // v7.AbstractC5989g
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.b(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f47284Z = 1;
        this.f47285h0 = bundle;
        for (Map.Entry entry : this.f47283Y.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.c(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f47284Z = 5;
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f47284Z = 3;
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f47283Y.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).e(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f47284Z = 2;
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f47284Z = 4;
        for (LifecycleCallback lifecycleCallback : this.f47283Y.values()) {
            lifecycleCallback.g();
        }
    }
}

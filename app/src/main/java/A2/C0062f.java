package A2;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import m.C4507D;
import s2.AbstractC5530A;
import y2.C6503F;
import y2.i0;

/* renamed from: A2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f543a;

    /* renamed from: b  reason: collision with root package name */
    public final C f544b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f545c;

    /* renamed from: d  reason: collision with root package name */
    public final C6503F f546d;

    /* renamed from: e  reason: collision with root package name */
    public final C4507D f547e;

    /* renamed from: f  reason: collision with root package name */
    public final C0061e f548f;

    /* renamed from: g  reason: collision with root package name */
    public C0059c f549g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f550h;

    public C0062f(Context context, C c10) {
        C6503F c6503f;
        C4507D c4507d;
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.f543a = applicationContext;
        this.f544b = c10;
        int i10 = AbstractC5530A.f45131a;
        Looper myLooper = Looper.myLooper();
        C0061e c0061e = null;
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f545c = handler;
        int i11 = AbstractC5530A.f45131a;
        if (i11 >= 23) {
            c6503f = new C6503F(this);
        } else {
            c6503f = null;
        }
        this.f546d = c6503f;
        if (i11 >= 21) {
            c4507d = new C4507D(this);
        } else {
            c4507d = null;
        }
        this.f547e = c4507d;
        if (C0059c.a()) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.f548f = uri != null ? new C0061e(this, handler, applicationContext.getContentResolver(), uri) : c0061e;
    }

    public static void a(C0062f c0062f, C0059c c0059c) {
        boolean z10;
        i0 i0Var;
        if (c0062f.f550h && !c0059c.equals(c0062f.f549g)) {
            c0062f.f549g = c0059c;
            S s10 = c0062f.f544b.f389a;
            if (s10.f471h0 == Looper.myLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.n(z10);
            if (!c0059c.equals(s10.f())) {
                s10.f488y = c0059c;
                F4.a aVar = s10.f483t;
                if (aVar != null) {
                    V v10 = (V) aVar.f5033Z;
                    synchronized (v10.f50563Y) {
                        i0Var = v10.f50579v0;
                    }
                    if (i0Var != null) {
                        ((H2.p) i0Var).i();
                    }
                }
            }
        }
    }
}

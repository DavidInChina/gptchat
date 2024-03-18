package w7;

import android.app.PendingIntent;
import android.os.Bundle;
import t7.C5680b;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public Object f48205a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f48206b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6134f f48207c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48208d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f48209e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AbstractC6134f f48210f;

    public v(AbstractC6134f abstractC6134f, int i10, Bundle bundle) {
        this.f48210f = abstractC6134f;
        Boolean bool = Boolean.TRUE;
        this.f48207c = abstractC6134f;
        this.f48205a = bool;
        this.f48208d = i10;
        this.f48209e = bundle;
    }

    public final /* bridge */ void a() {
        AbstractC6134f abstractC6134f = this.f48210f;
        PendingIntent pendingIntent = null;
        int i10 = this.f48208d;
        if (i10 == 0) {
            if (!c()) {
                abstractC6134f.v(1, null);
                b(new C5680b(8, null));
                return;
            }
            return;
        }
        abstractC6134f.v(1, null);
        Bundle bundle = this.f48209e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        b(new C5680b(i10, pendingIntent));
    }

    public abstract void b(C5680b c5680b);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f48205a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f48207c.f48149k) {
            this.f48207c.f48149k.remove(this);
        }
    }
}

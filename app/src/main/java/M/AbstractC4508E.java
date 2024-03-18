package m;

import Rh.AbstractC1315n;
import V1.e0;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import th.AbstractC5809q;
import y1.C6497g;

/* renamed from: m.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4508E implements AbstractC1315n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f38593Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f38594Z;

    public AbstractC4508E(e0 e0Var, C6497g c6497g) {
        this.f38593Y = e0Var;
        this.f38594Z = c6497g;
    }

    public final void a() {
        Object obj = this.f38593Y;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((LayoutInflater$Factory2C4511H) this.f38594Z).f38654p0.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f38593Y = null;
        }
    }

    public final void b() {
        e0 e0Var = (e0) this.f38593Y;
        C6497g c6497g = (C6497g) this.f38594Z;
        e0Var.getClass();
        AbstractC3557B.c0("signal", c6497g);
        LinkedHashSet linkedHashSet = e0Var.f18187e;
        if (linkedHashSet.remove(c6497g) && linkedHashSet.isEmpty()) {
            e0Var.b();
        }
    }

    @Override // Rh.AbstractC1315n
    public final void c() {
        f().add(new Rh.K((String) this.f38593Y, (Map) this.f38594Z));
    }

    public abstract IntentFilter d();

    public abstract int e();

    public abstract List f();

    public final boolean g() {
        View view = ((e0) this.f38593Y).f18185c.f18269J0;
        AbstractC3557B.b0("operation.fragment.mView", view);
        int h10 = Gi.e.h(view);
        int i10 = ((e0) this.f38593Y).f18183a;
        if (h10 != i10 && (h10 == 2 || i10 == 2)) {
            return false;
        }
        return true;
    }

    @Override // Rh.AbstractC1315n
    public final void h(String str, AbstractC5809q abstractC5809q) {
        ((Map) this.f38594Z).put(str, abstractC5809q);
    }

    public abstract void i();

    public final void j() {
        a();
        IntentFilter d10 = d();
        if (d10.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f38593Y) == null) {
            this.f38593Y = new C4507D(0, this);
        }
        ((LayoutInflater$Factory2C4511H) this.f38594Z).f38654p0.registerReceiver((BroadcastReceiver) this.f38593Y, d10);
    }

    public AbstractC4508E(String str) {
        this.f38593Y = str;
        this.f38594Z = new HashMap();
    }

    public AbstractC4508E(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H) {
        this.f38594Z = layoutInflater$Factory2C4511H;
    }
}

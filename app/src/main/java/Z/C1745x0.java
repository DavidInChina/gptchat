package Z;

import android.util.SparseBooleanArray;
import b7.C2130a;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import java.util.EnumSet;
import p2.C5064q;
import s2.AbstractC5532b;

/* renamed from: Z.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745x0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22767a;

    /* renamed from: b  reason: collision with root package name */
    public Object f22768b;

    public C1745x0() {
        this.f22768b = AbstractC5532b.f45146a;
    }

    public final void a(int i10) {
        Gi.e.n(!this.f22767a);
        ((SparseBooleanArray) this.f22768b).append(i10, true);
    }

    public final C5064q b() {
        Gi.e.n(!this.f22767a);
        this.f22767a = true;
        return new C5064q((SparseBooleanArray) this.f22768b);
    }

    public final synchronized void c() {
        this.f22767a = false;
    }

    public final synchronized boolean d() {
        if (this.f22767a) {
            return false;
        }
        this.f22767a = true;
        notifyAll();
        return true;
    }

    public final void e(com.google.android.gms.internal.play_billing.h1 h1Var) {
        if (this.f22767a) {
            AbstractC2468q.e("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((s3.z) this.f22768b).f(new C2130a(h1Var));
        } catch (Throwable unused) {
            AbstractC2468q.e("BillingLogger", "logging failed.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1745x0(int i10) {
        this();
        if (i10 == 2) {
        } else if (i10 != 6) {
            this.f22768b = new SparseBooleanArray();
        } else {
            this.f22768b = EnumSet.allOf(Ci.c.class);
            this.f22767a = true;
        }
    }

    public C1745x0(Exception exc, boolean z10) {
        this.f22767a = z10;
        this.f22768b = exc;
    }
}

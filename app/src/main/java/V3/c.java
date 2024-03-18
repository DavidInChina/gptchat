package V3;

import M3.F;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f18336Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f18337h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f18338i0 = false;

    public c(F f6, String str) {
        this.f18336Z = f6;
        this.f18337h0 = str;
    }

    @Override // V3.d
    public final void b() {
        F f6 = this.f18336Z;
        WorkDatabase workDatabase = f6.f11519h;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().j(this.f18337h0).iterator();
            while (it.hasNext()) {
                d.a(f6, (String) it.next());
            }
            workDatabase.n();
            workDatabase.j();
            if (this.f18338i0) {
                M3.v.b(f6.f11518g, f6.f11519h, f6.f11521j);
            }
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}

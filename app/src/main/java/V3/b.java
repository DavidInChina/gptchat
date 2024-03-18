package V3;

import M3.F;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f18333Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f18334h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f18335i0;

    public /* synthetic */ b(F f6, Object obj, int i10) {
        this.f18333Z = i10;
        this.f18334h0 = f6;
        this.f18335i0 = obj;
    }

    @Override // V3.d
    public final void b() {
        WorkDatabase workDatabase;
        int i10 = this.f18333Z;
        Object obj = this.f18335i0;
        F f6 = this.f18334h0;
        switch (i10) {
            case 0:
                workDatabase = f6.f11519h;
                workDatabase.c();
                try {
                    d.a(f6, ((UUID) obj).toString());
                    workDatabase.n();
                    workDatabase.j();
                    M3.v.b(f6.f11518g, f6.f11519h, f6.f11521j);
                    return;
                } finally {
                    workDatabase.j();
                }
            default:
                workDatabase = f6.f11519h;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.u().k((String) obj).iterator();
                    while (it.hasNext()) {
                        d.a(f6, (String) it.next());
                    }
                    workDatabase.n();
                    workDatabase.j();
                    M3.v.b(f6.f11518g, f6.f11519h, f6.f11521j);
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }
}

package kh;

import Z.N;
import android.content.SharedPreferences;
import h.C3277c;
import id.AbstractC3557B;
import jf.y;
import oh.C5020g;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37559Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f37560Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, Object obj) {
        super(1);
        this.f37559Y = i10;
        this.f37560Z = obj;
    }

    public final void a(long j6) {
        int i10 = this.f37559Y;
        Object obj = this.f37560Z;
        switch (i10) {
            case 0:
                ((e) ((m) obj)).f37555e.setValue(new Z0.k(j6));
                return;
            default:
                ((C5020g) obj).f41419b.setValue(new Z0.k(j6));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f37559Y;
        Object obj2 = this.f37560Z;
        switch (i10) {
            case 0:
                a(((Z0.k) obj).f22804a);
                return yVar;
            case 1:
                AbstractC3557B.c0("$this$DisposableEffect", (N) obj);
                return new C3277c(13, (l) obj2);
            case 2:
                a(((Z0.k) obj).f22804a);
                return yVar;
            case 3:
                Hi.c cVar = (Hi.c) obj;
                AbstractC3557B.c0("appStartData", cVar);
                return Hi.c.a(cVar, null, new Hi.e((Throwable) obj2), null, null, null, null, null, null, null, null, null, null, null, null, -131073);
            default:
                Hi.i iVar = (Hi.i) obj;
                AbstractC3557B.c0("state", iVar);
                ((SharedPreferences) obj2).edit().putString("lastResumedState", iVar.name()).putLong("lastResumedCurrentMillis", System.currentTimeMillis()).apply();
                return yVar;
        }
    }
}

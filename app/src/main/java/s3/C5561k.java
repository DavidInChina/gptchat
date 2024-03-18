package s3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.b0;
import wf.AbstractC6216a;

/* renamed from: s3.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5561k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45303Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5562l f45304Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5561k(C5562l c5562l, int i10) {
        super(0);
        this.f45303Y = i10;
        this.f45304Z = c5562l;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.a, androidx.lifecycle.b0, java.lang.Object] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Context context;
        int i10 = this.f45303Y;
        Application application = null;
        C5562l c5562l = this.f45304Z;
        switch (i10) {
            case 0:
                Context context2 = c5562l.f45305Y;
                if (context2 != null) {
                    context = context2.getApplicationContext();
                } else {
                    context = null;
                }
                if (context instanceof Application) {
                    application = context;
                }
                return new androidx.lifecycle.V(application, c5562l, c5562l.d());
            default:
                if (c5562l.f45314o0) {
                    C2088x c2088x = c5562l.f45312m0;
                    if (c2088x.f25386f != EnumC2082q.f25375Y) {
                        ?? obj = new Object();
                        obj.f25350Y = c5562l.f45313n0.f645b;
                        obj.f25351Z = c2088x;
                        obj.f25352h0 = null;
                        return ((C5560j) new U3.u(c5562l, (b0) obj).l(C5560j.class)).f45302d;
                    }
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }
}

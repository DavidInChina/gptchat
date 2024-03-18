package o9;

import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import me.C4631d;

/* renamed from: o9.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4964l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4964l f41018Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        Throwable th2 = (Throwable) obj;
        AbstractC3557B.c0("e", th2);
        boolean z10 = false;
        if (!(th2 instanceof CancellationException) && (!(th2 instanceof C4631d) || 400 > (i10 = ((C4631d) th2).f39189Y.f().f49834Y) || i10 >= 500)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}

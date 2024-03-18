package w6;

import android.app.Activity;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import jf.y;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48042Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f48043Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i10) {
        super(1);
        this.f48042Y = i10;
        this.f48043Z = activity;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        y yVar = y.f36177a;
        switch (this.f48042Y) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                AbstractC3557B.c0("it", weakReference);
                if (weakReference.get() != null && !AbstractC3557B.K(weakReference.get(), this.f48043Z)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                Rd.j jVar = (Rd.j) obj;
                return yVar;
            case 2:
                Rd.j jVar2 = (Rd.j) obj;
                return yVar;
            case 3:
                Rd.j jVar3 = (Rd.j) obj;
                return yVar;
            case 4:
                Rd.j jVar4 = (Rd.j) obj;
                return yVar;
            default:
                Rd.j jVar5 = (Rd.j) obj;
                return yVar;
        }
    }
}

package u;

import U3.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import e.AbstractBinderC2736d;
import e.AbstractC2737e;

/* renamed from: u.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceConnectionC5821c implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public Context f46325a;

    public abstract void a(i iVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, U3.i] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, e.c] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC2737e abstractC2737e;
        if (this.f46325a != null) {
            int i10 = AbstractBinderC2736d.f28680a;
            if (iBinder == null) {
                abstractC2737e = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof AbstractC2737e)) {
                    abstractC2737e = (AbstractC2737e) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f28679a = iBinder;
                    abstractC2737e = obj;
                }
            }
            Context context = this.f46325a;
            ?? obj2 = new Object();
            obj2.f17417i0 = this;
            obj2.f17414Y = abstractC2737e;
            obj2.f17415Z = componentName;
            obj2.f17416h0 = context;
            a(obj2);
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}

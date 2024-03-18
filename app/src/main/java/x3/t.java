package x3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes2.dex */
public final class t extends Binder implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f48728b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f48729a;

    public t(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f48729a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // x3.k
    public final int a(i iVar, String str) {
        AbstractC3557B.c0("callback", iVar);
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f48729a;
        synchronized (multiInstanceInvalidationService.f25511h0) {
            try {
                int i11 = multiInstanceInvalidationService.f25509Y + 1;
                multiInstanceInvalidationService.f25509Y = i11;
                if (multiInstanceInvalidationService.f25511h0.register(iVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f25510Z.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f25509Y--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [x3.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [x3.h, java.lang.Object] */
    /* renamed from: g */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i10 != 1598968902) {
            i iVar = null;
            i iVar2 = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    i(parcel.readInt(), parcel.createStringArray());
                } else {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
                            iVar2 = (i) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f48686a = readStrongBinder;
                            iVar2 = obj;
                        }
                    }
                    int readInt = parcel.readInt();
                    AbstractC3557B.c0("callback", iVar2);
                    MultiInstanceInvalidationService multiInstanceInvalidationService = this.f48729a;
                    synchronized (multiInstanceInvalidationService.f25511h0) {
                        multiInstanceInvalidationService.f25511h0.unregister(iVar2);
                        String str = (String) multiInstanceInvalidationService.f25510Z.remove(Integer.valueOf(readInt));
                    }
                    parcel2.writeNoException();
                }
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof i)) {
                        iVar = (i) queryLocalInterface2;
                    } else {
                        ?? obj2 = new Object();
                        obj2.f48686a = readStrongBinder2;
                        iVar = obj2;
                    }
                }
                int a5 = a(iVar, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a5);
            }
            return true;
        }
        parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
        return true;
    }

    @Override // x3.k
    public final void i(int i10, String[] strArr) {
        AbstractC3557B.c0("tables", strArr);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f48729a;
        synchronized (multiInstanceInvalidationService.f25511h0) {
            String str = (String) multiInstanceInvalidationService.f25510Z.get(Integer.valueOf(i10));
            if (str == null) {
                AbstractC3612c.r("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f25511h0.beginBroadcast();
            for (int i11 = 0; i11 < beginBroadcast; i11++) {
                Object broadcastCookie = multiInstanceInvalidationService.f25511h0.getBroadcastCookie(i11);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", broadcastCookie);
                Integer num = (Integer) broadcastCookie;
                int intValue = num.intValue();
                String str2 = (String) multiInstanceInvalidationService.f25510Z.get(num);
                if (i10 != intValue && AbstractC3557B.K(str, str2)) {
                    try {
                        ((i) multiInstanceInvalidationService.f25511h0.getBroadcastItem(i11)).c(strArr);
                    } catch (RemoteException e10) {
                        AbstractC3612c.s("ROOM", "Error invoking a remote callback", e10);
                    }
                }
            }
            multiInstanceInvalidationService.f25511h0.finishBroadcast();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

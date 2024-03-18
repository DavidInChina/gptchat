package s8;

import Q1.u;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Iterator;
import r8.AbstractC5377f;
import r8.BinderC5375d;
import r8.C5376e;
import x3.r;

/* renamed from: s8.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5590g extends AbstractRunnableC5589f {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f45445Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45446h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f45447i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5590g(Object obj, N7.f fVar, Object obj2, int i10) {
        super(fVar);
        this.f45445Z = i10;
        this.f45447i0 = obj;
        this.f45446h0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.IInterface, s8.d] */
    @Override // s8.AbstractRunnableC5589f
    public final void a() {
        IInterface iInterface;
        int i10 = this.f45445Z;
        Object obj = this.f45447i0;
        Object obj2 = this.f45446h0;
        switch (i10) {
            case 0:
                C5592i c5592i = (C5592i) obj;
                AbstractRunnableC5589f abstractRunnableC5589f = (AbstractRunnableC5589f) obj2;
                IInterface iInterface2 = c5592i.f45463m;
                ArrayList arrayList = c5592i.f45454d;
                u uVar = c5592i.f45452b;
                if (iInterface2 == null && !c5592i.f45457g) {
                    uVar.d("Initiate binding to the service.", new Object[0]);
                    arrayList.add(abstractRunnableC5589f);
                    r rVar = new r(c5592i, 2);
                    c5592i.f45462l = rVar;
                    c5592i.f45457g = true;
                    if (!c5592i.f45451a.bindService(c5592i.f45458h, rVar, 1)) {
                        uVar.d("Failed to bind to the service.", new Object[0]);
                        c5592i.f45457g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            K0.e eVar = new K0.e();
                            N7.f fVar = ((AbstractRunnableC5589f) it.next()).f45444Y;
                            if (fVar != null) {
                                fVar.a(eVar);
                            }
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                } else if (c5592i.f45457g) {
                    uVar.d("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(abstractRunnableC5589f);
                    return;
                } else {
                    abstractRunnableC5589f.run();
                    return;
                }
            case 1:
                r rVar2 = (r) obj;
                C5592i c5592i2 = (C5592i) rVar2.f48717b;
                IBinder iBinder = (IBinder) obj2;
                int i11 = AbstractBinderC5586c.f45443b;
                if (iBinder == null) {
                    iInterface = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    if (queryLocalInterface instanceof AbstractC5587d) {
                        iInterface = (AbstractC5587d) queryLocalInterface;
                    } else {
                        iInterface = new C5585b(iBinder);
                    }
                }
                c5592i2.f45463m = iInterface;
                Object obj3 = rVar2.f48717b;
                C5592i c5592i3 = (C5592i) obj3;
                c5592i3.f45452b.d("linkToDeath", new Object[0]);
                try {
                    c5592i3.f45463m.asBinder().linkToDeath(c5592i3.f45460j, 0);
                } catch (RemoteException e10) {
                    Object[] objArr = new Object[0];
                    u uVar2 = c5592i3.f45452b;
                    uVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC3612c.d("PlayCore", u.e(uVar2.f14350Z, "linkToDeath failed", objArr), e10);
                    }
                }
                C5592i c5592i4 = (C5592i) obj3;
                c5592i4.f45457g = false;
                Iterator it2 = c5592i4.f45454d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((C5592i) obj3).f45454d.clear();
                return;
            default:
                try {
                    ?? r32 = ((C5376e) obj).f44469a.f45463m;
                    String str = ((C5376e) obj).f44470b;
                    Bundle a5 = AbstractC5377f.a();
                    C5376e c5376e = (C5376e) obj;
                    String str2 = c5376e.f44470b;
                    r32.e(str, a5, new BinderC5375d(c5376e, (N7.f) obj2));
                    return;
                } catch (RemoteException e11) {
                    u uVar3 = C5376e.f44468c;
                    Object[] objArr2 = {((C5376e) obj).f44470b};
                    uVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        AbstractC3612c.d("PlayCore", u.e(uVar3.f14350Z, "error requesting in-app review for %s", objArr2), e11);
                    }
                    ((N7.f) obj2).a(new RuntimeException(e11));
                    return;
                }
        }
    }

    public C5590g(r rVar, IBinder iBinder) {
        this.f45445Z = 1;
        this.f45447i0 = rVar;
        this.f45446h0 = iBinder;
    }
}

package Z1;

import M1.AbstractC0928i;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class r0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23094Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f23095Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23095Z = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r0(this.f23095Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23094Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Context context = this.f23095Z;
            T t10 = new T(context);
            this.f23094Y = 1;
            String packageName = context.getPackageName();
            List<AppWidgetProviderInfo> installedProviders = t10.f22904b.getInstalledProviders();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : installedProviders) {
                if (AbstractC3557B.K(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
            }
            Object b10 = ((AbstractC0928i) t10.f22905c.getValue()).b(new Q(kf.t.P2(arrayList2), null), this);
            if (b10 != EnumC5000a.f41328Y) {
                b10 = yVar;
            }
            if (b10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}

package H0;

import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import n0.C4702a;
import q0.C5254f;

/* renamed from: H0.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0706u extends kotlin.jvm.internal.k implements wf.o {
    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC2469q0.p(obj);
        C0714y c0714y = (C0714y) this.receiver;
        Resources resources = c0714y.getContext().getResources();
        C4702a c4702a = new C4702a(new Z0.c(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C5254f) obj2).f43640a, (wf.k) obj3);
        if (Build.VERSION.SDK_INT >= 24) {
            return Boolean.valueOf(T.f6880a.a(c0714y, null, c4702a));
        }
        throw null;
    }
}

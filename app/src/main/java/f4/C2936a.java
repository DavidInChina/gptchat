package f4;

import android.content.Context;
import com.openai.chatgpt.app.MainApplication;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.C3959i;
import wd.C6209w;

/* renamed from: f4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2936a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2936a f29586a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static q f29587b;

    public static final q a(Context context) {
        j jVar;
        q qVar = f29587b;
        if (qVar == null) {
            synchronized (f29586a) {
                try {
                    qVar = f29587b;
                    if (qVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext instanceof j) {
                            jVar = (j) applicationContext;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            MainApplication mainApplication = (MainApplication) jVar;
                            h hVar = new h(mainApplication);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList2.add(new C3959i(new Object(), String.class));
                            arrayList3.add(new C3959i(new Object(), C6209w.class));
                            f9.p pVar = mainApplication.f27652Y;
                            if (pVar != null) {
                                arrayList4.add(new C3959i((Ua.e) pVar.f29890U.get(), C6209w.class));
                                hVar.f29605d = new c(A7.b.S1(arrayList), A7.b.S1(arrayList2), A7.b.S1(arrayList3), A7.b.S1(arrayList4), A7.b.S1(arrayList5));
                                qVar = hVar.a();
                            } else {
                                AbstractC3557B.C2("appComponent");
                                throw null;
                            }
                        } else {
                            qVar = new h(context).a();
                        }
                        f29587b = qVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qVar;
    }
}

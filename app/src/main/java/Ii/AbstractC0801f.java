package Ii;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: Ii.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0801f {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f8646a = new ArrayList();

    public static final void a(wf.k kVar) {
        ArrayList arrayList = f8646a;
        boolean z10 = !arrayList.isEmpty();
        arrayList.add(kVar);
        if (z10) {
            return;
        }
        AbstractC0804i.b((Handler) AbstractC0804i.f8654a.getValue(), C0800e.f8642Z);
    }
}
